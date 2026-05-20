package org.gwtfusion.router;

import elemental2.dom.DomGlobal;
import elemental2.dom.EventListener;

final class HashHistoryStrategy implements HistoryStrategy {
    @Override
    public RouteLocation location() {
        String hash = DomGlobal.window.location.hash;
        if (hash == null || hash.isEmpty() || "#".equals(hash)) {
            return RouteLocation.parse("/");
        }
        return RouteLocation.parse(hash.substring(1));
    }

    @Override
    public void push(RouteLocation location) {
        DomGlobal.window.history.pushState(null, "", href(location.asPath()));
    }

    @Override
    public void replace(RouteLocation location) {
        DomGlobal.window.history.replaceState(null, "", href(location.asPath()));
    }

    @Override
    public String href(String path) {
        return "#" + RouteLocation.parse(path).asPath();
    }

    @Override
    public ListenerRegistration listen(LocationChangeListener listener) {
        EventListener eventListener = event -> listener.onLocationChange(location());
        DomGlobal.window.addEventListener("popstate", eventListener);
        DomGlobal.window.addEventListener("hashchange", eventListener);
        return () -> {
            DomGlobal.window.removeEventListener("popstate", eventListener);
            DomGlobal.window.removeEventListener("hashchange", eventListener);
        };
    }
}
