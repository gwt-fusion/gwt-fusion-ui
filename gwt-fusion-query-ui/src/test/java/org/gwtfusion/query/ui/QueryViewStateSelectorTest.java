package org.gwtfusion.query.ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gwtfusion.query.QueryState;
import org.junit.jupiter.api.Test;

class QueryViewStateSelectorTest {
    @Test
    void selectsLifecyclePhases() {
        assertEquals(QueryViewPhase.IDLE, QueryViewStateSelector.select(QueryState.idle(), data -> false));
        assertEquals(QueryViewPhase.LOADING, QueryViewStateSelector.select(QueryState.loading(), data -> false));
        assertEquals(QueryViewPhase.ERROR, QueryViewStateSelector.select(QueryState.error("offline", null, -1, 1), data -> false));
        assertEquals(QueryViewPhase.SUCCESS, QueryViewStateSelector.select(QueryState.success("ready", 10), String::isEmpty));
    }

    @Test
    void selectsEmptyOnlyForSuccessfulData() {
        assertEquals(QueryViewPhase.EMPTY, QueryViewStateSelector.select(QueryState.success(new String[0], 10), values -> values.length == 0));
        assertEquals(QueryViewPhase.EMPTY, QueryViewStateSelector.select(QueryState.refreshing(new String[0], 10), values -> values.length == 0));
        assertEquals(QueryViewPhase.SUCCESS, QueryViewStateSelector.select(QueryState.refreshing(new String[] {"cached"}, 10), values -> values.length == 0));
        assertEquals(QueryViewPhase.ERROR, QueryViewStateSelector.select(QueryState.error("offline", new String[0], 10, 1), values -> values.length == 0));
    }

    @Test
    void treatsNullStateAsIdleAndAllowsNoEmptyPredicate() {
        assertEquals(QueryViewPhase.IDLE, QueryViewStateSelector.select(null, data -> false));
        assertEquals(QueryViewPhase.SUCCESS, QueryViewStateSelector.select(QueryState.success(null, 10), null));
    }
}
