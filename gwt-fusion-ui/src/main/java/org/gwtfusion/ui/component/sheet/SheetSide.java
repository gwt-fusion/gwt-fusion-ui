package org.gwtfusion.ui.component.sheet;

import org.gwtfusion.ui.theme.Direction;
import org.gwtfusion.ui.theme.DirectionManager;

public enum SheetSide {
    TOP("inset-x-0 top-0 w-full border-b"),
    RIGHT("inset-y-0 right-0 h-full w-3/4 max-w-sm border-l"),
    BOTTOM("inset-x-0 bottom-0 w-full border-t"),
    LEFT("inset-y-0 left-0 h-full w-3/4 max-w-sm border-r"),
    START(""),
    END("");

    private final String classes;

    SheetSide(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes(DirectionManager.direction());
    }

    public String classes(Direction direction) {
        return resolve(direction).classes;
    }

    public SheetSide resolve() {
        return resolve(DirectionManager.direction());
    }

    public SheetSide resolve(Direction direction) {
        Direction resolvedDirection = direction == null ? Direction.LTR : direction;
        if (this == START) {
            return resolvedDirection == Direction.RTL ? RIGHT : LEFT;
        }
        if (this == END) {
            return resolvedDirection == Direction.RTL ? LEFT : RIGHT;
        }
        return this;
    }
}
