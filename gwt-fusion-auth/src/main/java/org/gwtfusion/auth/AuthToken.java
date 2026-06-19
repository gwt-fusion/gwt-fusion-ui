package org.gwtfusion.auth;

public final class AuthToken {
    private final String scheme;
    private final String value;
    private final Long expiresAtMillis;

    private AuthToken(String scheme, String value, Long expiresAtMillis) {
        String cleanValue = value == null ? "" : value.trim();
        if (cleanValue.isEmpty()) {
            throw new IllegalArgumentException("value must not be empty");
        }
        this.scheme = scheme == null ? "" : scheme.trim();
        this.value = cleanValue;
        this.expiresAtMillis = expiresAtMillis;
    }

    public static AuthToken bearer(String value) {
        return of("Bearer", value, null);
    }

    public static AuthToken bearer(String value, long expiresAtMillis) {
        return of("Bearer", value, expiresAtMillis);
    }

    public static AuthToken of(String scheme, String value, Long expiresAtMillis) {
        return new AuthToken(scheme, value, expiresAtMillis);
    }

    public String scheme() {
        return scheme;
    }

    public String value() {
        return value;
    }

    public boolean hasExpiration() {
        return expiresAtMillis != null;
    }

    public Long expiresAtMillis() {
        return expiresAtMillis;
    }

    public boolean expired(long nowMillis) {
        return expiresAtMillis != null && nowMillis >= expiresAtMillis;
    }

    public String authorizationHeader() {
        return scheme.isEmpty() ? value : scheme + " " + value;
    }
}
