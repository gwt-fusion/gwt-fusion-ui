package org.gwtfusion.router;

import java.util.ArrayList;
import java.util.List;

public final class MemoryHistoryStrategy implements HistoryStrategy {
    private final List<LocationChangeListener> listeners = new ArrayList<>();
    private RouteLocation location;

    public MemoryHistoryStrategy() {
        this(RouteLocation.parse("/"));
    }

    public MemoryHistoryStrategy(RouteLocation initialLocation) {
        this.location = initialLocation == null ? RouteLocation.parse("/") : initialLocation;
    }

    @Override
    public RouteLocation location() {
        return location;
    }

    @Override
    public void push(RouteLocation location) {
        setLocation(location);
    }

    @Override
    public void replace(RouteLocation location) {
        setLocation(location);
    }

    @Override
    public String href(String path) {
        return RouteLocation.parse(path).asPath();
    }

    @Override
    public ListenerRegistration listen(LocationChangeListener listener) {
        listeners.add(listener);
        return () -> listeners.remove(listener);
    }

    public void setLocation(RouteLocation location) {
        RouteLocation next = location == null ? RouteLocation.parse("/") : location;
        if (next.equals(this.location)) {
            return;
        }
        this.location = next;
        notifyListeners();
    }

    private void notifyListeners() {
        List<LocationChangeListener> snapshot = new ArrayList<>(listeners);
        for (LocationChangeListener listener : snapshot) {
            listener.onLocationChange(location);
        }
    }
}
