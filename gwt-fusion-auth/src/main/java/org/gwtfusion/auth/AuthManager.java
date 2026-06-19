package org.gwtfusion.auth;

import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.router.ListenerRegistration;

public final class AuthManager {
    private final List<AuthStateListener> listeners = new ArrayList<>();
    private AuthState state = AuthState.anonymous();
    private AuthSessionStore sessionStore;

    private AuthManager() {
    }

    public static AuthManager create() {
        return new AuthManager();
    }

    public AuthManager sessionStore(AuthSessionStore sessionStore) {
        this.sessionStore = sessionStore;
        return this;
    }

    public AuthState state() {
        return state;
    }

    public AuthSession session() {
        return state.session();
    }

    public ListenerRegistration onStateChange(AuthStateListener listener) {
        if (listener == null) {
            return ListenerRegistration.empty();
        }
        listeners.add(listener);
        return () -> listeners.remove(listener);
    }

    public AuthManager loading() {
        setState(AuthState.loading());
        return this;
    }

    public AuthManager login(AuthSession session) {
        if (sessionStore != null) {
            sessionStore.save(session);
        }
        setState(AuthState.authenticated(session));
        return this;
    }

    public AuthManager logout() {
        if (sessionStore != null) {
            sessionStore.clear();
        }
        setState(AuthState.anonymous());
        return this;
    }

    public AuthManager expire() {
        setState(AuthState.expired(state.session()));
        return this;
    }

    public AuthManager fail(String message) {
        setState(AuthState.failed(message));
        return this;
    }

    public AuthManager restore() {
        if (sessionStore == null) {
            return this;
        }
        AuthSession session = sessionStore.load();
        if (session == null) {
            setState(AuthState.anonymous());
        } else if (session.accessTokenExpired(System.currentTimeMillis())) {
            setState(AuthState.expired(session));
        } else {
            setState(AuthState.authenticated(session));
        }
        return this;
    }

    public AuthManager refresh(AuthRefreshHandler handler) {
        AuthSession current = state.session();
        if (handler == null || current == null) {
            return expire();
        }
        setState(AuthState.loading());
        handler.refresh(new AuthRefreshContext(this, current));
        return this;
    }

    private void setState(AuthState state) {
        this.state = state == null ? AuthState.anonymous() : state;
        List<AuthStateListener> snapshot = new ArrayList<>(listeners);
        for (AuthStateListener listener : snapshot) {
            listener.onStateChange(this.state);
        }
    }
}
