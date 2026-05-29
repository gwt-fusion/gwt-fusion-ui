package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconTheme;

final class PhosphorIconsFillK {
    private static final String[] NAMES = {"kanban", "key", "key-return", "keyboard", "keyhole", "knife"};

    private PhosphorIconsFillK() {
    }

    static String[] names() {
        String[] names = new String[NAMES.length];
        for (int i = 0; i < NAMES.length; i++) {
            names[i] = NAMES[i];
        }
        return names;
    }

    static Icon icon(String name) {
        if ("kanban".equals(name)) {
            return kanban();
        }
        if ("key".equals(name)) {
            return key();
        }
        if ("key-return".equals(name)) {
            return keyReturn();
        }
        if ("keyboard".equals(name)) {
            return keyboard();
        }
        if ("keyhole".equals(name)) {
            return keyhole();
        }
        if ("knife".equals(name)) {
            return knife();
        }
        return null;
    }

    static Icon kanban() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M160,56v96a8,8,0,0,1-8,8H112a8,8,0,0,1-8-8V56a8,8,0,0,1,8-8h40A8,8,0,0,1,160,56Zm64-8H184a8,8,0,0,0-8,8v52a4,4,0,0,0,4,4h48a4,4,0,0,0,4-4V56A8,8,0,0,0,224,48Zm4,80H180a4,4,0,0,0-4,4v44a16,16,0,0,0,16,16h24a16,16,0,0,0,16-16V132A4,4,0,0,0,228,128ZM80,48H40a8,8,0,0,0-8,8v52a4,4,0,0,0,4,4H84a4,4,0,0,0,4-4V56A8,8,0,0,0,80,48Zm4,80H36a4,4,0,0,0-4,4v76a16,16,0,0,0,16,16H72a16,16,0,0,0,16-16V132A4,4,0,0,0,84,128Z");
    }

    static Icon key() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M216.57,39.43A80,80,0,0,0,83.91,120.78L28.69,176A15.86,15.86,0,0,0,24,187.31V216a16,16,0,0,0,16,16H72a8,8,0,0,0,8-8V208H96a8,8,0,0,0,8-8V184h16a8,8,0,0,0,5.66-2.34l9.56-9.57A79.73,79.73,0,0,0,160,176h.1A80,80,0,0,0,216.57,39.43ZM180,92a16,16,0,1,1,16-16A16,16,0,0,1,180,92Z");
    }

    static Icon keyReturn() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M216,40H40A16,16,0,0,0,24,56V200a16,16,0,0,0,16,16H216a16,16,0,0,0,16-16V56A16,16,0,0,0,216,40Zm-32,96a8,8,0,0,1-8,8H99.31l10.35,10.34a8,8,0,0,1-11.32,11.32l-24-24a8,8,0,0,1,0-11.32l24-24a8,8,0,0,1,11.32,11.32L99.31,128H168V104a8,8,0,0,1,16,0Z");
    }

    static Icon keyboard() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M224,48H32A16,16,0,0,0,16,64V192a16,16,0,0,0,16,16H224a16,16,0,0,0,16-16V64A16,16,0,0,0,224,48ZM64,168H48a8,8,0,0,1,0-16H64a8,8,0,0,1,0,16Zm96,0H96a8,8,0,0,1,0-16h64a8,8,0,0,1,0,16Zm48,0H192a8,8,0,0,1,0-16h16a8,8,0,0,1,0,16Zm0-32H48a8,8,0,0,1,0-16H208a8,8,0,0,1,0,16Zm0-32H48a8,8,0,0,1,0-16H208a8,8,0,0,1,0,16Z");
    }

    static Icon keyhole() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M128,24A104,104,0,1,0,232,128,104.11,104.11,0,0,0,128,24Zm29.52,146.39a4,4,0,0,1-3.66,5.61H102.14a4,4,0,0,1-3.66-5.61L112,139.72a32,32,0,1,1,32,0Z");
    }

    static Icon knife() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M236,49a25,25,0,0,0-42.63-17.66L143.16,81.54,18.34,206.4a8,8,0,0,0,3.86,13.45A160.67,160.67,0,0,0,58.4,224c32.95,0,65.91-10.2,96.94-30.23,31.76-20.5,50.19-43.82,51-44.8a8,8,0,0,0-.64-10.59L181.31,114l47.38-47.39A24.84,24.84,0,0,0,236,49ZM146.23,180.6c-34.43,22.1-69.94,30.92-105.76,26.3L146,101.34l43.09,43.1A220.09,220.09,0,0,1,146.23,180.6Z");
    }
}
