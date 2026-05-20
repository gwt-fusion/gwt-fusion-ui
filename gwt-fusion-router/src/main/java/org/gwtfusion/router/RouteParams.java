package org.gwtfusion.router;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RouteParams {
    private final Map<String, String> values;

    RouteParams(Map<String, String> values) {
        this.values = Collections.unmodifiableMap(new LinkedHashMap<>(values));
    }

    public String get(String name) {
        return values.get(name);
    }

    public boolean has(String name) {
        return values.containsKey(name);
    }

    public Map<String, String> asMap() {
        return values;
    }
}
