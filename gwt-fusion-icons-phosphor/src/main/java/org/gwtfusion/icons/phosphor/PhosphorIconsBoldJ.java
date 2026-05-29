package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconTheme;

final class PhosphorIconsBoldJ {
    private static final String[] NAMES = {"jar", "jar-label", "jeep", "joystick"};

    private PhosphorIconsBoldJ() {
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
                .element("path", "d", "M188,49.68V32a20,20,0,0,0-20-20H88A20,20,0,0,0,68,32V49.68A44.06,44.06,0,0,0,36,92V200a44.05,44.05,0,0,0,44,44h96a44.05,44.05,0,0,0,44-44V92A44.06,44.06,0,0,0,188,49.68ZM164,48H140V36h24ZM116,36V48H92V36Zm80,164a20,20,0,0,1-20,20H80a20,20,0,0,1-20-20V92A20,20,0,0,1,80,72h96a20,20,0,0,1,20,20Z");
    }

    static Icon jarLabel() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M188,49.68V32a20,20,0,0,0-20-20H88A20,20,0,0,0,68,32V49.68A44.06,44.06,0,0,0,36,92V200a44.05,44.05,0,0,0,44,44h96a44.05,44.05,0,0,0,44-44V92A44.06,44.06,0,0,0,188,49.68ZM60,120H196v48H60ZM164,48H140V36h24ZM116,36V48H92V36ZM80,72h96a20,20,0,0,1,20,20v4H60V92A20,20,0,0,1,80,72Zm96,148H80a20,20,0,0,1-20-20v-8H196v8A20,20,0,0,1,176,220Z");
    }

    static Icon jeep() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M240,84h-6.3l-8.61-40.19A20.11,20.11,0,0,0,205.53,28H50.47A20.11,20.11,0,0,0,30.91,43.81L22.3,84H16a12,12,0,0,0,0,24h4v92a20,20,0,0,0,20,20H68a20,20,0,0,0,20-20V180h80v20a20,20,0,0,0,20,20h28a20,20,0,0,0,20-20V108h4a12,12,0,0,0,0-24ZM53.7,52H202.3l6.86,32H46.84ZM64,196H44V180H64Zm128,0V180h20v16Zm20-40H180V132a12,12,0,0,0-24,0v24H140V132a12,12,0,0,0-24,0v24H100V132a12,12,0,0,0-24,0v24H44V108H212Z");
    }

    static Icon joystick() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M208,144H140V98.32a44,44,0,1,0-24,0V144H48a20,20,0,0,0-20,20v44a20,20,0,0,0,20,20H208a20,20,0,0,0,20-20V164A20,20,0,0,0,208,144ZM108,56a20,20,0,1,1,20,20A20,20,0,0,1,108,56Zm96,148H52V168H204ZM172,104h32a12,12,0,0,1,0,24H172a12,12,0,0,1,0-24Z");
    }
}
