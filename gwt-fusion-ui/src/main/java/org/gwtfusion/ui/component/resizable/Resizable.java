package org.gwtfusion.ui.component.resizable;

import elemental2.dom.DOMRect;
import elemental2.dom.DomGlobal;
import elemental2.dom.EventListener;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import elemental2.dom.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Resizable extends BaseComponent<Resizable> {
    public static final String ROOT_CLASSES = "flex min-h-48 w-full overflow-hidden rounded-lg border border-border bg-background text-sm text-foreground";
    public static final String PANE_CLASSES = "min-w-0 min-h-0 overflow-auto p-4";
    public static final String HANDLE_BASE_CLASSES = "shrink-0 bg-border transition-colors hover:bg-ring focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    public static final double KEYBOARD_STEP = 5;

    private final HTMLElement firstPane;
    private final HTMLElement secondPane;
    private final HTMLElement handle;
    private final List<ValueChangeListener<Double>> valueChangeListeners = new ArrayList<>();

    private ResizableOrientation orientation = ResizableOrientation.HORIZONTAL;
    private ListenerRegistration dragCleanup = ListenerRegistration.empty();
    private double firstSize = 50;

    private Resizable(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        firstPane = (HTMLElement) DomGlobal.document.createElement("div");
        firstPane.className = PANE_CLASSES;
        secondPane = (HTMLElement) DomGlobal.document.createElement("div");
        secondPane.className = PANE_CLASSES;
        handle = (HTMLElement) DomGlobal.document.createElement("button");
        handle.setAttribute("type", "button");
        handle.setAttribute("aria-label", "Resize panels");
        handle.addEventListener("mousedown", event -> startDrag((MouseEvent) event));
        handle.addEventListener("keydown", event -> onHandleKeyDown((KeyboardEvent) event));
        element().appendChild(firstPane);
        element().appendChild(handle);
        element().appendChild(secondPane);
        applyOrientation();
        applySizes();
    }

    public static Resizable create() {
        return new Resizable((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Resizable orientation(ResizableOrientation orientation) {
        removeClasses(this.orientation.containerClasses());
        this.orientation = orientation == null ? ResizableOrientation.HORIZONTAL : orientation;
        applyOrientation();
        applySizes();
        return this;
    }

    public Resizable defaultSize(double percent) {
        firstSize = clamp(percent);
        applySizes();
        return this;
    }

    public double value() {
        return firstSize;
    }

    public Resizable first(UiComponent content) {
        if (content != null) {
            firstPane.appendChild(content.element());
        }
        return this;
    }

    public Resizable second(UiComponent content) {
        if (content != null) {
            secondPane.appendChild(content.element());
        }
        return this;
    }

    public ListenerRegistration onValueChange(ValueChangeListener<Double> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    private void applyOrientation() {
        classes(orientation.containerClasses());
        handle.className = HANDLE_BASE_CLASSES + " " + orientation.handleClasses();
        handle.setAttribute("role", "separator");
        handle.setAttribute("aria-orientation", orientation == ResizableOrientation.HORIZONTAL ? "vertical" : "horizontal");
    }

    private void applySizes() {
        firstPane.style.flexBasis = firstSize + "%";
        secondPane.style.flexBasis = (100 - firstSize) + "%";
        firstPane.style.flexGrow = 0;
        secondPane.style.flexGrow = 0;
        firstPane.style.flexShrink = 0;
        secondPane.style.flexShrink = 0;
        handle.setAttribute("aria-valuenow", String.valueOf((int) firstSize));
        handle.setAttribute("aria-valuemin", "10");
        handle.setAttribute("aria-valuemax", "90");
    }

    private void startDrag(MouseEvent event) {
        event.preventDefault();
        dragCleanup.remove();
        EventListener move = moveEvent -> drag((MouseEvent) moveEvent);
        EventListener up = upEvent -> dragCleanup.remove();
        DomGlobal.document.addEventListener("mousemove", move);
        DomGlobal.document.addEventListener("mouseup", up);
        dragCleanup = () -> {
            DomGlobal.document.removeEventListener("mousemove", move);
            DomGlobal.document.removeEventListener("mouseup", up);
            dragCleanup = ListenerRegistration.empty();
        };
    }

    private void drag(MouseEvent event) {
        DOMRect rect = element().getBoundingClientRect();
        double next;
        if (orientation == ResizableOrientation.HORIZONTAL) {
            next = ((event.clientX - rect.left) / rect.width) * 100;
        } else {
            next = ((event.clientY - rect.top) / rect.height) * 100;
        }
        resizeTo(next);
    }

    private void onHandleKeyDown(KeyboardEvent event) {
        String key = event.key;
        if ("Home".equals(key)) {
            handleKeyResize(event, 10);
        } else if ("End".equals(key)) {
            handleKeyResize(event, 90);
        } else if (orientation == ResizableOrientation.HORIZONTAL && "ArrowLeft".equals(key)) {
            handleKeyResize(event, firstSize - KEYBOARD_STEP);
        } else if (orientation == ResizableOrientation.HORIZONTAL && "ArrowRight".equals(key)) {
            handleKeyResize(event, firstSize + KEYBOARD_STEP);
        } else if (orientation == ResizableOrientation.VERTICAL && "ArrowUp".equals(key)) {
            handleKeyResize(event, firstSize - KEYBOARD_STEP);
        } else if (orientation == ResizableOrientation.VERTICAL && "ArrowDown".equals(key)) {
            handleKeyResize(event, firstSize + KEYBOARD_STEP);
        }
    }

    private void handleKeyResize(KeyboardEvent event, double next) {
        event.preventDefault();
        event.stopPropagation();
        resizeTo(next);
    }

    private void resizeTo(double next) {
        firstSize = clamp(next);
        applySizes();
        for (ValueChangeListener<Double> listener : new ArrayList<>(valueChangeListeners)) {
            listener.onValueChange(firstSize);
        }
    }

    public static double clamp(double value) {
        if (value < 10) {
            return 10;
        }
        if (value > 90) {
            return 90;
        }
        return value;
    }
}
