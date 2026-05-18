package org.gwtfusion.ui.component.carousel;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.button.ButtonSize;
import org.gwtfusion.ui.component.button.ButtonVariant;

public final class Carousel extends BaseComponent<Carousel> {
    public static final String ROOT_CLASSES = "grid gap-3";
    public static final String VIEWPORT_CLASSES = "overflow-hidden rounded-lg border";
    public static final String SLIDE_CLASSES = "min-h-40 p-6";
    public static final String CONTROLS_CLASSES = "flex items-center justify-between gap-2";

    private final HTMLElement viewport;
    private final HTMLElement controls;
    private final List<UiComponent> slides = new ArrayList<>();
    private int index;

    private Carousel(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        viewport = (HTMLElement) DomGlobal.document.createElement("div");
        viewport.className = VIEWPORT_CLASSES;
        controls = (HTMLElement) DomGlobal.document.createElement("div");
        controls.className = CONTROLS_CLASSES;
        controls.appendChild(Button.create("Previous").size(ButtonSize.SM).variant(ButtonVariant.OUTLINE).onClick(event -> previous()).element());
        controls.appendChild(Button.create("Next").size(ButtonSize.SM).variant(ButtonVariant.OUTLINE).onClick(event -> next()).element());
        element.appendChild(viewport);
        element.appendChild(controls);
    }

    public static Carousel create() {
        return new Carousel((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Carousel addSlide(UiComponent slide) {
        if (slide != null) {
            slides.add(slide);
            render();
        }
        return this;
    }

    public Carousel index(int index) {
        if (slides.isEmpty()) {
            this.index = 0;
        } else {
            this.index = Math.max(0, Math.min(slides.size() - 1, index));
        }
        render();
        return this;
    }

    public Carousel next() {
        return index(slides.isEmpty() ? 0 : (index + 1) % slides.size());
    }

    public Carousel previous() {
        return index(slides.isEmpty() ? 0 : (index + slides.size() - 1) % slides.size());
    }

    private void render() {
        clear(viewport);
        if (slides.isEmpty()) {
            return;
        }
        HTMLElement slide = (HTMLElement) DomGlobal.document.createElement("div");
        slide.className = SLIDE_CLASSES;
        slide.appendChild(slides.get(index).element());
        viewport.appendChild(slide);
    }

    private static void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
    }
}
