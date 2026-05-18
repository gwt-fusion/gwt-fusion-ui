package org.gwtfusion.ui.component.tabs;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.css.CssClasses;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Tabs extends BaseComponent<Tabs> {
    public static final String ROOT_CLASSES = "grid gap-2";
    public static final String LIST_CLASSES = "inline-flex h-9 items-center justify-center rounded-lg bg-muted p-1 text-muted-foreground";
    public static final String TRIGGER_CLASSES = "inline-flex items-center justify-center gap-2 whitespace-nowrap rounded-md px-3 py-1 text-sm font-medium transition-colors focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50";
    public static final String TRIGGER_ACTIVE_CLASSES = "bg-background text-foreground shadow";
    public static final String TRIGGER_INACTIVE_CLASSES = "hover:bg-background hover:text-foreground";
    public static final String PANEL_CLASSES = "mt-2 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";

    private final HTMLElement list;
    private final List<Item> items = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private TabsOrientation orientation = TabsOrientation.HORIZONTAL;
    private TabsVariant variant = TabsVariant.DEFAULT;
    private String value;

    private Tabs(HTMLElement element) {
        super(element);
        classes(orientation.rootClasses());
        list = (HTMLElement) DomGlobal.document.createElement("div");
        list.className = CssClasses.join(orientation.listClasses(), variant.listClasses());
        list.setAttribute("role", "tablist");
        element.appendChild(list);
    }

    public static Tabs create() {
        return new Tabs((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Tabs addTab(String value, String label, UiComponent content) {
        return addTab(value, label, null, content, false);
    }

    public Tabs addTab(String value, String label, UiComponent content, boolean disabled) {
        return addTab(value, label, null, content, disabled);
    }

    public Tabs addTab(String value, String label, UiComponent icon, UiComponent content) {
        return addTab(value, label, icon, content, false);
    }

    public Tabs addTab(String value, String label, UiComponent icon, UiComponent content, boolean disabled) {
        String safeValue = value == null ? "" : value;
        HTMLElement trigger = (HTMLElement) DomGlobal.document.createElement("button");
        trigger.className = TRIGGER_CLASSES;
        trigger.setAttribute("type", "button");
        trigger.setAttribute("role", "tab");
        trigger.setAttribute("id", tabId(safeValue));
        trigger.setAttribute("aria-controls", panelId(safeValue));
        trigger.setAttribute("aria-disabled", String.valueOf(disabled));
        if (disabled) {
            trigger.setAttribute("disabled", "");
        }
        if (icon != null) {
            trigger.appendChild(icon.element());
        }
        HTMLElement labelElement = (HTMLElement) DomGlobal.document.createElement("span");
        labelElement.textContent = label == null ? "" : label;
        trigger.appendChild(labelElement);

        HTMLElement panel = (HTMLElement) DomGlobal.document.createElement("div");
        panel.className = PANEL_CLASSES;
        panel.setAttribute("role", "tabpanel");
        panel.setAttribute("id", panelId(safeValue));
        panel.setAttribute("aria-labelledby", tabId(safeValue));
        panel.appendChild(content.element());

        Item item = new Item(safeValue, trigger, panel, disabled);
        items.add(item);
        trigger.addEventListener("click", event -> {
            if (!item.disabled) {
                select(safeValue, true);
            }
        });
        trigger.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event, item));
        list.appendChild(trigger);
        element().appendChild(panel);

        if (value == null && !disabled) {
            select(safeValue, false);
        } else {
            applyItemState(item, false);
        }
        return this;
    }

    public Tabs value(String value) {
        select(value, false);
        return this;
    }

    public Tabs variant(TabsVariant variant) {
        removeClasses(this.variant.listClasses(), list);
        this.variant = variant == null ? TabsVariant.DEFAULT : variant;
        list.className = CssClasses.join(orientation.listClasses(), this.variant.listClasses());
        for (Item item : items) {
            applyItemState(item, item.value.equals(value()));
        }
        return this;
    }

    public Tabs orientation(TabsOrientation orientation) {
        removeClasses(this.orientation.rootClasses(), element());
        this.orientation = orientation == null ? TabsOrientation.HORIZONTAL : orientation;
        classes(this.orientation.rootClasses());
        list.className = CssClasses.join(this.orientation.listClasses(), variant.listClasses());
        list.setAttribute("aria-orientation", this.orientation == TabsOrientation.VERTICAL ? "vertical" : "horizontal");
        return this;
    }

    public Tabs disabled(String value, boolean disabled) {
        String safeValue = value == null ? "" : value;
        for (Item item : items) {
            if (item.value.equals(safeValue)) {
                item.disabled = disabled;
                item.trigger.setAttribute("aria-disabled", String.valueOf(disabled));
                if (disabled) {
                    item.trigger.setAttribute("disabled", "");
                    if (item.value.equals(value())) {
                        selectFirstEnabled(false);
                    }
                } else {
                    item.trigger.removeAttribute("disabled");
                    if (this.value == null) {
                        select(item.value, false);
                    }
                }
                break;
            }
        }
        return this;
    }

    public String value() {
        return value == null ? "" : value;
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    private void select(String nextValue, boolean notify) {
        String previous = value();
        String safeValue = nextValue == null ? "" : nextValue;
        Item selected = findItem(safeValue);
        if (selected == null || selected.disabled) {
            return;
        }
        value = safeValue;
        for (Item item : items) {
            if (item.value.equals(value) && item.disabled) {
                value = previous;
                return;
            }
            applyItemState(item, item.value.equals(value));
        }
        if (notify && !previous.equals(value)) {
            notifyValueChange();
        }
    }

    private void notifyValueChange() {
        for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
            listener.onValueChange(value());
        }
    }

    private void applyItemState(Item item, boolean active) {
        item.trigger.setAttribute("aria-selected", String.valueOf(active));
        item.trigger.setAttribute("tabindex", active ? "0" : "-1");
        item.trigger.setAttribute("data-state", active ? "active" : "inactive");
        item.panel.setAttribute("data-state", active ? "active" : "inactive");

        toggleClasses(item.trigger, allActiveClasses(), false);
        toggleClasses(item.trigger, allInactiveClasses(), false);
        toggleClasses(item.trigger, variant.activeTriggerClasses(), active);
        toggleClasses(item.trigger, variant.inactiveTriggerClasses(), !active);

        if (active) {
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
        String key = event.key;
        if ("ArrowRight".equals(key) || "ArrowDown".equals(key)) {
            event.preventDefault();
            focusAndSelect(nextEnabledIndex(index, 1));
        } else if ("ArrowLeft".equals(key) || "ArrowUp".equals(key)) {
            event.preventDefault();
            focusAndSelect(nextEnabledIndex(index, -1));
        } else if ("Home".equals(key)) {
            event.preventDefault();
            focusAndSelect(firstEnabledIndex());
        } else if ("End".equals(key)) {
            event.preventDefault();
            focusAndSelect(lastEnabledIndex());
        }
    }

    private void focusAndSelect(int index) {
        if (index < 0) {
            return;
        }
        Item item = items.get(index);
        select(item.value, true);
        item.trigger.focus();
    }

    private void selectFirstEnabled(boolean notify) {
        int index = firstEnabledIndex();
        if (index >= 0) {
            select(items.get(index).value, notify);
        } else {
            value = null;
            clearSelection();
        }
    }

    private void clearSelection() {
        for (Item item : items) {
            applyItemState(item, false);
        }
    }

    private Item findItem(String value) {
        for (Item item : items) {
            if (item.value.equals(value)) {
                return item;
            }
        }
        return null;
    }

    private int nextEnabledIndex(int index, int direction) {
        if (items.isEmpty()) {
            return -1;
        }
        int next = index;
        for (int i = 0; i < items.size(); i++) {
            next = (next + direction + items.size()) % items.size();
            if (!items.get(next).disabled) {
                return next;
            }
        }
        return -1;
    }

    private int firstEnabledIndex() {
        for (int i = 0; i < items.size(); i++) {
            if (!items.get(i).disabled) {
                return i;
            }
        }
        return -1;
    }

    private int lastEnabledIndex() {
        for (int i = items.size() - 1; i >= 0; i--) {
            if (!items.get(i).disabled) {
                return i;
            }
        }
        return -1;
    }

    private String allActiveClasses() {
        return CssClasses.join(TRIGGER_ACTIVE_CLASSES, TabsVariant.LINE.activeTriggerClasses());
    }

    private String allInactiveClasses() {
        return CssClasses.join(TRIGGER_INACTIVE_CLASSES, TabsVariant.LINE.inactiveTriggerClasses());
    }

    private void toggleClasses(HTMLElement element, String classes, boolean add) {
        for (String className : CssClasses.tokens(classes)) {
            if (add) {
                element.classList.add(className);
            } else {
                element.classList.remove(className);
            }
        }
    }

    private void removeClasses(String classes, HTMLElement element) {
        for (String className : CssClasses.tokens(classes)) {
            element.classList.remove(className);
        }
    }

    private String tabId(String value) {
        return "tab-" + value;
    }

    private String panelId(String value) {
        return "panel-" + value;
    }

    private static final class Item {
        private final String value;
        private final HTMLElement trigger;
        private final HTMLElement panel;
        private boolean disabled;

        private Item(String value, HTMLElement trigger, HTMLElement panel, boolean disabled) {
            this.value = value;
            this.trigger = trigger;
            this.panel = panel;
            this.disabled = disabled;
        }
    }
}
