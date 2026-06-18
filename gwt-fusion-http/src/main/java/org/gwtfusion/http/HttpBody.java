package org.gwtfusion.http;

public final class HttpBody {
    private static final HttpBody EMPTY = new HttpBody(null, null);

    private final String content;
    private final String contentType;

    private HttpBody(String content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }

    public static HttpBody empty() {
        return EMPTY;
    }

    public static HttpBody text(String content) {
        return new HttpBody(content == null ? "" : content, "text/plain;charset=UTF-8");
    }

    public static HttpBody json(String json) {
        return new HttpBody(json == null ? "null" : json, "application/json;charset=UTF-8");
    }

    public static HttpBody of(String content, String contentType) {
        return new HttpBody(content == null ? "" : content, contentType);
    }

    public boolean hasContent() {
        return content != null;
    }

    public String content() {
        return content;
    }

    public String contentType() {
        return contentType;
    }
}
