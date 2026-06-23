package org.gwtfusion.query;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class QueryClient {
    private final Map<QueryKey, Query<?>> queries = new LinkedHashMap<>();
    private QueryClock clock = System::currentTimeMillis;

    private QueryClient() {
    }

    public static QueryClient create() {
        return new QueryClient();
    }

    public QueryClient clock(QueryClock clock) {
        this.clock = clock == null ? System::currentTimeMillis : clock;
        return this;
    }

    long now() {
        return clock.now();
    }

    public <T> Query<T> query(QueryKey key, QueryFetcher<T> fetcher) {
        return query(key, fetcher, QueryOptions.create());
    }

    @SuppressWarnings("unchecked")
    public <T> Query<T> query(QueryKey key, QueryFetcher<T> fetcher, QueryOptions options) {
        requireKey(key);
        Query<?> existing = queries.get(key);
        if (existing != null) {
            return (Query<T>) existing;
        }
        Query<T> query = new Query<>(this, key, fetcher, options == null ? QueryOptions.create() : options);
        queries.put(key, query);
        return query;
    }

    @SuppressWarnings("unchecked")
    public <T> Query<T> get(QueryKey key) {
        requireKey(key);
        return (Query<T>) queries.get(key);
    }

    public <T> Query<T> fetchQuery(QueryKey key, QueryFetcher<T> fetcher, QueryOptions options) {
        Query<T> query = query(key, fetcher, options);
        if (query.shouldFetch()) {
            query.refetch();
        }
        return query;
    }

    public QueryClient invalidate(QueryKey prefix) {
        requireKey(prefix);
        for (Query<?> query : queries.values()) {
            if (query.key().startsWith(prefix)) {
                query.markStale();
            }
        }
        return this;
    }

    public QueryClient remove(QueryKey key) {
        requireKey(key);
        queries.remove(key);
        return this;
    }

    public QueryClient collectGarbage() {
        long now = now();
        List<QueryKey> remove = new ArrayList<>();
        for (Query<?> query : queries.values()) {
            if (query.garbage(now)) {
                remove.add(query.key());
            }
        }
        for (QueryKey key : remove) {
            queries.remove(key);
        }
        return this;
    }

    public List<QueryKey> keys() {
        return Collections.unmodifiableList(new ArrayList<>(queries.keySet()));
    }

    public int size() {
        return queries.size();
    }

    private static void requireKey(QueryKey key) {
        if (key == null) {
            throw new IllegalArgumentException("query key must not be null");
        }
    }
}
