package org.gwtfusion.ui.component.combobox;

import elemental2.dom.DOMRect;
import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import elemental2.dom.Node;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.command.CommandMenu;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.Aria;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;
import org.gwtfusion.ui.overlay.OutsideClick;
import org.gwtfusion.ui.overlay.Portal;

public final class Combobox extends BaseComponent<Combobox> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String TRIGGER_CLASSES = "flex h-9 w-56 items-center justify-between rounded-md border border-input bg-transparent px-3 py-1 text-sm shadow-sm hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50";
    public static final String CONTENT_CLASSES = "fixed z-50 w-56 rounded-lg bg-background text-foreground shadow-lg";
    public static final int OFFSET = 4;

    private final IdGenerator ids = IdGenerator.create("combobox");
    private final String contentId = ids.next("content");
    private final CommandMenu menu = CommandMenu.create();
    private final List<Item> items = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private final HTMLElement trigger;

    private HTMLElement content;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private String placeholder = "Select option...";
    private String value = "";
    private boolean open;

    private Combobox(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        trigger = (HTMLElement) DomGlobal.document.createElement("button");
        trigger.className = TRIGGER_CLASSES;
        trigger.setAttribute("type", "button");
        Aria.buttonPopup(trigger, "listbox", contentId, false);
        trigger.addEventListener("click", event -> open(!open));
        trigger.addEventListener("keydown", event -> {
            KeyboardEvent keyEvent = (KeyboardEvent) event;
            if (Keyboard.isActivationKey(keyEvent.key) || Keyboard.ARROW_DOWN.equals(keyEvent.key)) {
                keyEvent.preventDefault();
                open(true);
            }
        });
        element().appendChild(trigger);
        menu.placeholder("Search options...");
        menu.onItemSelect(this::select);
        updateTrigger();
    }

    public static Combobox create() {
        return new Combobox((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Combobox placeholder(String placeholder) {
        this.placeholder = placeholder == null ? "" : placeholder;
        updateTrigger();
        return this;
    }

    public Combobox searchPlaceholder(String placeholder) {
        menu.placeholder(placeholder);
        return this;
    }

    public Combobox emptyText(String emptyText) {
        menu.emptyText(emptyText);
        return this;
    }

    public Combobox item(String value, String label) {
        return item(value, label, false, null);
    }

    public Combobox item(String value, String label, Runnable onSelect) {
        return item(value, label, false, onSelect);
    }

    public Combobox disabledItem(String value, String label) {
        return item(value, label, true, null);
    }

    public Combobox item(String value, String label, boolean disabled, Runnable onSelect) {
        Item item = new Item(value == null ? "" : value, label == null ? "" : label, disabled);
        items.add(item);
        if (disabled) {
            menu.disabledItem(item.value, item.label);
        } else {
            menu.item(item.value, item.label, onSelect);
        }
        updateTrigger();
        return this;
    }

    public Combobox value(String value) {
        this.value = value == null ? "" : value;
        menu.value(this.value);
        updateTrigger();
        return this;
    }

    public String value() {
        return value;
    }

    public Combobox open(boolean open) {
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

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        openChangeListeners.add(listener);
        return () -> openChangeListeners.remove(listener);
    }

    private void mount() {
        content = (HTMLElement) DomGlobal.document.createElement("div");
        content.className = CONTENT_CLASSES;
        content.id = contentId;
        content.appendChild(menu.element());
        content.addEventListener("keydown", event -> {
            KeyboardEvent keyEvent = (KeyboardEvent) event;
            if (Keyboard.isEscape(keyEvent.key)) {
                keyEvent.preventDefault();
                open(false);
            }
        });
        ListenerRegistration portal = Portal.appendToBody(content);
        positionAtTrigger();
        ListenerRegistration outside = OutsideClick.listen(content, event -> {
            if (!isTriggerEvent(event)) {
                open(false);
            }
        });
        cleanup = ListenerRegistration.combine(outside, portal);
        Aria.buttonPopup(trigger, "listbox", contentId, true);
        menu.focusInput();
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        content = null;
        Aria.buttonPopup(trigger, "listbox", contentId, false);
        FocusManager.focus(trigger);
    }

    private void select(String nextValue) {
        String previous = value;
        value = nextValue == null ? "" : nextValue;
        updateTrigger();
        open(false);
        if (!previous.equals(value)) {
            for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
                listener.onValueChange(value);
            }
        }
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }

    private void updateTrigger() {
        trigger.textContent = labelForValue(value);
    }

    private String labelForValue(String value) {
        for (Item item : items) {
            if (item.value.equals(value)) {
                return item.label;
            }
        }
        return placeholder;
    }

    private boolean isTriggerEvent(Event event) {
        EventTarget target = event.target;
        return target instanceof Node && trigger.contains((Node) target);
    }

    private void positionAtTrigger() {
        if (content == null) {
            return;
        }
        DOMRect rect = trigger.getBoundingClientRect();
        content.style.left = rect.left + "px";
        content.style.top = rect.bottom + OFFSET + "px";
    }

    private static final class Item {
        private final String value;
        private final String label;
        private final boolean disabled;

        private Item(String value, String label, boolean disabled) {
            this.value = value;
            this.label = label;
            this.disabled = disabled;
        }
    }
}
