package org.gwtfusion.router;

import elemental2.dom.DomGlobal;
import elemental2.dom.EventListener;

final class BrowserHistoryStrategy implements HistoryStrategy {
    @Override
    public RouteLocation location() {
        return RouteLocation.parse(DomGlobal.window.location.pathname + DomGlobal.window.location.search + DomGlobal.window.location.hash);
    }

    @Override
    public void push(RouteLocation location) {
        DomGlobal.window.history.pushState(null, "", location.asPath());
    }

    @Override
    public void replace(RouteLocation location) {
        DomGlobal.window.history.replaceState(null, "", location.asPath());
    }

    @Override
    public String href(String path) {
        return RouteLocation.parse(path).asPath();
    }

    @Override
    public ListenerRegistration listen(LocationChangeListener listener) {
        EventListener eventListener = event -> listener.onLocationChange(location());
        DomGlobal.window.addEventListener("popstate", eventListener);
        return () -> DomGlobal.window.removeEventListener("popstate", eventListener);
    }
}
