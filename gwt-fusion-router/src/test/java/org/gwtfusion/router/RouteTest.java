package org.gwtfusion.router;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class RouteTest {
    @Test
    void matchesStaticRoutes() {
        Route route = Route.of("/components", context -> null);

        assertNotNull(route.match(RouteLocation.parse("/components")));
        assertNull(route.match(RouteLocation.parse("/components/button")));
    }

    @Test
    void capturesNamedParams() {
        RouteMatch match = Route.of("/components/:id", context -> null).match(RouteLocation.parse("/components/button"));

        assertNotNull(match);
        assertEquals("button", match.params().get("id"));
    }

    @Test
    void capturesSplat() {
        RouteMatch match = Route.of("/docs/*", context -> null).match(RouteLocation.parse("/docs/router/history"));

        assertNotNull(match);
        assertEquals("router/history", match.params().get("*"));
    }

    @Test
    void rejectsNonFinalSplat() {
        assertThrows(IllegalArgumentException.class, () -> Route.of("/docs/*/history", context -> null));
    }
}
