package org.gwtfusion.query;

public final class MutationOptions<V, T> {
    private final MutationHandler<V, T> handler;
    private OptimisticUpdate<V> optimisticUpdate;

    private MutationOptions(MutationHandler<V, T> handler) {
        if (handler == null) {
            throw new IllegalArgumentException("handler must not be null");
        }
        this.handler = handler;
    }

    public static <V, T> MutationOptions<V, T> create(MutationHandler<V, T> handler) {
        return new MutationOptions<>(handler);
    }

    public MutationOptions<V, T> onMutate(OptimisticUpdate<V> optimisticUpdate) {
        this.optimisticUpdate = optimisticUpdate;
        return this;
    }

    MutationHandler<V, T> handler() {
        return handler;
    }

    void optimisticUpdate(V variables) {
        if (optimisticUpdate != null) {
            optimisticUpdate.apply(variables);
        }
    }
}
