package org.gwtfusion.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AuthStateTest {
    @Test
    void exposesTokenExpirationAndAuthorizationHeader() {
        AuthToken token = AuthToken.bearer("abc", 1_500);

        assertEquals("Bearer", token.scheme());
        assertEquals("abc", token.value());
        assertEquals("Bearer abc", token.authorizationHeader());
        assertFalse(token.expired(1_499));
        assertTrue(token.expired(1_500));
    }

    @Test
    void supportsCookieBackedAuthenticatedSessionWithoutToken() {
        AuthSession session = AuthSession.of(AuthUser.of("u1", "Ada", "ada@example.test"));
        AuthState state = AuthState.authenticated(session);

        assertEquals(AuthStatus.AUTHENTICATED, state.status());
        assertTrue(state.authenticated());
        assertFalse(session.hasAccessToken());
    }

    @Test
    void validatesRequiredValues() {
        assertThrows(IllegalArgumentException.class, () -> AuthToken.bearer(" "));
        assertThrows(IllegalArgumentException.class, () -> AuthUser.of(" "));
        assertThrows(IllegalArgumentException.class, () -> AuthState.authenticated(null));
    }
}
