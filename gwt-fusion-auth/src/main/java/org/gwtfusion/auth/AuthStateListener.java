package org.gwtfusion.auth;

@FunctionalInterface
public interface AuthStateListener {
    void onStateChange(AuthState state);
}
