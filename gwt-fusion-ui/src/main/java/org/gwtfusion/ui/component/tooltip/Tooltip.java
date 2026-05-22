package org.gwtfusion.ui.component.tooltip;

import elemental2.dom.DomGlobal;
import elemental2.dom.EventListener;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.OverlaySide;
import org.gwtfusion.ui.overlay.Portal;

public final class Tooltip extends BaseComponent<Tooltip> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String CONTENT_CLASSES = "fixed z-50 max-w-xs rounded-md bg-primary px-3 py-1.5 text-xs text-primary-foreground shadow-lg";
    public static final String ARROW_CLASSES = "absolute h-2 w-2 rotate-45 bg-primary";
    public static final int OFFSET = 6;

    private final IdGenerator ids = IdGenerator.create("tooltip");
    private final String tooltipId = ids.next("content");
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private HTMLElement trigger;
    private HTMLElement tooltip;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private String text = "";
    private OverlaySide side = OverlaySide.TOP;
    private boolean open;

    private Tooltip(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static Tooltip create(String text) {
        return new Tooltip((HTMLElement) DomGlobal.document.createElement("span")).label(text);
    }

    public Tooltip trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        this.trigger.setAttribute("aria-describedby", tooltipId);
        this.trigger.addEventListener("mouseenter", event -> open(true));
        this.trigger.addEventListener("focus", event -> open(true));
        this.trigger.addEventListener("mouseleave", event -> open(false));
        this.trigger.addEventListener("blur", event -> open(false));
        element().appendChild(this.trigger);
        return this;
    }

    public Tooltip label(String text) {
        this.text = text == null ? "" : text;
        return this;
    }

    public Tooltip side(OverlaySide side) {
        this.side = side == null ? OverlaySide.TOP : side;
        return this;
    }

    public Tooltip open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        if (open) {
            mount();
        } else {
            unmount();
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

    private void mount() {
        tooltip = (HTMLElement) DomGlobal.document.createElement("div");
        tooltip.className = CONTENT_CLASSES;
        tooltip.setAttribute("id", tooltipId);
        tooltip.setAttribute("role", "tooltip");
        tooltip.textContent = text;
        HTMLElement arrow = (HTMLElement) DomGlobal.document.createElement("div");
        arrow.className = ARROW_CLASSES + " " + arrowClasses();
        arrow.setAttribute("aria-hidden", "true");
        tooltip.appendChild(arrow);
        ListenerRegistration portal = Portal.appendToBody(tooltip);
        EventListener reposition = event -> positionAtTrigger();
        DomGlobal.window.addEventListener("scroll", reposition, true);
        DomGlobal.window.addEventListener("resize", reposition);
        cleanup = ListenerRegistration.combine(portal, () -> {
            DomGlobal.window.removeEventListener("scroll", reposition, true);
            DomGlobal.window.removeEventListener("resize", reposition);
        });
        positionAtTrigger();
    }

    private String arrowClasses() {
        OverlaySide resolvedSide = side.resolve();
        if (resolvedSide == OverlaySide.RIGHT) {
            return "-left-1 top-1/2 -translate-y-1/2";
        }
        if (resolvedSide == OverlaySide.BOTTOM) {
            return "-top-1 left-1/2 -translate-x-1/2";
        }
        if (resolvedSide == OverlaySide.LEFT) {
            return "-right-1 top-1/2 -translate-y-1/2";
        }
        return "-bottom-1 left-1/2 -translate-x-1/2";
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        tooltip = null;
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }

    private void positionAtTrigger() {
        if (trigger == null || tooltip == null) {
            return;
        }
        elemental2.dom.DOMRect rect = trigger.getBoundingClientRect();
        OverlaySide resolvedSide = side.resolve();
        double left;
        double top;
        if (resolvedSide == OverlaySide.RIGHT) {
            left = rect.right + OFFSET;
            top = rect.top + (rect.height - tooltip.offsetHeight) / 2;
        } else if (resolvedSide == OverlaySide.BOTTOM) {
            left = rect.left + (rect.width - tooltip.offsetWidth) / 2;
            top = rect.bottom + OFFSET;
        } else if (resolvedSide == OverlaySide.LEFT) {
            left = rect.left - tooltip.offsetWidth - OFFSET;
            top = rect.top + (rect.height - tooltip.offsetHeight) / 2;
        } else {
            left = rect.left + (rect.width - tooltip.offsetWidth) / 2;
            top = rect.top - tooltip.offsetHeight - OFFSET;
        }
        tooltip.style.left = left + "px";
        tooltip.style.top = top + "px";
    }
}
