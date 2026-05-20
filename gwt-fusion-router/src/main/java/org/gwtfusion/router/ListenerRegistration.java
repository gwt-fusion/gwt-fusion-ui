package org.gwtfusion.router;

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
