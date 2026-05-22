package org.gwtfusion.ui.theme;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import java.util.Objects;

public final class DirectionManager {
    private static Direction direction = Direction.LTR;

    private DirectionManager() {
    }

    public static Direction direction() {
        return direction;
    }

    public static boolean isLtr() {
        return direction == Direction.LTR;
    }

    public static boolean isRtl() {
        return direction == Direction.RTL;
    }

    public static void set(Direction nextDirection) {
        direction = Objects.requireNonNull(nextDirection, "nextDirection");
        apply();
    }

    public static void apply() {
        Element root = rootElement();
        if (root != null) {
            root.setAttribute("dir", direction.attributeValue());
        }
    }

    public static void applyDetected() {
        direction = detect();
        apply();
    }

    static Direction detect() {
        Element root = rootElement();
        if (root != null) {
            Direction fromDir = Direction.fromAttribute(root.getAttribute("dir"));
            if (fromDir != null) {
                return fromDir;
            }
            String language = root.getAttribute("lang");
            if (language != null && !language.trim().isEmpty()) {
                return Direction.fromLanguageTag(language);
            }
        }
        if (DomGlobal.navigator != null && DomGlobal.navigator.language != null && !DomGlobal.navigator.language.trim().isEmpty()) {
            return Direction.fromLanguageTag(DomGlobal.navigator.language);
        }
        return Direction.LTR;
    }

    private static Element rootElement() {
        if (DomGlobal.document == null) {
            return null;
        }
        return DomGlobal.document.documentElement;
    }
}
