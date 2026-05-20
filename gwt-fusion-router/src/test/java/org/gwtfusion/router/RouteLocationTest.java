package org.gwtfusion.router;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RouteLocationTest {
    @Test
    void normalizesPaths() {
        assertEquals("/", RouteLocation.parse("").path());
        assertEquals("/components/button", RouteLocation.parse("components/button/").path());
        assertEquals("/components/button", RouteLocation.parse("/components/button/").path());
    }

    @Test
    void parsesSearchAndHash() {
        RouteLocation location = RouteLocation.parse("/components/button?tab=usage&compact#preview");

        assertEquals("/components/button", location.path());
        assertEquals("usage", location.search().get("tab"));
        assertTrue(location.search().has("compact"));
        assertEquals("preview", location.hash());
        assertEquals("/components/button?tab=usage&compact#preview", location.asPath());
    }
}
