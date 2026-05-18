package org.gwtfusion.ui.component.status;

public enum StatusIndicatorVariant {
    NEUTRAL("bg-muted-foreground", "text-muted-foreground"),
    SUCCESS("bg-green-500", "text-green-700 dark:text-green-400"),
    WARNING("bg-yellow-500", "text-yellow-700 dark:text-yellow-400"),
    ERROR("bg-destructive", "text-destructive"),
    INFO("bg-blue-500", "text-blue-700 dark:text-blue-400");

    private final String dotClass;
    private final String textClass;

    StatusIndicatorVariant(String dotClass, String textClass) {
        this.dotClass = dotClass;
        this.textClass = textClass;
    }

    public String dotClass() {
        return dotClass;
    }

    public String textClass() {
        return textClass;
    }
}
