package org.gwtfusion.storage;

public final class StorageKey<T> {
    private final String namespace;
    private final String name;
    private final StorageCodec<T> codec;

    private StorageKey(String namespace, String name, StorageCodec<T> codec) {
        this.namespace = cleanNamespace(namespace);
        this.name = cleanName(name);
        if (codec == null) {
            throw new IllegalArgumentException("codec must not be null");
        }
        this.codec = codec;
    }

    public static <T> StorageKey<T> of(String namespace, String name, StorageCodec<T> codec) {
        return new StorageKey<>(namespace, name, codec);
    }

    public static StorageKey<String> string(String namespace, String name) {
        return of(namespace, name, StorageCodec.string());
    }

    public static StorageKey<Integer> integer(String namespace, String name) {
        return of(namespace, name, StorageCodec.integer());
    }

    public static StorageKey<Long> longInteger(String namespace, String name) {
        return of(namespace, name, StorageCodec.longInteger());
    }

    public static StorageKey<Boolean> bool(String namespace, String name) {
        return of(namespace, name, StorageCodec.bool());
    }

    public String namespace() {
        return namespace;
    }

    public String name() {
        return name;
    }

    public StorageCodec<T> codec() {
        return codec;
    }

    public String rawKey() {
        return namespace.isEmpty() ? name : namespace + ":" + name;
    }

    private static String cleanNamespace(String namespace) {
        return namespace == null ? "" : namespace.trim();
    }

    private static String cleanName(String name) {
        String clean = name == null ? "" : name.trim();
        if (clean.isEmpty()) {
            throw new IllegalArgumentException("name must not be empty");
        }
        return clean;
    }
}
