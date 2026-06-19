package org.gwtfusion.storage;

import elemental2.dom.DomGlobal;
import java.util.ArrayList;
import java.util.List;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

final class BrowserStorageBackend implements StorageBackend {
    static final String LOCAL = "local";
    static final String SESSION = "session";

    private final BrowserStorage storage;

    private BrowserStorageBackend(BrowserStorage storage) {
        if (storage == null) {
            throw new IllegalStateException("browser storage is not available");
        }
        this.storage = storage;
    }

    static BrowserStorageBackend create(String type) {
        WindowStorage window = Js.uncheckedCast(DomGlobal.window);
        return new BrowserStorageBackend(SESSION.equals(type) ? window.getSessionStorage() : window.getLocalStorage());
    }

    @Override
    public String getItem(String key) {
        return storage.getItem(key);
    }

    @Override
    public void setItem(String key, String value) {
        storage.setItem(key, value);
    }

    @Override
    public void removeItem(String key) {
        storage.removeItem(key);
    }

    @Override
    public List<String> keys() {
        List<String> keys = new ArrayList<>();
        for (int i = 0; i < storage.getLength(); i++) {
            String key = storage.key(i);
            if (key != null) {
                keys.add(key);
            }
        }
        return keys;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    private interface WindowStorage {
        @JsProperty
        BrowserStorage getLocalStorage();

        @JsProperty
        BrowserStorage getSessionStorage();
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Storage")
    private interface BrowserStorage {
        @JsProperty
        int getLength();

        @JsMethod
        String getItem(String key);

        @JsMethod
        void setItem(String key, String value);

        @JsMethod
        void removeItem(String key);

        @JsMethod
        String key(int index);
    }
}
