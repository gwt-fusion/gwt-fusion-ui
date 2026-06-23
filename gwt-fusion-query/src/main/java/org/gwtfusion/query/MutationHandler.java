package org.gwtfusion.query;

import elemental2.promise.Promise;

@FunctionalInterface
public interface MutationHandler<V, T> {
    Promise<T> mutate(V variables);
}
