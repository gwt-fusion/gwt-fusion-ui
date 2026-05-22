package org.gwtfusion.ui.theme;

public enum Direction {
    LTR("ltr"),
    RTL("rtl");

    private final String attributeValue;

    Direction(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String attributeValue() {
        return attributeValue;
    }

    public static Direction fromAttribute(String value) {
        if (value == null) {
            return null;
        }
        String normalized = value.trim().toLowerCase();
        if (RTL.attributeValue.equals(normalized)) {
            return RTL;
        }
        if (LTR.attributeValue.equals(normalized)) {
            return LTR;
        }
        return null;
    }

    public static Direction fromLanguageTag(String languageTag) {
        if (languageTag == null || languageTag.trim().isEmpty()) {
            return LTR;
        }
        String normalized = languageTag.trim().replace('_', '-').toLowerCase();
        String[] parts = normalized.split("-");
        String language = parts.length == 0 ? normalized : parts[0];
        String script = scriptSubtag(parts);

        if ("arab".equals(script) || "hebr".equals(script) || "thaa".equals(script)) {
            return RTL;
        }
        if ("latn".equals(script) || "cyrl".equals(script)) {
            return LTR;
        }
        return isRtlLanguage(language) ? RTL : LTR;
    }

    private static String scriptSubtag(String[] parts) {
        for (String part : parts) {
            if (isScriptSubtag(part)) {
                return part;
            }
        }
        return "";
    }

    private static boolean isScriptSubtag(String part) {
        if (part.length() != 4) {
            return false;
        }
        for (int i = 0; i < part.length(); i++) {
            char character = part.charAt(i);
            if ((character < 'a' || character > 'z') && (character < 'A' || character > 'Z')) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRtlLanguage(String language) {
        return "ar".equals(language)
                || "dv".equals(language)
                || "fa".equals(language)
                || "he".equals(language)
                || "iw".equals(language)
                || "ps".equals(language)
                || "sd".equals(language)
                || "ug".equals(language)
                || "ur".equals(language)
                || "yi".equals(language);
    }
}
