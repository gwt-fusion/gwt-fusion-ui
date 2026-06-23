package org.gwtfusion.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class QueryStateTest {
    @Test
    void exposesLoadingSuccessRefreshingAndErrorState() {
        QueryState<String> loading = QueryState.loading();
        QueryState<String> success = QueryState.success("Ada", 1_000);
        QueryState<String> refreshing = QueryState.refreshing("Ada", 1_000);
        QueryState<String> error = QueryState.error("nope", "Ada", 1_000, 2);

        assertTrue(loading.isLoading());
        assertTrue(loading.fetching());
        assertTrue(success.isSuccess());
        assertFalse(success.stale());
        assertTrue(refreshing.isRefreshing());
        assertTrue(error.isError());
        assertEquals("nope", error.errorMessage());
        assertEquals(2, error.failureCount());
    }
}
