package org.gwtfusion.storage;

public interface StorageCodec<T> {
    String encode(T value);

    T decode(String value);

    static StorageCodec<String> string() {
        return of(value -> value, value -> value);
    }

    static StorageCodec<Integer> integer() {
        return of(value -> value == null ? null : String.valueOf(value), value -> value == null ? null : Integer.valueOf(value));
    }

    static StorageCodec<Long> longInteger() {
        return of(value -> value == null ? null : String.valueOf(value), value -> value == null ? null : Long.valueOf(value));
    }

    static StorageCodec<Boolean> bool() {
        return of(value -> value == null ? null : String.valueOf(value), value -> {
            if (value == null) {
                return null;
            }
            if ("true".equals(value)) {
                return true;
            }
            if ("false".equals(value)) {
                return false;
            }
            throw new IllegalArgumentException("Invalid boolean value: " + value);
        });
    }

    static <T> StorageCodec<T> of(Encoder<T> encoder, Decoder<T> decoder) {
        if (encoder == null) {
            throw new IllegalArgumentException("encoder must not be null");
        }
        if (decoder == null) {
            throw new IllegalArgumentException("decoder must not be null");
        }
        return new StorageCodec<T>() {
            @Override
            public String encode(T value) {
                return encoder.encode(value);
            }

            @Override
            public T decode(String value) {
                return decoder.decode(value);
            }
        };
    }

    interface Encoder<T> {
        String encode(T value);
    }

    interface Decoder<T> {
        T decode(String value);
    }
}
