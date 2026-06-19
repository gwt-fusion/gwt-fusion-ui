package org.gwtfusion.storage;

import java.util.List;

public final class StorageArea {
    private final StorageBackend primary;
    private final StorageBackend fallback;
    private final StorageClock clock;
    private boolean fallbackOnly;

    private StorageArea(StorageBackend primary, StorageBackend fallback, StorageClock clock) {
        this.primary = primary == null ? new MemoryStorageBackend() : primary;
        this.fallback = fallback == null ? new MemoryStorageBackend() : fallback;
        this.clock = clock == null ? System::currentTimeMillis : clock;
    }

    public static StorageArea memory() {
        return new StorageArea(new MemoryStorageBackend(), null, null);
    }

    public static StorageArea localStorage() {
        return browser(BrowserStorageBackend.LOCAL);
    }

    public static StorageArea sessionStorage() {
        return browser(BrowserStorageBackend.SESSION);
    }

    static StorageArea memory(StorageClock clock) {
        return new StorageArea(new MemoryStorageBackend(), null, clock);
    }

    static StorageArea create(StorageBackend primary, StorageBackend fallback, StorageClock clock) {
        return new StorageArea(primary, fallback, clock);
    }

    public <T> StorageArea set(StorageKey<T> key, T value) {
        return set(key, value, null);
    }

    public <T> StorageArea set(StorageKey<T> key, T value, long ttlMillis) {
        long now = clock.now();
        Long expiresAtMillis = ttlMillis < 0 ? null : now + ttlMillis;
        return set(key, value, expiresAtMillis);
    }

    public <T> StorageArea setUntil(StorageKey<T> key, T value, long expiresAtMillis) {
        return set(key, value, Long.valueOf(expiresAtMillis));
    }

    public <T> T get(StorageKey<T> key) {
        StorageEntry<T> entry = entry(key);
        return entry == null ? null : entry.value();
    }

    public <T> StorageEntry<T> entry(StorageKey<T> key) {
        requireKey(key);
        String raw = read(key.rawKey());
        if (raw == null) {
            return null;
        }
        ParsedEntry parsed = ParsedEntry.parse(raw);
        if (parsed == null) {
            remove(key);
            return null;
        }
        try {
            T value = key.codec().decode(parsed.value);
            StorageEntry<T> entry = new StorageEntry<>(key, value, parsed.createdAtMillis, parsed.expiresAtMillis);
            if (entry.expired(clock.now())) {
                remove(key);
                return null;
            }
            return entry;
        } catch (RuntimeException exception) {
            remove(key);
            return null;
        }
    }

    public boolean contains(StorageKey<?> key) {
        return entry(key) != null;
    }

    public StorageArea remove(StorageKey<?> key) {
        requireKey(key);
        removeRaw(key.rawKey());
        return this;
    }

    public StorageArea clear() {
        for (String key : keys()) {
            removeRaw(key);
        }
        return this;
    }

    public StorageArea clearNamespace(String namespace) {
        String clean = namespace == null ? "" : namespace.trim();
        if (clean.isEmpty()) {
            return this;
        }
        String prefix = clean + ":";
        for (String key : keys()) {
            if (key.startsWith(prefix)) {
                removeRaw(key);
            }
        }
        return this;
    }

    public boolean usingFallback() {
        return fallbackOnly;
    }

    private <T> StorageArea set(StorageKey<T> key, T value, Long expiresAtMillis) {
        requireKey(key);
        if (value == null) {
            return remove(key);
        }
        String encoded = key.codec().encode(value);
        if (encoded == null) {
            return remove(key);
        }
        StorageEntry<T> entry = new StorageEntry<>(key, value, clock.now(), expiresAtMillis);
        write(key.rawKey(), serialize(entry, encoded));
        return this;
    }

    private static StorageArea browser(String type) {
        StorageBackend fallback = new MemoryStorageBackend();
        try {
            return new StorageArea(BrowserStorageBackend.create(type), fallback, null);
        } catch (RuntimeException ignored) {
            return new StorageArea(fallback, fallback, null);
        }
    }

    private String read(String key) {
        if (!fallbackOnly) {
            try {
                return primary.getItem(key);
            } catch (RuntimeException ignored) {
                fallbackOnly = true;
            }
        }
        return fallback.getItem(key);
    }

    private void write(String key, String value) {
        if (!fallbackOnly) {
            try {
                primary.setItem(key, value);
                return;
            } catch (RuntimeException ignored) {
                fallbackOnly = true;
            }
        }
        fallback.setItem(key, value);
    }

    private void removeRaw(String key) {
        if (!fallbackOnly) {
            try {
                primary.removeItem(key);
                return;
            } catch (RuntimeException ignored) {
                fallbackOnly = true;
            }
        }
        fallback.removeItem(key);
    }

    private List<String> keys() {
        if (!fallbackOnly) {
            try {
                return primary.keys();
            } catch (RuntimeException ignored) {
                fallbackOnly = true;
            }
        }
        return fallback.keys();
    }

    private static <T> String serialize(StorageEntry<T> entry, String encoded) {
        return entry.createdAtMillis() + "\n" + (entry.expiresAtMillis() == null ? "" : entry.expiresAtMillis()) + "\n" + encoded;
    }

    private static void requireKey(StorageKey<?> key) {
        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }
    }

    private static final class ParsedEntry {
        final long createdAtMillis;
        final Long expiresAtMillis;
        final String value;

        private ParsedEntry(long createdAtMillis, Long expiresAtMillis, String value) {
            this.createdAtMillis = createdAtMillis;
            this.expiresAtMillis = expiresAtMillis;
            this.value = value;
        }

        static ParsedEntry parse(String raw) {
            int first = raw.indexOf('\n');
            if (first < 0) {
                return null;
            }
            int second = raw.indexOf('\n', first + 1);
            if (second < 0) {
                return null;
            }
            try {
                long createdAtMillis = Long.parseLong(raw.substring(0, first));
                String expires = raw.substring(first + 1, second);
                Long expiresAtMillis = expires.isEmpty() ? null : Long.valueOf(expires);
                return new ParsedEntry(createdAtMillis, expiresAtMillis, raw.substring(second + 1));
            } catch (RuntimeException exception) {
                return null;
            }
        }
    }
}
