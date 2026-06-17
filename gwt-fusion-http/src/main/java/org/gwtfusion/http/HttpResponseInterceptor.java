package org.gwtfusion.http;

@FunctionalInterface
public interface HttpResponseInterceptor {
    HttpResponse intercept(HttpResponse response);
}
