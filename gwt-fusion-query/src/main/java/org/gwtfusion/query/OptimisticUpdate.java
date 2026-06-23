package org.gwtfusion.query;

@FunctionalInterface
public interface OptimisticUpdate<V> {
    void apply(V variables);
}
