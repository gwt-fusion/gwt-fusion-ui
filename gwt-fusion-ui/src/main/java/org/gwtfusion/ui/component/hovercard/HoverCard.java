package org.gwtfusion.ui.component.hovercard;

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

public final class HoverCard extends BaseComponent<HoverCard> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String CONTENT_CLASSES = "fixed z-50 grid w-80 gap-3 rounded-md border border-border bg-background p-4 text-sm text-foreground shadow-lg";
    public static final int OFFSET = 4;

    private final IdGenerator ids = IdGenerator.create("hover-card");
    private final String contentId = ids.next("content");
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private HTMLElement trigger;
    private HTMLElement card;
    private UiComponent content;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private OverlaySide side = OverlaySide.BOTTOM;
    private int showDelayMs;
    private int hideDelayMs = 150;
    private double showTimer = -1;
    private double hideTimer = -1;
    private boolean overTrigger;
    private boolean overCard;
    private boolean open;

    private HoverCard(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static HoverCard create() {
        return new HoverCard((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public HoverCard trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        this.trigger.setAttribute("aria-describedby", contentId);
        this.trigger.addEventListener("mouseenter", event -> {
            overTrigger = true;
            scheduleOpen();
        });
        this.trigger.addEventListener("focus", event -> {
            overTrigger = true;
            scheduleOpen();
        });
        this.trigger.addEventListener("mouseleave", event -> {
            overTrigger = false;
            scheduleClose();
        });
        this.trigger.addEventListener("blur", event -> {
            overTrigger = false;
            scheduleClose();
        });
        element().appendChild(this.trigger);
        return this;
    }

    public HoverCard content(UiComponent content) {
        this.content = content;
        return this;
    }

    public HoverCard side(OverlaySide side) {
        this.side = side == null ? OverlaySide.BOTTOM : side;
        return this;
    }

    public HoverCard showDelay(int milliseconds) {
        showDelayMs = Math.max(0, milliseconds);
        return this;
    }

    public HoverCard hideDelay(int milliseconds) {
        hideDelayMs = Math.max(0, milliseconds);
        return this;
    }

    public HoverCard open(boolean open) {
        if (this.open == open) {
            return this;
        }
        cancelShowTimer();
        cancelHideTimer();
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
        card = (HTMLElement) DomGlobal.document.createElement("div");
        card.className = CONTENT_CLASSES;
        card.setAttribute("id", contentId);
        card.setAttribute("role", "dialog");
        card.addEventListener("mouseenter", event -> {
            overCard = true;
            cancelHideTimer();
        });
        card.addEventListener("mouseleave", event -> {
            overCard = false;
            scheduleClose();
        });
        if (content != null) {
            card.appendChild(content.element());
        }
        ListenerRegistration portal = Portal.appendToBody(card);
        EventListener reposition = event -> positionAtTrigger();
        DomGlobal.window.addEventListener("scroll", reposition, true);
        DomGlobal.window.addEventListener("resize", reposition);
        cleanup = ListenerRegistration.combine(portal, () -> {
            DomGlobal.window.removeEventListener("scroll", reposition, true);
            DomGlobal.window.removeEventListener("resize", reposition);
        });
        positionAtTrigger();
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        card = null;
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }

    private void scheduleOpen() {
        cancelHideTimer();
        cancelShowTimer();
        if (open) {
            positionAtTrigger();
            return;
        }
        if (showDelayMs == 0) {
            open(true);
        } else {
            showTimer = DomGlobal.setTimeout(event -> open(true), showDelayMs);
        }
    }

    private void scheduleClose() {
        cancelShowTimer();
        cancelHideTimer();
        if (!open) {
            return;
        }
        hideTimer = DomGlobal.setTimeout(event -> {
            if (!overTrigger && !overCard) {
                open(false);
            }
        }, hideDelayMs);
    }

    private void cancelShowTimer() {
        if (showTimer >= 0) {
            DomGlobal.clearTimeout(showTimer);
            showTimer = -1;
        }
    }

    private void cancelHideTimer() {
        if (hideTimer >= 0) {
            DomGlobal.clearTimeout(hideTimer);
            hideTimer = -1;
        }
    }

    private void positionAtTrigger() {
        if (trigger == null || card == null) {
            return;
        }
        elemental2.dom.DOMRect rect = trigger.getBoundingClientRect();
        double left;
        double top;
        if (side == OverlaySide.RIGHT) {
            left = rect.right + OFFSET;
            top = rect.top;
        } else if (side == OverlaySide.TOP) {
            left = rect.left;
            top = rect.top - card.offsetHeight - OFFSET;
        } else if (side == OverlaySide.LEFT) {
            left = rect.left - card.offsetWidth - OFFSET;
            top = rect.top;
        } else {
            left = rect.left;
            top = rect.bottom + OFFSET;
        }
        card.style.left = left + "px";
        card.style.top = top + "px";
    }
}
