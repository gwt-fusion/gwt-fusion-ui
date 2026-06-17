package org.gwtfusion.http;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HttpErrorTest {
    @Test
    void formatsHttpErrorMessage() {
        HttpError error = HttpError.of(404, "Not Found", "/api/users/1");

        assertEquals(404, error.status());
        assertEquals("Not Found", error.statusText());
        assertEquals("/api/users/1", error.url());
        assertTrue(error.getMessage().contains("Not Found"));
        assertTrue(error.getMessage().contains("404"));
        assertTrue(error.getMessage().contains("/api/users/1"));
    }
}
