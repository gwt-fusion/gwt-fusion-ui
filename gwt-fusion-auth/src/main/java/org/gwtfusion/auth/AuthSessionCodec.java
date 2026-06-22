package org.gwtfusion.auth;

import java.util.LinkedHashMap;
import java.util.Map;
import org.gwtfusion.storage.StorageCodec;

public final class AuthSessionCodec implements StorageCodec<AuthSession> {
    private AuthSessionCodec() {
    }

    public static AuthSessionCodec create() {
        return new AuthSessionCodec();
    }

    @Override
    public String encode(AuthSession session) {
        if (session == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        appendUser(builder, session.user());
        appendToken(builder, session.accessToken());
        appendToken(builder, session.refreshToken());
        appendMap(builder, session.metadata());
        return builder.toString();
    }

    @Override
    public AuthSession decode(String value) {
        if (value == null) {
            return null;
        }
        Reader reader = new Reader(value);
        AuthUser user = readUser(reader);
        AuthToken accessToken = readToken(reader);
        AuthToken refreshToken = readToken(reader);
        Map<String, String> metadata = readMap(reader);
        AuthSession session = AuthSession.of(user, accessToken).withRefreshToken(refreshToken);
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            session = session.withMetadata(entry.getKey(), entry.getValue());
        }
        reader.requireExhausted();
        return session;
    }

    private static void appendUser(StringBuilder builder, AuthUser user) {
        appendField(builder, user.id());
        appendField(builder, user.displayName());
        appendField(builder, user.email());
        appendMap(builder, user.attributes());
    }

    private static AuthUser readUser(Reader reader) {
        AuthUser user = AuthUser.of(reader.field(), reader.field(), reader.field());
        Map<String, String> attributes = readMap(reader);
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            user = user.withAttribute(entry.getKey(), entry.getValue());
        }
        return user;
    }

    private static void appendToken(StringBuilder builder, AuthToken token) {
        if (token == null) {
            appendField(builder, null);
            appendField(builder, null);
            appendField(builder, null);
            return;
        }
        appendField(builder, token.scheme());
        appendField(builder, token.value());
        appendField(builder, token.expiresAtMillis() == null ? null : String.valueOf(token.expiresAtMillis()));
    }

    private static AuthToken readToken(Reader reader) {
        String scheme = reader.field();
        String token = reader.field();
        String expires = reader.field();
        if (token == null) {
            return null;
        }
        Long expiresAtMillis = expires == null ? null : Long.valueOf(expires);
        return AuthToken.of(scheme, token, expiresAtMillis);
    }

    private static void appendMap(StringBuilder builder, Map<String, String> map) {
        Map<String, String> values = map == null ? new LinkedHashMap<>() : map;
        appendField(builder, String.valueOf(values.size()));
        for (Map.Entry<String, String> entry : values.entrySet()) {
            appendField(builder, entry.getKey());
            appendField(builder, entry.getValue());
        }
    }

    private static Map<String, String> readMap(Reader reader) {
        int size = Integer.parseInt(reader.field());
        if (size < 0) {
            throw new IllegalArgumentException("Invalid auth session data");
        }
        Map<String, String> values = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            values.put(reader.field(), reader.field());
        }
        return values;
    }

    private static void appendField(StringBuilder builder, String value) {
        if (value == null) {
            builder.append("-1:");
        } else {
            builder.append(value.length()).append(':').append(value);
        }
    }

    private static final class Reader {
        private final String value;
        private int index;

        Reader(String value) {
            this.value = value;
        }

        String field() {
            int separator = value.indexOf(':', index);
            if (separator < 0) {
                throw new IllegalArgumentException("Invalid auth session data");
            }
            int length = Integer.parseInt(value.substring(index, separator));
            index = separator + 1;
            if (length < 0) {
                return null;
            }
            if (index + length > value.length()) {
                throw new IllegalArgumentException("Invalid auth session data");
            }
            String field = value.substring(index, index + length);
            index += length;
            return field;
        }

        void requireExhausted() {
            if (index != value.length()) {
                throw new IllegalArgumentException("Invalid auth session data");
            }
        }
    }
}
