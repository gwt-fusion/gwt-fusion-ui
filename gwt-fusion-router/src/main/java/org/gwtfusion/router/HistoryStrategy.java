package org.gwtfusion.router;

public interface HistoryStrategy {
    RouteLocation location();

    void push(RouteLocation location);

    void replace(RouteLocation location);

    String href(String path);

    ListenerRegistration listen(LocationChangeListener listener);

    static HistoryStrategy browser() {
        return new BrowserHistoryStrategy();
    }

    static MemoryHistoryStrategy memory() {
        return new MemoryHistoryStrategy();
    }

    static HistoryStrategy hash() {
        return new HashHistoryStrategy();
    }
}
