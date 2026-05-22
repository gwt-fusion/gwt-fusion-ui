package org.gwtfusion.ui.component.popover;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import elemental2.dom.Node;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.Aria;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;
import org.gwtfusion.ui.overlay.OutsideClick;
import org.gwtfusion.ui.overlay.OverlaySide;
import org.gwtfusion.ui.overlay.Portal;

public final class Popover extends BaseComponent<Popover> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String CONTENT_CLASSES = "fixed z-50 grid w-72 gap-3 rounded-md border border-border bg-popover p-4 text-sm text-popover-foreground shadow-lg";
    public static final int OFFSET = 4;

    private final IdGenerator ids = IdGenerator.create("popover");
    private final String contentId = ids.next("content");
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();

    private HTMLElement trigger;
    private HTMLElement contentElement;
    private UiComponent content;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private OverlaySide side = OverlaySide.BOTTOM;
    private boolean open;

    private Popover(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static Popover create() {
        return new Popover((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Popover trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        Aria.buttonPopup(this.trigger, "dialog", contentId, open);
        this.trigger.addEventListener("click", event -> open(!open));
        element().appendChild(this.trigger);
        return this;
    }

    public Popover content(UiComponent content) {
        this.content = content;
        return this;
    }

    public Popover side(OverlaySide side) {
        this.side = side == null ? OverlaySide.BOTTOM : side;
        return this;
    }

    public Popover open(boolean open) {
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
        contentElement = (HTMLElement) DomGlobal.document.createElement("div");
        contentElement.className = CONTENT_CLASSES;
        contentElement.setAttribute("id", contentId);
        contentElement.setAttribute("role", "dialog");
        contentElement.setAttribute("tabindex", "-1");
        if (content != null) {
            contentElement.appendChild(content.element());
        }
        ListenerRegistration portal = Portal.appendToBody(contentElement);
        positionAtTrigger();
        ListenerRegistration outside = OutsideClick.listen(contentElement, event -> {
            if (!isTriggerEvent(event)) {
                open(false);
            }
        });
        EventListener reposition = event -> positionAtTrigger();
        DomGlobal.window.addEventListener("scroll", reposition, true);
        DomGlobal.window.addEventListener("resize", reposition);
        contentElement.addEventListener("keydown", event -> {
            KeyboardEvent keyEvent = (KeyboardEvent) event;
            if (Keyboard.isEscape(keyEvent.key)) {
                keyEvent.preventDefault();
                open(false);
            }
        });
        cleanup = ListenerRegistration.combine(outside, portal, () -> {
            DomGlobal.window.removeEventListener("scroll", reposition, true);
            DomGlobal.window.removeEventListener("resize", reposition);
        });
        if (trigger != null) {
            Aria.buttonPopup(trigger, "dialog", contentId, true);
        }
        FocusManager.focus(contentElement);
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        contentElement = null;
        if (trigger != null) {
            Aria.buttonPopup(trigger, "dialog", contentId, false);
            FocusManager.focus(trigger);
        }
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }

    private boolean isTriggerEvent(Event event) {
        EventTarget target = event.target;
        return trigger != null && target instanceof Node && trigger.contains((Node) target);
    }

    private void positionAtTrigger() {
        if (trigger == null || contentElement == null) {
            return;
        }
        elemental2.dom.DOMRect rect = trigger.getBoundingClientRect();
        OverlaySide resolvedSide = side.resolve();
        double left;
        double top;
        if (resolvedSide == OverlaySide.RIGHT) {
            left = rect.right + OFFSET;
            top = rect.top;
        } else if (resolvedSide == OverlaySide.TOP) {
            left = rect.left;
            top = rect.top - contentElement.offsetHeight - OFFSET;
        } else if (resolvedSide == OverlaySide.LEFT) {
            left = rect.left - contentElement.offsetWidth - OFFSET;
            top = rect.top;
        } else {
            left = rect.left;
            top = rect.bottom + OFFSET;
        }
        contentElement.style.left = left + "px";
        contentElement.style.top = top + "px";
    }
}
