package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconTheme;

final class PhosphorIconsThinJ {
    private static final String[] NAMES = {"jar", "jar-label", "jeep", "joystick"};

    private PhosphorIconsThinJ() {
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
                .element("path", "d", "M180,52.23V32a12,12,0,0,0-12-12H88A12,12,0,0,0,76,32V52.23A36,36,0,0,0,44,88V200a36,36,0,0,0,36,36h96a36,36,0,0,0,36-36V88A36,36,0,0,0,180,52.23ZM172,32V52H148V28h20A4,4,0,0,1,172,32ZM116,52V28h24V52ZM88,28h20V52H84V32A4,4,0,0,1,88,28ZM204,200a28,28,0,0,1-28,28H80a28,28,0,0,1-28-28V88A28,28,0,0,1,80,60h96a28,28,0,0,1,28,28Z");
    }

    static Icon jarLabel() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M180,52.23V32a12,12,0,0,0-12-12H88A12,12,0,0,0,76,32V52.23A36,36,0,0,0,44,88V200a36,36,0,0,0,36,36h96a36,36,0,0,0,36-36V88A36,36,0,0,0,180,52.23ZM52,108H204v72H52ZM172,32V52H148V28h20A4,4,0,0,1,172,32ZM116,52V28h24V52ZM88,28h20V52H84V32A4,4,0,0,1,88,28ZM80,60h96a28,28,0,0,1,28,28v12H52V88A28,28,0,0,1,80,60Zm96,168H80a28,28,0,0,1-28-28V188H204v12A28,28,0,0,1,176,228Z");
    }

    static Icon jeep() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M240,92H227.23l-10-46.51A12.07,12.07,0,0,0,205.53,36H50.47a12.07,12.07,0,0,0-11.74,9.49L28.77,92H16a4,4,0,0,0,0,8H28V200a12,12,0,0,0,12,12H64a12,12,0,0,0,12-12V172H180v28a12,12,0,0,0,12,12h24a12,12,0,0,0,12-12V100h12a4,4,0,0,0,0-8ZM46.56,47.16A4,4,0,0,1,50.47,44H205.53a4,4,0,0,1,3.91,3.16L219.05,92H37ZM68,200a4,4,0,0,1-4,4H40a4,4,0,0,1-4-4V172H68Zm148,4H192a4,4,0,0,1-4-4V172h32v28A4,4,0,0,1,216,204Zm4-40H148V128a4,4,0,0,0-8,0v36H116V128a4,4,0,0,0-8,0v36H36V100H220ZM60,132a8,8,0,1,1,8,8A8,8,0,0,1,60,132Zm120,0a8,8,0,1,1,8,8A8,8,0,0,1,180,132Z");
    }

    static Icon joystick() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M208,148H132V91.77a36,36,0,1,0-8,0V148H48a12,12,0,0,0-12,12v48a12,12,0,0,0,12,12H208a12,12,0,0,0,12-12V160A12,12,0,0,0,208,148ZM100,56a28,28,0,1,1,28,28A28,28,0,0,1,100,56ZM212,208a4,4,0,0,1-4,4H48a4,4,0,0,1-4-4V160a4,4,0,0,1,4-4H208a4,4,0,0,1,4,4Zm-48-88a4,4,0,0,1,4-4h32a4,4,0,0,1,0,8H168A4,4,0,0,1,164,120Z");
    }
}
