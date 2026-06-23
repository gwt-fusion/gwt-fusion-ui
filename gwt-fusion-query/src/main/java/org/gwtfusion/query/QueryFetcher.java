package org.gwtfusion.query;

import elemental2.promise.Promise;

@FunctionalInterface
public interface QueryFetcher<T> {
    Promise<T> fetch();
}
