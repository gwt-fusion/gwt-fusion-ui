package org.gwtfusion.query;

public final class QueryOptions {
    private long staleTimeMillis;
    private long gcTimeMillis = 5 * 60 * 1_000L;
    private boolean enabled = true;
    private int retryCount;
    private QueryRetryDelay retryDelay = QueryRetryDelay.immediate();

    private QueryOptions() {
    }

    public static QueryOptions create() {
        return new QueryOptions();
    }

    public QueryOptions staleTime(long staleTimeMillis) {
        this.staleTimeMillis = Math.max(0, staleTimeMillis);
        return this;
    }

    public long staleTimeMillis() {
        return staleTimeMillis;
    }

    public QueryOptions gcTime(long gcTimeMillis) {
        this.gcTimeMillis = Math.max(0, gcTimeMillis);
        return this;
    }

    public QueryOptions cacheTime(long cacheTimeMillis) {
        return gcTime(cacheTimeMillis);
    }

    public long gcTimeMillis() {
        return gcTimeMillis;
    }

    public QueryOptions enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public QueryOptions retry(int retryCount) {
        this.retryCount = Math.max(0, retryCount);
        return this;
    }

    public int retryCount() {
        return retryCount;
    }

    public QueryOptions retryDelay(QueryRetryDelay retryDelay) {
        this.retryDelay = retryDelay == null ? QueryRetryDelay.immediate() : retryDelay;
        return this;
    }

    public long retryDelayMillis(int failureCount) {
        return Math.max(0, retryDelay.delayMillis(failureCount));
    }

    public boolean shouldRetry(int failureCount) {
        return failureCount > 0 && failureCount <= retryCount;
    }

    public boolean stale(long updatedAtMillis, long nowMillis) {
        return updatedAtMillis < 0 || nowMillis - updatedAtMillis >= staleTimeMillis;
    }
}
