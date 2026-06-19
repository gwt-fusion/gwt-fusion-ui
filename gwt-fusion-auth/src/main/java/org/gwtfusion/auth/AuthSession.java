package org.gwtfusion.auth;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AuthSession {
    private final AuthUser user;
    private final AuthToken accessToken;
    private final AuthToken refreshToken;
    private final Map<String, String> metadata;

    private AuthSession(AuthUser user, AuthToken accessToken, AuthToken refreshToken, Map<String, String> metadata) {
        if (user == null) {
            throw new IllegalArgumentException("user must not be null");
        }
        this.user = user;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.metadata = Collections.unmodifiableMap(new LinkedHashMap<>(metadata == null ? Collections.emptyMap() : metadata));
    }

    public static AuthSession of(AuthUser user) {
        return new AuthSession(user, null, null, null);
    }

    public static AuthSession of(AuthUser user, AuthToken accessToken) {
        return new AuthSession(user, accessToken, null, null);
    }

    public AuthSession withAccessToken(AuthToken accessToken) {
        return new AuthSession(user, accessToken, refreshToken, metadata);
    }

    public AuthSession withRefreshToken(AuthToken refreshToken) {
        return new AuthSession(user, accessToken, refreshToken, metadata);
    }

    public AuthSession withMetadata(String name, String value) {
        if (name == null || name.trim().isEmpty()) {
            return this;
        }
        Map<String, String> next = new LinkedHashMap<>(metadata);
        next.put(name.trim(), value == null ? "" : value);
        return new AuthSession(user, accessToken, refreshToken, next);
    }

    public AuthUser user() {
        return user;
    }

    public AuthToken accessToken() {
        return accessToken;
    }

    public boolean hasAccessToken() {
        return accessToken != null;
    }

    public AuthToken refreshToken() {
        return refreshToken;
    }

    public boolean hasRefreshToken() {
        return refreshToken != null;
    }

    public Map<String, String> metadata() {
        return metadata;
    }

    public boolean accessTokenExpired(long nowMillis) {
        return accessToken != null && accessToken.expired(nowMillis);
    }
}
