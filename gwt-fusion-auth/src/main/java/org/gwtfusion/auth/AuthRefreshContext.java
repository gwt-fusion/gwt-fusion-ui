package org.gwtfusion.auth;

public final class AuthRefreshContext {
    private final AuthManager manager;
    private final AuthSession session;

    AuthRefreshContext(AuthManager manager, AuthSession session) {
        this.manager = manager;
        this.session = session;
    }

    public AuthSession session() {
        return session;
    }

    public void complete(AuthSession session) {
        manager.login(session);
    }

    public void fail(String message) {
        manager.fail(message);
    }

    public void logout() {
        manager.logout();
    }
}
