package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsV {
    private static final String[] NAMES = {"vaccine", "vaccine-bottle", "vaccine-bottle-off", "vaccine-off", "vacuum-cleaner", "variable", "variable-minus", "variable-off", "variable-plus", "vector", "vector-bezier", "vector-bezier-2", "vector-bezier-arc", "vector-bezier-circle", "vector-off", "vector-spline", "vector-triangle", "vector-triangle-off", "venus", "versions", "versions-off", "video", "video-minus", "video-off", "video-plus", "view-360", "view-360-arrow", "view-360-number", "view-360-off", "viewfinder", "viewfinder-off", "viewport-narrow", "viewport-short", "viewport-tall", "viewport-wide", "vignette", "vinyl", "vip", "vip-2", "vip-off", "virus", "virus-off", "virus-search", "vocabulary", "vocabulary-off", "volcano", "volume", "volume-2", "volume-3", "volume-4", "volume-off", "vs"};

    private TablerIconsV() {
    }

    static String[] names() {
        String[] names = new String[NAMES.length];
        for (int i = 0; i < NAMES.length; i++) {
            names[i] = NAMES[i];
        }
        return names;
    }

    static Icon icon(String name) {
        if ("vaccine".equals(name)) {
            return vaccine();
        }
        if ("vaccine-bottle".equals(name)) {
            return vaccineBottle();
        }
        if ("vaccine-bottle-off".equals(name)) {
            return vaccineBottleOff();
        }
        if ("vaccine-off".equals(name)) {
            return vaccineOff();
        }
        if ("vacuum-cleaner".equals(name)) {
            return vacuumCleaner();
        }
        if ("variable".equals(name)) {
            return variable();
        }
        if ("variable-minus".equals(name)) {
            return variableMinus();
        }
        if ("variable-off".equals(name)) {
            return variableOff();
        }
        if ("variable-plus".equals(name)) {
            return variablePlus();
        }
        if ("vector".equals(name)) {
            return vector();
        }
        if ("vector-bezier".equals(name)) {
            return vectorBezier();
        }
        if ("vector-bezier-2".equals(name)) {
            return vectorBezierN2();
        }
        if ("vector-bezier-arc".equals(name)) {
            return vectorBezierArc();
        }
        if ("vector-bezier-circle".equals(name)) {
            return vectorBezierCircle();
        }
        if ("vector-off".equals(name)) {
            return vectorOff();
        }
        if ("vector-spline".equals(name)) {
            return vectorSpline();
        }
        if ("vector-triangle".equals(name)) {
            return vectorTriangle();
        }
        if ("vector-triangle-off".equals(name)) {
            return vectorTriangleOff();
        }
        if ("venus".equals(name)) {
            return venus();
        }
        if ("versions".equals(name)) {
            return versions();
        }
        if ("versions-off".equals(name)) {
            return versionsOff();
        }
        if ("video".equals(name)) {
            return video();
        }
        if ("video-minus".equals(name)) {
            return videoMinus();
        }
        if ("video-off".equals(name)) {
            return videoOff();
        }
        if ("video-plus".equals(name)) {
            return videoPlus();
        }
        if ("view-360".equals(name)) {
            return viewN360();
        }
        if ("view-360-arrow".equals(name)) {
            return viewN360Arrow();
        }
        if ("view-360-number".equals(name)) {
            return viewN360Number();
        }
        if ("view-360-off".equals(name)) {
            return viewN360Off();
        }
        if ("viewfinder".equals(name)) {
            return viewfinder();
        }
        if ("viewfinder-off".equals(name)) {
            return viewfinderOff();
        }
        if ("viewport-narrow".equals(name)) {
            return viewportNarrow();
        }
        if ("viewport-short".equals(name)) {
            return viewportShort();
        }
        if ("viewport-tall".equals(name)) {
            return viewportTall();
        }
        if ("viewport-wide".equals(name)) {
            return viewportWide();
        }
        if ("vignette".equals(name)) {
            return vignette();
        }
        if ("vinyl".equals(name)) {
            return vinyl();
        }
        if ("vip".equals(name)) {
            return vip();
        }
        if ("vip-2".equals(name)) {
            return vipN2();
        }
        if ("vip-off".equals(name)) {
            return vipOff();
        }
        if ("virus".equals(name)) {
            return virus();
        }
        if ("virus-off".equals(name)) {
            return virusOff();
        }
        if ("virus-search".equals(name)) {
            return virusSearch();
        }
        if ("vocabulary".equals(name)) {
            return vocabulary();
        }
        if ("vocabulary-off".equals(name)) {
            return vocabularyOff();
        }
        if ("volcano".equals(name)) {
            return volcano();
        }
        if ("volume".equals(name)) {
            return volume();
        }
        if ("volume-2".equals(name)) {
            return volumeN2();
        }
        if ("volume-3".equals(name)) {
            return volumeN3();
        }
        if ("volume-4".equals(name)) {
            return volumeN4();
        }
        if ("volume-off".equals(name)) {
            return volumeOff();
        }
        if ("vs".equals(name)) {
            return vs();
        }
        return null;
    }

    static Icon vaccine() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 3l4 4")
                .element("path", "d", "M19 5l-4.5 4.5")
                .element("path", "d", "M11.5 6.5l6 6")
                .element("path", "d", "M16.5 11.5l-6.5 6.5h-4v-4l6.5 -6.5")
                .element("path", "d", "M7.5 12.5l1.5 1.5")
                .element("path", "d", "M10.5 9.5l1.5 1.5")
                .element("path", "d", "M3 21l3 -3");
    }

    static Icon vaccineBottle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9 4a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v1a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1l0 -1")
                .element("path", "d", "M10 6v.98c0 .877 -.634 1.626 -1.5 1.77c-.866 .144 -1.5 .893 -1.5 1.77v8.48a2 2 0 0 0 2 2h6a2 2 0 0 0 2 -2v-8.48c0 -.877 -.634 -1.626 -1.5 -1.77a1.795 1.795 0 0 1 -1.5 -1.77v-.98")
                .element("path", "d", "M7 12h10")
                .element("path", "d", "M7 18h10")
                .element("path", "d", "M11 15h2");
    }

    static Icon vaccineBottleOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9 5v-1a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v1a1 1 0 0 1 -1 1h-4")
                .element("path", "d", "M8.7 8.705a1.806 1.806 0 0 1 -.2 .045c-.866 .144 -1.5 .893 -1.5 1.77v8.48a2 2 0 0 0 2 2h6a2 2 0 0 0 2 -2v-2m0 -4v-2.48c0 -.877 -.634 -1.626 -1.5 -1.77a1.795 1.795 0 0 1 -1.5 -1.77v-.98")
                .element("path", "d", "M7 12h5m4 0h1")
                .element("path", "d", "M7 18h10")
                .element("path", "d", "M11 15h2")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon vaccineOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 3l4 4")
                .element("path", "d", "M19 5l-4.5 4.5")
                .element("path", "d", "M11.5 6.5l6 6")
                .element("path", "d", "M16.5 11.5l-.5 .5m-2 2l-4 4h-4v-4l4 -4m2 -2l.5 -.5")
                .element("path", "d", "M7.5 12.5l1.5 1.5")
                .element("path", "d", "M3 21l3 -3")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon vacuumCleaner() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M21 12a9 9 0 1 1 -18 0a9 9 0 0 1 18 0")
                .element("path", "d", "M14 9a2 2 0 1 1 -4 0a2 2 0 0 1 4 0")
                .element("path", "d", "M12 16h.01");
    }

    static Icon variable() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 4c-2.5 5 -2.5 10 0 16m14 -16c2.5 5 2.5 10 0 16m-10 -11h1c1 0 1 1 2.016 3.527c.984 2.473 .984 3.473 1.984 3.473h1")
                .element("path", "d", "M8 16c1.5 0 3 -2 4 -3.5s2.5 -3.5 4 -3.5");
    }

    static Icon variableMinus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 16c1.5 0 3 -2 4 -3.5s2.5 -3.5 4 -3.5")
                .element("path", "d", "M5 4c-2.5 5 -2.5 10 0 16m14 -16c1.775 3.55 2.29 7.102 1.544 11.01m-11.544 -6.01h1c1 0 1 1 2.016 3.527c.782 1.966 .943 3 1.478 3.343")
                .element("path", "d", "M8 16c1.5 0 3 -2 4 -3.5s2.5 -3.5 4 -3.5")
                .element("path", "d", "M16 19h6");
    }

    static Icon variableOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4.675 4.68c-2.17 4.776 -2.062 9.592 .325 15.32")
                .element("path", "d", "M19 4c1.959 3.917 2.383 7.834 1.272 12.232m-.983 3.051c-.093 .238 -.189 .477 -.289 .717")
                .element("path", "d", "M11.696 11.696c.095 .257 .2 .533 .32 .831c.984 2.473 .984 3.473 1.984 3.473h1")
                .element("path", "d", "M8 16c1.5 0 3 -2 4 -3.5m2.022 -2.514c.629 -.582 1.304 -.986 1.978 -.986")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon variablePlus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 4c-2.5 5 -2.5 10 0 16m14 -16c1.38 2.76 2 5.52 1.855 8.448m-11.855 -3.448h1c1 0 1 1 2.016 3.527c.785 1.972 .944 3.008 1.483 3.346")
                .element("path", "d", "M8 16c1.5 0 3 -2 4 -3.5s2.5 -3.5 4 -3.5")
                .element("path", "d", "M16 19h6")
                .element("path", "d", "M19 16v6");
    }

    static Icon vector() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 4a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 4a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M3 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M5 7l0 10")
                .element("path", "d", "M19 7l0 10")
                .element("path", "d", "M7 5l10 0")
                .element("path", "d", "M7 19l10 0");
    }

    static Icon vectorBezier() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 15a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 15a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M10 7a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M10 8.5a6 6 0 0 0 -5 5.5")
                .element("path", "d", "M14 8.5a6 6 0 0 1 5 5.5")
                .element("path", "d", "M10 8l-6 0")
                .element("path", "d", "M20 8l-6 0")
                .element("path", "d", "M2 8a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M20 8a1 1 0 1 0 2 0a1 1 0 1 0 -2 0");
    }

    static Icon vectorBezierN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 4a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M7 5l7 0")
                .element("path", "d", "M10 19l7 0")
                .element("path", "d", "M8 19a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M14 5a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M7 5.5a5 6.5 0 0 1 5 6.5a5 6.5 0 0 0 5 6.5");
    }

    static Icon vectorBezierArc() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 11a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 11a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M10 4a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M10 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M19 10a5 5 0 0 0 -5 -5")
                .element("path", "d", "M5 14a5 5 0 0 0 5 5")
                .element("path", "d", "M5 10a5 5 0 0 1 5 -5");
    }

    static Icon vectorBezierCircle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 11a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 11a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M10 4a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M10 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M19 10a5 5 0 0 0 -5 -5")
                .element("path", "d", "M19 14a5 5 0 0 1 -5 5")
                .element("path", "d", "M5 14a5 5 0 0 0 5 5")
                .element("path", "d", "M5 10a5 5 0 0 1 5 -5");
    }

    static Icon vectorOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6.68 6.733a1 1 0 0 1 -.68 .267h-2a1 1 0 0 1 -1 -1v-2c0 -.276 .112 -.527 .293 -.708")
                .element("path", "d", "M17 4a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M20.72 20.693a1 1 0 0 1 -.72 .307h-2a1 1 0 0 1 -1 -1v-2c0 -.282 .116 -.536 .304 -.718")
                .element("path", "d", "M3 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M5 7v10")
                .element("path", "d", "M19 7v8")
                .element("path", "d", "M9 5h8")
                .element("path", "d", "M7 19h10")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon vectorSpline() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 4a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M3 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 5c-6.627 0 -12 5.373 -12 12");
    }

    static Icon vectorTriangle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 5a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M3 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M17 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M6.5 17.1l5 -9.1")
                .element("path", "d", "M17.5 17.1l-5 -9.1")
                .element("path", "d", "M7 19l10 0");
    }

    static Icon vectorTriangleOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 6v-1a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-1")
                .element("path", "d", "M3 18a1 1 0 0 1 1 -1h2a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1l0 -2")
                .element("path", "d", "M20.705 20.709a1 1 0 0 1 -.705 .291h-2a1 1 0 0 1 -1 -1v-2c0 -.28 .115 -.532 .3 -.714")
                .element("path", "d", "M6.5 17.1l3.749 -6.823")
                .element("path", "d", "M13.158 9.197l-.658 -1.197")
                .element("path", "d", "M7 19h10")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon venus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7 9a5 5 0 1 0 10 0a5 5 0 1 0 -10 0")
                .element("path", "d", "M12 14l0 7")
                .element("path", "d", "M9 18l6 0");
    }

    static Icon versions() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 7a2 2 0 0 1 2 -2h6a2 2 0 0 1 2 2v10a2 2 0 0 1 -2 2h-6a2 2 0 0 1 -2 -2l0 -10")
                .element("path", "d", "M7 7l0 10")
                .element("path", "d", "M4 8l0 8");
    }

    static Icon versionsOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10.184 6.162a2 2 0 0 1 1.816 -1.162h6a2 2 0 0 1 2 2v9m-1.185 2.827a1.993 1.993 0 0 1 -.815 .173h-6a2 2 0 0 1 -2 -2v-7")
                .element("path", "d", "M7 7v10")
                .element("path", "d", "M4 8v8")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon video() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M15 10l4.553 -2.276a1 1 0 0 1 1.447 .894v6.764a1 1 0 0 1 -1.447 .894l-4.553 -2.276v-4")
                .element("path", "d", "M3 8a2 2 0 0 1 2 -2h8a2 2 0 0 1 2 2v8a2 2 0 0 1 -2 2h-8a2 2 0 0 1 -2 -2l0 -8");
    }

    static Icon videoMinus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M15 10l4.553 -2.276a1 1 0 0 1 1.447 .894v6.764a1 1 0 0 1 -1.447 .894l-4.553 -2.276v-4")
                .element("path", "d", "M3 8a2 2 0 0 1 2 -2h8a2 2 0 0 1 2 2v8a2 2 0 0 1 -2 2h-8a2 2 0 0 1 -2 -2l0 -8")
                .element("path", "d", "M7 12l4 0");
    }

    static Icon videoOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 3l18 18")
                .element("path", "d", "M15 11v-1l4.553 -2.276a1 1 0 0 1 1.447 .894v6.764a1 1 0 0 1 -.675 .946")
                .element("path", "d", "M10 6h3a2 2 0 0 1 2 2v3m0 4v1a2 2 0 0 1 -2 2h-8a2 2 0 0 1 -2 -2v-8a2 2 0 0 1 2 -2h1");
    }

    static Icon videoPlus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M15 10l4.553 -2.276a1 1 0 0 1 1.447 .894v6.764a1 1 0 0 1 -1.447 .894l-4.553 -2.276v-4")
                .element("path", "d", "M3 8a2 2 0 0 1 2 -2h8a2 2 0 0 1 2 2v8a2 2 0 0 1 -2 2h-8a2 2 0 0 1 -2 -2l0 -8")
                .element("path", "d", "M7 12l4 0")
                .element("path", "d", "M9 10l0 4");
    }

    static Icon viewN360() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 12a9 9 0 1 0 18 0a9 9 0 1 0 -18 0")
                .element("path", "d", "M8 12a4 9 0 1 0 8 0a4 9 0 1 0 -8 0")
                .element("path", "d", "M3 12c0 2.21 4.03 4 9 4s9 -1.79 9 -4s-4.03 -4 -9 -4s-9 1.79 -9 4");
    }

    static Icon viewN360Arrow() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 15.328c2.414 -.718 4 -1.94 4 -3.328c0 -2.21 -4.03 -4 -9 -4s-9 1.79 -9 4s4.03 4 9 4")
                .element("path", "d", "M9 13l3 3l-3 3");
    }

    static Icon viewN360Number() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M14 6a1 1 0 0 0 -1 -1h-2a1 1 0 0 0 -1 1v6a1 1 0 0 0 1 1h2a1 1 0 0 0 1 -1v-2a1 1 0 0 0 -1 -1h-3")
                .element("path", "d", "M3 5h2.5a1.5 1.5 0 0 1 1.5 1.5v1a1.5 1.5 0 0 1 -1.5 1.5h-1.5h1.5a1.5 1.5 0 0 1 1.5 1.5v1a1.5 1.5 0 0 1 -1.5 1.5h-2.5")
                .element("path", "d", "M17 7v4a2 2 0 1 0 4 0v-4a2 2 0 1 0 -4 0")
                .element("path", "d", "M3 16c0 1.657 4.03 3 9 3s9 -1.343 9 -3");
    }

    static Icon viewN360Off() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8.335 8.388a19 19 0 0 0 -.335 3.612c0 4.97 1.79 9 4 9c1.622 0 3.018 -2.172 3.646 -5.294m.354 -3.706c0 -4.97 -1.79 -9 -4 -9c-1.035 0 -1.979 .885 -2.689 2.337")
                .element("path", "d", "M5.65 5.623a9 9 0 1 0 12.71 12.745m1.684 -2.328a9 9 0 0 0 -12.094 -12.08")
                .element("path", "d", "M8.32 8.349c-3.136 .625 -5.32 2.025 -5.32 3.651c0 2.21 4.03 4 9 4c1.286 0 2.51 -.12 3.616 -.336m3.059 -.98c1.445 -.711 2.325 -1.653 2.325 -2.684c0 -2.21 -4.03 -4 -9 -4")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon viewfinder() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 12a9 9 0 1 0 18 0a9 9 0 1 0 -18 0")
                .element("path", "d", "M12 3l0 4")
                .element("path", "d", "M12 21l0 -3")
                .element("path", "d", "M3 12l4 0")
                .element("path", "d", "M21 12l-3 0")
                .element("path", "d", "M12 12l0 .01");
    }

    static Icon viewfinderOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5.65 5.623a9 9 0 1 0 12.71 12.745m1.684 -2.328a9 9 0 0 0 -12.094 -12.08")
                .element("path", "d", "M12 3v4")
                .element("path", "d", "M12 21v-3")
                .element("path", "d", "M3 12h4")
                .element("path", "d", "M21 12h-3")
                .element("path", "d", "M12 12v.01")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon viewportNarrow() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 12h7l-3 -3")
                .element("path", "d", "M7 15l3 -3")
                .element("path", "d", "M21 12h-7l3 -3")
                .element("path", "d", "M17 15l-3 -3")
                .element("path", "d", "M9 6v-1a2 2 0 0 1 2 -2h2a2 2 0 0 1 2 2v1")
                .element("path", "d", "M9 18v1a2 2 0 0 0 2 2h2a2 2 0 0 0 2 -2v-1");
    }

    static Icon viewportShort() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 3v7l3 -3")
                .element("path", "d", "M9 7l3 3")
                .element("path", "d", "M12 21v-7l3 3")
                .element("path", "d", "M9 17l3 -3")
                .element("path", "d", "M18 9h1a2 2 0 0 1 2 2v2a2 2 0 0 1 -2 2h-1")
                .element("path", "d", "M6 9h-1a2 2 0 0 0 -2 2v2a2 2 0 0 0 2 2h1");
    }

    static Icon viewportTall() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 10v-7l3 3")
                .element("path", "d", "M9 6l3 -3")
                .element("path", "d", "M12 14v7l3 -3")
                .element("path", "d", "M9 18l3 3")
                .element("path", "d", "M18 3h1a2 2 0 0 1 2 2v14a2 2 0 0 1 -2 2h-1")
                .element("path", "d", "M6 3h-1a2 2 0 0 0 -2 2v14a2 2 0 0 0 2 2h1");
    }

    static Icon viewportWide() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 12h-7l3 -3")
                .element("path", "d", "M6 15l-3 -3")
                .element("path", "d", "M14 12h7l-3 -3")
                .element("path", "d", "M18 15l3 -3")
                .element("path", "d", "M3 6v-1a2 2 0 0 1 2 -2h14a2 2 0 0 1 2 2v1")
                .element("path", "d", "M3 18v1a2 2 0 0 0 2 2h14a2 2 0 0 0 2 -2v-1");
    }

    static Icon vignette() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M21 12a9 9 0 1 1 -18 0a9 9 0 0 1 18 0")
                .element("path", "d", "M7.02 12h-.01")
                .element("path", "d", "M12.02 7h-.01")
                .element("path", "d", "M17.02 12h-.01")
                .element("path", "d", "M12.02 17h-.01")
                .element("path", "d", "M8.483 8.468l-.007 -.007")
                .element("path", "d", "M15.554 8.468l-.007 -.007")
                .element("path", "d", "M15.554 15.539l-.007 -.007")
                .element("path", "d", "M8.483 15.539l-.007 -.007");
    }

    static Icon vinyl() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M16 3.937a9 9 0 1 0 5 8.063")
                .element("path", "d", "M11 12a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M19 4a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M20 4l-3.5 10l-2.5 2");
    }

    static Icon vip() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 5h18")
                .element("path", "d", "M3 19h18")
                .element("path", "d", "M4 9l2 6h1l2 -6")
                .element("path", "d", "M12 9v6")
                .element("path", "d", "M16 15v-6h2a2 2 0 1 1 0 4h-2");
    }

    static Icon vipN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 5h4")
                .element("path", "d", "M17 5h4")
                .element("path", "d", "M3 19h18")
                .element("path", "d", "M4 9l2 6h1l2 -6")
                .element("path", "d", "M12 10v5")
                .element("path", "d", "M16 15v-6h2a2 2 0 1 1 0 4h-2")
                .element("path", "d", "M10 5a2 2 0 0 1 2 2a2 2 0 0 1 2 -2a2 2 0 0 1 -2 -2a2 2 0 0 1 -2 2");
    }

    static Icon vipOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 5h2m4 0h12")
                .element("path", "d", "M3 19h16")
                .element("path", "d", "M4 9l2 6h1l2 -6")
                .element("path", "d", "M12 12v3")
                .element("path", "d", "M16 12v-3h2a2 2 0 1 1 0 4h-1")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon virus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7 12a5 5 0 1 0 10 0a5 5 0 1 0 -10 0")
                .element("path", "d", "M12 7v-4")
                .element("path", "d", "M11 3h2")
                .element("path", "d", "M15.536 8.464l2.828 -2.828")
                .element("path", "d", "M17.657 4.929l1.414 1.414")
                .element("path", "d", "M17 12h4")
                .element("path", "d", "M21 11v2")
                .element("path", "d", "M15.535 15.536l2.829 2.828")
                .element("path", "d", "M19.071 17.657l-1.414 1.414")
                .element("path", "d", "M12 17v4")
                .element("path", "d", "M13 21h-2")
                .element("path", "d", "M8.465 15.536l-2.829 2.828")
                .element("path", "d", "M6.343 19.071l-1.413 -1.414")
                .element("path", "d", "M7 12h-4")
                .element("path", "d", "M3 13v-2")
                .element("path", "d", "M8.464 8.464l-2.828 -2.828")
                .element("path", "d", "M4.929 6.343l1.414 -1.413");
    }

    static Icon virusOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 3l18 18")
                .element("path", "d", "M8.469 8.46a5 5 0 0 0 7.058 7.084")
                .element("path", "d", "M16.913 12.936a5 5 0 0 0 -5.826 -5.853")
                .element("path", "d", "M12 7v-4")
                .element("path", "d", "M11 3h2")
                .element("path", "d", "M15.536 8.464l2.828 -2.828")
                .element("path", "d", "M17.657 4.929l1.414 1.414")
                .element("path", "d", "M17 12h4")
                .element("path", "d", "M21 11v2")
                .element("path", "d", "M18.364 18.363l-.707 .707")
                .element("path", "d", "M12 17v4")
                .element("path", "d", "M13 21h-2")
                .element("path", "d", "M8.465 15.536l-2.829 2.828")
                .element("path", "d", "M6.343 19.071l-1.413 -1.414")
                .element("path", "d", "M7 12h-4")
                .element("path", "d", "M3 13v-2")
                .element("path", "d", "M5.636 5.637l-.707 .707");
    }

    static Icon virusSearch() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 12a5 5 0 1 0 -5 5")
                .element("path", "d", "M12 7v-4")
                .element("path", "d", "M11 3h2")
                .element("path", "d", "M15.536 8.464l2.828 -2.828")
                .element("path", "d", "M17.657 4.929l1.414 1.414")
                .element("path", "d", "M17 12h4")
                .element("path", "d", "M21 11v2")
                .element("path", "d", "M12 17v4")
                .element("path", "d", "M13 21h-2")
                .element("path", "d", "M8.465 15.536l-2.829 2.828")
                .element("path", "d", "M6.343 19.071l-1.413 -1.414")
                .element("path", "d", "M7 12h-4")
                .element("path", "d", "M3 13v-2")
                .element("path", "d", "M8.464 8.464l-2.828 -2.828")
                .element("path", "d", "M4.929 6.343l1.414 -1.413")
                .element("path", "d", "M15 17.5a2.5 2.5 0 1 0 5 0a2.5 2.5 0 1 0 -5 0")
                .element("path", "d", "M19.5 19.5l2.5 2.5");
    }

    static Icon vocabulary() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 19h-6a1 1 0 0 1 -1 -1v-14a1 1 0 0 1 1 -1h6a2 2 0 0 1 2 2a2 2 0 0 1 2 -2h6a1 1 0 0 1 1 1v14a1 1 0 0 1 -1 1h-6a2 2 0 0 0 -2 2a2 2 0 0 0 -2 -2")
                .element("path", "d", "M12 5v16")
                .element("path", "d", "M7 7h1")
                .element("path", "d", "M7 11h1")
                .element("path", "d", "M16 7h1")
                .element("path", "d", "M16 11h1")
                .element("path", "d", "M16 15h1");
    }

    static Icon vocabularyOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7 3h3a2 2 0 0 1 2 2a2 2 0 0 1 2 -2h6a1 1 0 0 1 1 1v13m-2 2h-5a2 2 0 0 0 -2 2a2 2 0 0 0 -2 -2h-6a1 1 0 0 1 -1 -1v-14c0 -.279 .114 -.53 .298 -.712")
                .element("path", "d", "M12 5v3m0 4v9")
                .element("path", "d", "M7 11h1")
                .element("path", "d", "M16 7h1")
                .element("path", "d", "M16 11h1")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon volcano() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9 8v-1a2 2 0 1 0 -4 0")
                .element("path", "d", "M15 8v-1a2 2 0 1 1 4 0")
                .element("path", "d", "M4 20l3.472 -7.812a2 2 0 0 1 1.828 -1.188h5.4a2 2 0 0 1 1.828 1.188l3.472 7.812")
                .element("path", "d", "M6.192 15.064a2.14 2.14 0 0 1 .475 -.064c.527 -.009 1.026 .178 1.333 .5c.307 .32 .806 .507 1.333 .5c.527 .007 1.026 -.18 1.334 -.5c.307 -.322 .806 -.509 1.333 -.5c.527 -.009 1.026 .178 1.333 .5c.308 .32 .807 .507 1.334 .5c.527 .007 1.026 -.18 1.333 -.5c.307 -.322 .806 -.509 1.333 -.5c.161 .003 .32 .025 .472 .064")
                .element("path", "d", "M12 8v-4");
    }

    static Icon volume() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M15 8a5 5 0 0 1 0 8")
                .element("path", "d", "M17.7 5a9 9 0 0 1 0 14")
                .element("path", "d", "M6 15h-2a1 1 0 0 1 -1 -1v-4a1 1 0 0 1 1 -1h2l3.5 -4.5a.8 .8 0 0 1 1.5 .5v14a.8 .8 0 0 1 -1.5 .5l-3.5 -4.5");
    }

    static Icon volumeN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M15 8a5 5 0 0 1 0 8")
                .element("path", "d", "M6 15h-2a1 1 0 0 1 -1 -1v-4a1 1 0 0 1 1 -1h2l3.5 -4.5a.8 .8 0 0 1 1.5 .5v14a.8 .8 0 0 1 -1.5 .5l-3.5 -4.5");
    }

    static Icon volumeN3() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6 15h-2a1 1 0 0 1 -1 -1v-4a1 1 0 0 1 1 -1h2l3.5 -4.5a.8 .8 0 0 1 1.5 .5v14a.8 .8 0 0 1 -1.5 .5l-3.5 -4.5")
                .element("path", "d", "M16 10l4 4m0 -4l-4 4");
    }

    static Icon volumeN4() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9.5 15h-2a1 1 0 0 1 -1 -1v-4a1 1 0 0 1 1 -1h2l3.5 -4.5a.8 .8 0 0 1 1.5 .5v14a.8 .8 0 0 1 -1.5 .5l-3.5 -4.5");
    }

    static Icon volumeOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M15 8a5 5 0 0 1 1.912 4.934m-1.377 2.602a5 5 0 0 1 -.535 .464")
                .element("path", "d", "M17.7 5a9 9 0 0 1 2.362 11.086m-1.676 2.299a9 9 0 0 1 -.686 .615")
                .element("path", "d", "M9.069 5.054l.431 -.554a.8 .8 0 0 1 1.5 .5v2m0 4v8a.8 .8 0 0 1 -1.5 .5l-3.5 -4.5h-2a1 1 0 0 1 -1 -1v-4a1 1 0 0 1 1 -1h2l1.294 -1.664")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon vs() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M2 12c0 5.523 4.477 10 10 10s10 -4.477 10 -10s-4.477 -10 -10 -10s-10 4.477 -10 10")
                .element("path", "d", "M14 14.25c0 .414 .336 .75 .75 .75h1.25a1 1 0 0 0 1 -1v-1a1 1 0 0 0 -1 -1h-1a1 1 0 0 1 -1 -1v-1a1 1 0 0 1 1 -1h1.25a.75 .75 0 0 1 .75 .75")
                .element("path", "d", "M7 9l2 6l2 -6");
    }
}
