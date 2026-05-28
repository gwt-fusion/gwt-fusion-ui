package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsT2 {
    private static final String[] NAMES = {"trending-down-2", "trending-down-3", "trending-up", "trending-up-2", "trending-up-3", "trending-up-down", "triangle", "triangle-inverted", "triangle-minus", "triangle-minus-2", "triangle-off", "triangle-plus", "triangle-plus-2", "triangle-square-circle", "triangles", "trident", "trolley", "trophy", "trophy-off", "trowel", "truck", "truck-delivery", "truck-loading", "truck-off", "truck-return", "txt", "typeface", "typography", "typography-off"};

    private TablerIconsT2() {
    }

    static String[] names() {
        return NAMES.clone();
    }

    static Icon icon(String name) {
        if ("trending-down-2".equals(name)) {
            return trendingDownN2();
        }
        if ("trending-down-3".equals(name)) {
            return trendingDownN3();
        }
        if ("trending-up".equals(name)) {
            return trendingUp();
        }
        if ("trending-up-2".equals(name)) {
            return trendingUpN2();
        }
        if ("trending-up-3".equals(name)) {
            return trendingUpN3();
        }
        if ("trending-up-down".equals(name)) {
            return trendingUpDown();
        }
        if ("triangle".equals(name)) {
            return triangle();
        }
        if ("triangle-inverted".equals(name)) {
            return triangleInverted();
        }
        if ("triangle-minus".equals(name)) {
            return triangleMinus();
        }
        if ("triangle-minus-2".equals(name)) {
            return triangleMinusN2();
        }
        if ("triangle-off".equals(name)) {
            return triangleOff();
        }
        if ("triangle-plus".equals(name)) {
            return trianglePlus();
        }
        if ("triangle-plus-2".equals(name)) {
            return trianglePlusN2();
        }
        if ("triangle-square-circle".equals(name)) {
            return triangleSquareCircle();
        }
        if ("triangles".equals(name)) {
            return triangles();
        }
        if ("trident".equals(name)) {
            return trident();
        }
        if ("trolley".equals(name)) {
            return trolley();
        }
        if ("trophy".equals(name)) {
            return trophy();
        }
        if ("trophy-off".equals(name)) {
            return trophyOff();
        }
        if ("trowel".equals(name)) {
            return trowel();
        }
        if ("truck".equals(name)) {
            return truck();
        }
        if ("truck-delivery".equals(name)) {
            return truckDelivery();
        }
        if ("truck-loading".equals(name)) {
            return truckLoading();
        }
        if ("truck-off".equals(name)) {
            return truckOff();
        }
        if ("truck-return".equals(name)) {
            return truckReturn();
        }
        if ("txt".equals(name)) {
            return txt();
        }
        if ("typeface".equals(name)) {
            return typeface();
        }
        if ("typography".equals(name)) {
            return typography();
        }
        if ("typography-off".equals(name)) {
            return typographyOff();
        }
        return null;
    }

    static Icon trendingDownN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 6h5l7 10h6")
                .element("path", "d", "M18 19l3 -3l-3 -3");
    }

    static Icon trendingDownN3() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 6h2.397a5 5 0 0 1 4.096 2.133l4.014 5.734a5 5 0 0 0 4.096 2.133h3.397")
                .element("path", "d", "M18 19l3 -3l-3 -3");
    }

    static Icon trendingUp() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 17l6 -6l4 4l8 -8")
                .element("path", "d", "M14 7l7 0l0 7");
    }

    static Icon trendingUpN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M18 5l3 3l-3 3")
                .element("path", "d", "M3 18h5l7 -10h6");
    }

    static Icon trendingUpN3() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M18 5l3 3l-3 3")
                .element("path", "d", "M3 18h2.397a5 5 0 0 0 4.096 -2.133l4.014 -5.734a5 5 0 0 1 4.096 -2.133h3.397");
    }

    static Icon trendingUpDown() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M2 14l6 -6l4 4l9 -9")
                .element("path", "d", "M15 3h6v6")
                .element("path", "d", "M15 21h6v-6")
                .element("path", "d", "M21 21l-6 -6");
    }

    static Icon triangle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10.363 3.591l-8.106 13.534a1.914 1.914 0 0 0 1.636 2.871h16.214a1.914 1.914 0 0 0 1.636 -2.87l-8.106 -13.536a1.914 1.914 0 0 0 -3.274 0");
    }

    static Icon triangleInverted() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10.363 20.405l-8.106 -13.534a1.914 1.914 0 0 1 1.636 -2.871h16.214a1.914 1.914 0 0 1 1.636 2.871l-8.106 13.534a1.914 1.914 0 0 1 -3.274 0");
    }

    static Icon triangleMinus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10.363 3.591l-8.106 13.534a1.914 1.914 0 0 0 1.636 2.871h16.214a1.914 1.914 0 0 0 1.636 -2.87l-8.106 -13.536a1.914 1.914 0 0 0 -3.274 0v.001")
                .element("path", "d", "M9 13h6");
    }

    static Icon triangleMinusN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M20.48 15.016l-6.843 -11.426a1.914 1.914 0 0 0 -3.274 0l-8.106 13.535a1.914 1.914 0 0 0 1.636 2.871h8.107")
                .element("path", "d", "M16 19h6");
    }

    static Icon triangleOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7.825 7.83l-5.568 9.295a1.914 1.914 0 0 0 1.636 2.871h16.107m1.998 -1.99a1.913 1.913 0 0 0 -.255 -.88l-8.106 -13.536a1.914 1.914 0 0 0 -3.274 0l-1.028 1.718")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon trianglePlus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10.363 3.591l-8.106 13.534a1.914 1.914 0 0 0 1.636 2.871h16.214a1.914 1.914 0 0 0 1.636 -2.87l-8.106 -13.536a1.914 1.914 0 0 0 -3.274 0v.001")
                .element("path", "d", "M9 13h6")
                .element("path", "d", "M12 10v6");
    }

    static Icon trianglePlusN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M18.69 12.027l-5.054 -8.437a1.914 1.914 0 0 0 -3.274 0l-8.105 13.535a1.914 1.914 0 0 0 1.636 2.871h8.107")
                .element("path", "d", "M16 19h6")
                .element("path", "d", "M19 16v6");
    }

    static Icon triangleSquareCircle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 3l-4 7h8l-4 -7")
                .element("path", "d", "M14 17a3 3 0 1 0 6 0a3 3 0 1 0 -6 0")
                .element("path", "d", "M4 15a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v4a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1l0 -4");
    }

    static Icon triangles() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9.974 21h8.052a.975 .975 0 0 0 .81 -1.517l-4.025 -6.048a.973 .973 0 0 0 -1.622 0l-4.025 6.048a.977 .977 0 0 0 .81 1.517")
                .element("path", "d", "M4.98 16h14.04c.542 0 .98 -.443 .98 -.989a1 1 0 0 0 -.156 -.534l-7.02 -11.023a.974 .974 0 0 0 -1.648 0l-7.02 11.023a1 1 0 0 0 .294 1.366a.973 .973 0 0 0 .53 .157");
    }

    static Icon trident() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 6l2 -2v3a7 7 0 0 0 14 0v-3l2 2")
                .element("path", "d", "M12 21v-18l-2 2m4 0l-2 -2");
    }

    static Icon trolley() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9 19a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M6 16l3 2")
                .element("path", "d", "M12 17l8 -12")
                .element("path", "d", "M17 10l2 1")
                .element("path", "d", "M9.592 4.695l3.306 2.104a1.3 1.3 0 0 1 .396 1.8l-3.094 4.811a1.3 1.3 0 0 1 -1.792 .394l-3.306 -2.104a1.3 1.3 0 0 1 -.396 -1.8l3.094 -4.81a1.3 1.3 0 0 1 1.792 -.394");
    }

    static Icon trophy() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 21l8 0")
                .element("path", "d", "M12 17l0 4")
                .element("path", "d", "M7 4l10 0")
                .element("path", "d", "M17 4v8a5 5 0 0 1 -10 0v-8")
                .element("path", "d", "M3 9a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M17 9a2 2 0 1 0 4 0a2 2 0 1 0 -4 0");
    }

    static Icon trophyOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 21h8")
                .element("path", "d", "M12 17v4")
                .element("path", "d", "M8 4h9")
                .element("path", "d", "M17 4v8c0 .31 -.028 .612 -.082 .905m-1.384 2.632a5 5 0 0 1 -8.534 -3.537v-5")
                .element("path", "d", "M3 9a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M17 9a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon trowel() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M14.42 9.058l-5.362 5.363a1.978 1.978 0 0 1 -3.275 -.773l-2.682 -8.044a1.978 1.978 0 0 1 2.502 -2.502l8.045 2.682a1.978 1.978 0 0 1 .773 3.274")
                .element("path", "d", "M10 10l6.5 6.5")
                .element("path", "d", "M19.347 16.575l1.08 1.079a1.96 1.96 0 0 1 -2.773 2.772l-1.08 -1.079a1.96 1.96 0 0 1 2.773 -2.772");
    }

    static Icon truck() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M15 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M5 17h-2v-11a1 1 0 0 1 1 -1h9v12m-4 0h6m4 0h2v-6h-8m0 -5h5l3 5");
    }

    static Icon truckDelivery() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M15 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M5 17h-2v-4m-1 -8h11v12m-4 0h6m4 0h2v-6h-8m0 -5h5l3 5")
                .element("path", "d", "M3 9l4 0");
    }

    static Icon truckLoading() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M2 3h1a2 2 0 0 1 2 2v10a2 2 0 0 0 2 2h15")
                .element("path", "d", "M9 9a3 3 0 0 1 3 -3h4a3 3 0 0 1 3 3v2a3 3 0 0 1 -3 3h-4a3 3 0 0 1 -3 -3l0 -2")
                .element("path", "d", "M7 19a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M16 19a2 2 0 1 0 4 0a2 2 0 1 0 -4 0");
    }

    static Icon truckOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M15.585 15.586a2 2 0 0 0 2.826 2.831")
                .element("path", "d", "M5 17h-2v-11a1 1 0 0 1 1 -1h1m3.96 0h4.04v4m0 4v4m-4 0h6m6 0v-6h-6m-2 -5h5l3 5")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon truckReturn() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M15 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M5 17h-2v-11a1 1 0 0 1 1 -1h9v6h-5l2 2m0 -4l-2 2")
                .element("path", "d", "M9 17l6 0")
                .element("path", "d", "M13 6h5l3 5v6h-2");
    }

    static Icon txt() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 8h4")
                .element("path", "d", "M5 8v8")
                .element("path", "d", "M17 8h4")
                .element("path", "d", "M19 8v8")
                .element("path", "d", "M10 8l4 8")
                .element("path", "d", "M10 16l4 -8");
    }

    static Icon typeface() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 5a2 2 0 0 1 2 -2h14a2 2 0 0 1 2 2v14a2 2 0 0 1 -2 2h-14a2 2 0 0 1 -2 -2l0 -14")
                .element("path", "d", "M17 17a2 2 0 0 1 -2 -2v-8h-5a2 2 0 0 0 -2 2")
                .element("path", "d", "M7 17a2.775 2.775 0 0 0 2.632 -1.897l.368 -1.103a13.4 13.4 0 0 1 3.236 -5.236l1.764 -1.764")
                .element("path", "d", "M10 14h5");
    }

    static Icon typography() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 20l3 0")
                .element("path", "d", "M14 20l7 0")
                .element("path", "d", "M6.9 15l6.9 0")
                .element("path", "d", "M10.2 6.3l5.8 13.7")
                .element("path", "d", "M5 20l6 -16l2 0l7 16");
    }

    static Icon typographyOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 20h3")
                .element("path", "d", "M14 20h6")
                .element("path", "d", "M6.9 15h6.9")
                .element("path", "d", "M13 13l3 7")
                .element("path", "d", "M5 20l4.09 -10.906")
                .element("path", "d", "M10.181 6.183l.819 -2.183h2l3.904 8.924")
                .element("path", "d", "M3 3l18 18");
    }
}
