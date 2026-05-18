package org.gwtfusion.ui.component.item;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class Item extends BaseComponent<Item> {
    public static final String ROOT_CLASSES = "flex items-center gap-3 rounded-lg border p-3 text-sm";
    public static final String MEDIA_CLASSES = "flex shrink-0 items-center justify-center";
    public static final String CONTENT_CLASSES = "grid min-w-0 flex-1 gap-1";
    public static final String TITLE_CLASSES = "truncate font-medium leading-none";
    public static final String DESCRIPTION_CLASSES = "truncate text-muted-foreground";
    public static final String ACTIONS_CLASSES = "flex shrink-0 items-center gap-2";

    private final HTMLElement media;
    private final HTMLElement content;
    private final HTMLElement title;
    private final HTMLElement description;
    private final HTMLElement actions;

    private Item(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        media = child("div", MEDIA_CLASSES);
        content = child("div", CONTENT_CLASSES);
        title = child("div", TITLE_CLASSES);
        description = child("div", DESCRIPTION_CLASSES);
        actions = child("div", ACTIONS_CLASSES);
        content.appendChild(title);
        content.appendChild(description);
        element.appendChild(media);
        element.appendChild(content);
        element.appendChild(actions);
    }

    public static Item create() {
        return new Item((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Item media(UiComponent component) {
        append(media, component);
        return this;
    }

    public Item title(String title) {
        this.title.textContent = title == null ? "" : title;
        return this;
    }

    public Item description(String description) {
        this.description.textContent = description == null ? "" : description;
        return this;
    }

    public Item action(UiComponent component) {
        append(actions, component);
        return this;
    }

    private static HTMLElement child(String tagName, String classes) {
        HTMLElement child = (HTMLElement) DomGlobal.document.createElement(tagName);
        child.className = classes;
        return child;
    }

    private static void append(HTMLElement target, UiComponent component) {
        if (component != null) {
            target.appendChild(component.element());
        }
    }
}
