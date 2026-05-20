package org.gwtfusion.router;

public final class RouteMatch {
    private final Route route;
    private final RouteLocation location;
    private final RouteParams params;

    RouteMatch(Route route, RouteLocation location, RouteParams params) {
        this.route = route;
        this.location = location;
        this.params = params;
    }

    public Route route() {
        return route;
    }

    public RouteLocation location() {
        return location;
    }

    public RouteParams params() {
        return params;
    }
}
