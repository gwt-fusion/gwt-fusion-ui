package org.gwtfusion.ui.component.timeline;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Timeline extends BaseComponent<Timeline> {
    public static final String ROOT_CLASSES = "grid gap-4";
    public static final String ITEM_CLASSES = "relative grid gap-1 pl-6 text-sm before:absolute before:left-1 before:top-2 before:h-full before:w-px before:bg-border last:before:hidden";
    public static final String DOT_CLASSES = "absolute left-0 top-1.5 h-2.5 w-2.5 rounded-full bg-primary ring-4 ring-background";
    public static final String TITLE_CLASSES = "font-medium leading-none";
    public static final String DESCRIPTION_CLASSES = "text-muted-foreground";
    public static final String META_CLASSES = "text-xs text-muted-foreground";

    private Timeline(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static Timeline create() {
        return new Timeline((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Timeline addItem(String title, String description, String meta) {
        HTMLElement item = (HTMLElement) DomGlobal.document.createElement("div");
        item.className = ITEM_CLASSES;
        HTMLElement dot = (HTMLElement) DomGlobal.document.createElement("span");
        dot.className = DOT_CLASSES;
        HTMLElement itemTitle = text("div", TITLE_CLASSES, title);
        HTMLElement itemDescription = text("div", DESCRIPTION_CLASSES, description);
        HTMLElement itemMeta = text("div", META_CLASSES, meta);
        item.appendChild(dot);
        item.appendChild(itemTitle);
        item.appendChild(itemDescription);
        item.appendChild(itemMeta);
        element().appendChild(item);
        return this;
    }

    private static HTMLElement text(String tagName, String classes, String text) {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement(tagName);
        element.className = classes;
        element.textContent = text == null ? "" : text;
        return element;
    }
}
