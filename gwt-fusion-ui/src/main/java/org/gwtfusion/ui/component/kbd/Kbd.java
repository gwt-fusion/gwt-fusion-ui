package org.gwtfusion.ui.component.kbd;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Kbd extends BaseComponent<Kbd> {
    public static final String BASE_CLASSES = "pointer-events-none inline-flex h-5 select-none items-center gap-1 rounded border bg-muted px-1.5 font-mono text-[10px] font-medium text-muted-foreground opacity-100";

    private Kbd(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static Kbd create(String text) {
        return new Kbd((HTMLElement) DomGlobal.document.createElement("kbd")).text(text);
    }
}
