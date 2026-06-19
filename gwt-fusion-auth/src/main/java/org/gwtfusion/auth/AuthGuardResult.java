package org.gwtfusion.auth;

public final class AuthGuardResult {
    private final AuthGuardResultType type;
    private final String redirectPath;

    private AuthGuardResult(AuthGuardResultType type, String redirectPath) {
        this.type = type == null ? AuthGuardResultType.WAIT : type;
        this.redirectPath = redirectPath == null ? "" : redirectPath;
    }

    public static AuthGuardResult allow() {
        return new AuthGuardResult(AuthGuardResultType.ALLOW, "");
    }

    public static AuthGuardResult waitForAuth() {
        return new AuthGuardResult(AuthGuardResultType.WAIT, "");
    }

    public static AuthGuardResult redirect(String redirectPath) {
        return new AuthGuardResult(AuthGuardResultType.REDIRECT, redirectPath);
    }

    public AuthGuardResultType type() {
        return type;
    }

    public String redirectPath() {
        return redirectPath;
    }

    public boolean allowed() {
        return type == AuthGuardResultType.ALLOW;
    }
}
