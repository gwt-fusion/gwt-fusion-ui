package org.gwtfusion.auth;

import org.gwtfusion.http.HttpRequestInterceptor;

public final class AuthHttp {
    private AuthHttp() {
    }

    public static HttpRequestInterceptor authorization(AuthManager auth) {
        return request -> {
            if (auth == null || request == null || request.headers().get("Authorization") != null) {
                return request;
            }
            AuthState state = auth.state();
            if (!state.authenticated()) {
                return request;
            }
            AuthToken token = state.session().accessToken();
            if (token == null || token.expired(System.currentTimeMillis())) {
                return request;
            }
            return request.copy().header("Authorization", token.authorizationHeader());
        };
    }
}
