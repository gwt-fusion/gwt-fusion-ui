package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsQ {
    private static final String[] NAMES = {"qrcode", "qrcode-off", "question-mark", "queue-pop-in", "queue-pop-out", "quote", "quote-off", "quote-open", "quotes"};

    private TablerIconsQ() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("qrcode".equals(name)) {
            return qrcode();
        }
        if ("qrcode-off".equals(name)) {
            return qrcodeOff();
        }
        if ("question-mark".equals(name)) {
            return questionMark();
        }
        if ("queue-pop-in".equals(name)) {
            return queuePopIn();
        }
        if ("queue-pop-out".equals(name)) {
            return queuePopOut();
        }
        if ("quote".equals(name)) {
            return quote();
        }
        if ("quote-off".equals(name)) {
            return quoteOff();
        }
        if ("quote-open".equals(name)) {
            return quoteOpen();
        }
        if ("quotes".equals(name)) {
            return quotes();
        }
        return null;
    }

    static Icon qrcode() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 5a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v4a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1l0 -4")
                .element("path", "d", "M7 17l0 .01")
                .element("path", "d", "M14 5a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v4a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1l0 -4")
                .element("path", "d", "M7 7l0 .01")
                .element("path", "d", "M4 15a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v4a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1l0 -4")
                .element("path", "d", "M17 7l0 .01")
                .element("path", "d", "M14 14l3 0")
                .element("path", "d", "M20 14l0 .01")
                .element("path", "d", "M14 14l0 3")
                .element("path", "d", "M14 20l3 0")
                .element("path", "d", "M17 17l3 0")
                .element("path", "d", "M20 17l0 3");
    }

    static Icon qrcodeOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 4h1a1 1 0 0 1 1 1v1m-.297 3.711a1 1 0 0 1 -.703 .289h-4a1 1 0 0 1 -1 -1v-4c0 -.275 .11 -.524 .29 -.705")
                .element("path", "d", "M7 17v.01")
                .element("path", "d", "M14 5a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v4a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1l0 -4")
                .element("path", "d", "M7 7v.01")
                .element("path", "d", "M4 15a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v4a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1l0 -4")
                .element("path", "d", "M17 7v.01")
                .element("path", "d", "M20 14v.01")
                .element("path", "d", "M14 14v3")
                .element("path", "d", "M14 20h3")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon questionMark() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 8a3.5 3 0 0 1 3.5 -3h1a3.5 3 0 0 1 3.5 3a3 3 0 0 1 -2 3a3 4 0 0 0 -2 4")
                .element("path", "d", "M12 19l0 .01");
    }

    static Icon queuePopIn() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M8 6h-3a2 2 0 0 0 -2 2v11a2 2 0 0 0 2 2h11a2 2 0 0 0 2 -2v-3.357")
                .element("path", "d", "M13 5a2 2 0 0 1 2 -2h4a2 2 0 0 1 2 2v4a2 2 0 0 1 -2 2h-4a2 2 0 0 1 -2 -2v-4")
                .element("path", "d", "M13.5 10.5l-5.5 5.5")
                .element("path", "d", "M8 11v5h5");
    }

    static Icon queuePopOut() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M11 5h-6a2 2 0 0 0 -2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2 -2v-6")
                .element("path", "d", "M3 13h6a2 2 0 0 1 2 2v6")
                .element("path", "d", "M16 3h5v5")
                .element("path", "d", "M21 3l-6 6");
    }

    static Icon quote() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 11h-4a1 1 0 0 1 -1 -1v-3a1 1 0 0 1 1 -1h3a1 1 0 0 1 1 1v6c0 2.667 -1.333 4.333 -4 5")
                .element("path", "d", "M19 11h-4a1 1 0 0 1 -1 -1v-3a1 1 0 0 1 1 -1h3a1 1 0 0 1 1 1v6c0 2.667 -1.333 4.333 -4 5");
    }

    static Icon quoteOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10 11h-4a1 1 0 0 1 -1 -1v-3a1 1 0 0 1 1 -1m4 4v3c0 2.667 -1.333 4.333 -4 5")
                .element("path", "d", "M19 11h-4m-1 -1v-3a1 1 0 0 1 1 -1h3a1 1 0 0 1 1 1v6c0 .66 -.082 1.26 -.245 1.798m-1.653 2.29c-.571 .4 -1.272 .704 -2.102 .912")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon quoteOpen() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M14 13h4a1 1 0 0 1 1 1v3a1 1 0 0 1 -1 1h-3a1 1 0 0 1 -1 -1v-6q 0 -4 4 -5")
                .element("path", "d", "M5 13h4a1 1 0 0 1 1 1v3a1 1 0 0 1 -1 1h-3a1 1 0 0 1 -1 -1v-6q 0 -4 4 -5");
    }

    static Icon quotes() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M4 12c-1.333 -1.854 -1.333 -4.146 0 -6")
                .element("path", "d", "M8 12c-1.333 -1.854 -1.333 -4.146 0 -6")
                .element("path", "d", "M16 18c1.333 -1.854 1.333 -4.146 0 -6")
                .element("path", "d", "M20 18c1.333 -1.854 1.333 -4.146 0 -6");
    }
}
