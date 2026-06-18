package org.gwtfusion.http;

final class HttpUrlEncoding {
    private static final char[] HEX = "0123456789ABCDEF".toCharArray();

    private HttpUrlEncoding() {
    }

    static String encode(String value) {
        if (value == null || value.isEmpty()) {
            return "";
        }
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < value.length(); ) {
            int codePoint = value.codePointAt(i);
            i += Character.charCount(codePoint);
            if (isUnreserved(codePoint)) {
                encoded.append((char) codePoint);
            } else {
                appendUtf8(encoded, codePoint);
            }
        }
        return encoded.toString();
    }

    private static boolean isUnreserved(int codePoint) {
        return codePoint >= 'a' && codePoint <= 'z'
                || codePoint >= 'A' && codePoint <= 'Z'
                || codePoint >= '0' && codePoint <= '9'
                || codePoint == '-' || codePoint == '_' || codePoint == '.' || codePoint == '~';
    }

    private static void appendUtf8(StringBuilder target, int codePoint) {
        if (codePoint <= 0x7F) {
            appendByte(target, codePoint);
        } else if (codePoint <= 0x7FF) {
            appendByte(target, 0xC0 | codePoint >> 6);
            appendByte(target, 0x80 | codePoint & 0x3F);
        } else if (codePoint <= 0xFFFF) {
            appendByte(target, 0xE0 | codePoint >> 12);
            appendByte(target, 0x80 | codePoint >> 6 & 0x3F);
            appendByte(target, 0x80 | codePoint & 0x3F);
        } else {
            appendByte(target, 0xF0 | codePoint >> 18);
            appendByte(target, 0x80 | codePoint >> 12 & 0x3F);
            appendByte(target, 0x80 | codePoint >> 6 & 0x3F);
            appendByte(target, 0x80 | codePoint & 0x3F);
        }
    }

    private static void appendByte(StringBuilder target, int value) {
        target.append('%');
        target.append(HEX[value >> 4 & 0xF]);
        target.append(HEX[value & 0xF]);
    }
}
