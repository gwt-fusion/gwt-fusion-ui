package org.gwtfusion.http;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HttpHeadersTest {
    @Test
    void storesHeadersCaseInsensitively() {
        HttpHeaders headers = new HttpHeaders()
                .set("Accept", "application/json")
                .set("accept", "text/plain");

        assertEquals("text/plain", headers.get("ACCEPT"));
        assertEquals("text/plain", headers.asMap().get("accept"));
        assertEquals(1, headers.asMap().size());
    }

    @Test
    void removesHeadersWithNullValues() {
        HttpHeaders headers = new HttpHeaders().set("Authorization", "Bearer token");

        headers.set("authorization", null);

        assertFalse(headers.has("Authorization"));
        assertNull(headers.get("Authorization"));
    }

    @Test
    void ignoresBlankHeaderNames() {
        HttpHeaders headers = new HttpHeaders().set(" ", "value");

        assertTrue(headers.asMap().isEmpty());
    }
}
