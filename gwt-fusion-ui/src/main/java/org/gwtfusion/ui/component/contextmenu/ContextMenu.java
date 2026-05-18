package org.gwtfusion.ui.component.contextmenu;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import elemental2.dom.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;
import org.gwtfusion.ui.overlay.OutsideClick;
import org.gwtfusion.ui.overlay.OverlaySide;
import org.gwtfusion.ui.overlay.Portal;

public final class ContextMenu extends BaseComponent<ContextMenu> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String MENU_CLASSES = "fixed z-50 grid min-w-40 gap-1 rounded-md border border-border bg-background p-1 text-sm text-foreground shadow-lg";
    public static final String ITEM_CLASSES = "flex w-full items-center gap-2 rounded px-2 py-1.5 text-left hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    public static final String LABEL_CLASSES = "px-2 py-1.5 text-xs font-medium text-muted-foreground";
    public static final String SEPARATOR_CLASSES = "-mx-1 my-1 h-px bg-border";
    public static final String SHORTCUT_CLASSES = "ml-auto text-xs tracking-widest text-muted-foreground";
    public static final String ICON_CLASSES = "inline-flex h-4 w-4 shrink-0 items-center justify-center";
    public static final String CHECK_CLASSES = "w-4 shrink-0 text-center text-xs";
    public static final String ITEM_LABEL_CLASSES = "truncate";
    public static final String DESTRUCTIVE_ITEM_CLASSES = "text-destructive hover:bg-destructive hover:text-destructive-foreground";
    public static final String SUBMENU_CLASSES = MENU_CLASSES + " min-w-40";
    public static final int OFFSET = 4;

    private final IdGenerator ids = IdGenerator.create("context-menu");
    private final String menuId = ids.next("content");
    private final List<Item> items = new ArrayList<>();
    private final List<HTMLElement> itemElements = new ArrayList<>();
    private final List<Item> focusableItems = new ArrayList<>();
    private final List<HTMLElement> submenuItemElements = new ArrayList<>();
    private final List<Item> submenuFocusableItems = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private HTMLElement menu;
    private HTMLElement submenu;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private String value = "";
    private double clientX;
    private double clientY;
    private OverlaySide side = OverlaySide.BOTTOM;
    private boolean open;

    private ContextMenu(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static ContextMenu create() {
        return new ContextMenu((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public ContextMenu target(UiComponent target) {
        if (target == null) {
            return this;
        }
        HTMLElement targetElement = target.element();
        targetElement.setAttribute("aria-haspopup", "menu");
        targetElement.setAttribute("aria-controls", menuId);
        targetElement.addEventListener("contextmenu", event -> {
            event.preventDefault();
            MouseEvent mouseEvent = (MouseEvent) event;
            clientX = mouseEvent.clientX;
            clientY = mouseEvent.clientY;
            if (open) {
                open(false);
            }
            open(true);
        });
        element().appendChild(targetElement);
        return this;
    }

    public ContextMenu addItem(String value, String label) {
        items.add(Item.action(value, label, null, "", false, null));
        return this;
    }

    public ContextMenu addItem(String value, String label, Runnable onSelect) {
        items.add(Item.action(value, label, null, "", false, onSelect));
        return this;
    }

    public ContextMenu addItem(String value, String label, UiComponent icon) {
        items.add(Item.action(value, label, icon, "", false, null));
        return this;
    }

    public ContextMenu addItem(String value, String label, UiComponent icon, Runnable onSelect) {
        items.add(Item.action(value, label, icon, "", false, onSelect));
        return this;
    }

    public ContextMenu addShortcutItem(String value, String label, String shortcut) {
        items.add(Item.action(value, label, null, shortcut, false, null));
        return this;
    }

    public ContextMenu addShortcutItem(String value, String label, String shortcut, Runnable onSelect) {
        items.add(Item.action(value, label, null, shortcut, false, onSelect));
        return this;
    }

    public ContextMenu addItem(String value, String label, UiComponent icon, String shortcut) {
        items.add(Item.action(value, label, icon, shortcut, false, null));
        return this;
    }

    public ContextMenu addItem(String value, String label, UiComponent icon, String shortcut, Runnable onSelect) {
        items.add(Item.action(value, label, icon, shortcut, false, onSelect));
        return this;
    }

    public ContextMenu addDestructiveItem(String value, String label) {
        items.add(Item.action(value, label, null, "", true, null));
        return this;
    }

    public ContextMenu addDestructiveItem(String value, String label, Runnable onSelect) {
        items.add(Item.action(value, label, null, "", true, onSelect));
        return this;
    }

    public ContextMenu addLabel(String label) {
        items.add(Item.label(label));
        return this;
    }

    public ContextMenu separator() {
        items.add(Item.separator());
        return this;
    }

    public ContextMenu addCheckboxItem(String value, String label, boolean checked) {
        items.add(Item.checkbox(value, label, checked, null));
        return this;
    }

    public ContextMenu addCheckboxItem(String value, String label, boolean checked, Runnable onSelect) {
        items.add(Item.checkbox(value, label, checked, onSelect));
        return this;
    }

    public ContextMenu addRadioItem(String group, String value, String label, boolean checked) {
        items.add(Item.radio(group, value, label, checked, null));
        return this;
    }

    public ContextMenu addRadioItem(String group, String value, String label, boolean checked, Runnable onSelect) {
        items.add(Item.radio(group, value, label, checked, onSelect));
        return this;
    }

    public ContextMenu addSubmenu(Submenu submenu) {
        if (submenu != null) {
            items.add(Item.submenu(submenu));
        }
        return this;
    }

    public static Submenu submenu(String label) {
        return new Submenu(label);
    }

    public ContextMenu side(OverlaySide side) {
        this.side = side == null ? OverlaySide.BOTTOM : side;
        return this;
    }

    public ContextMenu open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        if (open) {
            mount();
        } else {
            unmount();
        }
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

    private void mount() {
        itemElements.clear();
        focusableItems.clear();
        closeSubmenu();
        menu = (HTMLElement) DomGlobal.document.createElement("div");
        menu.className = MENU_CLASSES;
        menu.setAttribute("id", menuId);
        menu.setAttribute("role", "menu");
        menu.setAttribute("tabindex", "-1");
        for (Item item : items) {
            menu.appendChild(renderItem(item, itemElements, focusableItems));
        }
        menu.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        ListenerRegistration portal = Portal.appendToBody(menu);
        positionAtPointer();
        cleanup = ListenerRegistration.combine(OutsideClick.listen(menu, event -> open(false)), portal);
        focusItem(0);
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        closeSubmenu();
        itemElements.clear();
        focusableItems.clear();
        menu = null;
    }

    private void select(Item item) {
        if (item.type == ItemType.CHECKBOX) {
            item.checked = !item.checked;
        } else if (item.type == ItemType.RADIO) {
            selectRadio(items, item);
        }
        String previous = value;
        value = item.value;
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

    private void onKeyDown(KeyboardEvent event) {
        int current = focusedIndex();
        int next = Keyboard.indexForKey(event.key, current, itemElements.size(), true);
        if (Keyboard.isEscape(event.key)) {
            event.preventDefault();
            open(false);
        } else if ("ArrowRight".equals(event.key) && current >= 0 && current < focusableItems.size() && focusableItems.get(current).type == ItemType.SUBMENU) {
            event.preventDefault();
            openSubmenu(focusableItems.get(current), itemElements.get(current));
            focusSubmenuItem(0);
        } else if (next != current) {
            event.preventDefault();
            closeSubmenu();
            focusItem(next);
        } else if (Keyboard.isActivationKey(event.key) && current >= 0 && current < focusableItems.size()) {
            event.preventDefault();
            Item item = focusableItems.get(current);
            if (item.type == ItemType.SUBMENU) {
                openSubmenu(item, itemElements.get(current));
                focusSubmenuItem(0);
            } else {
                select(item);
            }
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

    private int focusedSubmenuIndex() {
        HTMLElement active = FocusManager.activeElement();
        for (int i = 0; i < submenuItemElements.size(); i++) {
            if (submenuItemElements.get(i) == active) {
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

    private void focusSubmenuItem(int index) {
        if (index >= 0 && index < submenuItemElements.size()) {
            FocusManager.focus(submenuItemElements.get(index));
        } else if (submenu != null) {
            FocusManager.focus(submenu);
        }
    }

    private HTMLElement renderItem(Item item, List<HTMLElement> focusableElements, List<Item> focusableItems) {
        if (item.type == ItemType.SEPARATOR) {
            HTMLElement separator = (HTMLElement) DomGlobal.document.createElement("div");
            separator.className = SEPARATOR_CLASSES;
            separator.setAttribute("role", "separator");
            return separator;
        }
        if (item.type == ItemType.LABEL) {
            HTMLElement label = (HTMLElement) DomGlobal.document.createElement("div");
            label.className = LABEL_CLASSES;
            label.textContent = item.label;
            return label;
        }

        HTMLElement itemElement = (HTMLElement) DomGlobal.document.createElement("button");
        itemElement.className = item.destructive ? ITEM_CLASSES + " " + DESTRUCTIVE_ITEM_CLASSES : ITEM_CLASSES;
        itemElement.setAttribute("type", "button");
        itemElement.setAttribute("role", roleFor(item));
        itemElement.setAttribute("tabindex", "-1");
        if (item.type == ItemType.CHECKBOX || item.type == ItemType.RADIO) {
            itemElement.setAttribute("aria-checked", String.valueOf(item.checked));
        }

        HTMLElement label = (HTMLElement) DomGlobal.document.createElement("span");
        label.className = "inline-flex min-w-0 flex-1 items-center gap-2";
        if (item.type == ItemType.CHECKBOX || item.type == ItemType.RADIO) {
            HTMLElement check = (HTMLElement) DomGlobal.document.createElement("span");
            check.className = CHECK_CLASSES;
            check.textContent = item.checked ? "*" : "";
            label.appendChild(check);
        }
        if (item.icon != null) {
            HTMLElement icon = (HTMLElement) DomGlobal.document.createElement("span");
            icon.className = ICON_CLASSES;
            icon.appendChild(item.icon.element());
            label.appendChild(icon);
        }
        HTMLElement text = (HTMLElement) DomGlobal.document.createElement("span");
        text.className = ITEM_LABEL_CLASSES;
        text.textContent = item.label;
        label.appendChild(text);
        itemElement.appendChild(label);

        HTMLElement shortcut = (HTMLElement) DomGlobal.document.createElement("span");
        shortcut.className = SHORTCUT_CLASSES;
        shortcut.textContent = item.type == ItemType.SUBMENU ? ">" : item.shortcut;
        itemElement.appendChild(shortcut);

        if (item.type == ItemType.SUBMENU) {
            itemElement.addEventListener("mouseenter", event -> openSubmenu(item, itemElement));
            itemElement.addEventListener("focus", event -> openSubmenu(item, itemElement));
            itemElement.addEventListener("click", event -> openSubmenu(item, itemElement));
        } else {
            itemElement.addEventListener("click", event -> select(item));
        }
        focusableElements.add(itemElement);
        focusableItems.add(item);
        return itemElement;
    }

    private String roleFor(Item item) {
        if (item.type == ItemType.CHECKBOX) {
            return "menuitemcheckbox";
        }
        if (item.type == ItemType.RADIO) {
            return "menuitemradio";
        }
        return "menuitem";
    }

    private void openSubmenu(Item item, HTMLElement trigger) {
        if (menu == null || item.submenuItems.isEmpty()) {
            return;
        }
        closeSubmenu();
        submenuItemElements.clear();
        submenuFocusableItems.clear();
        submenu = (HTMLElement) DomGlobal.document.createElement("div");
        submenu.className = SUBMENU_CLASSES;
        submenu.setAttribute("role", "menu");
        submenu.setAttribute("tabindex", "-1");
        for (Item submenuItem : item.submenuItems) {
            submenu.appendChild(renderItem(submenuItem, submenuItemElements, submenuFocusableItems));
        }
        submenu.addEventListener("keydown", event -> onSubmenuKeyDown((KeyboardEvent) event, trigger));
        menu.appendChild(submenu);
        elemental2.dom.DOMRect rect = trigger.getBoundingClientRect();
        submenu.style.left = rect.right + OFFSET + "px";
        submenu.style.top = rect.top + "px";
    }

    private void closeSubmenu() {
        if (submenu != null) {
            submenu.remove();
            submenu = null;
        }
        submenuItemElements.clear();
        submenuFocusableItems.clear();
    }

    private void onSubmenuKeyDown(KeyboardEvent event, HTMLElement trigger) {
        int current = focusedSubmenuIndex();
        int next = Keyboard.indexForKey(event.key, current, submenuItemElements.size(), true);
        if (Keyboard.isEscape(event.key)) {
            event.preventDefault();
            open(false);
        } else if ("ArrowLeft".equals(event.key)) {
            event.preventDefault();
            closeSubmenu();
            FocusManager.focus(trigger);
        } else if (next != current) {
            event.preventDefault();
            focusSubmenuItem(next);
        } else if (Keyboard.isActivationKey(event.key) && current >= 0 && current < submenuFocusableItems.size()) {
            event.preventDefault();
            select(submenuFocusableItems.get(current));
        }
    }

    private void selectRadio(List<Item> scope, Item selected) {
        for (Item item : scope) {
            if (item.type == ItemType.RADIO && item.group.equals(selected.group)) {
                item.checked = item == selected;
            }
            if (!item.submenuItems.isEmpty()) {
                selectRadio(item.submenuItems, selected);
            }
        }
    }

    private void positionAtPointer() {
        if (menu == null) {
            return;
        }
        double left;
        double top;
        if (side == OverlaySide.RIGHT) {
            left = clientX + OFFSET;
            top = clientY;
        } else if (side == OverlaySide.TOP) {
            left = clientX;
            top = clientY - menu.offsetHeight - OFFSET;
        } else if (side == OverlaySide.LEFT) {
            left = clientX - menu.offsetWidth - OFFSET;
            top = clientY;
        } else {
            left = clientX;
            top = clientY + OFFSET;
        }
        menu.style.left = left + "px";
        menu.style.top = top + "px";
    }

    public static final class Submenu {
        private final String label;
        private final List<Item> items = new ArrayList<>();

        private Submenu(String label) {
            this.label = label == null ? "" : label;
        }

        public Submenu addItem(String value, String label) {
            items.add(Item.action(value, label, null, "", false, null));
            return this;
        }

        public Submenu addItem(String value, String label, Runnable onSelect) {
            items.add(Item.action(value, label, null, "", false, onSelect));
            return this;
        }

        public Submenu addShortcutItem(String value, String label, String shortcut) {
            items.add(Item.action(value, label, null, shortcut, false, null));
            return this;
        }

        public Submenu addShortcutItem(String value, String label, String shortcut, Runnable onSelect) {
            items.add(Item.action(value, label, null, shortcut, false, onSelect));
            return this;
        }

        public Submenu addDestructiveItem(String value, String label) {
            items.add(Item.action(value, label, null, "", true, null));
            return this;
        }

        public Submenu addDestructiveItem(String value, String label, Runnable onSelect) {
            items.add(Item.action(value, label, null, "", true, onSelect));
            return this;
        }
    }

    private enum ItemType {
        ACTION,
        LABEL,
        SEPARATOR,
        CHECKBOX,
        RADIO,
        SUBMENU
    }

    private static final class Item {
        private final String value;
        private final String label;
        private final UiComponent icon;
        private final String shortcut;
        private final String group;
        private final ItemType type;
        private final boolean destructive;
        private final Runnable onSelect;
        private final List<Item> submenuItems = new ArrayList<>();
        private boolean checked;

        private Item(String value, String label, UiComponent icon, String shortcut, String group, ItemType type, boolean checked, boolean destructive, Runnable onSelect) {
            this.value = value == null ? "" : value;
            this.label = label == null ? "" : label;
            this.icon = icon;
            this.shortcut = shortcut == null ? "" : shortcut;
            this.group = group == null ? "" : group;
            this.type = type;
            this.checked = checked;
            this.destructive = destructive;
            this.onSelect = onSelect;
        }

        private static Item action(String value, String label, UiComponent icon, String shortcut, boolean destructive, Runnable onSelect) {
            return new Item(value, label, icon, shortcut, "", ItemType.ACTION, false, destructive, onSelect);
        }

        private static Item label(String label) {
            return new Item("", label, null, "", "", ItemType.LABEL, false, false, null);
        }

        private static Item separator() {
            return new Item("", "", null, "", "", ItemType.SEPARATOR, false, false, null);
        }

        private static Item checkbox(String value, String label, boolean checked, Runnable onSelect) {
            return new Item(value, label, null, "", "", ItemType.CHECKBOX, checked, false, onSelect);
        }

        private static Item radio(String group, String value, String label, boolean checked, Runnable onSelect) {
            return new Item(value, label, null, "", group, ItemType.RADIO, checked, false, onSelect);
        }

        private static Item submenu(Submenu submenu) {
            Item item = new Item("", submenu.label, null, ">", "", ItemType.SUBMENU, false, false, null);
            item.submenuItems.addAll(submenu.items);
            return item;
        }
    }
}
