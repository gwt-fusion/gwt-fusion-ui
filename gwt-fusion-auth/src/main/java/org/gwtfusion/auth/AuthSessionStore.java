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
        AuthToken ttlToken = session.refreshToken() == null ? session.accessToken() : session.refreshToken();
        if (ttlToken != null && ttlToken.hasExpiration()) {
            storage.setUntil(key, session, ttlToken.expiresAtMillis());
        } else {
            storage.set(key, session);
        }
        return this;
    }

    public AuthSessionStore clear() {
        storage.remove(key);
        return this;
    }
}
