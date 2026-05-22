package org.gwtfusion.ui.component.card;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class Card extends BaseComponent<Card> {
    public static final String ROOT_CLASSES = "rounded-lg border bg-card text-card-foreground shadow-sm";

    private Card(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static Card create() {
        return new Card((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Card add(UiComponent component) {
        element().appendChild(component.element());
        return this;
    }

    public static Section header() {
        return Section.create("div", "flex flex-col space-y-1.5 p-6");
    }

    public static Section title(String text) {
        return Section.create("h3", "text-2xl font-semibold leading-none tracking-tight").text(text);
    }

    public static Section description(String text) {
        return Section.create("p", "text-sm text-muted-foreground").text(text);
    }

    public static Section content() {
        return Section.create("div", "p-6 pt-0");
    }

    public static Section footer() {
        return Section.create("div", "flex items-center p-6 pt-0");
    }

    public static final class Section extends BaseComponent<Section> {
        private Section(HTMLElement element, String classes) {
            super(element);
            classes(classes);
        }

        private static Section create(String tagName, String classes) {
            return new Section((HTMLElement) DomGlobal.document.createElement(tagName), classes);
        }

        public Section add(UiComponent component) {
            element().appendChild(component.element());
            return this;
        }
    }
}
