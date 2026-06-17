package org.gwtfusion.http;

import elemental2.dom.Headers;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class HttpHeaders {
    private final Map<String, HeaderValue> values = new LinkedHashMap<>();

    public HttpHeaders() {
    }

    public HttpHeaders(HttpHeaders source) {
        if (source != null) {
            values.putAll(source.values);
        }
    }

    public HttpHeaders set(String name, String value) {
        if (isBlank(name)) {
            return this;
        }
        String key = key(name);
        if (value == null) {
            values.remove(key);
        } else {
            values.put(key, new HeaderValue(name.trim(), value));
        }
        return this;
    }

    public HttpHeaders remove(String name) {
        if (!isBlank(name)) {
            values.remove(key(name));
        }
        return this;
    }

    public boolean has(String name) {
        return !isBlank(name) && values.containsKey(key(name));
    }

    public String get(String name) {
        HeaderValue value = isBlank(name) ? null : values.get(key(name));
        return value == null ? null : value.value;
    }

    public Map<String, String> asMap() {
        Map<String, String> headers = new LinkedHashMap<>();
        for (HeaderValue value : values.values()) {
            headers.put(value.name, value.value);
        }
        return Collections.unmodifiableMap(headers);
    }

    Headers toFetchHeaders() {
        Headers headers = new Headers();
        for (HeaderValue value : values.values()) {
            headers.set(value.name, value.value);
        }
        return headers;
    }

    private static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    private static String key(String value) {
        return value.trim().toLowerCase();
    }

    private static final class HeaderValue {
        final String name;
        final String value;

        HeaderValue(String name, String value) {
            this.name = name;
            this.value = value;
        }
    }
}
