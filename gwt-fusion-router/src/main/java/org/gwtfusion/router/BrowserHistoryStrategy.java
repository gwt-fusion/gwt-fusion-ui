package org.gwtfusion.router;

import elemental2.dom.DomGlobal;
import elemental2.dom.EventListener;
import java.util.ArrayList;
import java.util.List;

final class BrowserHistoryStrategy implements HistoryStrategy {
    private final List<LocationChangeListener> listeners = new ArrayList<>();

    @Override
    public RouteLocation location() {
        return RouteLocation.parse(DomGlobal.window.location.pathname + DomGlobal.window.location.search + DomGlobal.window.location.hash);
    }

    @Override
    public void push(RouteLocation location) {
        DomGlobal.window.history.pushState(null, "", location.asPath());
        notifyListeners(location);
    }

    @Override
    public void replace(RouteLocation location) {
        DomGlobal.window.history.replaceState(null, "", location.asPath());
        notifyListeners(location);
    }

    @Override
    public String href(String path) {
        return RouteLocation.parse(path).asPath();
    }

    @Override
    public ListenerRegistration listen(LocationChangeListener listener) {
        listeners.add(listener);
        EventListener eventListener = event -> listener.onLocationChange(location());
        DomGlobal.window.addEventListener("popstate", eventListener);
        return () -> {
            listeners.remove(listener);
            DomGlobal.window.removeEventListener("popstate", eventListener);
        };
    }

    private void notifyListeners(RouteLocation location) {
        List<LocationChangeListener> snapshot = new ArrayList<>(listeners);
        for (LocationChangeListener listener : snapshot) {
            listener.onLocationChange(location);
        }
    }
}
