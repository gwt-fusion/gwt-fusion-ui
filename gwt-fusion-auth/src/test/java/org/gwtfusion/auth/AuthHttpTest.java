package org.gwtfusion.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.gwtfusion.http.HttpClient;
import org.gwtfusion.http.HttpRequest;
import org.gwtfusion.http.HttpRequestInterceptor;
import org.junit.jupiter.api.Test;

class AuthHttpTest {
    @Test
    void addsAuthorizationHeaderForAuthenticatedSession() {
        AuthManager auth = AuthManager.create().login(AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("token")));
        HttpRequestInterceptor interceptor = AuthHttp.authorization(auth);

        HttpRequest request = interceptor.intercept(HttpClient.create().get("/users"));

        assertEquals("Bearer token", request.headers().get("Authorization"));
    }

    @Test
    void skipsHeaderWhenAnonymousExpiredOrAlreadyPresent() {
        HttpRequest anonymous = AuthHttp.authorization(AuthManager.create()).intercept(HttpClient.create().get("/users"));
        assertNull(anonymous.headers().get("Authorization"));

        AuthManager expired = AuthManager.create().login(AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("token", 1)));
        HttpRequest expiredRequest = AuthHttp.authorization(expired).intercept(HttpClient.create().get("/users"));
        assertNull(expiredRequest.headers().get("Authorization"));

        AuthManager auth = AuthManager.create().login(AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("token")));
        HttpRequest existing = AuthHttp.authorization(auth).intercept(HttpClient.create().get("/users").header("Authorization", "Custom value"));
        assertEquals("Custom value", existing.headers().get("Authorization"));
    }
}
