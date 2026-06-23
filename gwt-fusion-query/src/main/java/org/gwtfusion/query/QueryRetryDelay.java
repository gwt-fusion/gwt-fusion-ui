package org.gwtfusion.query;

@FunctionalInterface
public interface QueryRetryDelay {
    long delayMillis(int failureCount);

    static QueryRetryDelay immediate() {
        return failureCount -> 0;
    }

    static QueryRetryDelay fixed(long delayMillis) {
        long clean = Math.max(0, delayMillis);
        return failureCount -> clean;
    }

    static QueryRetryDelay exponential(long baseDelayMillis, long maxDelayMillis) {
        long base = Math.max(0, baseDelayMillis);
        long max = Math.max(base, maxDelayMillis);
        return failureCount -> {
            if (base == 0 || failureCount <= 0) {
                return 0;
            }
            long delay = base;
            for (int i = 1; i < failureCount; i++) {
                if (delay >= max / 2) {
                    return max;
                }
                delay *= 2;
            }
            return Math.min(delay, max);
        };
    }
}
