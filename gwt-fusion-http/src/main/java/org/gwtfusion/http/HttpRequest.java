package org.gwtfusion.http;

import elemental2.dom.RequestInit;
import elemental2.promise.Promise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class HttpRequest {
    private final HttpClient client;
    private HttpMethod method;
    private String url;
    private final HttpHeaders headers;
    private final Map<String, List<String>> query = new LinkedHashMap<>();
    private HttpBody body = HttpBody.empty();
    private String managedContentType;
    private String credentials;
    private String mode;

    HttpRequest(HttpClient client, HttpMethod method, String url) {
        this.client = client;
        this.method = method == null ? HttpMethod.GET : method;
        this.url = url == null ? "" : url;
        this.headers = new HttpHeaders();
    }

    private HttpRequest(HttpRequest source) {
        this.client = source.client;
        this.method = source.method;
        this.url = source.url;
        this.headers = new HttpHeaders(source.headers);
        for (Map.Entry<String, List<String>> entry : source.query.entrySet()) {
            this.query.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        this.body = source.body;
        this.managedContentType = source.managedContentType;
        this.credentials = source.credentials;
        this.mode = source.mode;
    }

    public HttpRequest copy() {
        return new HttpRequest(this);
    }

    public HttpRequest method(HttpMethod method) {
        this.method = method == null ? HttpMethod.GET : method;
        return this;
    }

    public HttpMethod method() {
        return method;
    }

    public HttpRequest url(String url) {
        this.url = url == null ? "" : url;
        return this;
    }

    public String url() {
        return url;
    }

    public HttpRequest header(String name, String value) {
        headers.set(name, value);
        if (isContentType(name)) {
            managedContentType = null;
        }
        return this;
    }

    public HttpHeaders headers() {
        return headers;
    }

    public HttpRequest query(String name, String value) {
        if (name != null && !name.isEmpty()) {
            query.computeIfAbsent(name, ignored -> new ArrayList<>()).add(value == null ? "" : value);
        }
        return this;
    }

    public HttpRequest query(String name, int value) {
        return query(name, String.valueOf(value));
    }

    public Map<String, List<String>> query() {
        Map<String, List<String>> copy = new LinkedHashMap<>();
        for (Map.Entry<String, List<String>> entry : query.entrySet()) {
            copy.put(entry.getKey(), Collections.unmodifiableList(new ArrayList<>(entry.getValue())));
        }
        return Collections.unmodifiableMap(copy);
    }

    public HttpRequest body(HttpBody body) {
        this.body = body == null ? HttpBody.empty() : body;
        String currentContentType = headers.get("Content-Type");
        if (this.body.contentType() == null) {
            if (managedContentType != null && managedContentType.equals(currentContentType)) {
                headers.remove("Content-Type");
            }
            managedContentType = null;
        } else if (currentContentType == null || (managedContentType != null && managedContentType.equals(currentContentType))) {
            managedContentType = this.body.contentType();
            headers.set("Content-Type", managedContentType);
        } else {
            managedContentType = null;
        }
        return this;
    }

    public HttpRequest text(String text) {
        return body(HttpBody.text(text));
    }

    public HttpRequest json(String json) {
        return body(HttpBody.json(json));
    }

    public HttpBody body() {
        return body;
    }

    public HttpRequest credentials(String credentials) {
        this.credentials = credentials;
        return this;
    }

    public String credentials() {
        return credentials;
    }

    public HttpRequest mode(String mode) {
        this.mode = mode;
        return this;
    }

    public String mode() {
        return mode;
    }

    public String urlWithQuery() {
        String resolved = client.resolve(url);
        if (query.isEmpty()) {
            return resolved;
        }
        StringBuilder builder = new StringBuilder(resolved);
        builder.append(resolved.contains("?") ? '&' : '?');
        boolean first = true;
        for (Map.Entry<String, List<String>> entry : query.entrySet()) {
            for (String value : entry.getValue()) {
                if (!first) {
                    builder.append('&');
                }
                builder.append(HttpUrlEncoding.encode(entry.getKey()))
                        .append('=')
                        .append(HttpUrlEncoding.encode(value));
                first = false;
            }
        }
        return builder.toString();
    }

    public Promise<HttpResponse> send() {
        return client.send(this);
    }

    public Promise<HttpResponse> sendOk() {
        return client.sendOk(this);
    }

    public <T> Promise<T> send(HttpResponseParser<T> parser) {
        return client.send(this, parser);
    }

    RequestInit toRequestInit() {
        RequestInit init = RequestInit.create();
        init.setMethod(method.value());
        init.setHeaders(headers.toFetchHeaders());
        if (credentials != null && !credentials.isEmpty()) {
            init.setCredentials(credentials);
        }
        if (mode != null && !mode.isEmpty()) {
            init.setMode(mode);
        }
        if (method.allowsBody() && body.hasContent()) {
            init.setBody(body.content());
        }
        return init;
    }

    private static boolean isContentType(String name) {
        return name != null && "Content-Type".equalsIgnoreCase(name.trim());
    }
}
