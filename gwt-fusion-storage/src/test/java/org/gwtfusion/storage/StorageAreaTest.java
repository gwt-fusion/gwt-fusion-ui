package org.gwtfusion.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class StorageAreaTest {
    @Test
    void storesAndReadsTypedValues() {
        StorageArea storage = StorageArea.memory();
        StorageKey<String> theme = StorageKey.string("demo", "theme");
        StorageKey<Integer> pageSize = StorageKey.integer("demo", "page-size");

        storage.set(theme, "dark").set(pageSize, 50);

        assertEquals("dark", storage.get(theme));
        assertEquals(50, storage.get(pageSize));
        assertTrue(storage.contains(theme));
    }

    @Test
    void nullValuesRemoveEntries() {
        StorageArea storage = StorageArea.memory();
        StorageKey<String> key = StorageKey.string("demo", "draft");

        storage.set(key, "hello").set(key, null);

        assertNull(storage.get(key));
        assertFalse(storage.contains(key));
    }

    @Test
    void returnsEntryMetadata() {
        MutableClock clock = new MutableClock(1_000);
        StorageArea storage = StorageArea.memory(clock);
        StorageKey<String> key = StorageKey.string("demo", "draft");

        storage.set(key, "hello", 500);
        StorageEntry<String> entry = storage.entry(key);

        assertEquals(key, entry.key());
        assertEquals("hello", entry.value());
        assertEquals(1_000, entry.createdAtMillis());
        assertTrue(entry.hasExpiration());
        assertEquals(1_500L, entry.expiresAtMillis());
        assertFalse(entry.expired(1_499));
        assertTrue(entry.expired(1_500));
    }

    @Test
    void expiredEntriesReadAsMissingAndAreRemoved() {
        MutableClock clock = new MutableClock(1_000);
        StorageArea storage = StorageArea.memory(clock);
        StorageKey<String> key = StorageKey.string("demo", "token");

        storage.set(key, "abc", 100);
        clock.now = 1_100;

        assertNull(storage.get(key));
        assertFalse(storage.contains(key));
    }

    @Test
    void negativeTtlMeansNoExpiration() {
        MutableClock clock = new MutableClock(1_000);
        StorageArea storage = StorageArea.memory(clock);
        StorageKey<String> key = StorageKey.string("demo", "preference");

        storage.set(key, "compact", -1);
        clock.now = 9_000;

        assertEquals("compact", storage.get(key));
        assertFalse(storage.entry(key).hasExpiration());
    }

    @Test
    void setUntilUsesAbsoluteExpirationMillis() {
        MutableClock clock = new MutableClock(1_000);
        StorageArea storage = StorageArea.memory(clock);
        StorageKey<String> key = StorageKey.string("demo", "token");

        storage.setUntil(key, "abc", 2_000);
        clock.now = 1_999;

        assertEquals("abc", storage.get(key));

        clock.now = 2_000;
        assertNull(storage.get(key));
    }

    @Test
    void clearsOnlyRequestedNamespace() {
        StorageArea storage = StorageArea.memory();
        StorageKey<String> theme = StorageKey.string("demo", "theme");
        StorageKey<String> token = StorageKey.string("auth", "token");

        storage.set(theme, "dark").set(token, "abc").clearNamespace("demo");

        assertNull(storage.get(theme));
        assertEquals("abc", storage.get(token));
    }

    @Test
    void fallsBackToMemoryWhenPrimaryStorageThrows() {
        MemoryStorageBackend fallback = new MemoryStorageBackend();
        StorageArea storage = StorageArea.create(new ThrowingStorageBackend(), fallback, () -> 1_000);
        StorageKey<String> key = StorageKey.string("demo", "theme");

        storage.set(key, "dark");

        assertTrue(storage.usingFallback());
        assertEquals("dark", storage.get(key));
    }

    @Test
    void primaryBackendErrorsAreNotSwallowedByFallback() {
        StorageArea storage = StorageArea.create(new ErrorStorageBackend(), new MemoryStorageBackend(), () -> 1_000);
        StorageKey<String> key = StorageKey.string("demo", "theme");

        assertThrows(AssertionError.class, () -> storage.set(key, "dark"));
    }

    private static final class MutableClock implements StorageClock {
        long now;

        MutableClock(long now) {
            this.now = now;
        }

        @Override
        public long now() {
            return now;
        }
    }

    private static final class ThrowingStorageBackend implements StorageBackend {
        @Override
        public String getItem(String key) {
            throw new IllegalStateException("blocked");
        }

        @Override
        public void setItem(String key, String value) {
            throw new IllegalStateException("blocked");
        }

        @Override
        public void removeItem(String key) {
            throw new IllegalStateException("blocked");
        }

        @Override
        public List<String> keys() {
            throw new IllegalStateException("blocked");
        }
    }

    private static final class ErrorStorageBackend implements StorageBackend {
        @Override
        public String getItem(String key) {
            throw new AssertionError("fatal");
        }

        @Override
        public void setItem(String key, String value) {
            throw new AssertionError("fatal");
        }

        @Override
        public void removeItem(String key) {
            throw new AssertionError("fatal");
        }

        @Override
        public List<String> keys() {
            throw new AssertionError("fatal");
        }
    }
}
