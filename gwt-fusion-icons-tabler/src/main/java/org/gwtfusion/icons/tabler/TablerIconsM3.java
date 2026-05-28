package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsM3 {
    private static final String[] NAMES = {"music-pin", "music-plus", "music-question", "music-search", "music-share", "music-star", "music-up", "music-x"};

    private TablerIconsM3() {
    }

    static String[] names() {
        return NAMES.clone();
    }

    static Icon icon(String name) {
        if ("music-pin".equals(name)) {
            return musicPin();
        }
        if ("music-plus".equals(name)) {
            return musicPlus();
        }
        if ("music-question".equals(name)) {
            return musicQuestion();
        }
        if ("music-search".equals(name)) {
            return musicSearch();
        }
        if ("music-share".equals(name)) {
            return musicShare();
        }
        if ("music-star".equals(name)) {
            return musicStar();
        }
        if ("music-up".equals(name)) {
            return musicUp();
        }
        if ("music-x".equals(name)) {
            return musicX();
        }
        return null;
    }

    static Icon musicPin() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v7")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M21.121 20.121a3 3 0 1 0 -4.242 0c.418 .419 1.125 1.045 2.121 1.879c1.051 -.89 1.759 -1.516 2.121 -1.879")
                .element("path", "d", "M19 18v.01");
    }

    static Icon musicPlus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v8")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M16 19h6")
                .element("path", "d", "M19 16v6");
    }

    static Icon musicQuestion() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v7")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M19 22v.01")
                .element("path", "d", "M19 19a2.003 2.003 0 0 0 .914 -3.782a1.98 1.98 0 0 0 -2.414 .483");
    }

    static Icon musicSearch() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v7")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M15 18a3 3 0 1 0 6 0a3 3 0 1 0 -6 0")
                .element("path", "d", "M20.2 20.2l1.8 1.8");
    }

    static Icon musicShare() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v9")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M16 22l5 -5")
                .element("path", "d", "M21 21.5v-4.5h-4.5");
    }

    static Icon musicStar() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v6")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M17.8 20.817l-2.172 1.138a.392 .392 0 0 1 -.568 -.41l.415 -2.411l-1.757 -1.707a.389 .389 0 0 1 .217 -.665l2.428 -.352l1.086 -2.193a.392 .392 0 0 1 .702 0l1.086 2.193l2.428 .352a.39 .39 0 0 1 .217 .665l-1.757 1.707l.414 2.41a.39 .39 0 0 1 -.567 .411l-2.172 -1.138");
    }

    static Icon musicUp() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v8")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M19 22v-6")
                .element("path", "d", "M22 19l-3 -3l-3 3");
    }

    static Icon musicX() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M9 17v-13h10v9")
                .element("path", "d", "M9 8h10")
                .element("path", "d", "M22 22l-5 -5")
                .element("path", "d", "M17 22l5 -5");
    }
}
