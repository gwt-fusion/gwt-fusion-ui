package org.gwtfusion.query;

public final class MutationState<T> {
    private final MutationStatus status;
    private final T data;
    private final Object error;
    private final long updatedAtMillis;

    private MutationState(MutationStatus status, T data, Object error, long updatedAtMillis) {
        this.status = status == null ? MutationStatus.IDLE : status;
        this.data = data;
        this.error = error;
        this.updatedAtMillis = updatedAtMillis;
    }

    public static <T> MutationState<T> idle() {
        return new MutationState<>(MutationStatus.IDLE, null, null, 0);
    }

    public static <T> MutationState<T> loading(T data) {
        return new MutationState<>(MutationStatus.LOADING, data, null, 0);
    }

    public static <T> MutationState<T> success(T data, long updatedAtMillis) {
        return new MutationState<>(MutationStatus.SUCCESS, data, null, updatedAtMillis);
    }

    public static <T> MutationState<T> error(Object error, T data, long updatedAtMillis) {
        return new MutationState<>(MutationStatus.ERROR, data, error, updatedAtMillis);
    }

    public MutationStatus status() {
        return status;
    }

    public T data() {
        return data;
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

    public boolean isIdle() {
        return status == MutationStatus.IDLE;
    }

    public boolean isLoading() {
        return status == MutationStatus.LOADING;
    }

    public boolean isSuccess() {
        return status == MutationStatus.SUCCESS;
    }

    public boolean isError() {
        return status == MutationStatus.ERROR;
    }
}
