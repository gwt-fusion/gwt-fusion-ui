package org.gwtfusion.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.gwtfusion.storage.StorageArea;
import org.junit.jupiter.api.Test;

class AuthSessionStoreTest {
    @Test
    void codecRoundTripsSessionWithoutReflection() {
        AuthSession session = AuthSession.of(AuthUser.of("u1", "Ada", "ada@example.test").withAttribute("role", "admin"), AuthToken.bearer("access", 2_000))
                .withRefreshToken(AuthToken.of("Refresh", "refresh", 5_000L))
                .withMetadata("tenant", "demo");

        AuthSession decoded = AuthSessionCodec.create().decode(AuthSessionCodec.create().encode(session));

        assertEquals("u1", decoded.user().id());
        assertEquals("Ada", decoded.user().displayName());
        assertEquals("admin", decoded.user().attributes().get("role"));
        assertEquals("access", decoded.accessToken().value());
        assertEquals("refresh", decoded.refreshToken().value());
        assertEquals("demo", decoded.metadata().get("tenant"));
    }

    @Test
    void codecRejectsTrailingAndCorruptMapData() {
        AuthSession session = AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("access"));
        String encoded = AuthSessionCodec.create().encode(session);

        assertThrows(IllegalArgumentException.class, () -> AuthSessionCodec.create().decode(encoded + "extra"));
        assertThrows(IllegalArgumentException.class, () -> AuthSessionCodec.create().decode("2:u10:0:2:-2"));
    }

    @Test
    void storePersistsLoadsAndClearsSession() {
        AuthSessionStore store = AuthSessionStore.create(StorageArea.memory());
        AuthSession session = AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("access"));

        store.save(session);

        assertNotNull(store.load());
        assertEquals("u1", store.load().user().id());

        store.clear();
        assertNull(store.load());
    }

    @Test
    void managerRestoresExpiredAccessTokenAsExpiredWhenRefreshTokenRemains() {
        long now = System.currentTimeMillis();
        AuthSessionStore store = AuthSessionStore.create(StorageArea.memory());
        AuthSession session = AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("access", now - 1_000))
                .withRefreshToken(AuthToken.of("Refresh", "refresh", now + 60_000));

        store.save(session);
        AuthManager auth = AuthManager.create().sessionStore(store).restore();

        assertEquals(AuthStatus.EXPIRED, auth.state().status());
        assertEquals("refresh", auth.state().session().refreshToken().value());
    }

    @Test
    void storeUsesLatestTokenExpirationForTtl() {
        long now = System.currentTimeMillis();
        AuthSessionStore store = AuthSessionStore.create(StorageArea.memory());
        AuthSession session = AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("access", now + 60_000))
                .withRefreshToken(AuthToken.of("Refresh", "refresh", now - 1_000));

        store.save(session);
        AuthManager auth = AuthManager.create().sessionStore(store).restore();

        assertEquals(AuthStatus.AUTHENTICATED, auth.state().status());
        assertEquals("access", auth.session().accessToken().value());
    }
}
