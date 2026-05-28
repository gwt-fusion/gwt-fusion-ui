package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsX {
    private static final String[] NAMES = {"x", "x-mark", "x-power-y", "xbox-a", "xbox-b", "xbox-x", "xbox-y", "xd", "xxx"};

    private TablerIconsX() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("x".equals(name)) {
            return x();
        }
        if ("x-mark".equals(name)) {
            return xMark();
        }
        if ("x-power-y".equals(name)) {
            return xPowerY();
        }
        if ("xbox-a".equals(name)) {
            return xboxA();
        }
        if ("xbox-b".equals(name)) {
            return xboxB();
        }
        if ("xbox-x".equals(name)) {
            return xboxX();
        }
        if ("xbox-y".equals(name)) {
            return xboxY();
        }
        if ("xd".equals(name)) {
            return xd();
        }
        if ("xxx".equals(name)) {
            return xxx();
        }
        return null;
    }

    static Icon x() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M18 6l-12 12")
                .element("path", "d", "M6 6l12 12");
    }

    static Icon xMark() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 16l3.644 3.644a1.21 1.21 0 0 0 1.712 0l2.288 -2.288a1.21 1.21 0 0 0 0 -1.712l-3.644 -3.644l3.644 -3.644a1.21 1.21 0 0 0 0 -1.712l-2.288 -2.288a1.21 1.21 0 0 0 -1.712 0l-3.644 3.644l-3.644 -3.644a1.21 1.21 0 0 0 -1.712 0l-2.288 2.288a1.21 1.21 0 0 0 0 1.712l3.644 3.644l-3.644 3.644a1.21 1.21 0 0 0 0 1.712l2.288 2.288a1.21 1.21 0 0 0 1.712 0l3.644 -3.644");
    }

    static Icon xPowerY() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M15 3l3 5.063")
                .element("path", "d", "M5 12l6 6")
                .element("path", "d", "M5 18l6 -6")
                .element("path", "d", "M21 3l-4.8 9");
    }

    static Icon xboxA() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 21a9 9 0 0 0 9 -9a9 9 0 0 0 -9 -9a9 9 0 0 0 -9 9a9 9 0 0 0 9 9")
                .element("path", "d", "M15 16l-3 -8l-3 8")
                .element("path", "d", "M14 14h-4");
    }

    static Icon xboxB() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 21a9 9 0 0 0 9 -9a9 9 0 0 0 -9 -9a9 9 0 0 0 -9 9a9 9 0 0 0 9 9")
                .element("path", "d", "M13 12a2 2 0 1 1 0 4h-3v-4")
                .element("path", "d", "M13 12h-3")
                .element("path", "d", "M13 12a2 2 0 1 0 0 -4h-3v4");
    }

    static Icon xboxX() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 21a9 9 0 0 0 9 -9a9 9 0 0 0 -9 -9a9 9 0 0 0 -9 9a9 9 0 0 0 9 9")
                .element("path", "d", "M9 8l6 8")
                .element("path", "d", "M15 8l-6 8");
    }

    static Icon xboxY() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 21a9 9 0 0 0 9 -9a9 9 0 0 0 -9 -9a9 9 0 0 0 -9 9a9 9 0 0 0 9 9")
                .element("path", "d", "M9 8l3 4")
                .element("path", "d", "M15 8l-2.988 3.984l-.012 4.016");
    }

    static Icon xd() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6 8l4 8")
                .element("path", "d", "M6 16l4 -8")
                .element("path", "d", "M14 8v8h2a2 2 0 0 0 2 -2v-4a2 2 0 0 0 -2 -2h-2");
    }

    static Icon xxx() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 8l4 8")
                .element("path", "d", "M10 16l4 -8")
                .element("path", "d", "M17 8l4 8")
                .element("path", "d", "M17 16l4 -8")
                .element("path", "d", "M3 8l4 8")
                .element("path", "d", "M3 16l4 -8");
    }
}
