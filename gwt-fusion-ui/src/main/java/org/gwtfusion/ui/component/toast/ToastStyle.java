package org.gwtfusion.ui.component.toast;

public enum ToastStyle {
    DEFAULT("rounded-lg p-4 shadow-lg"),
    SONNER("rounded-xl p-3 shadow-xl backdrop-blur supports-[backdrop-filter]:bg-background/95");

    private final String classes;

    ToastStyle(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
