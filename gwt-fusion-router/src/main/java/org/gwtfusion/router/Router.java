package org.gwtfusion.router;

import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Router {
    private final HistoryStrategy history;
    private final List<Route> routes = new ArrayList<>();
    private RouteRenderer notFoundRenderer;
    private HTMLElement outlet;
    private ListenerRegistration historyRegistration = ListenerRegistration.empty();
    private RouteLocation currentLocation;
    private RouteMatch currentMatch;

    private Router(HistoryStrategy history) {
        this.history = history == null ? HistoryStrategy.hash() : history;
        this.notFoundRenderer = context -> null;
    }

    public static Router create(HistoryStrategy history) {
        return new Router(history);
    }

    public Router routes(Route... routes) {
        this.routes.clear();
        if (routes != null) {
            this.routes.addAll(Arrays.asList(routes));
        }
        return this;
    }

    public Router route(String path, RouteRenderer renderer) {
        routes.add(Route.of(path, renderer));
        return this;
    }

    public Router notFound(RouteRenderer renderer) {
        this.notFoundRenderer = renderer == null ? context -> null : renderer;
        return this;
    }

    public ListenerRegistration attach(HTMLElement outlet) {
        detach();
        this.outlet = outlet;
        historyRegistration = history.listen(location -> render(location, false));
        render(history.location(), false);
        return this::detach;
    }

    public void detach() {
        historyRegistration.remove();
        historyRegistration = ListenerRegistration.empty();
        outlet = null;
    }

    public void navigate(String path) {
        RouteLocation next = RouteLocation.parse(path);
        history.push(next);
    }

    public void replace(String path) {
        RouteLocation next = RouteLocation.parse(path);
        history.replace(next);
    }

    public String href(String path) {
        return history.href(path);
    }

    public RouteLocation location() {
        return currentLocation == null ? history.location() : currentLocation;
    }

    public RouteMatch match() {
        return currentMatch;
    }

    public List<Route> routes() {
        return Collections.unmodifiableList(routes);
    }

    private void render(RouteLocation location, boolean replace) {
        currentLocation = location;
        currentMatch = findMatch(location);
        if (outlet == null) {
            return;
        }
        clear(outlet);
        HTMLElement rendered;
        if (currentMatch == null) {
            rendered = notFoundRenderer.render(new RouteContext(this, new RouteMatch(Route.of("*", notFoundRenderer), location, new RouteParams(Collections.emptyMap()))));
        } else {
            rendered = currentMatch.route().renderer().render(new RouteContext(this, currentMatch));
        }
        if (rendered != null) {
            outlet.appendChild(rendered);
        }
    }

    private RouteMatch findMatch(RouteLocation location) {
        for (Route route : routes) {
            RouteMatch match = route.match(location);
            if (match != null) {
                return match;
            }
        }
        return null;
    }

    private void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
    }
}
