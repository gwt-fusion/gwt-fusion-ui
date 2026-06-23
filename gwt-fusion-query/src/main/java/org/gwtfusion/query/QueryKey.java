package org.gwtfusion.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class QueryKey {
    private final List<String> parts;

    private QueryKey(List<String> parts) {
        List<String> clean = new ArrayList<>();
        if (parts != null) {
            for (String part : parts) {
                if (part != null && !part.trim().isEmpty()) {
                    clean.add(part.trim());
                }
            }
        }
        if (clean.isEmpty()) {
            throw new IllegalArgumentException("query key must not be empty");
        }
        this.parts = Collections.unmodifiableList(clean);
    }

    public static QueryKey of(String... parts) {
        return new QueryKey(parts == null ? Collections.emptyList() : Arrays.asList(parts));
    }

    public QueryKey append(String part) {
        List<String> next = new ArrayList<>(parts);
        next.add(part);
        return new QueryKey(next);
    }

    public List<String> parts() {
        return parts;
    }

    public String value() {
        return String.join("/", parts);
    }

    public boolean startsWith(QueryKey prefix) {
        if (prefix == null || prefix.parts.size() > parts.size()) {
            return false;
        }
        for (int i = 0; i < prefix.parts.size(); i++) {
            if (!parts.get(i).equals(prefix.parts.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryKey)) {
            return false;
        }
        QueryKey queryKey = (QueryKey) o;
        return parts.equals(queryKey.parts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parts);
    }

    @Override
    public String toString() {
        return value();
    }
}
