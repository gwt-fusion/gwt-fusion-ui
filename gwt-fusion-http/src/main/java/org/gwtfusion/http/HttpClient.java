package org.gwtfusion.http;

import elemental2.dom.DomGlobal;
import elemental2.promise.Promise;
import java.util.ArrayList;
import java.util.List;

public final class HttpClient {
    private final List<HttpRequestInterceptor> requestInterceptors = new ArrayList<>();
    private final List<HttpResponseInterceptor> responseInterceptors = new ArrayList<>();
    private String baseUrl = "";

    private HttpClient() {
    }

    public static HttpClient create() {
        return new HttpClient();
    }

    public HttpClient baseUrl(String baseUrl) {
        this.baseUrl = baseUrl == null ? "" : baseUrl.trim();
        return this;
    }

    public String baseUrl() {
        return baseUrl;
    }

    public HttpClient addRequestInterceptor(HttpRequestInterceptor interceptor) {
        if (interceptor != null) {
            requestInterceptors.add(interceptor);
        }
        return this;
    }

    public HttpClient addResponseInterceptor(HttpResponseInterceptor interceptor) {
        if (interceptor != null) {
            responseInterceptors.add(interceptor);
        }
        return this;
    }

    public HttpRequest request(HttpMethod method, String url) {
        return new HttpRequest(this, method, url);
    }

    public HttpRequest get(String url) {
        return request(HttpMethod.GET, url);
    }

    public HttpRequest post(String url) {
        return request(HttpMethod.POST, url);
    }

    public HttpRequest put(String url) {
        return request(HttpMethod.PUT, url);
    }

    public HttpRequest patch(String url) {
        return request(HttpMethod.PATCH, url);
    }

    public HttpRequest delete(String url) {
        return request(HttpMethod.DELETE, url);
    }

    public Promise<HttpResponse> send(HttpRequest request) {
        HttpRequest prepared = prepare(request);
        return DomGlobal.fetch(prepared.urlWithQuery(), prepared.toRequestInit())
                .then(response -> Promise.resolve(applyResponseInterceptors(new HttpResponse(prepared, response))));
    }

    public Promise<HttpResponse> sendOk(HttpRequest request) {
        return send(request).then(response -> {
            if (!response.ok()) {
                throw HttpError.from(response);
            }
            return Promise.resolve(response);
        });
    }

    public <T> Promise<T> send(HttpRequest request, HttpResponseParser<T> parser) {
        return sendOk(request).then(response -> parser.parse(response));
    }

    HttpRequest prepare(HttpRequest request) {
        HttpRequest prepared = request.copy();
        for (HttpRequestInterceptor interceptor : requestInterceptors) {
            HttpRequest intercepted = interceptor.intercept(prepared);
            if (intercepted != null) {
                prepared = intercepted;
            }
        }
        return prepared;
    }

    HttpResponse applyResponseInterceptors(HttpResponse response) {
        HttpResponse current = response;
        for (HttpResponseInterceptor interceptor : responseInterceptors) {
            HttpResponse intercepted = interceptor.intercept(current);
            if (intercepted != null) {
                current = intercepted;
            }
        }
        return current;
    }

    String resolve(String url) {
        if (url == null || url.isEmpty() || isAbsolute(url) || baseUrl.isEmpty()) {
            return url == null ? "" : url;
        }
        if (baseUrl.endsWith("/") && url.startsWith("/")) {
            return baseUrl.substring(0, baseUrl.length() - 1) + url;
        }
        if (!baseUrl.endsWith("/") && !url.startsWith("/")) {
            return baseUrl + "/" + url;
        }
        return baseUrl + url;
    }

    private static boolean isAbsolute(String url) {
        if (url.startsWith("//")) {
            return true;
        }
        int schemeEnd = url.indexOf(':');
        if (schemeEnd <= 0) {
            return false;
        }
        for (int i = 0; i < schemeEnd; i++) {
            char c = url.charAt(i);
            boolean valid = (c >= 'a' && c <= 'z')
                    || (c >= 'A' && c <= 'Z')
                    || (i > 0 && ((c >= '0' && c <= '9') || c == '+' || c == '-' || c == '.'));
            if (!valid) {
                return false;
            }
        }
        return true;
    }
}
