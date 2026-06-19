package org.gwtfusion.auth;

public final class AuthState {
    private final AuthStatus status;
    private final AuthSession session;
    private final String message;

    private AuthState(AuthStatus status, AuthSession session, String message) {
        this.status = status == null ? AuthStatus.ANONYMOUS : status;
        this.session = session;
        this.message = message == null ? "" : message;
    }

    public static AuthState anonymous() {
        return new AuthState(AuthStatus.ANONYMOUS, null, "");
    }

    public static AuthState loading() {
        return new AuthState(AuthStatus.LOADING, null, "");
    }

    public static AuthState authenticated(AuthSession session) {
        if (session == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        return new AuthState(AuthStatus.AUTHENTICATED, session, "");
    }

    public static AuthState expired(AuthSession session) {
        return new AuthState(AuthStatus.EXPIRED, session, "");
    }

    public static AuthState failed(String message) {
        return new AuthState(AuthStatus.FAILED, null, message);
    }

    public AuthStatus status() {
        return status;
    }

    public AuthSession session() {
        return session;
    }

    public String message() {
        return message;
    }

    public boolean authenticated() {
        return status == AuthStatus.AUTHENTICATED && session != null;
    }

    public boolean terminalFailure() {
        return status == AuthStatus.FAILED || status == AuthStatus.EXPIRED;
    }
}
