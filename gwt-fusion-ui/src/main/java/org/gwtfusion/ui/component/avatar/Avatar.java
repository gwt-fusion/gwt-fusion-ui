package org.gwtfusion.ui.component.avatar;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLImageElement;
import org.gwtfusion.ui.BaseComponent;

public final class Avatar extends BaseComponent<Avatar> {
    public static final String ROOT_CLASSES = "relative inline-flex shrink-0 overflow-hidden rounded-full bg-muted";
    public static final String IMAGE_CLASSES = "aspect-square h-full w-full object-cover";
    public static final String FALLBACK_CLASSES = "flex h-full w-full items-center justify-center rounded-full bg-muted text-sm font-medium text-muted-foreground";

    private final HTMLImageElement image;
    private final HTMLElement fallback;
    private AvatarSize size;

    private Avatar(HTMLElement element, HTMLImageElement image, HTMLElement fallback) {
        super(element);
        this.image = image;
        this.fallback = fallback;
        classes(ROOT_CLASSES);
        image.className = IMAGE_CLASSES;
        fallback.className = FALLBACK_CLASSES;
        image.addEventListener("load", event -> showImage());
        image.addEventListener("error", event -> showFallback());
        showFallback();
        element.appendChild(image);
        element.appendChild(fallback);
        size(AvatarSize.MD);
    }

    public static Avatar create() {
        return new Avatar(
                (HTMLElement) DomGlobal.document.createElement("span"),
                (HTMLImageElement) DomGlobal.document.createElement("img"),
                (HTMLElement) DomGlobal.document.createElement("span"));
    }

    public Avatar src(String src) {
        image.src = src == null ? "" : src;
        showFallback();
        return this;
    }

    public Avatar alt(String alt) {
        image.alt = alt == null ? "" : alt;
        return this;
    }

    public Avatar fallback(String text) {
        fallback.textContent = text == null ? "" : text;
        return this;
    }

    public Avatar size(AvatarSize size) {
        if (this.size != null) {
            removeClasses(this.size.classes());
        }
        this.size = size == null ? AvatarSize.MD : size;
        return classes(this.size.classes());
    }

    private void showImage() {
        image.removeAttribute("hidden");
        fallback.setAttribute("hidden", "");
    }

    private void showFallback() {
        image.setAttribute("hidden", "");
        fallback.removeAttribute("hidden");
    }
}
