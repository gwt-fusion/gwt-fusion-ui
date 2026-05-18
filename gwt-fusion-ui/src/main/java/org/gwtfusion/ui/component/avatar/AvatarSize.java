package org.gwtfusion.ui.component.avatar;

public enum AvatarSize {
    SM("h-8 w-8"),
    MD("h-10 w-10"),
    LG("h-14 w-14");

    private final String classes;

    AvatarSize(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
