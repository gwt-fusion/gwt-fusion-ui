package org.gwtfusion.router;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class RouteSearch {
    private final Map<String, String> values;

    public RouteSearch(Map<String, String> values) {
        this.values = Collections.unmodifiableMap(new LinkedHashMap<>(values == null ? Collections.emptyMap() : values));
    }

    public static RouteSearch empty() {
        return new RouteSearch(Collections.emptyMap());
    }

    public static RouteSearch parse(String query) {
        if (query == null || query.isEmpty()) {
            return empty();
        }
        String normalized = query.startsWith("?") ? query.substring(1) : query;
        Map<String, String> values = new LinkedHashMap<>();
        for (String part : normalized.split("&")) {
            if (part.isEmpty()) {
                continue;
            }
            int separator = part.indexOf('=');
            if (separator < 0) {
                values.put(part, "");
            } else {
                values.put(part.substring(0, separator), part.substring(separator + 1));
            }
        }
        return new RouteSearch(values);
    }

    public String get(String name) {
        return values.get(name);
    }

    public boolean has(String name) {
        return values.containsKey(name);
    }

    public Map<String, String> asMap() {
        return values;
    }

    public String toQueryString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (builder.length() > 0) {
                builder.append('&');
            }
            builder.append(entry.getKey());
            if (!entry.getValue().isEmpty()) {
                builder.append('=').append(entry.getValue());
            }
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RouteSearch)) {
            return false;
        }
        RouteSearch that = (RouteSearch) o;
        return values.equals(that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
