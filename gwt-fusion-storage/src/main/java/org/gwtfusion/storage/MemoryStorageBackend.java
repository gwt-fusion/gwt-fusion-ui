package org.gwtfusion.storage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class MemoryStorageBackend implements StorageBackend {
    private final Map<String, String> values = new LinkedHashMap<>();

    @Override
    public String getItem(String key) {
        return values.get(key);
    }

    @Override
    public void setItem(String key, String value) {
        values.put(key, value);
    }

    @Override
    public void removeItem(String key) {
        values.remove(key);
    }

    @Override
    public List<String> keys() {
        return new ArrayList<>(values.keySet());
    }
}
