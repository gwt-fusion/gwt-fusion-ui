package org.gwtfusion.ui.component.command;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLInputElement;
import elemental2.dom.KeyboardEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;

public final class CommandMenu extends BaseComponent<CommandMenu> {
    public static final String ROOT_CLASSES = "grid w-full gap-2 rounded-lg border border-border bg-background p-2 text-sm text-foreground shadow-sm";
    public static final String INPUT_CLASSES = "h-9 w-full rounded-md border border-input bg-transparent px-3 py-1 text-sm outline-none placeholder:text-muted-foreground focus-visible:ring-1 focus-visible:ring-ring";
    public static final String LIST_CLASSES = "grid max-h-72 gap-1 overflow-y-auto";
    public static final String GROUP_CLASSES = "grid gap-1";
    public static final String GROUP_HEADING_CLASSES = "px-2 py-1.5 text-xs font-medium text-muted-foreground";
    public static final String ITEM_CLASSES = "flex w-full items-center gap-2 rounded px-2 py-1.5 text-left hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    public static final String ACTIVE_ITEM_CLASSES = "bg-accent text-accent-foreground";
    public static final String DISABLED_ITEM_CLASSES = "pointer-events-none opacity-50";
    public static final String ICON_CLASSES = "inline-flex h-4 w-4 shrink-0 items-center justify-center";
    public static final String LABEL_CLASSES = "truncate";
    public static final String DESCRIPTION_CLASSES = "truncate text-xs text-muted-foreground";
    public static final String SHORTCUT_CLASSES = "ml-auto text-xs tracking-widest text-muted-foreground";
    public static final String SEPARATOR_CLASSES = "-mx-2 my-1 h-px bg-border";
    public static final String EMPTY_CLASSES = "py-6 text-center text-sm text-muted-foreground";

    private final IdGenerator ids = IdGenerator.create("command-menu");
    private final String inputId = ids.next("input");
    private final String listId = ids.next("list");
    private final HTMLInputElement input;
    private final HTMLElement list;
    private final List<Entry> entries = new ArrayList<>();
    private final List<Item> visibleItems = new ArrayList<>();
    private final List<HTMLElement> visibleElements = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private final List<ValueChangeListener<String>> itemSelectListeners = new ArrayList<>();

    private String currentGroup = "";
    private String emptyText = "No results found.";
    private String value = "";
    private int activeIndex = -1;

    private CommandMenu(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);

        input = (HTMLInputElement) DomGlobal.document.createElement("input");
        input.className = INPUT_CLASSES;
        input.id = inputId;
        input.type = "search";
        input.setAttribute("aria-controls", listId);
        input.setAttribute("aria-autocomplete", "list");
        input.addEventListener("input", event -> render());
        input.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        element().appendChild(input);

        list = (HTMLElement) DomGlobal.document.createElement("div");
        list.className = LIST_CLASSES;
        list.id = listId;
        list.setAttribute("role", "listbox");
        element().appendChild(list);

