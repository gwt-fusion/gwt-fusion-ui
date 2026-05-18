package org.gwtfusion.ui.component.spinner;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Spinner extends BaseComponent<Spinner> {
    public static final String BASE_CLASSES = "inline-block animate-spin rounded-full border-2 border-current border-r-transparent text-primary";

    private SpinnerSize size;

    private Spinner(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
        attr("role", "status");
        attr("aria-label", "Loading");
        size(SpinnerSize.MD);
    }

    public static Spinner create() {
        return new Spinner((HTMLElement) DomGlobal.document.createElement("span"));
    }

    public Spinner size(SpinnerSize size) {
        if (this.size != null) {
            removeClasses(this.size.classes());
        }
        this.size = size == null ? SpinnerSize.MD : size;
        return classes(this.size.classes());
    }

    public Spinner label(String label) {
        return attr("aria-label", label == null || label.isEmpty() ? "Loading" : label);
    }
}
