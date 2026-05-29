package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconTheme;

final class PhosphorIconsLightJ {
    private static final String[] NAMES = {"jar", "jar-label", "jeep", "joystick"};

    private PhosphorIconsLightJ() {
    }

    static String[] names() {
        String[] names = new String[NAMES.length];
        for (int i = 0; i < NAMES.length; i++) {
            names[i] = NAMES[i];
        }
        return names;
    }

    static Icon icon(String name) {
        if ("jar".equals(name)) {
            return jar();
        }
        if ("jar-label".equals(name)) {
            return jarLabel();
        }
        if ("jeep".equals(name)) {
            return jeep();
        }
        if ("joystick".equals(name)) {
            return joystick();
        }
        return null;
    }

    static Icon jar() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M182,50.48V32a14,14,0,0,0-14-14H88A14,14,0,0,0,74,32V50.48A38.05,38.05,0,0,0,42,88V200a38,38,0,0,0,38,38h96a38,38,0,0,0,38-38V88A38.05,38.05,0,0,0,182,50.48ZM170,32V50H150V30h18A2,2,0,0,1,170,32ZM118,50V30h20V50ZM88,30h18V50H86V32A2,2,0,0,1,88,30ZM202,200a26,26,0,0,1-26,26H80a26,26,0,0,1-26-26V88A26,26,0,0,1,80,62h96a26,26,0,0,1,26,26Z");
    }

    static Icon jarLabel() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M182,50.48V32a14,14,0,0,0-14-14H88A14,14,0,0,0,74,32V50.48A38.05,38.05,0,0,0,42,88V200a38,38,0,0,0,38,38h96a38,38,0,0,0,38-38V88A38.05,38.05,0,0,0,182,50.48ZM54,110H202v68H54ZM170,32V50H150V30h18A2,2,0,0,1,170,32ZM118,50V30h20V50ZM88,30h18V50H86V32A2,2,0,0,1,88,30ZM80,62h96a26,26,0,0,1,26,26V98H54V88A26,26,0,0,1,80,62Zm96,164H80a26,26,0,0,1-26-26V190H202v10A26,26,0,0,1,176,226Z");
    }

    static Icon jeep() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M240,90H228.85l-9.63-44.93A14.06,14.06,0,0,0,205.53,34H50.47A14.06,14.06,0,0,0,36.78,45.07L27.15,90H16a6,6,0,0,0,0,12H26v98a14,14,0,0,0,14,14H64a14,14,0,0,0,14-14V174H178v26a14,14,0,0,0,14,14h24a14,14,0,0,0,14-14V102h10a6,6,0,0,0,0-12ZM48.51,47.58a2,2,0,0,1,2-1.58H205.53a2,2,0,0,1,2,1.58L216.58,90H39.42ZM66,200a2,2,0,0,1-2,2H40a2,2,0,0,1-2-2V174H66Zm150,2H192a2,2,0,0,1-2-2V174h28v26A2,2,0,0,1,216,202Zm2-40H150V128a6,6,0,0,0-12,0v34H118V128a6,6,0,0,0-12,0v34H38V102H218ZM58,132a10,10,0,1,1,10,10A10,10,0,0,1,58,132Zm120,0a10,10,0,1,1,10,10A10,10,0,0,1,178,132Z");
    }

    static Icon joystick() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M208,146H134V93.52a38,38,0,1,0-12,0V146H48a14,14,0,0,0-14,14v48a14,14,0,0,0,14,14H208a14,14,0,0,0,14-14V160A14,14,0,0,0,208,146ZM102,56a26,26,0,1,1,26,26A26,26,0,0,1,102,56ZM210,208a2,2,0,0,1-2,2H48a2,2,0,0,1-2-2V160a2,2,0,0,1,2-2H208a2,2,0,0,1,2,2Zm-42-94h32a6,6,0,0,1,0,12H168a6,6,0,0,1,0-12Z");
    }
}
