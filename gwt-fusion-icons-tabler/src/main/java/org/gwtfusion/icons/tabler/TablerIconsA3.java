package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsA3 {
    private static final String[] NAMES = {"axis-y"};

    private TablerIconsA3() {
    }

    static String[] names() {
        String[] names = new String[NAMES.length];
        for (int i = 0; i < NAMES.length; i++) {
            names[i] = NAMES[i];
        }
        return names;
    }

    static Icon icon(String name) {
        if ("axis-y".equals(name)) {
            return axisY();
        }
        return null;
    }

    static Icon axisY() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M11 20h-.01")
                .element("path", "d", "M15 20h-.01")
                .element("path", "d", "M19 20h-.01")
                .element("path", "d", "M4 7l3 -3l3 3")
                .element("path", "d", "M7 20v-16");
    }
}
