package org.gwtfusion.query;

@FunctionalInterface
public interface ListenerRegistration {
    void remove();

    default void close() {
        remove();
    }

    static ListenerRegistration empty() {
        return () -> {
        };
    }
}
