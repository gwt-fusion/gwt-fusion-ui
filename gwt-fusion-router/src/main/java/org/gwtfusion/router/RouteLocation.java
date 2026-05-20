package org.gwtfusion.router;

import java.util.Objects;

public final class RouteLocation {
    private final String path;
    private final RouteSearch search;
    private final String hash;

    public RouteLocation(String path, RouteSearch search, String hash) {
        this.path = normalizePath(path);
        this.search = search == null ? RouteSearch.empty() : search;
        this.hash = normalizeHash(hash);
    }

    public static RouteLocation parse(String value) {
        String route = value == null || value.isEmpty() ? "/" : value;
        String hash = "";
        int hashIndex = route.indexOf('#');
        if (hashIndex >= 0) {
            hash = route.substring(hashIndex + 1);
            route = route.substring(0, hashIndex);
        }
        String query = "";
        int queryIndex = route.indexOf('?');
        if (queryIndex >= 0) {
            query = route.substring(queryIndex + 1);
            route = route.substring(0, queryIndex);
        }
        return new RouteLocation(route, RouteSearch.parse(query), hash);
    }

    public String path() {
        return path;
    }

    public RouteSearch search() {
        return search;
    }

    public String hash() {
        return hash;
    }

    public String asPath() {
        StringBuilder builder = new StringBuilder(path);
        String query = search.toQueryString();
        if (!query.isEmpty()) {
            builder.append('?').append(query);
        }
        if (!hash.isEmpty()) {
            builder.append('#').append(hash);
        }
        return builder.toString();
    }

    static String normalizePath(String value) {
        String path = value == null || value.isEmpty() ? "/" : value;
        int queryIndex = path.indexOf('?');
        if (queryIndex >= 0) {
            path = path.substring(0, queryIndex);
        }
        int hashIndex = path.indexOf('#');
        if (hashIndex >= 0) {
            path = path.substring(0, hashIndex);
        }
        if (path.isEmpty()) {
            return "/";
        }
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        while (path.length() > 1 && path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        return path;
    }

    private static String normalizeHash(String value) {
        if (value == null || value.isEmpty()) {
            return "";
        }
        return value.startsWith("#") ? value.substring(1) : value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RouteLocation)) {
            return false;
        }
        RouteLocation that = (RouteLocation) o;
        return path.equals(that.path) && search.equals(that.search) && hash.equals(that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, search, hash);
    }
}
