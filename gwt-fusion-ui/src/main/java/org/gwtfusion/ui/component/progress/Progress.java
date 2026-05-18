package org.gwtfusion.ui.component.progress;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Progress extends BaseComponent<Progress> {
    public static final String ROOT_CLASSES = "relative h-2 w-full overflow-hidden rounded-full bg-secondary";
    public static final String INDICATOR_CLASSES = "h-full w-full flex-1 bg-primary transition-all";

    private final HTMLElement indicator;
    private double max = 100;

    private Progress(HTMLElement element, HTMLElement indicator) {
        super(element);
        this.indicator = indicator;
        classes(ROOT_CLASSES);
        attr("role", "progressbar");
        attr("aria-valuemin", "0");
        attr("aria-valuemax", String.valueOf(max));
        indicator.className = INDICATOR_CLASSES;
        element.appendChild(indicator);
        value(0);
    }

    public static Progress create() {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement("div");
        HTMLElement indicator = (HTMLElement) DomGlobal.document.createElement("div");
        return new Progress(element, indicator);
    }

    public Progress max(double max) {
        this.max = max <= 0 ? 100 : max;
        attr("aria-valuemax", String.valueOf(this.max));
        String currentValue = element().getAttribute("aria-valuenow");
        if (currentValue != null) {
            value(toDouble(currentValue));
        }
        return this;
    }

    public Progress value(double value) {
        removeClasses("animate-pulse");
        double safeValue = clamp(value, 0, max);
        attr("aria-valuenow", String.valueOf(safeValue));
        attr("aria-valuetext", percentage(safeValue) + "%");
        indicator.style.setProperty("width", percentage(safeValue) + "%");
        return this;
    }

    public Progress indeterminate() {
        attr("aria-valuenow", null);
        attr("aria-valuetext", "Loading");
        indicator.style.setProperty("width", "100%");
        return classes("animate-pulse");
    }

    private int percentage(double value) {
        return (int) Math.round(value / max * 100);
    }

    private static double clamp(double value, double min, double max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    private static double toDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException ignored) {
            return 0;
        }
    }
}
