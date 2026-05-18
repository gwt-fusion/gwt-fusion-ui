package org.gwtfusion.ui.component.toast;

public enum ToastVariant {
    DEFAULT("border bg-background text-foreground"),
    SUCCESS("border-green-200 bg-green-50 text-green-950 dark:border-green-900 dark:bg-green-950 dark:text-green-50"),
    WARNING("border-yellow-200 bg-yellow-50 text-yellow-950 dark:border-yellow-900 dark:bg-yellow-950 dark:text-yellow-50"),
    ERROR("border-destructive bg-destructive text-destructive-foreground");

    private final String classes;

    ToastVariant(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
