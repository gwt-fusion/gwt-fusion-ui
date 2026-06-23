package org.gwtfusion.query;

@FunctionalInterface
public interface MutationObserver<T> {
    void onStateChange(MutationState<T> state);
}
