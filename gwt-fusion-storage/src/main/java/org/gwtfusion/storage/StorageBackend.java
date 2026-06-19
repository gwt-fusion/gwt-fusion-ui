package org.gwtfusion.storage;

import java.util.List;

interface StorageBackend {
    String getItem(String key);

    void setItem(String key, String value);

    void removeItem(String key);

    List<String> keys();
}
