package org.gwtfusion.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gwtfusion.router.RouteLocation;
import org.junit.jupiter.api.Test;

class AuthGuardTest {
    @Test
    void allowsAuthenticatedSession() {
        AuthState state = AuthState.authenticated(AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("token")));

        AuthGuardResult result = AuthGuard.decide(state, RouteLocation.parse("/admin"), "/login");

        assertEquals(AuthGuardResultType.ALLOW, result.type());
    }

    @Test
    void waitsWhileLoading() {
        AuthGuardResult result = AuthGuard.decide(AuthState.loading(), RouteLocation.parse("/admin"), "/login");

        assertEquals(AuthGuardResultType.WAIT, result.type());
    }

    @Test
    void redirectsAnonymousExpiredAndFailedStates() {
        AuthGuardResult anonymous = AuthGuard.decide(AuthState.anonymous(), RouteLocation.parse("/admin?tab=users"), "/login");
        AuthGuardResult expired = AuthGuard.decide(AuthState.expired(AuthSession.of(AuthUser.of("u1"))), RouteLocation.parse("/admin"), "/login");
        AuthGuardResult failed = AuthGuard.decide(AuthState.failed("nope"), RouteLocation.parse("/admin"), "/login");

        assertEquals(AuthGuardResultType.REDIRECT, anonymous.type());
        assertEquals("/login?redirect=%2Fadmin%3Ftab%3Dusers", anonymous.redirectPath());
        assertEquals(AuthGuardResultType.REDIRECT, expired.type());
        assertEquals(AuthGuardResultType.REDIRECT, failed.type());
    }

    @Test
    void redirectsWithUtf8EncodedUnicodePath() {
        AuthGuardResult result = AuthGuard.decide(AuthState.anonymous(), RouteLocation.parse("/konto/€-你好-🙂"), "/login");

        assertEquals(AuthGuardResultType.REDIRECT, result.type());
        assertEquals("/login?redirect=%2Fkonto%2F%E2%82%AC-%E4%BD%A0%E5%A5%BD-%F0%9F%99%82", result.redirectPath());
    }
}
