package org.gwtfusion.http;

import elemental2.promise.Promise;
import java.util.function.Function;

@FunctionalInterface
public interface HttpResponseParser<T> {
    Promise<T> parse(HttpResponse response);

    static HttpResponseParser<String> text() {
        return HttpResponse::text;
    }

    static HttpResponseParser<Object> json() {
        return HttpResponse::json;
    }

    static <T> HttpResponseParser<T> json(Function<Object, T> parser) {
        return response -> response.json().then(json -> Promise.resolve(parser.apply(json)));
    }

    static <T> HttpResponseParser<T> text(Function<String, T> parser) {
        return response -> response.text().then(text -> Promise.resolve(parser.apply(text)));
    }

    static <T> HttpResponseParser<T> of(Function<HttpResponse, T> parser) {
        return response -> Promise.resolve(parser.apply(response));
    }
}
