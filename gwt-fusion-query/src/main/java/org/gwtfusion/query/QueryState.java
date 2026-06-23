package org.gwtfusion.query;

public final class QueryState<T> {
    private final QueryStatus status;
    private final T data;
    private final Object error;
    private final long updatedAtMillis;
    private final boolean fetching;
    private final boolean stale;
    private final int failureCount;

    private QueryState(QueryStatus status, T data, Object error, long updatedAtMillis, boolean fetching, boolean stale, int failureCount) {
        this.status = status == null ? QueryStatus.IDLE : status;
        this.data = data;
        this.error = error;
        this.updatedAtMillis = updatedAtMillis;
        this.fetching = fetching;
        this.stale = stale;
        this.failureCount = Math.max(0, failureCount);
    }

    public static <T> QueryState<T> idle() {
        return new QueryState<>(QueryStatus.IDLE, null, null, 0, false, true, 0);
    }

    public static <T> QueryState<T> loading() {
        return new QueryState<>(QueryStatus.LOADING, null, null, 0, true, true, 0);
    }

    public static <T> QueryState<T> refreshing(T data, long updatedAtMillis) {
        return new QueryState<>(QueryStatus.SUCCESS, data, null, updatedAtMillis, true, true, 0);
    }

    public static <T> QueryState<T> success(T data, long updatedAtMillis) {
        return new QueryState<>(QueryStatus.SUCCESS, data, null, updatedAtMillis, false, false, 0);
    }

    public static <T> QueryState<T> error(Object error, T data, long updatedAtMillis, int failureCount) {
        return new QueryState<>(QueryStatus.ERROR, data, error, updatedAtMillis, false, true, failureCount);
    }

    public QueryStatus status() {
        return status;
    }

    public T data() {
        return data;
    }

    public boolean hasData() {
        return data != null;
    }

    public Object error() {
        return error;
    }

    public String errorMessage() {
        return error == null ? "" : String.valueOf(error);
    }

    public long updatedAtMillis() {
        return updatedAtMillis;
    }

    public boolean fetching() {
        return fetching;
    }

    public boolean isLoading() {
        return status == QueryStatus.LOADING;
    }

    public boolean isSuccess() {
        return status == QueryStatus.SUCCESS;
    }

    public boolean isError() {
        return status == QueryStatus.ERROR;
    }

    public boolean isIdle() {
        return status == QueryStatus.IDLE;
    }

    public boolean isRefreshing() {
        return status == QueryStatus.SUCCESS && fetching;
    }

    public boolean stale() {
        return stale;
    }

    public int failureCount() {
        return failureCount;
    }

    public QueryState<T> asStale() {
        return staleCopy();
    }

    QueryState<T> staleCopy() {
        return new QueryState<>(status, data, error, updatedAtMillis, fetching, true, failureCount);
    }
}
