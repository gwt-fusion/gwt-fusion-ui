package org.gwtfusion.ui.component.command;

import elemental2.dom.DomGlobal;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
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
import org.gwtfusion.ui.overlay.Portal;

public final class CommandPalette extends BaseComponent<CommandPalette> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String LAYER_CLASSES = "fixed inset-0 z-50 flex items-start justify-center bg-background/80 p-4 pt-24";
    public static final String PANEL_CLASSES = "grid w-full max-w-xl gap-3 rounded-xl border border-border bg-background p-3 text-foreground shadow-lg";
    public static final String TITLE_CLASSES = "px-1 text-lg font-semibold tracking-tight";
    public static final String DESCRIPTION_CLASSES = "px-1 text-sm text-muted-foreground";

    private final IdGenerator ids = IdGenerator.create("command-palette");
    private final String paletteId = ids.next("content");
    private final String titleId = ids.next("title");
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private final List<String> shortcuts = new ArrayList<>();

    private CommandMenu menu = CommandMenu.create();
    private HTMLElement trigger;
    private HTMLElement layer;
    private HTMLElement previouslyFocused;
    private EventListener shortcutListener;
    private ListenerRegistration portal = ListenerRegistration.empty();
    private ListenerRegistration menuSelection = ListenerRegistration.empty();
    private ListenerRegistration shortcutRegistration = ListenerRegistration.empty();
    private String title = "Command Palette";
    private String description = "Search for a command or action.";
    private boolean open;

    private CommandPalette(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        attachMenuSelection();
    }

    public static CommandPalette create() {
        return new CommandPalette((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public CommandPalette trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        Aria.buttonPopup(this.trigger, "dialog", paletteId, open);
        this.trigger.addEventListener("click", event -> open(!open));
        element().appendChild(this.trigger);
        return this;
    }

    public CommandPalette title(String title) {
        this.title = title == null ? "" : title;
        return this;
    }

    public CommandPalette description(String description) {
        this.description = description == null ? "" : description;
        return this;
    }

    public CommandPalette menu(CommandMenu menu) {
        if (menu == null) {
            return this;
        }
        menuSelection.remove();
        this.menu = menu;
        attachMenuSelection();
        return this;
    }

    public CommandPalette placeholder(String placeholder) {
        menu.placeholder(placeholder);
        return this;
    }

    public CommandPalette emptyText(String emptyText) {
        menu.emptyText(emptyText);
        return this;
    }

    public CommandPalette group(String heading) {
        menu.group(heading);
        return this;
    }

    public CommandPalette separator() {
        menu.separator();
        return this;
    }

    public CommandPalette item(String value, String label, Runnable onSelect) {
        menu.item(value, label, onSelect);
        return this;
    }

    public CommandPalette item(String value, String label, UiComponent icon, Runnable onSelect) {
        menu.item(value, label, icon, onSelect);
        return this;
    }

    public CommandPalette item(String value, String label, UiComponent icon, String shortcut, Runnable onSelect) {
        menu.item(value, label, icon, shortcut, onSelect);
        return this;
    }

    public CommandPalette disabledItem(String value, String label) {
        menu.disabledItem(value, label);
        return this;
    }

    public CommandPalette shortcut(String shortcut) {
        if (shortcut != null && !shortcut.trim().isEmpty()) {
            shortcuts.add(shortcut.trim());
            ensureShortcutListener();
        }
        return this;
    }

    public CommandPalette defaultShortcut() {
        return shortcut("Meta+K").shortcut("Ctrl+K");
    }

    public CommandPalette open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        if (open) {
            mount();
        } else {
            unmount(true);
        }
        notifyOpenChange();
        return this;
    }

    public boolean open() {
        return open;
    }

    public String value() {
        return menu.value();
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        return menu.onValueChange(listener);
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        openChangeListeners.add(listener);
        return () -> openChangeListeners.remove(listener);
    }

    private void attachMenuSelection() {
        menuSelection = menu.onItemSelect(value -> open(false));
    }

    private void ensureShortcutListener() {
        shortcutRegistration.remove();
        shortcutListener = this::onDocumentKeyDown;
        DomGlobal.document.addEventListener("keydown", shortcutListener);
        shortcutRegistration = () -> DomGlobal.document.removeEventListener("keydown", shortcutListener);
    }

    private void onDocumentKeyDown(elemental2.dom.Event event) {
        KeyboardEvent keyEvent = (KeyboardEvent) event;
        for (String shortcut : shortcuts) {
            if (matchesShortcut(shortcut, keyEvent.key, keyEvent.metaKey, keyEvent.ctrlKey, keyEvent.altKey, keyEvent.shiftKey)) {
                keyEvent.preventDefault();
                open(!open);
                return;
            }
        }
    }

    private void mount() {
        previouslyFocused = FocusManager.activeElement();
        layer = (HTMLElement) DomGlobal.document.createElement("div");
        layer.className = LAYER_CLASSES;
        layer.setAttribute("tabindex", "-1");

        HTMLElement panel = (HTMLElement) DomGlobal.document.createElement("div");
        panel.className = PANEL_CLASSES;
        panel.id = paletteId;
        panel.setAttribute("role", "dialog");
        panel.setAttribute("aria-modal", "true");
        if (!title.isEmpty()) {
            panel.setAttribute("aria-labelledby", titleId);
            HTMLElement titleElement = (HTMLElement) DomGlobal.document.createElement("h2");
            titleElement.className = TITLE_CLASSES;
            titleElement.id = titleId;
            titleElement.textContent = title;
            panel.appendChild(titleElement);
        }
        if (!description.isEmpty()) {
            HTMLElement descriptionElement = (HTMLElement) DomGlobal.document.createElement("p");
            descriptionElement.className = DESCRIPTION_CLASSES;
            descriptionElement.textContent = description;
            panel.appendChild(descriptionElement);
        }
        panel.appendChild(menu.element());
        panel.addEventListener("keydown", event -> {
            KeyboardEvent keyEvent = (KeyboardEvent) event;
            if (Keyboard.isEscape(keyEvent.key)) {
                keyEvent.preventDefault();
                open(false);
            }
        });

        layer.appendChild(panel);
        layer.addEventListener("click", event -> {
            EventTarget target = event.target;
            if (target == layer) {
                open(false);
            }
        });
        portal = Portal.appendToBody(layer);
        if (trigger != null) {
            Aria.buttonPopup(trigger, "dialog", paletteId, true);
        }
        menu.focusInput();
    }

    private void unmount(boolean restoreFocus) {
        portal.remove();
        portal = ListenerRegistration.empty();
        layer = null;
        if (trigger != null) {
            Aria.buttonPopup(trigger, "dialog", paletteId, false);
        }
        if (restoreFocus) {
            FocusManager.focus(previouslyFocused != null ? previouslyFocused : trigger);
        }
        previouslyFocused = null;
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }

    public static boolean matchesShortcut(String shortcut, String key, boolean meta, boolean ctrl, boolean alt, boolean shift) {
        boolean needsMeta = false;
        boolean needsCtrl = false;
        boolean needsAlt = false;
        boolean needsShift = false;
        String neededKey = "";
        String[] parts = shortcut == null ? new String[0] : shortcut.split("\\+");
        for (String part : parts) {
            String token = part.trim().toLowerCase();
            if (token.equals("meta") || token.equals("cmd") || token.equals("command")) {
                needsMeta = true;
            } else if (token.equals("ctrl") || token.equals("control")) {
                needsCtrl = true;
            } else if (token.equals("alt") || token.equals("option")) {
                needsAlt = true;
            } else if (token.equals("shift")) {
                needsShift = true;
            } else {
                neededKey = token;
            }
        }
        return needsMeta == meta
                && needsCtrl == ctrl
                && needsAlt == alt
                && needsShift == shift
                && !neededKey.isEmpty()
                && neededKey.equals((key == null ? "" : key).toLowerCase());
    }
}
