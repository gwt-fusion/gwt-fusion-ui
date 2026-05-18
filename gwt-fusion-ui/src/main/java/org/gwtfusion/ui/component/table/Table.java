package org.gwtfusion.ui.component.table;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class Table extends BaseComponent<Table> {
    public static final String WRAPPER_CLASSES = "relative w-full overflow-auto";
    public static final String TABLE_CLASSES = "w-full caption-bottom text-sm";
    public static final String HEADER_CLASSES = "border-b";
    public static final String BODY_CLASSES = "[&_tr:last-child]:border-0";
    public static final String FOOTER_CLASSES = "border-t bg-muted/50 font-medium";
    public static final String ROW_CLASSES = "border-b transition-colors hover:bg-muted/50";
    public static final String HEAD_CLASSES = "h-10 px-2 text-left align-middle font-medium text-muted-foreground";
    public static final String CELL_CLASSES = "p-2 align-middle";
    public static final String CAPTION_CLASSES = "mt-4 text-sm text-muted-foreground";

    private final HTMLElement table;

    private Table(HTMLElement wrapper, HTMLElement table) {
        super(wrapper);
        this.table = table;
        classes(WRAPPER_CLASSES);
        table.className = TABLE_CLASSES;
        wrapper.appendChild(table);
    }

    public static Table create() {
        return new Table(
                (HTMLElement) DomGlobal.document.createElement("div"),
                (HTMLElement) DomGlobal.document.createElement("table"));
    }

    public Table add(UiComponent component) {
        table.appendChild(component.element());
        return this;
    }

    public static Part caption(String text) {
        return Part.create("caption", CAPTION_CLASSES).text(text);
    }

    public static Part header() {
        return Part.create("thead", HEADER_CLASSES);
    }

    public static Part body() {
        return Part.create("tbody", BODY_CLASSES);
    }

    public static Part footer() {
        return Part.create("tfoot", FOOTER_CLASSES);
    }

    public static Part row() {
        return Part.create("tr", ROW_CLASSES);
    }

    public static Part head(String text) {
        return Part.create("th", HEAD_CLASSES).text(text);
    }

    public static Part cell(String text) {
        return Part.create("td", CELL_CLASSES).text(text);
    }

    public static Part cell(UiComponent component) {
        return Part.create("td", CELL_CLASSES).add(component);
    }

    public static final class Part extends BaseComponent<Part> {
        private Part(HTMLElement element, String classes) {
            super(element);
            classes(classes);
        }

        private static Part create(String tagName, String classes) {
            return new Part((HTMLElement) DomGlobal.document.createElement(tagName), classes);
        }

        public Part add(UiComponent component) {
            if (component != null) {
                element().appendChild(component.element());
            }
            return this;
        }
    }
}
