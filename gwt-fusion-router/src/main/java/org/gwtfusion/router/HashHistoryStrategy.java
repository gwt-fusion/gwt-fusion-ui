package org.gwtfusion.router;

import elemental2.dom.DomGlobal;
import elemental2.dom.EventListener;
import java.util.ArrayList;
import java.util.List;

final class HashHistoryStrategy implements HistoryStrategy {
    private final List<LocationChangeListener> listeners = new ArrayList<>();

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
        notifyListeners(location);
    }

    @Override
    public void replace(RouteLocation location) {
        DomGlobal.window.history.replaceState(null, "", href(location.asPath()));
        notifyListeners(location);
    }

    @Override
    public String href(String path) {
        return "#" + RouteLocation.parse(path).asPath();
    }

    @Override
    public ListenerRegistration listen(LocationChangeListener listener) {
        listeners.add(listener);
        EventListener eventListener = event -> listener.onLocationChange(location());
        DomGlobal.window.addEventListener("popstate", eventListener);
        DomGlobal.window.addEventListener("hashchange", eventListener);
        return () -> {
            listeners.remove(listener);
            DomGlobal.window.removeEventListener("popstate", eventListener);
            DomGlobal.window.removeEventListener("hashchange", eventListener);
        };
    }

    private void notifyListeners(RouteLocation location) {
        List<LocationChangeListener> snapshot = new ArrayList<>(listeners);
        for (LocationChangeListener listener : snapshot) {
            listener.onLocationChange(location);
        }
    }
}
