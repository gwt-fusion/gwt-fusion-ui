package org.gwtfusion.http;

public enum HttpMethod {
    GET(false),
    POST(true),
    PUT(true),
    PATCH(true),
    DELETE(true),
    HEAD(false),
    OPTIONS(true);

    private final boolean allowsBody;

    HttpMethod(boolean allowsBody) {
        this.allowsBody = allowsBody;
    }

    public String value() {
        return name();
    }

    public boolean allowsBody() {
        return allowsBody;
    }
}
