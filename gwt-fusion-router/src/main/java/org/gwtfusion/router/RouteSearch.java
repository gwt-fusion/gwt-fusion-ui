package org.gwtfusion.router;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class RouteSearch {
    private final Map<String, String> values;

    public RouteSearch(Map<String, String> values) {
        this.values = Collections.unmodifiableMap(new LinkedHashMap<>(values == null ? Collections.emptyMap() : values));
    }

    public static RouteSearch empty() {
        return new RouteSearch(Collections.emptyMap());
    }

    public static RouteSearch parse(String query) {
        if (query == null || query.isEmpty()) {
            return empty();
        }
        String normalized = query.startsWith("?") ? query.substring(1) : query;
        Map<String, String> values = new LinkedHashMap<>();
        for (String part : normalized.split("&")) {
            if (part.isEmpty()) {
                continue;
            }
            int separator = part.indexOf('=');
            if (separator < 0) {
                values.put(decodeURIComponent(part), "");
            } else {
                values.put(decodeURIComponent(part.substring(0, separator)), decodeURIComponent(part.substring(separator + 1)));
            }
        }
        return new RouteSearch(values);
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

    public String toQueryString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (builder.length() > 0) {
                builder.append('&');
            }
            builder.append(encodeURIComponent(entry.getKey()));
            if (!entry.getValue().isEmpty()) {
                builder.append('=').append(encodeURIComponent(entry.getValue()));
            }
        }
        return builder.toString();
    }

    private static String encodeURIComponent(String value) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (isUriComponentChar(c)) {
                builder.append(c);
            } else {
                appendUtf8PercentEncoded(builder, c);
            }
        }
        return builder.toString();
    }

    private static String decodeURIComponent(String value) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c != '%' || i + 2 >= value.length()) {
                builder.append(c);
                continue;
            }

            int start = i;
            int[] bytes = new int[(value.length() - i) / 3];
            int count = 0;
            while (i + 2 < value.length() && value.charAt(i) == '%') {
                int high = hexValue(value.charAt(i + 1));
                int low = hexValue(value.charAt(i + 2));
                if (high < 0 || low < 0) {
                    break;
                }
                bytes[count++] = high << 4 | low;
                i += 3;
            }
            if (count == 0) {
                builder.append(c);
            } else {
                appendUtf8Decoded(builder, bytes, count);
                i--;
            }
            if (count == 0 && start != i) {
                i = start;
            }
        }
        return builder.toString();
    }

    private static boolean isUriComponentChar(char c) {
        return c >= 'A' && c <= 'Z'
                || c >= 'a' && c <= 'z'
                || c >= '0' && c <= '9'
                || c == '-' || c == '_' || c == '.' || c == '!' || c == '~' || c == '*' || c == '\'' || c == '(' || c == ')';
    }

    private static void appendUtf8PercentEncoded(StringBuilder builder, char c) {
        if (c <= 0x7F) {
            appendPercentByte(builder, c);
        } else if (c <= 0x7FF) {
            appendPercentByte(builder, 0xC0 | c >> 6);
            appendPercentByte(builder, 0x80 | c & 0x3F);
        } else {
            appendPercentByte(builder, 0xE0 | c >> 12);
            appendPercentByte(builder, 0x80 | c >> 6 & 0x3F);
            appendPercentByte(builder, 0x80 | c & 0x3F);
        }
    }

    private static void appendPercentByte(StringBuilder builder, int value) {
        builder.append('%');
        builder.append(Character.toUpperCase(Character.forDigit(value >> 4 & 0xF, 16)));
        builder.append(Character.toUpperCase(Character.forDigit(value & 0xF, 16)));
    }

    private static void appendUtf8Decoded(StringBuilder builder, int[] bytes, int count) {
        for (int i = 0; i < count; i++) {
            int b = bytes[i];
            if ((b & 0x80) == 0) {
                builder.append((char) b);
            } else if ((b & 0xE0) == 0xC0 && i + 1 < count) {
                builder.append((char) ((b & 0x1F) << 6 | bytes[++i] & 0x3F));
            } else if ((b & 0xF0) == 0xE0 && i + 2 < count) {
                builder.append((char) ((b & 0x0F) << 12 | (bytes[++i] & 0x3F) << 6 | bytes[++i] & 0x3F));
            }
        }
    }

    private static int hexValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RouteSearch)) {
            return false;
        }
        RouteSearch that = (RouteSearch) o;
        return values.equals(that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
