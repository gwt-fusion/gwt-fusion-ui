package org.gwtfusion.ui.component.skeleton;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Skeleton extends BaseComponent<Skeleton> {
    public static final String BASE_CLASSES = "animate-pulse rounded-md bg-muted";

    private Skeleton(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
        attr("aria-hidden", "true");
    }

    public static Skeleton create() {
        return new Skeleton((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Skeleton size(String classes) {
        return classes(classes);
    }
}