        render();
    }

    public static CommandMenu create() {
        return new CommandMenu((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public CommandMenu placeholder(String placeholder) {
        input.placeholder = placeholder == null ? "" : placeholder;
        return this;
    }

    public CommandMenu emptyText(String emptyText) {
        this.emptyText = emptyText == null ? "" : emptyText;
        render();
        return this;
    }

    public CommandMenu query(String query) {
        input.value = query == null ? "" : query;
        render();
        return this;
    }

    public String query() {
        return input.value;
    }

    public CommandMenu group(String heading) {
        currentGroup = heading == null ? "" : heading;
        return this;
    }

    public CommandMenu separator() {
        entries.add(Entry.separator());
        render();
        return this;
    }

    public CommandMenu item(String value, String label) {
        return item(value, label, null, "", "", false, null);
    }

    public CommandMenu item(String value, String label, Runnable onSelect) {
        return item(value, label, null, "", "", false, onSelect);
    }

    public CommandMenu item(String value, String label, UiComponent icon) {
        return item(value, label, icon, "", "", false, null);
    }

    public CommandMenu item(String value, String label, UiComponent icon, Runnable onSelect) {
        return item(value, label, icon, "", "", false, onSelect);
    }

    public CommandMenu item(String value, String label, UiComponent icon, String shortcut, Runnable onSelect) {
        return item(value, label, icon, shortcut, "", false, onSelect);
    }

    public CommandMenu item(String value, String label, UiComponent icon, String shortcut, String keywords, Runnable onSelect) {
        return item(value, label, icon, shortcut, keywords, false, onSelect);
    }

    public CommandMenu disabledItem(String value, String label) {
        return item(value, label, null, "", "", true, null);
    }

    public CommandMenu disabledItem(String value, String label, UiComponent icon, String shortcut) {
        return item(value, label, icon, shortcut, "", true, null);
    }

    public CommandMenu item(String value, String label, UiComponent icon, String shortcut, String keywords, boolean disabled, Runnable onSelect) {
        entries.add(Entry.item(new Item(currentGroup, value, label, icon, shortcut, keywords, disabled, onSelect)));
        render();
        return this;
    }

    public CommandMenu value(String value) {
        this.value = value == null ? "" : value;
        render();
        return this;
    }

    public String value() {
        return value;
    }

    public CommandMenu focusInput() {
        FocusManager.focus(input);
        return this;
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    public ListenerRegistration onItemSelect(ValueChangeListener<String> listener) {
        itemSelectListeners.add(listener);
        return () -> itemSelectListeners.remove(listener);
    }

    private void render() {
        clear(list);
        visibleItems.clear();
        visibleElements.clear();
        activeIndex = -1;

        String query = input.value == null ? "" : input.value;
        String lastGroup = null;
        HTMLElement groupElement = null;
        boolean previousWasVisibleItem = false;
        boolean renderedItem = false;

        for (Entry entry : entries) {
            if (entry.separator) {
                if (previousWasVisibleItem) {
                    list.appendChild(separatorElement());
                    previousWasVisibleItem = false;
                }
                continue;
            }
            Item item = entry.item;
            if (!matches(item.value, item.label, item.keywords, query)) {
                continue;
            }
            if (!same(lastGroup, item.group)) {
                groupElement = (HTMLElement) DomGlobal.document.createElement("div");
                groupElement.className = GROUP_CLASSES;
                if (!item.group.isEmpty()) {
                    HTMLElement heading = (HTMLElement) DomGlobal.document.createElement("div");
                    heading.className = GROUP_HEADING_CLASSES;
                    heading.textContent = item.group;
                    groupElement.appendChild(heading);
                }
                list.appendChild(groupElement);
                lastGroup = item.group;
            }
            HTMLElement itemElement = itemElement(item);
            groupElement.appendChild(itemElement);
            renderedItem = true;
            if (!item.disabled) {
                visibleItems.add(item);
                visibleElements.add(itemElement);
                if (activeIndex < 0) {
                    activeIndex = 0;
                }
            }
            previousWasVisibleItem = true;
        }

        if (!renderedItem) {
            clear(list);
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
        element.setAttribute("aria-selected", String.valueOf(item.value.equals(value)));
        element.setAttribute("aria-disabled", String.valueOf(item.disabled));
        if (item.disabled) {
            element.setAttribute("disabled", "");
        }
        if (item.icon != null) {
            HTMLElement icon = (HTMLElement) DomGlobal.document.createElement("span");
            icon.className = ICON_CLASSES;
            icon.appendChild(item.icon.element());
            element.appendChild(icon);
        }
        HTMLElement labelColumn = (HTMLElement) DomGlobal.document.createElement("span");
        labelColumn.className = "grid min-w-0 flex-1";
        HTMLElement label = (HTMLElement) DomGlobal.document.createElement("span");
        label.className = LABEL_CLASSES;
        label.textContent = item.label;
        labelColumn.appendChild(label);
        if (!item.keywords.isEmpty()) {
            HTMLElement description = (HTMLElement) DomGlobal.document.createElement("span");
            description.className = DESCRIPTION_CLASSES;
            description.textContent = item.keywords;
            labelColumn.appendChild(description);
        }
        element.appendChild(labelColumn);
        if (!item.shortcut.isEmpty()) {
            HTMLElement shortcut = (HTMLElement) DomGlobal.document.createElement("span");
            shortcut.className = SHORTCUT_CLASSES;
            shortcut.textContent = item.shortcut;
            element.appendChild(shortcut);
        }
        element.addEventListener("click", event -> select(item));
        element.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        return element;
    }

    private HTMLElement separatorElement() {
        HTMLElement separator = (HTMLElement) DomGlobal.document.createElement("div");
        separator.className = SEPARATOR_CLASSES;
        separator.setAttribute("role", "separator");
        return separator;
    }

    private void onKeyDown(KeyboardEvent event) {
        int next = Keyboard.indexForKey(event.key, activeIndex, visibleItems.size(), true);
        if (next != activeIndex) {
            event.preventDefault();
            activeIndex = next;
            applyActiveState();
            focusActiveItem();
        } else if (Keyboard.isActivationKey(event.key) && activeIndex >= 0 && activeIndex < visibleItems.size()) {
            event.preventDefault();
            select(visibleItems.get(activeIndex));
        }
    }

    private void focusActiveItem() {
        if (activeIndex >= 0 && activeIndex < visibleElements.size()) {
            FocusManager.focus(visibleElements.get(activeIndex));
        } else {
            FocusManager.focus(input);
        }
    }

    private void applyActiveState() {
        for (int i = 0; i < visibleElements.size(); i++) {
            HTMLElement element = visibleElements.get(i);
            boolean active = i == activeIndex;
            if (active) {
                element.className = withClass(element.className, ACTIVE_ITEM_CLASSES);
                element.setAttribute("aria-selected", "true");
            } else {
                element.className = removeClassText(element.className, ACTIVE_ITEM_CLASSES);
                element.setAttribute("aria-selected", String.valueOf(visibleItems.get(i).value.equals(value)));
            }
        }
    }

    private void select(Item item) {
        if (item.disabled) {
            return;
        }
        String previous = value;
        value = item.value;
        if (item.onSelect != null) {
            item.onSelect.run();
        }
        if (!previous.equals(value)) {
            for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
                listener.onValueChange(value);
            }
        }
        for (ValueChangeListener<String> listener : new ArrayList<>(itemSelectListeners)) {
            listener.onValueChange(value);
        }
        render();
    }

    public static boolean matches(String value, String label, String keywords, String query) {
        String safeQuery = safe(query).trim().toLowerCase();
        if (safeQuery.isEmpty()) {
            return true;
        }
        return safe(value).toLowerCase().contains(safeQuery)
                || safe(label).toLowerCase().contains(safeQuery)
                || safe(keywords).toLowerCase().contains(safeQuery);
    }

    private static String safe(String value) {
        return value == null ? "" : value;
    }

    private static boolean same(String left, String right) {
        return safe(left).equals(safe(right));
    }

    private static void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
    }

    private static String withClass(String className, String add) {
        return className.contains(add) ? className : className + " " + add;
    }

    private static String removeClassText(String className, String remove) {
        return className.replace(remove, "").replace("  ", " ").trim();
    }

    private static final class Entry {
        private final Item item;
        private final boolean separator;

        private Entry(Item item, boolean separator) {
            this.item = item;
            this.separator = separator;
        }

        private static Entry item(Item item) {
            return new Entry(item, false);
        }

        private static Entry separator() {
            return new Entry(null, true);
        }
    }

    private static final class Item {
        private final String group;
        private final String value;
        private final String label;
        private final UiComponent icon;
        private final String shortcut;
        private final String keywords;
        private final boolean disabled;
        private final Runnable onSelect;

        private Item(String group, String value, String label, UiComponent icon, String shortcut, String keywords, boolean disabled, Runnable onSelect) {
            this.group = safe(group);
            this.value = safe(value);
            this.label = safe(label);
            this.icon = icon;
            this.shortcut = safe(shortcut);
            this.keywords = safe(keywords);
            this.disabled = disabled;
            this.onSelect = onSelect;
        }
    }
}
