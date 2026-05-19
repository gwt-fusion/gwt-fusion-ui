package org.gwtfusion.ui.component.multiselect;

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
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.Aria;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;
import org.gwtfusion.ui.overlay.OutsideClick;
import org.gwtfusion.ui.overlay.Portal;

public final class MultiSelect extends BaseComponent<MultiSelect> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String TRIGGER_CLASSES = "flex h-9 w-64 items-center justify-between rounded-md border border-input bg-transparent px-3 py-1 text-sm shadow-sm hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50";
    public static final String CONTENT_CLASSES = "fixed z-50 grid max-h-72 w-64 gap-1 overflow-y-auto rounded-md border border-border bg-background p-1 text-sm text-foreground shadow-lg";
    public static final String ITEM_CLASSES = "flex w-full items-center gap-2 rounded px-2 py-1.5 text-left hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    public static final String ACTIVE_ITEM_CLASSES = "bg-accent text-accent-foreground";
    public static final String DISABLED_ITEM_CLASSES = "pointer-events-none opacity-50";
    public static final String CHECK_CLASSES = "w-4 shrink-0 text-center text-xs";
    public static final int OFFSET = 4;

    private final IdGenerator ids = IdGenerator.create("multi-select");
    private final String contentId = ids.next("content");
    private final HTMLElement trigger;
    private final List<Item> items = new ArrayList<>();
    private final List<HTMLElement> itemElements = new ArrayList<>();
    private final List<Item> focusableItems = new ArrayList<>();
    private final List<ValueChangeListener<List<String>>> valueChangeListeners = new ArrayList<>();
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private final List<String> values = new ArrayList<>();

    private HTMLElement content;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private String placeholder = "Select options...";
    private int activeIndex = -1;
    private boolean open;

    private MultiSelect(HTMLElement element) {
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
        updateTrigger();
    }

    public static MultiSelect create() {
        return new MultiSelect((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public MultiSelect placeholder(String placeholder) {
        this.placeholder = placeholder == null ? "" : placeholder;
        updateTrigger();
        return this;
    }

    public MultiSelect item(String value, String label) {
        return item(value, label, false);
    }

    public MultiSelect disabledItem(String value, String label) {
        return item(value, label, true);
    }

    public MultiSelect item(String value, String label, boolean disabled) {
        items.add(new Item(value == null ? "" : value, label == null ? "" : label, disabled));
        if (content != null) {
            renderItems();
        }
        updateTrigger();
        return this;
    }

    public MultiSelect selected(String value, boolean selected) {
        String safeValue = value == null ? "" : value;
        if (selected && !values.contains(safeValue)) {
            values.add(safeValue);
        } else if (!selected) {
            values.remove(safeValue);
        }
        updateTrigger();
        if (content != null) {
            renderItems();
        }
        return this;
    }

    public List<String> values() {
        return new ArrayList<>(values);
    }

    public MultiSelect open(boolean open) {
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

    public ListenerRegistration onValueChange(ValueChangeListener<List<String>> listener) {
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
        content.setAttribute("role", "listbox");
        content.setAttribute("aria-multiselectable", "true");
        content.setAttribute("tabindex", "-1");
        content.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        renderItems();
        ListenerRegistration portal = Portal.appendToBody(content);
        positionAtTrigger();
        ListenerRegistration outside = OutsideClick.listen(content, event -> {
            if (!isTriggerEvent(event)) {
                open(false);
            }
        });
        cleanup = ListenerRegistration.combine(outside, portal);
        Aria.buttonPopup(trigger, "listbox", contentId, true);
        focusItem(0);
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        itemElements.clear();
        focusableItems.clear();
        content = null;
        Aria.buttonPopup(trigger, "listbox", contentId, false);
        FocusManager.focus(trigger);
    }

    private void renderItems() {
        clear(content);
        itemElements.clear();
        focusableItems.clear();
        activeIndex = -1;
        for (Item item : items) {
            HTMLElement element = (HTMLElement) DomGlobal.document.createElement("button");
            element.className = item.disabled ? ITEM_CLASSES + " " + DISABLED_ITEM_CLASSES : ITEM_CLASSES;
            element.setAttribute("type", "button");
            element.setAttribute("role", "option");
            element.setAttribute("tabindex", "-1");
            element.setAttribute("aria-selected", String.valueOf(values.contains(item.value)));
            element.setAttribute("aria-disabled", String.valueOf(item.disabled));
            if (item.disabled) {
                element.setAttribute("disabled", "");
            }
            HTMLElement check = (HTMLElement) DomGlobal.document.createElement("span");
            check.className = CHECK_CLASSES;
            check.textContent = values.contains(item.value) ? "✓" : "";
            element.appendChild(check);
            HTMLElement label = (HTMLElement) DomGlobal.document.createElement("span");
            label.textContent = item.label;
            element.appendChild(label);
            element.addEventListener("click", event -> toggle(item));
            content.appendChild(element);
            if (!item.disabled) {
                itemElements.add(element);
                focusableItems.add(item);
                if (activeIndex < 0) {
                    activeIndex = 0;
                }
            }
        }
        applyActiveState();
    }

    private void onKeyDown(KeyboardEvent event) {
        int next = Keyboard.indexForKey(event.key, activeIndex, itemElements.size(), true);
        if (Keyboard.isEscape(event.key)) {
            event.preventDefault();
            open(false);
        } else if (next != activeIndex) {
            event.preventDefault();
            focusItem(next);
        } else if (Keyboard.isActivationKey(event.key)) {
            event.preventDefault();
            if (activeIndex >= 0 && activeIndex < focusableItems.size()) {
                toggle(focusableItems.get(activeIndex));
            }
        }
    }

    private void toggle(Item item) {
        if (item.disabled) {
            return;
        }
        if (values.contains(item.value)) {
            values.remove(item.value);
        } else {
            values.add(item.value);
        }
        updateTrigger();
        renderItems();
        for (ValueChangeListener<List<String>> listener : new ArrayList<>(valueChangeListeners)) {
            listener.onValueChange(values());
        }
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }

    private void focusItem(int index) {
        activeIndex = index;
        applyActiveState();
        if (index >= 0 && index < itemElements.size()) {
            FocusManager.focus(itemElements.get(index));
        } else if (content != null) {
            FocusManager.focus(content);
        }
    }

    private void applyActiveState() {
        for (int i = 0; i < itemElements.size(); i++) {
            HTMLElement element = itemElements.get(i);
            if (i == activeIndex) {
                element.className = element.className.contains(ACTIVE_ITEM_CLASSES) ? element.className : element.className + " " + ACTIVE_ITEM_CLASSES;
            } else {
                element.className = element.className.replace(ACTIVE_ITEM_CLASSES, "").replace("  ", " ").trim();
            }
        }
    }

    private void updateTrigger() {
        if (values.isEmpty()) {
            trigger.textContent = placeholder;
            return;
        }
        trigger.textContent = values.size() == 1 ? labelForValue(values.get(0)) : values.size() + " selected";
    }

    private String labelForValue(String value) {
        for (Item item : items) {
            if (item.value.equals(value)) {
                return item.label;
            }
        }
        return value;
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

    private static void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
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
