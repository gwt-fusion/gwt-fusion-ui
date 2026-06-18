package org.gwtfusion.http;

@FunctionalInterface
public interface HttpRequestInterceptor {
    HttpRequest intercept(HttpRequest request);
}
