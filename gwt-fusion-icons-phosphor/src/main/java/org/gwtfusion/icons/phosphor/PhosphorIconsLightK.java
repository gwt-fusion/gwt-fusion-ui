package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconTheme;

final class PhosphorIconsLightK {
    private static final String[] NAMES = {"kanban", "key", "key-return", "keyboard", "keyhole", "knife"};

    private PhosphorIconsLightK() {
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
                .element("path", "d", "M216,50H40a6,6,0,0,0-6,6V208a14,14,0,0,0,14,14H88a14,14,0,0,0,14-14V158h52v18a14,14,0,0,0,14,14h40a14,14,0,0,0,14-14V56A6,6,0,0,0,216,50Zm-6,64H166V62h44ZM90,62v52H46V62Zm0,146a2,2,0,0,1-2,2H48a2,2,0,0,1-2-2V126H90Zm12-62V62h52v84Zm106,32H168a2,2,0,0,1-2-2V126h44v50A2,2,0,0,1,208,178Z");
    }

    static Icon key() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M215.15,40.85A78,78,0,0,0,86.2,121.31l-56.1,56.1a13.94,13.94,0,0,0-4.1,9.9V216a14,14,0,0,0,14,14H72a6,6,0,0,0,6-6V206H96a6,6,0,0,0,6-6V182h18a6,6,0,0,0,4.24-1.76l10.45-10.44A77.59,77.59,0,0,0,160,174h.1A78,78,0,0,0,215.15,40.85ZM226,98.16c-1.12,35.16-30.67,63.8-65.88,63.84a65.93,65.93,0,0,1-24.51-4.67,6,6,0,0,0-6.64,1.26L117.51,170H96a6,6,0,0,0-6,6v18H72a6,6,0,0,0-6,6v18H40a2,2,0,0,1-2-2V187.31a2,2,0,0,1,.58-1.41l58.83-58.83a6,6,0,0,0,1.26-6.64A65.61,65.61,0,0,1,94,95.92C94,60.71,122.68,31.16,157.83,30A66,66,0,0,1,226,98.16ZM190,76a10,10,0,1,1-10-10A10,10,0,0,1,190,76Z");
    }

    static Icon keyReturn() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M182,104v32a6,6,0,0,1-6,6H94.48l13.76,13.76a6,6,0,1,1-8.48,8.48l-24-24a6,6,0,0,1,0-8.48l24-24a6,6,0,0,1,8.48,8.48L94.48,130H170V104a6,6,0,0,1,12,0Zm48-48V200a14,14,0,0,1-14,14H40a14,14,0,0,1-14-14V56A14,14,0,0,1,40,42H216A14,14,0,0,1,230,56Zm-12,0a2,2,0,0,0-2-2H40a2,2,0,0,0-2,2V200a2,2,0,0,0,2,2H216a2,2,0,0,0,2-2Z");
    }

    static Icon keyboard() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M224,50H32A14,14,0,0,0,18,64V192a14,14,0,0,0,14,14H224a14,14,0,0,0,14-14V64A14,14,0,0,0,224,50Zm2,142a2,2,0,0,1-2,2H32a2,2,0,0,1-2-2V64a2,2,0,0,1,2-2H224a2,2,0,0,1,2,2Zm-20-64a6,6,0,0,1-6,6H56a6,6,0,0,1,0-12H200A6,6,0,0,1,206,128Zm0-32a6,6,0,0,1-6,6H56a6,6,0,0,1,0-12H200A6,6,0,0,1,206,96ZM70,160a6,6,0,0,1-6,6H56a6,6,0,0,1,0-12h8A6,6,0,0,1,70,160Zm96,0a6,6,0,0,1-6,6H96a6,6,0,0,1,0-12h64A6,6,0,0,1,166,160Zm40,0a6,6,0,0,1-6,6h-8a6,6,0,0,1,0-12h8A6,6,0,0,1,206,160Z");
    }

    static Icon keyhole() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M128,26A102,102,0,1,0,230,128,102.12,102.12,0,0,0,128,26Zm0,192a90,90,0,1,1,90-90A90.1,90.1,0,0,1,128,218Zm38-106a38,38,0,1,0-61.5,29.86l-14,31.72A6,6,0,0,0,96,182h64a6,6,0,0,0,5.49-8.42l-14-31.72A38.16,38.16,0,0,0,166,112Zm-25,22.53a6,6,0,0,0-2.49,7.61L150.8,170H105.2l12.29-27.86a6,6,0,0,0-2.49-7.61,26,26,0,1,1,26,0Z");
    }

    static Icon knife() {
        return Icon.svg("0 0 256 256")
                .theme(IconTheme.FILLED)
                .element("path", "d", "M230.46,33.55a25.81,25.81,0,0,0-36.49,0L19.76,207.82a6,6,0,0,0,2.89,10.09A158.88,158.88,0,0,0,58.39,222c32.57,0,65.17-10.1,95.87-29.91,31.49-20.32,49.72-43.39,50.48-44.36a6,6,0,0,0-.49-7.94L182.49,118l48-48A25.86,25.86,0,0,0,230.46,33.55Zm-38.6,110.82A221,221,0,0,1,147.75,182C111.5,205.4,74,214.23,36.23,208.32L146,98.5ZM222,61.56l-48,48L154.49,90l48-48A13.81,13.81,0,0,1,222,61.56Z");
    }
}
