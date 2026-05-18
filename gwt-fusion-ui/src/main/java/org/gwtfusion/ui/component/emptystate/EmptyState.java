package org.gwtfusion.ui.component.emptystate;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class EmptyState extends BaseComponent<EmptyState> {
    public static final String ROOT_CLASSES = "flex min-h-48 flex-col items-center justify-center gap-3 rounded-lg border border-dashed p-8 text-center";
    public static final String TITLE_CLASSES = "text-lg font-semibold tracking-tight";
    public static final String DESCRIPTION_CLASSES = "max-w-sm text-sm text-muted-foreground";
    public static final String ACTIONS_CLASSES = "flex flex-wrap items-center justify-center gap-2 pt-2";

    private final HTMLElement title;
    private final HTMLElement description;
    private final HTMLElement actions;

    private EmptyState(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        title = (HTMLElement) DomGlobal.document.createElement("h3");
        title.className = TITLE_CLASSES;
        description = (HTMLElement) DomGlobal.document.createElement("p");
        description.className = DESCRIPTION_CLASSES;
        actions = (HTMLElement) DomGlobal.document.createElement("div");
        actions.className = ACTIONS_CLASSES;
        element.appendChild(title);
        element.appendChild(description);
        element.appendChild(actions);
    }

    public static EmptyState create() {
        return new EmptyState((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public EmptyState title(String title) {
        this.title.textContent = title == null ? "" : title;
        return this;
    }

    public EmptyState description(String description) {
        this.description.textContent = description == null ? "" : description;
        return this;
    }

    public EmptyState action(UiComponent action) {
        if (action != null) {
            actions.appendChild(action.element());
        }
        return this;
    }
}
