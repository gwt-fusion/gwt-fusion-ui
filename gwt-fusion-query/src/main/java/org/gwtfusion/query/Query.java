package org.gwtfusion.query;

import elemental2.dom.DomGlobal;
import elemental2.promise.Promise;
import java.util.ArrayList;
import java.util.List;

public final class Query<T> {
    private final QueryClient client;
    private final QueryKey key;
    private final QueryFetcher<T> fetcher;
    private final QueryOptions options;
    private final List<QueryObserver<T>> observers = new ArrayList<>();
    private QueryState<T> state = QueryState.idle();
    private Promise<T> inFlight;
    private long lastAccessedAtMillis;

    Query(QueryClient client, QueryKey key, QueryFetcher<T> fetcher, QueryOptions options) {
        if (fetcher == null) {
            throw new IllegalArgumentException("fetcher must not be null");
        }
        this.client = client;
        this.key = key;
        this.fetcher = fetcher;
        this.options = options;
        touch();
    }

    public QueryKey key() {
        return key;
    }

    public QueryOptions options() {
        return options;
    }

    public QueryState<T> state() {
        touch();
        return state;
    }

    public boolean inFlight() {
        return inFlight != null;
    }

    public boolean shouldFetch() {
        touch();
        if (!options.enabled()) {
            return false;
        }
        return state.isIdle() || state.isError() || state.stale() || options.stale(state.updatedAtMillis(), client.now());
    }

    public Promise<T> refetch() {
        touch();
        if (inFlight != null) {
            return inFlight;
        }
        if (state.hasData()) {
            setState(QueryState.refreshing(state.data(), state.updatedAtMillis()));
        } else {
            setState(QueryState.loading());
        }
        Promise<T> fetch = runFetch(0);
        inFlight = state.fetching() ? fetch : null;
        return fetch;
    }

    public Query<T> markStale() {
        setState(state.staleCopy());
        return this;
    }

    public ListenerRegistration observe(QueryObserver<T> observer) {
        if (observer == null) {
            return ListenerRegistration.empty();
        }
        observers.add(observer);
        observer.onStateChange(state);
        return () -> observers.remove(observer);
    }

    boolean garbage(long nowMillis) {
        return observers.isEmpty() && inFlight == null && nowMillis - lastAccessedAtMillis >= options.gcTimeMillis();
    }

    void setState(QueryState<T> state) {
        this.state = state == null ? QueryState.idle() : state;
        List<QueryObserver<T>> snapshot = new ArrayList<>(observers);
        for (QueryObserver<T> observer : snapshot) {
            observer.onStateChange(this.state);
        }
    }

    private Promise<T> runFetch(int failureCount) {
        try {
            return fetcher.fetch().then(data -> {
                inFlight = null;
                setState(QueryState.success(data, client.now()));
                return Promise.resolve(data);
            }, error -> handleFetchError(error, failureCount));
        } catch (Throwable error) {
            return handleFetchError(error, failureCount);
        }
    }

    private Promise<T> handleFetchError(Object error, int failureCount) {
        int nextFailureCount = failureCount + 1;
        if (options.shouldRetry(nextFailureCount)) {
            return delay(options.retryDelayMillis(nextFailureCount)).then(ignored -> runFetch(nextFailureCount));
        }
        inFlight = null;
        setState(QueryState.error(error, state.data(), state.updatedAtMillis(), nextFailureCount));
        return Promise.reject(error);
    }

    private Promise<Void> delay(long delayMillis) {
        if (delayMillis <= 0) {
            return Promise.resolve((Void) null);
        }
        return new Promise<>((resolve, reject) -> DomGlobal.setTimeout(event -> resolve.onInvoke((Void) null), delayMillis));
    }

    private void touch() {
        lastAccessedAtMillis = client.now();
    }
}
