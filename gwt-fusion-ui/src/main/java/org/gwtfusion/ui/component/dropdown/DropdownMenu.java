package org.gwtfusion.ui.component.dropdown;

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

public final class DropdownMenu extends BaseComponent<DropdownMenu> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String MENU_CLASSES = "fixed z-50 grid min-w-40 gap-1 rounded-md border border-border bg-background p-1 text-sm text-foreground shadow-lg";
    public static final String ITEM_CLASSES = "w-full rounded px-2 py-1.5 text-left hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    public static final int OFFSET = 4;

    private final IdGenerator ids = IdGenerator.create("dropdown-menu");
    private final String menuId = ids.next("content");
    private final List<Item> items = new ArrayList<>();
    private final List<HTMLElement> itemElements = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();

    private HTMLElement trigger;
    private HTMLElement menu;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private String value = "";
    private OverlaySide side = OverlaySide.BOTTOM;
    private boolean open;

    private DropdownMenu(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static DropdownMenu create() {
        return new DropdownMenu((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public DropdownMenu trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        Aria.buttonPopup(this.trigger, "menu", menuId, open);
        this.trigger.addEventListener("click", event -> open(!open));
        element().appendChild(this.trigger);
        return this;
    }

    public DropdownMenu addItem(String value, String label) {
        items.add(new Item(value == null ? "" : value, label == null ? "" : label));
        return this;
    }

    public DropdownMenu side(OverlaySide side) {
        this.side = side == null ? OverlaySide.BOTTOM : side;
        return this;
    }

    public DropdownMenu open(boolean open) {
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

    public String value() {
        return value;
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        openChangeListeners.add(listener);
        return () -> openChangeListeners.remove(listener);
    }

    private void mount() {
        itemElements.clear();
        menu = (HTMLElement) DomGlobal.document.createElement("div");
        menu.className = MENU_CLASSES;
        menu.setAttribute("id", menuId);
        menu.setAttribute("role", "menu");
        menu.setAttribute("tabindex", "-1");
        for (Item item : items) {
            HTMLElement itemElement = (HTMLElement) DomGlobal.document.createElement("button");
            itemElement.className = ITEM_CLASSES;
            itemElement.setAttribute("type", "button");
            itemElement.setAttribute("role", "menuitem");
            itemElement.setAttribute("tabindex", "-1");
            itemElement.textContent = item.label;
            itemElement.addEventListener("click", event -> select(item));
            itemElements.add(itemElement);
            menu.appendChild(itemElement);
        }
        menu.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        ListenerRegistration portal = Portal.appendToBody(menu);
        positionAtTrigger();
        ListenerRegistration outside = OutsideClick.listen(menu, event -> {
            if (!isTriggerEvent(event)) {
                open(false);
            }
        });
        EventListener reposition = event -> positionAtTrigger();
        DomGlobal.window.addEventListener("scroll", reposition, true);
        DomGlobal.window.addEventListener("resize", reposition);
        cleanup = ListenerRegistration.combine(outside, portal, () -> {
            DomGlobal.window.removeEventListener("scroll", reposition, true);
            DomGlobal.window.removeEventListener("resize", reposition);
        });
        if (trigger != null) {
            Aria.buttonPopup(trigger, "menu", menuId, true);
        }
        focusItem(0);
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        itemElements.clear();
        menu = null;
        if (trigger != null) {
            Aria.buttonPopup(trigger, "menu", menuId, false);
            FocusManager.focus(trigger);
        }
    }

    private void select(Item item) {
        String previous = value;
        value = item.value;
        open(false);
        if (!previous.equals(value)) {
            for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
                listener.onValueChange(value);
            }
        }
    }

    private void onKeyDown(KeyboardEvent event) {
        int current = focusedIndex();
        int next = Keyboard.indexForKey(event.key, current, itemElements.size(), true);
        if (Keyboard.isEscape(event.key)) {
            event.preventDefault();
            open(false);
        } else if (next != current) {
            event.preventDefault();
            focusItem(next);
        } else if (Keyboard.isActivationKey(event.key) && current >= 0 && current < items.size()) {
            event.preventDefault();
            select(items.get(current));
        }
    }

    private int focusedIndex() {
        HTMLElement active = FocusManager.activeElement();
        for (int i = 0; i < itemElements.size(); i++) {
            if (itemElements.get(i) == active) {
                return i;
            }
        }
        return -1;
    }

    private void focusItem(int index) {
        if (index >= 0 && index < itemElements.size()) {
            FocusManager.focus(itemElements.get(index));
        } else {
            FocusManager.focus(menu);
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
        if (trigger == null || menu == null) {
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
            top = rect.top - menu.offsetHeight - OFFSET;
        } else if (resolvedSide == OverlaySide.LEFT) {
            left = rect.left - menu.offsetWidth - OFFSET;
            top = rect.top;
        } else {
            left = rect.left;
            top = rect.bottom + OFFSET;
        }
        menu.style.left = left + "px";
        menu.style.top = top + "px";
    }

    private static final class Item {
        private final String value;
        private final String label;

        private Item(String value, String label) {
            this.value = value;
            this.label = label;
        }
    }
}
