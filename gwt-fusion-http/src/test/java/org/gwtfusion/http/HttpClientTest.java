package org.gwtfusion.http;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

class HttpClientTest {
    @Test
    void requestInterceptorsCanAddSharedHeaders() {
        HttpClient client = HttpClient.create()
                .addRequestInterceptor(request -> request.copy().header("Authorization", "Bearer token"))
                .addRequestInterceptor(request -> request.header("X-Correlation-Id", "demo"));
        HttpRequest original = client.get("/users");

        HttpRequest prepared = client.prepare(original);

        assertNotSame(original, prepared);
        assertEquals("Bearer token", prepared.headers().get("authorization"));
        assertEquals("demo", prepared.headers().get("x-correlation-id"));
        assertEquals(null, original.headers().get("authorization"));
    }

    @Test
    void nullInterceptorsAreIgnored() {
        HttpClient client = HttpClient.create()
                .addRequestInterceptor(null)
                .addResponseInterceptor(null);

        assertEquals("/users", client.prepare(client.get("/users")).urlWithQuery());
    }
}
