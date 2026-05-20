package org.gwtfusion.router;

public final class RouteContext {
    private final Router router;
    private final RouteMatch match;

    RouteContext(Router router, RouteMatch match) {
        this.router = router;
        this.match = match;
    }

    public Router router() {
        return router;
    }

    public RouteLocation location() {
        return match.location();
    }

    public RouteParams params() {
        return match.params();
    }

    public RouteSearch search() {
        return match.location().search();
    }
}
