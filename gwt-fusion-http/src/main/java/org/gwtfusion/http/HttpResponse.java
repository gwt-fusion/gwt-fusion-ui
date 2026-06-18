package org.gwtfusion.http;

import elemental2.dom.Response;
import elemental2.promise.Promise;

public final class HttpResponse {
    private final HttpRequest request;
    private final Response response;

    HttpResponse(HttpRequest request, Response response) {
        this.request = request;
        this.response = response;
    }

    public HttpRequest request() {
        return request;
    }

    public Response raw() {
        return response;
    }

    public String url() {
        return request.urlWithQuery();
    }

    public boolean ok() {
        return response.ok;
    }

    public int status() {
        return response.status;
    }

    public String statusText() {
        return response.statusText;
    }

    public String header(String name) {
        return response.headers == null ? null : response.headers.get(name);
    }

    public Promise<String> text() {
        return response.text();
    }

    public Promise<Object> json() {
        return response.json();
    }

    public <T> Promise<T> parse(HttpResponseParser<T> parser) {
        return parser.parse(this);
    }
}
