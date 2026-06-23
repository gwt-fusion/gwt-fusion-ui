package org.gwtfusion.query;

@FunctionalInterface
public interface QueryObserver<T> {
    void onStateChange(QueryState<T> state);
}
