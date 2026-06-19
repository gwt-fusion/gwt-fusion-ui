package org.gwtfusion.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class StorageKeyTest {
    @Test
    void composesNamespacedRawKey() {
        StorageKey<String> key = StorageKey.string("demo", "theme");

        assertEquals("demo", key.namespace());
        assertEquals("theme", key.name());
        assertEquals("demo:theme", key.rawKey());
    }

    @Test
    void allowsUnnamespacedRawKey() {
        assertEquals("theme", StorageKey.string(null, "theme").rawKey());
    }

    @Test
    void rejectsEmptyNamesAndMissingCodecs() {
        assertThrows(IllegalArgumentException.class, () -> StorageKey.string("demo", " "));
        assertThrows(IllegalArgumentException.class, () -> StorageKey.of("demo", "theme", null));
    }
}
