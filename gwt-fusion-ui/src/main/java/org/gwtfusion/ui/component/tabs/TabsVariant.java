package org.gwtfusion.ui.component.tabs;

public enum TabsVariant {
    DEFAULT(
            "h-9 items-center justify-center rounded-lg bg-muted p-1 text-muted-foreground",
            "bg-background text-foreground shadow",
            "hover:bg-background hover:text-foreground"),
    LINE(
            "items-center justify-start gap-2 border-b border-border text-muted-foreground",
            "border-b-2 border-primary text-foreground",
            "hover:text-foreground");

    private final String listClasses;
    private final String activeTriggerClasses;
    private final String inactiveTriggerClasses;

    TabsVariant(String listClasses, String activeTriggerClasses, String inactiveTriggerClasses) {
        this.listClasses = listClasses;
        this.activeTriggerClasses = activeTriggerClasses;
        this.inactiveTriggerClasses = inactiveTriggerClasses;
    }

    public String listClasses() {
        return listClasses;
    }

    public String activeTriggerClasses() {
        return activeTriggerClasses;
    }

    public String inactiveTriggerClasses() {
        return inactiveTriggerClasses;
    }
}
