package org.gwtfusion.ui.overlay;

import org.gwtfusion.ui.theme.Direction;
import org.gwtfusion.ui.theme.DirectionManager;

public enum OverlaySide {
    TOP,
    RIGHT,
    BOTTOM,
    LEFT,
    START,
    END;

    public OverlaySide resolve() {
        return resolve(DirectionManager.direction());
    }

    public OverlaySide resolve(Direction direction) {
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
