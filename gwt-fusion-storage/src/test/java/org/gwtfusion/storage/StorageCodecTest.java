package org.gwtfusion.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StorageCodecTest {
    @Test
    void builtInCodecsRoundTripValues() {
        assertEquals("Ada", StorageCodec.string().decode(StorageCodec.string().encode("Ada")));
        assertEquals(42, StorageCodec.integer().decode(StorageCodec.integer().encode(42)));
        assertEquals(123456789L, StorageCodec.longInteger().decode(StorageCodec.longInteger().encode(123456789L)));
        assertTrue(StorageCodec.bool().decode(StorageCodec.bool().encode(true)));
        assertFalse(StorageCodec.bool().decode(StorageCodec.bool().encode(false)));
    }

    @Test
    void builtInCodecsPreserveNull() {
        assertNull(StorageCodec.string().encode(null));
        assertNull(StorageCodec.integer().decode(null));
        assertNull(StorageCodec.longInteger().decode(null));
        assertNull(StorageCodec.bool().decode(null));
    }

    @Test
    void booleanCodecRejectsMalformedValues() {
        assertThrows(IllegalArgumentException.class, () -> StorageCodec.bool().decode("yes"));
        assertThrows(IllegalArgumentException.class, () -> StorageCodec.bool().decode("TRUE"));
    }

    @Test
    void customCodecRequiresEncoderAndDecoder() {
        assertThrows(IllegalArgumentException.class, () -> StorageCodec.<String>of(null, value -> value));
        assertThrows(IllegalArgumentException.class, () -> StorageCodec.<String>of(value -> value, null));
    }
}
