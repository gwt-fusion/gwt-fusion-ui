package org.gwtfusion.router;

import java.util.LinkedHashMap;
import java.util.Map;

public final class Route {
    private final String path;
    private final RouteRenderer renderer;

    public Route(String path, RouteRenderer renderer) {
        this.path = RouteLocation.normalizePath(path);
        this.renderer = renderer;
    }

    public static Route of(String path, RouteRenderer renderer) {
        return new Route(path, renderer);
    }

    public String path() {
        return path;
    }

    public RouteRenderer renderer() {
        return renderer;
    }

    RouteMatch match(RouteLocation location) {
        Map<String, String> params = new LinkedHashMap<>();
        if (!matches(pathSegments(path), pathSegments(location.path()), params)) {
            return null;
        }
        return new RouteMatch(this, location, new RouteParams(params));
    }

    private boolean matches(String[] routeSegments, String[] pathSegments, Map<String, String> params) {
        int routeIndex = 0;
        int pathIndex = 0;
        while (routeIndex < routeSegments.length) {
            String routeSegment = routeSegments[routeIndex];
            if (routeSegment.equals("*")) {
                params.put("*", join(pathSegments, pathIndex));
                return true;
            }
            if (pathIndex >= pathSegments.length) {
                return false;
            }
            if (routeSegment.startsWith(":")) {
                params.put(routeSegment.substring(1), pathSegments[pathIndex]);
            } else if (!routeSegment.equals(pathSegments[pathIndex])) {
                return false;
            }
            routeIndex++;
            pathIndex++;
        }
        return pathIndex == pathSegments.length;
    }

    private static String[] pathSegments(String path) {
        String normalized = RouteLocation.normalizePath(path);
        if ("/".equals(normalized)) {
            return new String[0];
        }
        return normalized.substring(1).split("/");
    }

    private static String join(String[] values, int offset) {
        StringBuilder builder = new StringBuilder();
        for (int i = offset; i < values.length; i++) {
            if (builder.length() > 0) {
                builder.append('/');
            }
            builder.append(values[i]);
        }
        return builder.toString();
    }
}
