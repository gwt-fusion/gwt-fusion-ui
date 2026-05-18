package org.gwtfusion.ui.component.status;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class StatusIndicator extends BaseComponent<StatusIndicator> {
    public static final String BASE_CLASSES = "inline-flex items-center gap-2 text-sm font-medium";
    public static final String DOT_CLASSES = "h-2.5 w-2.5 rounded-full";

    private final HTMLElement dot;
    private final HTMLElement label;
    private StatusIndicatorVariant variant;

    private StatusIndicator(HTMLElement element, HTMLElement dot, HTMLElement label) {
        super(element);
        this.dot = dot;
        this.label = label;
        classes(BASE_CLASSES);
        dot.className = DOT_CLASSES;
        element.appendChild(dot);
        element.appendChild(label);
        variant(StatusIndicatorVariant.NEUTRAL);
    }

    public static StatusIndicator create(String label) {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement("span");
        HTMLElement dot = (HTMLElement) DomGlobal.document.createElement("span");
        HTMLElement text = (HTMLElement) DomGlobal.document.createElement("span");
        return new StatusIndicator(element, dot, text).label(label);
    }

    public StatusIndicator variant(StatusIndicatorVariant variant) {
        if (this.variant != null) {
            dot.classList.remove(this.variant.dotClass());
            removeClasses(this.variant.textClass());
        }
        this.variant = variant == null ? StatusIndicatorVariant.NEUTRAL : variant;
        dot.classList.add(this.variant.dotClass());
        return classes(this.variant.textClass());
    }

    public StatusIndicator label(String label) {
        this.label.textContent = label == null ? "" : label;
        return this;
    }
}
