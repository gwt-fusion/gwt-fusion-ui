package org.gwtfusion.auth;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AuthUser {
    private final String id;
    private final String displayName;
    private final String email;
    private final Map<String, String> attributes;

    private AuthUser(String id, String displayName, String email, Map<String, String> attributes) {
        String cleanId = id == null ? "" : id.trim();
        if (cleanId.isEmpty()) {
            throw new IllegalArgumentException("id must not be empty");
        }
        this.id = cleanId;
        this.displayName = displayName == null ? "" : displayName;
        this.email = email == null ? "" : email;
        this.attributes = Collections.unmodifiableMap(new LinkedHashMap<>(attributes == null ? Collections.emptyMap() : attributes));
    }

    public static AuthUser of(String id) {
        return new AuthUser(id, "", "", null);
    }

    public static AuthUser of(String id, String displayName, String email) {
        return new AuthUser(id, displayName, email, null);
    }

    public AuthUser withAttribute(String name, String value) {
        if (name == null || name.trim().isEmpty()) {
            return this;
        }
        Map<String, String> next = new LinkedHashMap<>(attributes);
        next.put(name.trim(), value == null ? "" : value);
        return new AuthUser(id, displayName, email, next);
    }

    public String id() {
        return id;
    }

    public String displayName() {
        return displayName;
    }

    public String email() {
        return email;
    }

    public Map<String, String> attributes() {
        return attributes;
    }
}
