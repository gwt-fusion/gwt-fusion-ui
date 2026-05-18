package org.gwtfusion.ui.component.spinner;

public enum SpinnerSize {
    SM("h-4 w-4"),
    MD("h-5 w-5"),
    LG("h-8 w-8");

    private final String classes;

    SpinnerSize(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
