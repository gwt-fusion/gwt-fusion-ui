package org.gwtfusion.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class QueryClientTest {
    @Test
    void returnsSameQueryForSameKeyAndInvalidatesPrefixes() {
        MutableClock clock = new MutableClock();
        QueryClient client = QueryClient.create().clock(clock);
        Query<String> first = client.query(QueryKey.of("users", "list"), () -> null, QueryOptions.create().staleTime(60_000));
        Query<String> second = client.query(QueryKey.of("users", "list"), () -> null);
        first.setState(QueryState.success("Ada", clock.now()));

        client.invalidate(QueryKey.of("users"));

        assertSame(first, second);
        assertTrue(first.state().stale());
    }

    @Test
    void notifiesObserversAndSupportsRemoval() {
        QueryClient client = QueryClient.create();
        Query<String> query = client.query(QueryKey.of("profile"), () -> null);
        List<QueryStatus> statuses = new ArrayList<>();
        ListenerRegistration registration = query.observe(state -> statuses.add(state.status()));

        query.setState(QueryState.loading());
        registration.remove();
        query.setState(QueryState.success("Ada", 1));

        assertEquals(2, statuses.size());
        assertEquals(QueryStatus.IDLE, statuses.get(0));
        assertEquals(QueryStatus.LOADING, statuses.get(1));
    }

    @Test
    void collectsUnobservedQueriesAfterGcTime() {
        MutableClock clock = new MutableClock();
        QueryClient client = QueryClient.create().clock(clock);
        client.query(QueryKey.of("old"), () -> null, QueryOptions.create().gcTime(10));

        clock.now = 11;
        client.collectGarbage();

        assertEquals(0, client.size());
    }

    private static final class MutableClock implements QueryClock {
        long now;

        @Override
        public long now() {
            return now;
        }
    }
}
