package org.gwtfusion.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class QueryOptionsTest {
    @Test
    void exposesStaleGcEnabledAndRetryDecisions() {
        QueryOptions options = QueryOptions.create()
                .staleTime(1_000)
                .gcTime(5_000)
                .enabled(false)
                .retry(2)
                .retryDelay(QueryRetryDelay.fixed(250));

        assertFalse(options.enabled());
        assertFalse(options.stale(1_000, 1_999));
        assertTrue(options.stale(1_000, 2_000));
        assertEquals(5_000, options.gcTimeMillis());
        assertTrue(options.shouldRetry(1));
        assertTrue(options.shouldRetry(2));
        assertFalse(options.shouldRetry(3));
        assertEquals(250, options.retryDelayMillis(1));
    }

    @Test
    void supportsExponentialRetryDelay() {
        QueryRetryDelay delay = QueryRetryDelay.exponential(100, 1_000);

        assertEquals(100, delay.delayMillis(1));
        assertEquals(200, delay.delayMillis(2));
        assertEquals(400, delay.delayMillis(3));
        assertEquals(1_000, delay.delayMillis(8));
    }
}
