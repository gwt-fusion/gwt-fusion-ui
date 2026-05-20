package org.gwtfusion.router;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;
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

    @Test
    void encodesSearchWhenSerializing() {
        Map<String, String> values = new LinkedHashMap<>();
        values.put("tab name", "usage & API");

        assertEquals("tab%20name=usage%20%26%20API", new RouteSearch(values).toQueryString());
    }

    @Test
    void decodesSearchWhenParsing() {
        RouteSearch search = RouteSearch.parse("tab%20name=usage%20%26%20API&empty%20flag");

        assertEquals("usage & API", search.get("tab name"));
        assertTrue(search.has("empty flag"));
    }
}
