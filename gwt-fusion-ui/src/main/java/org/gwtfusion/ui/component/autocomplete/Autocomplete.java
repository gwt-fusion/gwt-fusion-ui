package org.gwtfusion.ui.component.autocomplete;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLInputElement;
import elemental2.dom.KeyboardEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.command.CommandMenu;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.Keyboard;

public final class Autocomplete extends BaseComponent<Autocomplete> {
    public static final String ROOT_CLASSES = "relative grid w-64 gap-1";
    public static final String INPUT_CLASSES = "flex h-9 w-full rounded-md border border-input bg-transparent px-3 py-1 text-sm shadow-sm outline-none placeholder:text-muted-foreground focus-visible:ring-1 focus-visible:ring-ring";
    public static final String LIST_CLASSES = "absolute left-0 top-10 z-50 grid max-h-60 w-full gap-1 overflow-y-auto rounded-md border border-border bg-background p-1 text-sm text-foreground shadow-lg";
    public static final String ITEM_CLASSES = "w-full rounded px-2 py-1.5 text-left hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    public static final String ACTIVE_ITEM_CLASSES = "bg-accent text-accent-foreground";
    public static final String DISABLED_ITEM_CLASSES = "pointer-events-none opacity-50";
    public static final String EMPTY_CLASSES = "py-4 text-center text-sm text-muted-foreground";

    private final HTMLInputElement input;
    private final HTMLElement list;
    private final List<Item> items = new ArrayList<>();
    private final List<Item> visibleItems = new ArrayList<>();
    private final List<HTMLElement> visibleElements = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();

    private String emptyText = "No suggestions found.";
    private String value = "";
    private int activeIndex = -1;
    private boolean open;

    private Autocomplete(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        input = (HTMLInputElement) DomGlobal.document.createElement("input");
        input.className = INPUT_CLASSES;
        input.type = "search";
        input.setAttribute("aria-autocomplete", "list");
        input.addEventListener("input", event -> {
            if (open) {
                render();
            } else {
                open(true);
            }
        });
        input.addEventListener("focus", event -> open(true));
        input.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        element().appendChild(input);

        list = (HTMLElement) DomGlobal.document.createElement("div");
        list.className = LIST_CLASSES;
        list.setAttribute("role", "listbox");
        element().appendChild(list);
        render();
    }

    public static Autocomplete create() {
        return new Autocomplete((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Autocomplete placeholder(String placeholder) {
        input.placeholder = placeholder == null ? "" : placeholder;
        return this;
    }

    public Autocomplete emptyText(String emptyText) {
        this.emptyText = emptyText == null ? "" : emptyText;
        render();
        return this;
    }

    public Autocomplete item(String value, String label) {
        return item(value, label, "", false, null);
    }

    public Autocomplete item(String value, String label, Runnable onSelect) {
        return item(value, label, "", false, onSelect);
    }

    public Autocomplete item(String value, String label, String keywords, Runnable onSelect) {
        return item(value, label, keywords, false, onSelect);
    }

    public Autocomplete disabledItem(String value, String label) {
        return item(value, label, "", true, null);
    }

    public Autocomplete item(String value, String label, String keywords, boolean disabled, Runnable onSelect) {
        items.add(new Item(value == null ? "" : value, label == null ? "" : label, keywords == null ? "" : keywords, disabled, onSelect));
        render();
        return this;
    }

    public Autocomplete value(String value) {
        this.value = value == null ? "" : value;
        input.value = this.value;
        render();
        return this;
    }

    public String value() {
        return value;
    }

    public Autocomplete open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        render();
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

    private void render() {
        clear(list);
        visibleItems.clear();
        visibleElements.clear();
        activeIndex = -1;
        list.style.display = open ? "grid" : "none";
        if (!open) {
            return;
        }
        String query = input.value == null ? "" : input.value;
        boolean renderedItem = false;
        for (Item item : items) {
            if (!CommandMenu.matches(item.value, item.label, item.keywords, query)) {
                continue;
            }
            HTMLElement element = itemElement(item);
            list.appendChild(element);
            renderedItem = true;
            if (!item.disabled) {
                visibleItems.add(item);
                visibleElements.add(element);
                if (activeIndex < 0) {
                    activeIndex = 0;
                }
            }
        }
        if (!renderedItem) {
            HTMLElement empty = (HTMLElement) DomGlobal.document.createElement("div");
            empty.className = EMPTY_CLASSES;
            empty.textContent = emptyText;
            list.appendChild(empty);
        }
        applyActiveState();
    }

    private HTMLElement itemElement(Item item) {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement("button");
        element.className = item.disabled ? ITEM_CLASSES + " " + DISABLED_ITEM_CLASSES : ITEM_CLASSES;
        element.setAttribute("type", "button");
        element.setAttribute("role", "option");
        element.setAttribute("tabindex", "-1");
        element.setAttribute("aria-disabled", String.valueOf(item.disabled));
        element.textContent = item.label;
        if (item.disabled) {
            element.setAttribute("disabled", "");
        }
        element.addEventListener("click", event -> select(item));
        element.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        return element;
    }

    private void onKeyDown(KeyboardEvent event) {
        int next = Keyboard.indexForKey(event.key, activeIndex, visibleItems.size(), true);
        if (Keyboard.isEscape(event.key)) {
            event.preventDefault();
            open(false);
        } else if (next != activeIndex) {
            event.preventDefault();
            activeIndex = next;
            applyActiveState();
            if (activeIndex >= 0 && activeIndex < visibleElements.size()) {
                FocusManager.focus(visibleElements.get(activeIndex));
            }
        } else if (Keyboard.isActivationKey(event.key) && activeIndex >= 0 && activeIndex < visibleItems.size()) {
            event.preventDefault();
            select(visibleItems.get(activeIndex));
        }
    }

    private void select(Item item) {
        if (item.disabled) {
            return;
        }
        String previous = value;
        value = item.value;
        input.value = item.label;
        open(false);
        if (item.onSelect != null) {
            item.onSelect.run();
        }
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

    private void applyActiveState() {
        for (int i = 0; i < visibleElements.size(); i++) {
            HTMLElement element = visibleElements.get(i);
            element.className = i == activeIndex ? ITEM_CLASSES + " " + ACTIVE_ITEM_CLASSES : ITEM_CLASSES;
            element.setAttribute("aria-selected", String.valueOf(i == activeIndex));
        }
    }

    private static void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
    }

    private static final class Item {
        private final String value;
        private final String label;
        private final String keywords;
        private final boolean disabled;
        private final Runnable onSelect;

        private Item(String value, String label, String keywords, boolean disabled, Runnable onSelect) {
            this.value = value;
            this.label = label;
            this.keywords = keywords;
            this.disabled = disabled;
            this.onSelect = onSelect;
        }
    }
}
