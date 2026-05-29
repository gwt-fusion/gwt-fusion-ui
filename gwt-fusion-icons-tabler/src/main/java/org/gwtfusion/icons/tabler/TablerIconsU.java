package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsU {
    private static final String[] NAMES = {"u-turn-left", "u-turn-right", "ufo", "ufo-off", "uhd", "umbrella", "umbrella-2", "umbrella-closed", "umbrella-closed-2", "umbrella-off", "underline", "unicycle", "universe", "unlink", "upload", "urgent", "usb", "user", "user-bitcoin", "user-bolt", "user-cancel", "user-check", "user-circle", "user-code", "user-cog", "user-dollar", "user-down", "user-edit", "user-exclamation", "user-heart", "user-hexagon", "user-key", "user-minus", "user-off", "user-pause", "user-pentagon", "user-pin", "user-plus", "user-question", "user-scan", "user-screen", "user-search", "user-share", "user-shield", "user-square", "user-square-rounded", "user-star", "user-up", "user-x", "users", "users-group", "users-minus", "users-plus", "uv-index", "ux-circle"};

    private TablerIconsU() {
    }

    static String[] names() {
        String[] names = new String[NAMES.length];
        for (int i = 0; i < NAMES.length; i++) {
            names[i] = NAMES[i];
        }
        return names;
    }

    static Icon icon(String name) {
        if ("u-turn-left".equals(name)) {
            return uTurnLeft();
        }
        if ("u-turn-right".equals(name)) {
            return uTurnRight();
        }
        if ("ufo".equals(name)) {
            return ufo();
        }
        if ("ufo-off".equals(name)) {
            return ufoOff();
        }
        if ("uhd".equals(name)) {
            return uhd();
        }
        if ("umbrella".equals(name)) {
            return umbrella();
        }
        if ("umbrella-2".equals(name)) {
            return umbrellaN2();
        }
        if ("umbrella-closed".equals(name)) {
            return umbrellaClosed();
        }
        if ("umbrella-closed-2".equals(name)) {
            return umbrellaClosedN2();
        }
        if ("umbrella-off".equals(name)) {
            return umbrellaOff();
        }
        if ("underline".equals(name)) {
            return underline();
        }
        if ("unicycle".equals(name)) {
            return unicycle();
        }
        if ("universe".equals(name)) {
            return universe();
        }
        if ("unlink".equals(name)) {
            return unlink();
        }
        if ("upload".equals(name)) {
            return upload();
        }
        if ("urgent".equals(name)) {
            return urgent();
        }
        if ("usb".equals(name)) {
            return usb();
        }
        if ("user".equals(name)) {
            return user();
        }
        if ("user-bitcoin".equals(name)) {
            return userBitcoin();
        }
        if ("user-bolt".equals(name)) {
            return userBolt();
        }
        if ("user-cancel".equals(name)) {
            return userCancel();
        }
        if ("user-check".equals(name)) {
            return userCheck();
        }
        if ("user-circle".equals(name)) {
            return userCircle();
        }
        if ("user-code".equals(name)) {
            return userCode();
        }
        if ("user-cog".equals(name)) {
            return userCog();
        }
        if ("user-dollar".equals(name)) {
            return userDollar();
        }
        if ("user-down".equals(name)) {
            return userDown();
        }
        if ("user-edit".equals(name)) {
            return userEdit();
        }
        if ("user-exclamation".equals(name)) {
            return userExclamation();
        }
        if ("user-heart".equals(name)) {
            return userHeart();
        }
        if ("user-hexagon".equals(name)) {
            return userHexagon();
        }
        if ("user-key".equals(name)) {
            return userKey();
        }
        if ("user-minus".equals(name)) {
            return userMinus();
        }
        if ("user-off".equals(name)) {
            return userOff();
        }
        if ("user-pause".equals(name)) {
            return userPause();
        }
        if ("user-pentagon".equals(name)) {
            return userPentagon();
        }
        if ("user-pin".equals(name)) {
            return userPin();
        }
        if ("user-plus".equals(name)) {
            return userPlus();
        }
        if ("user-question".equals(name)) {
            return userQuestion();
        }
        if ("user-scan".equals(name)) {
            return userScan();
        }
        if ("user-screen".equals(name)) {
            return userScreen();
        }
        if ("user-search".equals(name)) {
            return userSearch();
        }
        if ("user-share".equals(name)) {
            return userShare();
        }
        if ("user-shield".equals(name)) {
            return userShield();
        }
        if ("user-square".equals(name)) {
            return userSquare();
        }
        if ("user-square-rounded".equals(name)) {
            return userSquareRounded();
        }
        if ("user-star".equals(name)) {
            return userStar();
        }
        if ("user-up".equals(name)) {
            return userUp();
        }
        if ("user-x".equals(name)) {
            return userX();
        }
        if ("users".equals(name)) {
            return users();
        }
        if ("users-group".equals(name)) {
            return usersGroup();
        }
        if ("users-minus".equals(name)) {
            return usersMinus();
        }
        if ("users-plus".equals(name)) {
            return usersPlus();
        }
        if ("uv-index".equals(name)) {
            return uvIndex();
        }
        if ("ux-circle".equals(name)) {
            return uxCircle();
        }
        return null;
    }

    static Icon uTurnLeft() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 20v-11.5a4.5 4.5 0 1 0 -9 0v8.5")
                .element("path", "d", "M11 14l-3 3l-3 -3");
    }

    static Icon uTurnRight() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7 20v-11.5a4.5 4.5 0 0 1 9 0v8.5")
                .element("path", "d", "M13 14l3 3l3 -3");
    }

    static Icon ufo() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M16.95 9.01c3.02 .739 5.05 2.123 5.05 3.714c0 2.367 -4.48 4.276 -10 4.276s-10 -1.909 -10 -4.276c0 -1.59 2.04 -2.985 5.07 -3.724")
                .element("path", "d", "M7 9c0 1.105 2.239 2 5 2s5 -.895 5 -2v-.035c0 -2.742 -2.239 -4.965 -5 -4.965s-5 2.223 -5 4.965v.035")
                .element("path", "d", "M15 17l2 3")
                .element("path", "d", "M8.5 17l-1.5 3")
                .element("path", "d", "M12 14h.01")
                .element("path", "d", "M7 13h.01")
                .element("path", "d", "M17 13h.01");
    }

    static Icon ufoOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M16.95 9.01c3.02 .739 5.05 2.123 5.05 3.714c0 1.08 -.931 2.063 -2.468 2.814m-3 1c-1.36 .295 -2.9 .462 -4.531 .462c-5.52 0 -10 -1.909 -10 -4.276c0 -1.59 2.04 -2.985 5.07 -3.724")
                .element("path", "d", "M14.69 10.686c1.388 -.355 2.31 -.976 2.31 -1.686v-.035c0 -2.742 -2.239 -4.965 -5 -4.965c-1.125 0 -2.164 .37 -3 .992m-1.707 2.297a4.925 4.925 0 0 0 -.293 1.676v.035c0 .961 1.696 1.764 3.956 1.956")
                .element("path", "d", "M15 17l2 3")
                .element("path", "d", "M8.5 17l-1.5 3")
                .element("path", "d", "M12 14h.01")
                .element("path", "d", "M7 13h.01")
                .element("path", "d", "M17 13h.01")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon uhd() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 16v-8")
                .element("path", "d", "M10 12h4")
                .element("path", "d", "M14 8v8")
                .element("path", "d", "M17 8v8h2a2 2 0 0 0 2 -2v-4a2 2 0 0 0 -2 -2l-2 0")
                .element("path", "d", "M3 8v6a2 2 0 1 0 4 0v-6");
    }

    static Icon umbrella() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 12a8 8 0 0 1 16 0l-16 0")
                .element("path", "d", "M12 12v6a2 2 0 0 0 4 0");
    }

    static Icon umbrellaN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5.343 7.343a8 8 0 1 1 11.314 11.314l-11.314 -11.314")
                .element("path", "d", "M10.828 13.34l-4.242 4.243a2 2 0 1 0 2.828 2.828");
    }

    static Icon umbrellaClosed() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9 16l3 -13l3 13l-6 0")
                .element("path", "d", "M12 16v3c0 2.667 4 2.667 4 0");
    }

    static Icon umbrellaClosedN2() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6.697 12.071l11.313 -7.071l-7.07 11.314l-4.243 -4.243")
                .element("path", "d", "M8.743 14.475l-2.121 2.121c-1.886 1.886 .943 4.715 2.828 2.829");
    }

    static Icon umbrellaOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 12h-8c0 -2.209 .895 -4.208 2.342 -5.656m2.382 -1.645a8 8 0 0 1 11.276 7.301l-4 0")
                .element("path", "d", "M12 12v6a2 2 0 1 0 4 0")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon underline() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7 5v5a5 5 0 0 0 10 0v-5")
                .element("path", "d", "M5 19h14");
    }

    static Icon unicycle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7 16a5 5 0 1 0 10 0a5 5 0 1 0 -10 0")
                .element("path", "d", "M12 16v-11")
                .element("path", "d", "M8 3q 2 2 7 2");
    }

    static Icon universe() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M7.027 11.477a5 5 0 1 0 5.496 -4.45a4.951 4.951 0 0 0 -3.088 .681")
                .element("path", "d", "M5.636 5.636a9 9 0 1 0 3.555 -2.188")
                .element("path", "d", "M17 5a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M11 12a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M8 16a1 1 0 1 0 2 0a1 1 0 1 0 -2 0");
    }

    static Icon unlink() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 22v-2")
                .element("path", "d", "M9 15l6 -6")
                .element("path", "d", "M11 6l.463 -.536a5 5 0 0 1 7.071 7.072l-.534 .464")
                .element("path", "d", "M13 18l-.397 .534a5.068 5.068 0 0 1 -7.127 0a4.972 4.972 0 0 1 0 -7.071l.524 -.463")
                .element("path", "d", "M20 17h2")
                .element("path", "d", "M2 7h2")
                .element("path", "d", "M7 2v2");
    }

    static Icon upload() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 17v2a2 2 0 0 0 2 2h12a2 2 0 0 0 2 -2v-2")
                .element("path", "d", "M7 9l5 -5l5 5")
                .element("path", "d", "M12 4l0 12");
    }

    static Icon urgent() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 16v-4a4 4 0 0 1 8 0v4")
                .element("path", "d", "M3 12h1m8 -9v1m8 8h1m-15.4 -6.4l.7 .7m12.1 -.7l-.7 .7")
                .element("path", "d", "M6 17a1 1 0 0 1 1 -1h10a1 1 0 0 1 1 1v2a1 1 0 0 1 -1 1h-10a1 1 0 0 1 -1 -1l0 -2");
    }

    static Icon usb() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 19a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M12 17v-11.5")
                .element("path", "d", "M7 10v3l5 3")
                .element("path", "d", "M12 14.5l5 -2v-2.5")
                .element("path", "d", "M16 10h2v-2h-2l0 2")
                .element("path", "d", "M6 9a1 1 0 1 0 2 0a1 1 0 1 0 -2 0")
                .element("path", "d", "M10 5.5h4l-2 -2.5l-2 2.5");
    }

    static Icon user() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v2");
    }

    static Icon userBitcoin() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M17 21v-6m2 0v-1.5m0 9v-1.5m-2 -3h3m-1 0h.5a1.5 1.5 0 0 1 0 3h-3.5m3 -3h.5a1.5 1.5 0 0 0 0 -3h-3.5")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3");
    }

    static Icon userBolt() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4c.267 0 .529 .026 .781 .076")
                .element("path", "d", "M19 16l-2 3h4l-2 3");
    }

    static Icon userCancel() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3.5")
                .element("path", "d", "M16 19a3 3 0 1 0 6 0a3 3 0 1 0 -6 0")
                .element("path", "d", "M17 21l4 -4");
    }

    static Icon userCheck() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4")
                .element("path", "d", "M15 19l2 2l4 -4");
    }

    static Icon userCircle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 12a9 9 0 1 0 18 0a9 9 0 1 0 -18 0")
                .element("path", "d", "M9 10a3 3 0 1 0 6 0a3 3 0 1 0 -6 0")
                .element("path", "d", "M6.168 18.849a4 4 0 0 1 3.832 -2.849h4a4 4 0 0 1 3.834 2.855");
    }

    static Icon userCode() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3.5")
                .element("path", "d", "M20 21l2 -2l-2 -2")
                .element("path", "d", "M17 17l-2 2l2 2");
    }

    static Icon userCog() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h2.5")
                .element("path", "d", "M17.001 19a2 2 0 1 0 4 0a2 2 0 1 0 -4 0")
                .element("path", "d", "M19.001 15.5v1.5")
                .element("path", "d", "M19.001 21v1.5")
                .element("path", "d", "M22.032 17.25l-1.299 .75")
                .element("path", "d", "M17.27 20l-1.3 .75")
                .element("path", "d", "M15.97 17.25l1.3 .75")
                .element("path", "d", "M20.733 20l1.3 .75");
    }

    static Icon userDollar() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3")
                .element("path", "d", "M21 15h-2.5a1.5 1.5 0 0 0 0 3h1a1.5 1.5 0 0 1 0 3h-2.5")
                .element("path", "d", "M19 21v1m0 -8v1");
    }

    static Icon userDown() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4c.342 0 .674 .043 .99 .124")
                .element("path", "d", "M19 16v6")
                .element("path", "d", "M22 19l-3 3l-3 -3");
    }

    static Icon userEdit() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3.5")
                .element("path", "d", "M18.42 15.61a2.1 2.1 0 0 1 2.97 2.97l-3.39 3.42h-3v-3l3.42 -3.39");
    }

    static Icon userExclamation() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4c.348 0 .686 .045 1.008 .128")
                .element("path", "d", "M19 16v3")
                .element("path", "d", "M19 22v.01");
    }

    static Icon userHeart() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h.5")
                .element("path", "d", "M18 22l3.35 -3.284a2.143 2.143 0 0 0 .005 -3.071a2.242 2.242 0 0 0 -3.129 -.006l-.224 .22l-.223 -.22a2.242 2.242 0 0 0 -3.128 -.006a2.143 2.143 0 0 0 -.006 3.071l3.355 3.296");
    }

    static Icon userHexagon() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 13a3 3 0 1 0 0 -6a3 3 0 0 0 0 6")
                .element("path", "d", "M6.201 18.744a4 4 0 0 1 3.799 -2.744h4a4 4 0 0 1 3.798 2.741")
                .element("path", "d", "M19.875 6.27c.7 .398 1.13 1.143 1.125 1.948v7.284c0 .809 -.443 1.555 -1.158 1.948l-6.75 4.27a2.269 2.269 0 0 1 -2.184 0l-6.75 -4.27a2.225 2.225 0 0 1 -1.158 -1.948v-7.285c0 -.809 .443 -1.554 1.158 -1.947l6.75 -3.98a2.33 2.33 0 0 1 2.25 0l6.75 3.98h-.033");
    }

    static Icon userKey() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h5")
                .element("path", "d", "M18.5 18.5l-3.5 3.5l-1.5 -1.5")
                .element("path", "d", "M18.554 18.414a2 2 0 1 1 2.828 -2.828a2 2 0 0 1 -2.828 2.828")
                .element("path", "d", "M16 19l1 1");
    }

    static Icon userMinus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4c.348 0 .686 .045 1.009 .128")
                .element("path", "d", "M16 19h6");
    }

    static Icon userOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8.18 8.189a4.01 4.01 0 0 0 2.616 2.627m3.507 -.545a4 4 0 1 0 -5.59 -5.552")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4c.412 0 .81 .062 1.183 .178m2.633 2.618c.12 .38 .184 .785 .184 1.204v2")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon userPause() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3.5")
                .element("path", "d", "M17 17v5")
                .element("path", "d", "M21 17v5");
    }

    static Icon userPentagon() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M13.163 2.168l8.021 5.828c.694 .504 .984 1.397 .719 2.212l-3.064 9.43a1.978 1.978 0 0 1 -1.881 1.367h-9.916a1.978 1.978 0 0 1 -1.881 -1.367l-3.064 -9.43a1.978 1.978 0 0 1 .719 -2.212l8.021 -5.828a1.978 1.978 0 0 1 2.326 0")
                .element("path", "d", "M12 13a3 3 0 1 0 0 -6a3 3 0 0 0 0 6")
                .element("path", "d", "M6 20.703v-.703a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v.707");
    }

    static Icon userPin() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h2.5")
                .element("path", "d", "M21.121 20.121a3 3 0 1 0 -4.242 0c.418 .419 1.125 1.045 2.121 1.879c1.051 -.89 1.759 -1.516 2.121 -1.879")
                .element("path", "d", "M19 18v.01");
    }

    static Icon userPlus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M16 19h6")
                .element("path", "d", "M19 16v6")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4");
    }

    static Icon userQuestion() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3.5")
                .element("path", "d", "M19 22v.01")
                .element("path", "d", "M19 19a2.003 2.003 0 0 0 .914 -3.782a1.98 1.98 0 0 0 -2.414 .483");
    }

    static Icon userScan() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 9a2 2 0 1 0 4 0a2 2 0 0 0 -4 0")
                .element("path", "d", "M8 16a2 2 0 0 1 2 -2h4a2 2 0 0 1 2 2")
                .element("path", "d", "M3 7v-2a2 2 0 0 1 2 -2h2")
                .element("path", "d", "M3 17v2a2 2 0 0 0 2 2h2")
                .element("path", "d", "M17 3h2a2 2 0 0 1 2 2v2")
                .element("path", "d", "M17 21h2a2 2 0 0 0 2 -2v-2");
    }

    static Icon userScreen() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M19.03 17.818a3 3 0 0 0 1.97 -2.818v-8a3 3 0 0 0 -3 -3h-12a3 3 0 0 0 -3 3v8c0 1.317 .85 2.436 2.03 2.84")
                .element("path", "d", "M10 14a2 2 0 1 0 4 0a2 2 0 0 0 -4 0")
                .element("path", "d", "M8 21a2 2 0 0 1 2 -2h4a2 2 0 0 1 2 2");
    }

    static Icon userSearch() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h1.5")
                .element("path", "d", "M15 18a3 3 0 1 0 6 0a3 3 0 1 0 -6 0")
                .element("path", "d", "M20.2 20.2l1.8 1.8");
    }

    static Icon userShare() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3")
                .element("path", "d", "M16 22l5 -5")
                .element("path", "d", "M21 21.5v-4.5h-4.5");
    }

    static Icon userShield() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h2")
                .element("path", "d", "M22 16c0 4 -2.5 6 -3.5 6s-3.5 -2 -3.5 -6c1 0 2.5 -.5 3.5 -1.5c1 1 2.5 1.5 3.5 1.5")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0");
    }

    static Icon userSquare() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9 10a3 3 0 1 0 6 0a3 3 0 0 0 -6 0")
                .element("path", "d", "M6 21v-1a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v1")
                .element("path", "d", "M3 5a2 2 0 0 1 2 -2h14a2 2 0 0 1 2 2v14a2 2 0 0 1 -2 2h-14a2 2 0 0 1 -2 -2v-14");
    }

    static Icon userSquareRounded() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 13a3 3 0 1 0 0 -6a3 3 0 0 0 0 6")
                .element("path", "d", "M12 3c7.2 0 9 1.8 9 9c0 7.2 -1.8 9 -9 9c-7.2 0 -9 -1.8 -9 -9c0 -7.2 1.8 -9 9 -9")
                .element("path", "d", "M6 20.05v-.05a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v.05");
    }

    static Icon userStar() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h.5")
                .element("path", "d", "M17.8 20.817l-2.172 1.138a.392 .392 0 0 1 -.568 -.41l.415 -2.411l-1.757 -1.707a.389 .389 0 0 1 .217 -.665l2.428 -.352l1.086 -2.193a.392 .392 0 0 1 .702 0l1.086 2.193l2.428 .352a.39 .39 0 0 1 .217 .665l-1.757 1.707l.414 2.41a.39 .39 0 0 1 -.567 .411l-2.172 -1.138");
    }

    static Icon userUp() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h4")
                .element("path", "d", "M19 22v-6")
                .element("path", "d", "M22 19l-3 -3l-3 3");
    }

    static Icon userX() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M6 21v-2a4 4 0 0 1 4 -4h3.5")
                .element("path", "d", "M22 22l-5 -5")
                .element("path", "d", "M17 22l5 -5");
    }

    static Icon users() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 7a4 4 0 1 0 8 0a4 4 0 1 0 -8 0")
                .element("path", "d", "M3 21v-2a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v2")
                .element("path", "d", "M16 3.13a4 4 0 0 1 0 7.75")
                .element("path", "d", "M21 21v-2a4 4 0 0 0 -3 -3.85");
    }

    static Icon usersGroup() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 13a2 2 0 1 0 4 0a2 2 0 0 0 -4 0")
                .element("path", "d", "M8 21v-1a2 2 0 0 1 2 -2h4a2 2 0 0 1 2 2v1")
                .element("path", "d", "M15 5a2 2 0 1 0 4 0a2 2 0 0 0 -4 0")
                .element("path", "d", "M17 10h2a2 2 0 0 1 2 2v1")
                .element("path", "d", "M5 5a2 2 0 1 0 4 0a2 2 0 0 0 -4 0")
                .element("path", "d", "M3 13v-1a2 2 0 0 1 2 -2h2");
    }

    static Icon usersMinus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M3 21v-2a4 4 0 0 1 4 -4h4c.948 0 1.818 .33 2.504 .88")
                .element("path", "d", "M16 3.13a4 4 0 0 1 0 7.75")
                .element("path", "d", "M16 19h6");
    }

    static Icon usersPlus() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M5 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0")
                .element("path", "d", "M3 21v-2a4 4 0 0 1 4 -4h4c.96 0 1.84 .338 2.53 .901")
                .element("path", "d", "M16 3.13a4 4 0 0 1 0 7.75")
                .element("path", "d", "M16 19h6")
                .element("path", "d", "M19 16v6");
    }

    static Icon uvIndex() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 12h1m16 0h1m-15.4 -6.4l.7 .7m12.1 -.7l-.7 .7m-9.7 5.7a4 4 0 1 1 8 0")
                .element("path", "d", "M12 4v-1")
                .element("path", "d", "M13 16l2 5h1l2 -5")
                .element("path", "d", "M6 16v3a2 2 0 1 0 4 0v-3");
    }

    static Icon uxCircle() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 12a9 9 0 1 0 18 0a9 9 0 1 0 -18 0")
                .element("path", "d", "M7 10v2a2 2 0 1 0 4 0v-2")
                .element("path", "d", "M14 10l3 4")
                .element("path", "d", "M14 14l3 -4");
    }
}
