package org.gwtfusion.storage;

public final class StorageEntry<T> {
    private final StorageKey<T> key;
    private final T value;
    private final long createdAtMillis;
    private final Long expiresAtMillis;

    StorageEntry(StorageKey<T> key, T value, long createdAtMillis, Long expiresAtMillis) {
        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }
        this.key = key;
        this.value = value;
        this.createdAtMillis = createdAtMillis;
        this.expiresAtMillis = expiresAtMillis;
    }

    public StorageKey<T> key() {
        return key;
    }

    public T value() {
        return value;
    }

    public long createdAtMillis() {
        return createdAtMillis;
    }

    public boolean hasExpiration() {
        return expiresAtMillis != null;
    }

    public Long expiresAtMillis() {
        return expiresAtMillis;
    }

    public boolean expired(long nowMillis) {
        return expiresAtMillis != null && nowMillis >= expiresAtMillis;
    }
}
