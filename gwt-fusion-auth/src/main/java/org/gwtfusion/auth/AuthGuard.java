package org.gwtfusion.auth;

import org.gwtfusion.router.ListenerRegistration;
import org.gwtfusion.router.RouteContext;
import org.gwtfusion.router.RouteLocation;
import org.gwtfusion.router.RouteRenderer;

public final class AuthGuard {
    private AuthGuard() {
    }

    public static RouteRenderer requireAuthenticated(AuthManager auth, RouteRenderer renderer, String loginPath) {
        ListenerRegistration[] pendingRegistration = {ListenerRegistration.empty()};
        boolean[] waiting = {false};
        return context -> {
            AuthGuardResult result = decide(auth == null ? AuthState.anonymous() : auth.state(), context.location(), loginPath);
            if (result.type() == AuthGuardResultType.ALLOW) {
                clearPending(pendingRegistration, waiting);
                return renderer == null ? null : renderer.render(context);
            }
            if (result.type() == AuthGuardResultType.REDIRECT) {
                clearPending(pendingRegistration, waiting);
                context.router().replace(result.redirectPath());
            } else if (result.type() == AuthGuardResultType.WAIT && auth != null && !waiting[0]) {
                waiting[0] = true;
                RouteLocation guardedLocation = context.location();
                pendingRegistration[0] = auth.onStateChange(state -> {
                    if (state.status() == AuthStatus.LOADING) {
                        return;
                    }
                    clearPending(pendingRegistration, waiting);
                    if (guardedLocation.equals(context.router().location())) {
                        context.router().replace(guardedLocation.asPath());
                    }
                });
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
        for (int i = 0; i < value.length();) {
            int c = value.codePointAt(i);
            i += Character.charCount(c);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.' || c == '~') {
                builder.appendCodePoint(c);
            } else {
                appendUtf8(builder, c);
            }
        }
        return builder.toString();
    }

    private static void clearPending(ListenerRegistration[] pendingRegistration, boolean[] waiting) {
        pendingRegistration[0].remove();
        pendingRegistration[0] = ListenerRegistration.empty();
        waiting[0] = false;
    }

    private static void appendUtf8(StringBuilder builder, int value) {
        if (value <= 0x7F) {
            appendHex(builder, value);
        } else if (value <= 0x7FF) {
            appendHex(builder, 0xC0 | (value >> 6));
            appendHex(builder, 0x80 | (value & 0x3F));
        } else if (value <= 0xFFFF) {
            appendHex(builder, 0xE0 | (value >> 12));
            appendHex(builder, 0x80 | ((value >> 6) & 0x3F));
            appendHex(builder, 0x80 | (value & 0x3F));
        } else {
            appendHex(builder, 0xF0 | (value >> 18));
            appendHex(builder, 0x80 | ((value >> 12) & 0x3F));
            appendHex(builder, 0x80 | ((value >> 6) & 0x3F));
            appendHex(builder, 0x80 | (value & 0x3F));
        }
    }

    private static void appendHex(StringBuilder builder, int value) {
        builder.append('%');
        builder.append(Character.toUpperCase(Character.forDigit(value >> 4 & 0xF, 16)));
        builder.append(Character.toUpperCase(Character.forDigit(value & 0xF, 16)));
    }
}
