package org.gwtfusion.auth;

@FunctionalInterface
public interface AuthRefreshHandler {
    void refresh(AuthRefreshContext context);
}
