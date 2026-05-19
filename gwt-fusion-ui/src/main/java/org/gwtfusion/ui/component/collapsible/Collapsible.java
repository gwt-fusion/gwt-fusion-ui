package org.gwtfusion.ui.component.collapsible;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Collapsible extends BaseComponent<Collapsible> {
    public static final String ROOT_CLASSES = "grid gap-2";
    public static final String TRIGGER_CLASSES = "inline-flex items-center justify-between rounded-md border border-input bg-background px-3 py-2 text-sm font-medium shadow-sm transition-colors hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    public static final String CONTENT_CLASSES = "overflow-hidden text-sm text-muted-foreground";

    private final HTMLButtonElement trigger;
    private final HTMLElement content;
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private boolean open = true;

    private Collapsible(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        trigger = (HTMLButtonElement) DomGlobal.document.createElement("button");
        trigger.type = "button";
        trigger.className = TRIGGER_CLASSES;
        content = (HTMLElement) DomGlobal.document.createElement("div");
        content.className = CONTENT_CLASSES;
        element.appendChild(trigger);
        element.appendChild(content);
        trigger.addEventListener("click", event -> open(!open));
        open(false);
    }

    public static Collapsible create(String triggerText) {
        return new Collapsible((HTMLElement) DomGlobal.document.createElement("div")).trigger(triggerText);
    }

    public Collapsible trigger(String text) {
        trigger.textContent = text == null ? "" : text;
        return this;
    }

    public Collapsible content(UiComponent component) {
        content.appendChild(component.element());
        return this;
    }

    public Collapsible open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        trigger.setAttribute("aria-expanded", String.valueOf(open));
        data("state", open ? "open" : "closed");
        content.setAttribute("data-state", open ? "open" : "closed");
        if (open) {
            content.removeAttribute("hidden");
        } else {
            content.setAttribute("hidden", "");
        }
        notifyOpenChange();
        return this;
    }

    public boolean open() {
        return open;
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        openChangeListeners.add(listener);
        return () -> openChangeListeners.remove(listener);
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }
}
