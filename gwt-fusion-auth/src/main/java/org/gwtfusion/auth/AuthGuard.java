package org.gwtfusion.auth;

import org.gwtfusion.router.RouteContext;
import org.gwtfusion.router.RouteLocation;
import org.gwtfusion.router.RouteRenderer;

public final class AuthGuard {
    private AuthGuard() {
    }

    public static RouteRenderer requireAuthenticated(AuthManager auth, RouteRenderer renderer, String loginPath) {
        return context -> {
            AuthGuardResult result = decide(auth == null ? AuthState.anonymous() : auth.state(), context.location(), loginPath);
            if (result.type() == AuthGuardResultType.ALLOW) {
                return renderer == null ? null : renderer.render(context);
            }
            if (result.type() == AuthGuardResultType.REDIRECT) {
                context.router().replace(result.redirectPath());
            }
            return null;
        };
    }

    public static AuthGuardResult decide(AuthState state, RouteLocation location, String loginPath) {
        AuthState current = state == null ? AuthState.anonymous() : state;
        if (current.status() == AuthStatus.LOADING) {
            return AuthGuardResult.waitForAuth();
        }
        if (current.authenticated() && !current.session().accessTokenExpired(System.currentTimeMillis())) {
            return AuthGuardResult.allow();
        }
        return AuthGuardResult.redirect(withRedirect(loginPath, location));
    }

    private static String withRedirect(String loginPath, RouteLocation location) {
        String path = loginPath == null || loginPath.trim().isEmpty() ? "/login" : loginPath.trim();
        if (location == null) {
            return path;
        }
        return path + (path.contains("?") ? "&" : "?") + "redirect=" + encode(location.asPath());
    }

    private static String encode(String value) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.' || c == '~') {
                builder.append(c);
            } else if (c <= 0x7F) {
                appendHex(builder, c);
            } else {
                appendHex(builder, 0xC0 | (c >> 6));
                appendHex(builder, 0x80 | (c & 0x3F));
            }
        }
        return builder.toString();
    }

    private static void appendHex(StringBuilder builder, int value) {
        builder.append('%');
        builder.append(Character.toUpperCase(Character.forDigit(value >> 4 & 0xF, 16)));
        builder.append(Character.toUpperCase(Character.forDigit(value & 0xF, 16)));
    }
}
