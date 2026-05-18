package org.gwtfusion.ui.component.toast;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.event.ListenerRegistration;

public final class ToastManager {
    public static final String VIEWPORT_CLASSES = "fixed right-4 top-4 z-50 grid max-h-screen w-auto gap-2 pointer-events-none";

    private HTMLElement viewport;

    private ToastManager() {
    }

    public static ToastManager create() {
        return new ToastManager();
    }

    public ListenerRegistration show(Toast toast) {
        if (toast == null) {
            return ListenerRegistration.empty();
        }
        HTMLElement viewport = viewport();
        viewport.appendChild(toast.element());
        double timer = toast.duration() > 0 ? DomGlobal.setTimeout(event -> remove(toast), toast.duration()) : -1;
        return () -> {
            if (timer >= 0) {
                DomGlobal.clearTimeout(timer);
            }
            remove(toast);
        };
    }

    public ListenerRegistration show(String title, String description) {
        return show(Toast.create().title(title).description(description));
    }

    private HTMLElement viewport() {
        if (viewport == null) {
            viewport = (HTMLElement) DomGlobal.document.createElement("div");
            viewport.className = VIEWPORT_CLASSES;
            viewport.setAttribute("aria-live", "polite");
            viewport.setAttribute("aria-relevant", "additions removals");
            DomGlobal.document.body.appendChild(viewport);
        }
        return viewport;
    }

    private void remove(Toast toast) {
        if (toast.element().parentNode != null) {
            toast.element().parentNode.removeChild(toast.element());
        }
    }
}
