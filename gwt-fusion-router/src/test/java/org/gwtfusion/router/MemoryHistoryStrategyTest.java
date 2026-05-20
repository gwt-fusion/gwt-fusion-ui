package org.gwtfusion.router;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class MemoryHistoryStrategyTest {
    @Test
    void notifiesLocationChanges() {
        MemoryHistoryStrategy history = new MemoryHistoryStrategy(RouteLocation.parse("/"));
        AtomicInteger changes = new AtomicInteger();

        history.listen(location -> changes.incrementAndGet());
        history.push(RouteLocation.parse("/components/button"));
        history.replace(RouteLocation.parse("/components/button?tab=usage"));

        assertEquals(2, changes.get());
        assertEquals("/components/button", history.location().path());
        assertEquals("usage", history.location().search().get("tab"));
    }

    @Test
    void hrefKeepsRouteShape() {
        assertEquals("/components/button", new MemoryHistoryStrategy().href("components/button"));
    }
}
