package org.gwtfusion.ui.component.accordion;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.KeyboardEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Accordion extends BaseComponent<Accordion> {
    public static final String ROOT_CLASSES = "grid w-full gap-1";
    public static final String ITEM_CLASSES = "border-b";
    public static final String TRIGGER_CLASSES = "flex w-full items-center justify-between py-4 text-left text-sm font-medium transition-colors hover:text-primary focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:cursor-not-allowed disabled:opacity-50";
    public static final String CONTENT_CLASSES = "pb-4 text-sm text-muted-foreground";

    private final List<Item> items = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private boolean multiple;

    private Accordion(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static Accordion create() {
        return new Accordion((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Accordion addItem(String value, String title, UiComponent content) {
        return addItem(value, title, content, false);
    }

    public Accordion addItem(String value, String title, UiComponent content, boolean disabled) {
        String safeValue = value == null ? "" : value;
        HTMLElement itemElement = (HTMLElement) DomGlobal.document.createElement("div");
        itemElement.className = ITEM_CLASSES;
        HTMLButtonElement trigger = (HTMLButtonElement) DomGlobal.document.createElement("button");
        trigger.type = "button";
        trigger.className = TRIGGER_CLASSES;
        trigger.textContent = title == null ? "" : title;
        trigger.setAttribute("id", triggerId(safeValue));
        trigger.setAttribute("aria-controls", panelId(safeValue));
        trigger.disabled = disabled;
        trigger.setAttribute("aria-disabled", String.valueOf(disabled));
        HTMLElement panel = (HTMLElement) DomGlobal.document.createElement("div");
        panel.className = CONTENT_CLASSES;
        panel.setAttribute("id", panelId(safeValue));
        panel.setAttribute("role", "region");
        panel.setAttribute("aria-labelledby", triggerId(safeValue));
        panel.appendChild(content.element());
        Item item = new Item(safeValue, trigger, panel, disabled);
        items.add(item);
        trigger.addEventListener("click", event -> toggle(item));
        trigger.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event, item));
        itemElement.appendChild(trigger);
        itemElement.appendChild(panel);
        element().appendChild(itemElement);
        apply(item, false);
        return this;
    }

    public Accordion multiple(boolean multiple) {
        this.multiple = multiple;
        if (!multiple) {
            boolean seenOpen = false;
            for (Item item : items) {
                boolean keepOpen = item.open && !seenOpen;
                apply(item, keepOpen);
                seenOpen = seenOpen || keepOpen;
            }
        }
        return this;
    }

    public Accordion multiple() {
        return multiple(true);
    }

    public Accordion disabled(String value, boolean disabled) {
        String safeValue = value == null ? "" : value;
        for (Item item : items) {
            if (item.value.equals(safeValue)) {
                item.disabled = disabled;
                item.trigger.disabled = disabled;
                item.trigger.setAttribute("aria-disabled", String.valueOf(disabled));
                if (disabled) {
                    apply(item, false);
                }
                break;
            }
        }
        return this;
    }

    public Accordion value(String value) {
        String safeValue = value == null ? "" : value;
        for (Item item : items) {
            apply(item, item.value.equals(safeValue));
        }
        return this;
    }

    public String value() {
        for (Item item : items) {
            if (item.open) {
                return item.value;
            }
        }
        return "";
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    private void toggle(Item selected) {
        if (selected.disabled) {
            return;
        }
        String previous = value();
        boolean nextOpen = !selected.open;
        if (multiple) {
            apply(selected, nextOpen);
        } else {
            for (Item item : items) {
                apply(item, item == selected && nextOpen);
            }
        }
        if (!previous.equals(value())) {
            notifyValueChange();
        }
    }

    private void notifyValueChange() {
        for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
            listener.onValueChange(value());
        }
    }

    private void apply(Item item, boolean open) {
        item.open = open;
        item.trigger.setAttribute("aria-expanded", String.valueOf(open));
        item.trigger.setAttribute("data-state", open ? "open" : "closed");
        item.panel.setAttribute("data-state", open ? "open" : "closed");
        if (open) {
            item.panel.removeAttribute("hidden");
        } else {
            item.panel.setAttribute("hidden", "");
        }
    }

    private void onKeyDown(KeyboardEvent event, Item current) {
        int index = items.indexOf(current);
        if (index < 0) {
            return;
        }
        if ("ArrowDown".equals(event.key)) {
            event.preventDefault();
            items.get((index + 1) % items.size()).trigger.focus();
        } else if ("ArrowUp".equals(event.key)) {
            event.preventDefault();
            items.get((index - 1 + items.size()) % items.size()).trigger.focus();
        } else if ("Home".equals(event.key)) {
            event.preventDefault();
            items.get(0).trigger.focus();
        } else if ("End".equals(event.key)) {
            event.preventDefault();
            items.get(items.size() - 1).trigger.focus();
        }
    }

    private String triggerId(String value) {
        return "accordion-trigger-" + value;
    }

    private String panelId(String value) {
        return "accordion-panel-" + value;
    }

    private static final class Item {
        private final String value;
        private final HTMLButtonElement trigger;
        private final HTMLElement panel;
        private boolean disabled;
        private boolean open;

        private Item(String value, HTMLButtonElement trigger, HTMLElement panel, boolean disabled) {
            this.value = value;
            this.trigger = trigger;
            this.panel = panel;
            this.disabled = disabled;
        }
    }
}
