package org.gwtfusion.ui.component.toast;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class Toast extends BaseComponent<Toast> {
    public static final String BASE_CLASSES = "pointer-events-auto grid w-full min-w-72 max-w-sm gap-1 border text-sm transition-all";
    public static final String TITLE_CLASSES = "font-semibold leading-none tracking-tight";
    public static final String DESCRIPTION_CLASSES = "text-sm opacity-90";
    public static final String ACTIONS_CLASSES = "mt-2 flex flex-wrap gap-2";

    private final HTMLElement title;
    private final HTMLElement description;
    private final HTMLElement actions;
    private ToastVariant variant;
    private ToastStyle style;
    private int durationMs = 5000;

    private Toast(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
        attr("role", "status");
        attr("aria-live", "polite");
        title = (HTMLElement) DomGlobal.document.createElement("div");
        title.className = TITLE_CLASSES;
        description = (HTMLElement) DomGlobal.document.createElement("div");
        description.className = DESCRIPTION_CLASSES;
        actions = (HTMLElement) DomGlobal.document.createElement("div");
        actions.className = ACTIONS_CLASSES;
        element.appendChild(title);
        element.appendChild(description);
        element.appendChild(actions);
        variant(ToastVariant.DEFAULT);
        style(ToastStyle.DEFAULT);
    }

    public static Toast create() {
        return new Toast((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Toast title(String title) {
        this.title.textContent = title == null ? "" : title;
        return this;
    }

    public Toast description(String description) {
        this.description.textContent = description == null ? "" : description;
        return this;
    }

    public Toast action(UiComponent action) {
        if (action != null) {
            actions.appendChild(action.element());
        }
        return this;
    }

    public Toast variant(ToastVariant variant) {
        if (this.variant != null) {
            removeClasses(this.variant.classes());
        }
        this.variant = variant == null ? ToastVariant.DEFAULT : variant;
        return classes(this.variant.classes());
    }

    public Toast style(ToastStyle style) {
        if (this.style != null) {
            removeClasses(this.style.classes());
        }
        this.style = style == null ? ToastStyle.DEFAULT : style;
        return classes(this.style.classes());
    }

    public Toast duration(int durationMs) {
        this.durationMs = Math.max(0, durationMs);
        return this;
    }

    public int duration() {
        return durationMs;
    }
}
