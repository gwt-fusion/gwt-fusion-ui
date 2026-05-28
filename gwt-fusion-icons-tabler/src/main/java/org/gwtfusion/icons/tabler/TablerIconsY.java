package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsY {
    private static final String[] NAMES = {"yin-yang", "yoga"};

    private TablerIconsY() {
    }

    static String[] names() {
        return NAMES.clone();
    }

    static Icon icon(String name) {
        if ("yin-yang".equals(name)) {
            return yinYang();
        }
        if ("yoga".equals(name)) {
            return yoga();
        }
        return null;
    }

    static Icon yinYang() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 12a9 9 0 1 0 18 0a9 9 0 1 0 -18 0")
                .element("path", "d", "M12 3a4.5 4.5 0 0 0 0 9a4.5 4.5 0 0 1 0 9")
                .element("path", "d", "M11.5 7.5a.5 .5 0 1 0 1 0a.5 .5 0 1 0 -1 0", "fill", "currentColor")
                .element("path", "d", "M11.5 16.5a.5 .5 0 1 0 1 0a.5 .5 0 1 0 -1 0", "fill", "currentColor");
    }

    static Icon yoga() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 20h4l1.5 -3")
                .element("path", "d", "M17 20l-1 -5h-5l1 -7")
                .element("path", "d", "M4 10l4 -1l4 -1l4 1.5l4 1.5")
                .element("path", "d", "M10.007 5a2 2 0 1 0 4 0a2 2 0 1 0 -4 0");
    }
}
