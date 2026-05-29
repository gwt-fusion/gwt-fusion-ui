package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconTheme;

final class PhosphorIconsBoldK {
    private static final String[] NAMES = {"kanban", "key", "key-return", "keyboard", "keyhole", "knife"};

    private PhosphorIconsBoldK() {
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
                .element("path", "d", "M216,44H40A12,12,0,0,0,28,56V208a20,20,0,0,0,20,20H88a20,20,0,0,0,20-20V164h40v12a20,20,0,0,0,20,20h40a20,20,0,0,0,20-20V56A12,12,0,0,0,216,44Zm-12,64H172V68h32ZM84,68v40H52V68Zm0,136H52V132H84Zm24-64V68h40v72Zm64,32V132h32v40Z");
    }

    static Icon key() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M196,76a16,16,0,1,1-16-16A16,16,0,0,1,196,76Zm48,22.74A84.3,84.3,0,0,1,160.11,180H160a83.52,83.52,0,0,1-23.65-3.38l-7.86,7.87A12,12,0,0,1,120,188H108v12a12,12,0,0,1-12,12H84v12a12,12,0,0,1-12,12H40a20,20,0,0,1-20-20V187.31a19.86,19.86,0,0,1,5.86-14.14l53.52-53.52A84,84,0,1,1,244,98.74ZM202.43,53.57A59.48,59.48,0,0,0,158,36c-32,1-58,27.89-58,59.89a59.69,59.69,0,0,0,4.2,22.19,12,12,0,0,1-2.55,13.21L44,189v23H60V200a12,12,0,0,1,12-12H84V176a12,12,0,0,1,12-12h19l9.65-9.65a12,12,0,0,1,13.22-2.55A59.58,59.58,0,0,0,160,156h.08c32,0,58.87-26.07,59.89-58A59.55,59.55,0,0,0,202.43,53.57Z");
    }

    static Icon keyReturn() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M71.51,144.49a12,12,0,0,1,0-17l24-24a12,12,0,0,1,17,17L109,124h55V104a12,12,0,0,1,24,0v32a12,12,0,0,1-12,12H109l3.52,3.51a12,12,0,0,1-17,17ZM236,56V200a20,20,0,0,1-20,20H40a20,20,0,0,1-20-20V56A20,20,0,0,1,40,36H216A20,20,0,0,1,236,56Zm-24,4H44V196H212Z");
    }

    static Icon keyboard() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M224,44H32A20,20,0,0,0,12,64V192a20,20,0,0,0,20,20H224a20,20,0,0,0,20-20V64A20,20,0,0,0,224,44Zm-4,144H36V68H220ZM52,128a12,12,0,0,1,12-12H192a12,12,0,0,1,0,24H64A12,12,0,0,1,52,128Zm0-36A12,12,0,0,1,64,80H192a12,12,0,0,1,0,24H64A12,12,0,0,1,52,92Zm0,72a12,12,0,0,1,12-12h8a12,12,0,0,1,0,24H64A12,12,0,0,1,52,164Zm108,0a12,12,0,0,1-12,12H108a12,12,0,0,1,0-24h40A12,12,0,0,1,160,164Zm44,0a12,12,0,0,1-12,12h-8a12,12,0,0,1,0-24h8A12,12,0,0,1,204,164Z");
    }

    static Icon keyhole() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M128,20A108,108,0,1,0,236,128,108.12,108.12,0,0,0,128,20Zm0,192a84,84,0,1,1,84-84A84.09,84.09,0,0,1,128,212Zm0-144a44,44,0,0,0-33.61,72.41l-9.86,32.06A12,12,0,0,0,96,188h64a12,12,0,0,0,11.47-15.53l-9.86-32.06A44,44,0,0,0,128,68Zm8.53,72.51L143.75,164h-31.5l7.22-23.49a12,12,0,0,0-4-12.89,20,20,0,1,1,25,0A12,12,0,0,0,136.53,140.51Z");
    }

    static Icon knife() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M234.7,29.3a31.83,31.83,0,0,0-45,0L15.52,203.56a12,12,0,0,0,5.78,20.19A164.85,164.85,0,0,0,58.42,228c33.71,0,67.41-10.42,99.1-30.87,32.32-20.86,51.16-44.7,51.94-45.7a12,12,0,0,0-1-15.89L191,118,234.7,74.29A31.86,31.86,0,0,0,234.7,29.3ZM143.87,177.36C113,197.12,81.28,206,49.28,203.74L146,107l19.5,19.51,0,0h0l18,18A216.69,216.69,0,0,1,143.87,177.36Zm73.86-120L174,101,163,90,206.7,46.28a7.8,7.8,0,0,1,11,11Z");
    }
}
