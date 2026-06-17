package org.gwtfusion.http;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HttpUrlEncodingTest {
    @Test
    void keepsUnreservedCharacters() {
        assertEquals("abcXYZ-_.~09", HttpUrlEncoding.encode("abcXYZ-_.~09"));
    }

    @Test
    void encodesSpacesReservedCharactersAndUtf8() {
        assertEquals("hello%20world%2F%C3%BC", HttpUrlEncoding.encode("hello world/ü"));
    }
}
