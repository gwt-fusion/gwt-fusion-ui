package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsJ {
    private static final String[] NAMES = {"jacket", "jetpack", "jetski", "jewish-star", "join-bevel", "join-round", "join-straight", "joker", "jpg", "json", "jump-rope"};

    private TablerIconsJ() {
    }

    static String[] names() {
        String[] names = new String[NAMES.length];
        for (int i = 0; i < NAMES.length; i++) {
            names[i] = NAMES[i];
        }
        return names;
    }

    static Icon icon(String name) {
        if ("jacket".equals(name)) {
            return jacket();
        }
        if ("jetpack".equals(name)) {
            return jetpack();
        }
        if ("jetski".equals(name)) {
            return jetski();
        }
        if ("jewish-star".equals(name)) {
            return jewishStar();
        }
        if ("join-bevel".equals(name)) {
            return joinBevel();
        }
        if ("join-round".equals(name)) {
            return joinRound();
        }
        if ("join-straight".equals(name)) {
            return joinStraight();
        }
        if ("joker".equals(name)) {
            return joker();
        }
        if ("jpg".equals(name)) {
            return jpg();
        }
        if ("json".equals(name)) {
            return json();
        }
        if ("jump-rope".equals(name)) {
            return jumpRope();
        }
        return null;
    }

    static Icon jacket() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M16 3l-4 5l-4 -5")
                .element("path", "d", "M12 19a2 2 0 0 1 -2 2h-4a2 2 0 0 1 -2 -2v-8.172a2 2 0 0 1 .586 -1.414l.828 -.828a2 2 0 0 0 .586 -1.414v-2.172a2 2 0 0 1 2 -2h8a2 2 0 0 1 2 2v2.172a2 2 0 0 0 .586 1.414l.828 .828a2 2 0 0 1 .586 1.414v8.172a2 2 0 0 1 -2 2h-4a2 2 0 0 1 -2 -2")
                .element("path", "d", "M20 13h-3a1 1 0 0 0 -1 1v2a1 1 0 0 0 1 1h3")
                .element("path", "d", "M4 17h3a1 1 0 0 0 1 -1v-2a1 1 0 0 0 -1 -1h-3")
                .element("path", "d", "M12 19v-11");
    }

    static Icon jetpack() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 6a3 3 0 1 0 -6 0v7h6v-7")
                .element("path", "d", "M14 13h6v-7a3 3 0 0 0 -6 0v7")
                .element("path", "d", "M5 16c0 2.333 .667 4 2 5c1.333 -1 2 -2.667 2 -5")
                .element("path", "d", "M15 16c0 2.333 .667 4 2 5c1.333 -1 2 -2.667 2 -5")
                .element("path", "d", "M10 8h4")
                .element("path", "d", "M10 11h4");
    }

    static Icon jetski() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 5h1.4a1 1 0 0 1 .882 .53l1.718 3.22")
                .element("path", "d", "M3.485 16.94l.136 .545a2 2 0 0 0 1.94 1.515h7.439a10 10 0 0 0 8 -4c0 -6 -5 -8 -5 -8c-1.889 2.518 -5.852 4 -9 4h-2a2 2 0 0 0 -2 2c0 1.328 .163 2.652 .485 3.94")
                .element("path", "d", "M3.25 15h17.75");
    }

    static Icon jewishStar() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 2l3 5h6l-3 5l3 5h-6l-3 5l-3 -5h-6l3 -5l-3 -5h6l3 -5");
    }

    static Icon joinBevel() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6 4h3a2 2 0 0 1 2 2v6a1 1 0 0 0 1 1h6a2 2 0 0 1 2 2v3a2 2 0 0 1 -2 2h-6.586a1 1 0 0 1 -.707 -.293l-6.414 -6.414a1 1 0 0 1 -.293 -.707v-6.586a2 2 0 0 1 2 -2");
    }

    static Icon joinRound() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6 4h3a2 2 0 0 1 2 2v6a1 1 0 0 0 1 1h6a2 2 0 0 1 2 2v3a2 2 0 0 1 -2 2h-6a8 8 0 0 1 -8 -8v-6a2 2 0 0 1 2 -2");
    }

    static Icon joinStraight() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6 4h3a2 2 0 0 1 2 2v6a1 1 0 0 0 1 1h6a2 2 0 0 1 2 2v3a2 2 0 0 1 -2 2h-12a2 2 0 0 1 -2 -2v-12a2 2 0 0 1 2 -2");
    }

    static Icon joker() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 17.5a1.5 1.5 0 0 1 1.5 -1.5h11a1.5 1.5 0 0 1 1.5 1.5a1.5 1.5 0 0 1 -1.5 1.5h-11a1.5 1.5 0 0 1 -1.5 -1.5")
                .element("path", "d", "M12 16q -2.5 -8 -6 -8q -2.5 0 -3 2c2.953 .31 3.308 3.33 4 6")
                .element("path", "d", "M12 16q 2.5 -8 6 -8q 2.5 0 3 2c-2.953 .31 -3.308 3.33 -4 6")
                .element("path", "d", "M9 9.5q 2 -3.5 3 -3.5t 3 3.5");
    }

    static Icon jpg() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M21 8h-2a2 2 0 0 0 -2 2v4a2 2 0 0 0 2 2h2v-4h-1")
                .element("path", "d", "M10 16v-8h2a2 2 0 1 1 0 4h-2")
                .element("path", "d", "M3 8h4v6a2 2 0 0 1 -2 2h-1.5a.5 .5 0 0 1 -.5 -.5v-.5");
    }

    static Icon json() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M20 16v-8l3 8v-8")
                .element("path", "d", "M15 8a2 2 0 0 1 2 2v4a2 2 0 1 1 -4 0v-4a2 2 0 0 1 2 -2")
                .element("path", "d", "M1 8h3v6.5a1.5 1.5 0 0 1 -3 0v-.5")
                .element("path", "d", "M7 15a1 1 0 0 0 1 1h1a1 1 0 0 0 1 -1v-2a1 1 0 0 0 -1 -1h-1a1 1 0 0 1 -1 -1v-2a1 1 0 0 1 1 -1h1a1 1 0 0 1 1 1");
    }

    static Icon jumpRope() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6 14v-6a3 3 0 1 1 6 0v8a3 3 0 0 0 6 0v-6")
                .element("path", "d", "M16 5a2 2 0 0 1 2 -2a2 2 0 0 1 2 2v3a2 2 0 0 1 -2 2a2 2 0 0 1 -2 -2l0 -3")
                .element("path", "d", "M4 16a2 2 0 0 1 2 -2a2 2 0 0 1 2 2v3a2 2 0 0 1 -2 2a2 2 0 0 1 -2 -2l0 -3");
    }
}
