package org.gwtfusion.auth;

import org.gwtfusion.storage.StorageArea;
import org.gwtfusion.storage.StorageKey;

public final class AuthSessionStore {
    private final StorageArea storage;
    private final StorageKey<AuthSession> key;

    private AuthSessionStore(StorageArea storage, StorageKey<AuthSession> key) {
        if (storage == null) {
            throw new IllegalArgumentException("storage must not be null");
        }
        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }
        this.storage = storage;
        this.key = key;
    }

    public static AuthSessionStore create(StorageArea storage) {
        return create(storage, defaultKey("gwt-fusion.auth"));
    }

    public static AuthSessionStore create(StorageArea storage, StorageKey<AuthSession> key) {
        return new AuthSessionStore(storage, key);
    }

    public static StorageKey<AuthSession> defaultKey(String namespace) {
        return StorageKey.of(namespace, "session", AuthSessionCodec.create());
    }

    public AuthSession load() {
        return storage.get(key);
    }

    public AuthSessionStore save(AuthSession session) {
        if (session == null) {
            return clear();
        }
        Long expiresAtMillis = latestExpiration(session.accessToken(), session.refreshToken());
        if (expiresAtMillis != null) {
            storage.setUntil(key, session, expiresAtMillis);
        } else {
            storage.set(key, session);
        }
        return this;
    }

    private static Long latestExpiration(AuthToken accessToken, AuthToken refreshToken) {
        Long latest = null;
        AuthToken[] tokens = {accessToken, refreshToken};
        for (AuthToken token : tokens) {
            if (token == null) {
                continue;
            }
            if (!token.hasExpiration()) {
                return null;
            }
            long expiresAtMillis = token.expiresAtMillis();
            latest = latest == null ? expiresAtMillis : Math.max(latest, expiresAtMillis);
        }
        return latest;
    }

    public AuthSessionStore clear() {
        storage.remove(key);
        return this;
    }
}
