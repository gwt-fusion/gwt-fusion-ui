package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsC5 {
    private static final String[] NAMES = {"cursor-text", "cut", "cylinder", "cylinder-off", "cylinder-plus"};

    private TablerIconsC5() {
    }

    static String[] names() {
        return NAMES.clone();
    }

    static Icon icon(String name) {
        if ("cursor-text".equals(name)) {
            return cursorText();
        }
        if ("cut".equals(name)) {
            return cut();
        }
        if ("cylinder".equals(name)) {
            return cylinder();
        }
        if ("cylinder-off".equals(name)) {
            return cylinderOff();
        }
        if ("cylinder-plus".equals(name)) {
            return cylinderPlus();
        }
        return null;
    }

    static Icon cursorText() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 12h4")
                .element("path", "d", "M9 4a3 3 0 0 1 3 3v10a3 3 0 0 1 -3 3")
                .element("path", "d", "M15 4a3 3 0 0 0 -3 3v10a3 3 0 0 0 3 3");
    }

    static Icon cut() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 17a3 3 0 1 0 6 0a3 3 0 1 0 -6 0")
                .element("path", "d", "M14 17a3 3 0 1 0 6 0a3 3 0 1 0 -6 0")
                .element("path", "d", "M9.15 14.85l8.85 -10.85")
                .element("path", "d", "M6 4l8.85 10.85");
    }

    static Icon cylinder() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 6a7 3 0 1 0 14 0a7 3 0 1 0 -14 0")
                .element("path", "d", "M5 6v12c0 1.657 3.134 3 7 3s7 -1.343 7 -3v-12");
    }

    static Icon cylinderOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5.23 5.233c-.15 .245 -.23 .502 -.23 .767c0 1.131 1.461 2.117 3.62 2.628m4.357 .343c3.404 -.204 6.023 -1.456 6.023 -2.971c0 -1.657 -3.134 -3 -7 -3c-1.645 0 -3.158 .243 -4.353 .65")
                .element("path", "d", "M5 6v12c0 1.657 3.134 3 7 3c3.245 0 5.974 -.946 6.767 -2.23m.233 -3.77v-9")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon cylinderPlus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 6a7 3 0 1 0 14 0a7 3 0 1 0 -14 0")
                .element("path", "d", "M5 6v12c0 1.657 3.134 3 7 3c.173 0 .345 -.003 .515 -.008m6.485 -8.992v-6")
                .element("path", "d", "M16 19h6")
                .element("path", "d", "M19 16v6");
    }
}
