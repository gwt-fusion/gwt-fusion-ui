package org.gwtfusion.query.ui;

import java.util.function.Predicate;
import org.gwtfusion.query.QueryState;

final class QueryViewStateSelector {
    private QueryViewStateSelector() {
    }

    static <T> QueryViewPhase select(QueryState<T> state, Predicate<? super T> emptyPredicate) {
        if (state == null || state.isIdle()) {
            return QueryViewPhase.IDLE;
        }
        if (state.isLoading()) {
            return QueryViewPhase.LOADING;
        }
        if (state.isError()) {
            return QueryViewPhase.ERROR;
        }
        if (emptyPredicate != null && emptyPredicate.test(state.data())) {
            return QueryViewPhase.EMPTY;
        }
        return QueryViewPhase.SUCCESS;
    }
}
