package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconTheme;

final class PhosphorIconsThinQ {
    private static final String[] NAMES = {"qr-code", "question", "question-mark", "queue", "quotes"};

    private PhosphorIconsThinQ() {
    }

    static String[] names() {
        String[] names = new String[NAMES.length];
        for (int i = 0; i < NAMES.length; i++) {
            names[i] = NAMES[i];
        }
        return names;
    }

    static Icon icon(String name) {
        if ("qr-code".equals(name)) {
            return qrCode();
        }
        if ("question".equals(name)) {
            return question();
        }
        if ("question-mark".equals(name)) {
            return questionMark();
        }
        if ("queue".equals(name)) {
            return queue();
        }
        if ("quotes".equals(name)) {
            return quotes();
        }
        return null;
    }

    static Icon qrCode() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M104,44H56A12,12,0,0,0,44,56v48a12,12,0,0,0,12,12h48a12,12,0,0,0,12-12V56A12,12,0,0,0,104,44Zm4,60a4,4,0,0,1-4,4H56a4,4,0,0,1-4-4V56a4,4,0,0,1,4-4h48a4,4,0,0,1,4,4Zm-4,36H56a12,12,0,0,0-12,12v48a12,12,0,0,0,12,12h48a12,12,0,0,0,12-12V152A12,12,0,0,0,104,140Zm4,60a4,4,0,0,1-4,4H56a4,4,0,0,1-4-4V152a4,4,0,0,1,4-4h48a4,4,0,0,1,4,4ZM200,44H152a12,12,0,0,0-12,12v48a12,12,0,0,0,12,12h48a12,12,0,0,0,12-12V56A12,12,0,0,0,200,44Zm4,60a4,4,0,0,1-4,4H152a4,4,0,0,1-4-4V56a4,4,0,0,1,4-4h48a4,4,0,0,1,4,4Zm-64,72V144a4,4,0,0,1,8,0v32a4,4,0,0,1-8,0Zm72-16a4,4,0,0,1-4,4H180v44a4,4,0,0,1-4,4H144a4,4,0,0,1,0-8h28V144a4,4,0,0,1,8,0v12h28A4,4,0,0,1,212,160Zm0,32v16a4,4,0,0,1-8,0V192a4,4,0,0,1,8,0Z");
    }

    static Icon question() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M136,180a8,8,0,1,1-8-8A8,8,0,0,1,136,180ZM128,76c-19.85,0-36,14.36-36,32v4a4,4,0,0,0,8,0v-4c0-13.23,12.56-24,28-24s28,10.77,28,24-12.56,24-28,24a4,4,0,0,0-4,4v8a4,4,0,0,0,8,0v-4.2c18-1.77,32-15.36,32-31.8C164,90.36,147.85,76,128,76Zm100,52A100,100,0,1,1,128,28,100.11,100.11,0,0,1,228,128Zm-8,0a92,92,0,1,0-92,92A92.1,92.1,0,0,0,220,128Z");
    }

    static Icon questionMark() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M188,96c0,27.51-24.77,50.09-56,51.89V160a4,4,0,0,1-8,0V144a4,4,0,0,1,4-4c28.67,0,52-19.74,52-44s-23.33-44-52-44S76,71.74,76,96a4,4,0,0,1-8,0c0-28.67,26.92-52,60-52S188,67.33,188,96ZM128,196a12,12,0,1,0,12,12A12,12,0,0,0,128,196Z");
    }

    static Icon queue() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M36,64a4,4,0,0,1,4-4H216a4,4,0,0,1,0,8H40A4,4,0,0,1,36,64Zm100,60H40a4,4,0,0,0,0,8h96a4,4,0,0,0,0-8Zm0,64H40a4,4,0,0,0,0,8h96a4,4,0,0,0,0-8Zm108-28a4,4,0,0,1-1.88,3.39l-64,40A4,4,0,0,1,176,204a4.06,4.06,0,0,1-1.94-.5A4,4,0,0,1,172,200V120a4,4,0,0,1,6.12-3.39l64,40A4,4,0,0,1,244,160Zm-11.55,0L180,127.22v65.56Z");
    }

    static Icon quotes() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M100,60H40A12,12,0,0,0,28,72v64a12,12,0,0,0,12,12h64v12a36,36,0,0,1-36,36,4,4,0,0,0,0,8,44.05,44.05,0,0,0,44-44V72A12,12,0,0,0,100,60Zm4,80H40a4,4,0,0,1-4-4V72a4,4,0,0,1,4-4h60a4,4,0,0,1,4,4ZM216,60H156a12,12,0,0,0-12,12v64a12,12,0,0,0,12,12h64v12a36,36,0,0,1-36,36,4,4,0,0,0,0,8,44.05,44.05,0,0,0,44-44V72A12,12,0,0,0,216,60Zm4,80H156a4,4,0,0,1-4-4V72a4,4,0,0,1,4-4h60a4,4,0,0,1,4,4Z");
    }
}
