package org.gwtfusion.ui.component.tabs;

public enum TabsOrientation {
    HORIZONTAL("grid gap-2", "inline-flex"),
    VERTICAL("flex items-start gap-4", "inline-flex h-auto flex-col items-stretch justify-start");

    private final String rootClasses;
    private final String listClasses;

    TabsOrientation(String rootClasses, String listClasses) {
        this.rootClasses = rootClasses;
        this.listClasses = listClasses;
    }

    public String rootClasses() {
        return rootClasses;
    }

    public String listClasses() {
        return listClasses;
    }
}
