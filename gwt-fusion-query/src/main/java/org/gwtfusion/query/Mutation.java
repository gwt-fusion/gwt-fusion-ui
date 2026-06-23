package org.gwtfusion.query;

import elemental2.promise.Promise;
import java.util.ArrayList;
import java.util.List;

public final class Mutation<V, T> {
    private final QueryClock clock;
    private final MutationOptions<V, T> options;
    private final List<MutationObserver<T>> observers = new ArrayList<>();
    private MutationState<T> state = MutationState.idle();

    private Mutation(QueryClock clock, MutationOptions<V, T> options) {
        if (options == null) {
            throw new IllegalArgumentException("options must not be null");
        }
        this.clock = clock == null ? System::currentTimeMillis : clock;
        this.options = options;
    }

    public static <V, T> Mutation<V, T> create(MutationOptions<V, T> options) {
        return new Mutation<>(System::currentTimeMillis, options);
    }

    static <V, T> Mutation<V, T> create(QueryClock clock, MutationOptions<V, T> options) {
        return new Mutation<>(clock, options);
    }

    public MutationState<T> state() {
        return state;
    }

    public Promise<T> execute(V variables) {
        try {
            options.optimisticUpdate(variables);
            setState(MutationState.loading(state.data()));
            return options.handler().mutate(variables).then(data -> {
                setState(MutationState.success(data, clock.now()));
                return Promise.resolve(data);
            }, error -> {
                setState(MutationState.error(error, state.data(), clock.now()));
                return Promise.reject(error);
            });
        } catch (Throwable error) {
            setState(MutationState.error(error, state.data(), clock.now()));
            return Promise.reject(error);
        }
    }

    public Mutation<V, T> reset() {
        setState(MutationState.idle());
        return this;
    }

    public ListenerRegistration observe(MutationObserver<T> observer) {
        if (observer == null) {
            return ListenerRegistration.empty();
        }
        observers.add(observer);
        observer.onStateChange(state);
        return () -> observers.remove(observer);
    }

    void setState(MutationState<T> state) {
        this.state = state == null ? MutationState.idle() : state;
        List<MutationObserver<T>> snapshot = new ArrayList<>(observers);
        for (MutationObserver<T> observer : snapshot) {
            observer.onStateChange(this.state);
        }
    }
}
