package org.gwtfusion.ui.overlay;

public final class Keyboard {
    public static final String ARROW_DOWN = "ArrowDown";
    public static final String ARROW_LEFT = "ArrowLeft";
    public static final String ARROW_RIGHT = "ArrowRight";
    public static final String ARROW_UP = "ArrowUp";
    public static final String END = "End";
    public static final String ENTER = "Enter";
    public static final String ESCAPE = "Escape";
    public static final String HOME = "Home";
    public static final String SPACE = " ";

    private Keyboard() {
    }

    public static boolean isEscape(String key) {
        return ESCAPE.equals(key);
    }

    public static boolean isActivationKey(String key) {
        return ENTER.equals(key) || SPACE.equals(key);
    }

    public static boolean isArrowKey(String key) {
        return ARROW_DOWN.equals(key) || ARROW_LEFT.equals(key) || ARROW_RIGHT.equals(key) || ARROW_UP.equals(key);
    }

    public static int nextIndex(int current, int size) {
        if (size <= 0) {
            return -1;
        }
        if (current < 0) {
            return 0;
        }
        if (current >= size) {
            return 0;
        }
        return (normalize(current, size) + 1) % size;
    }

    public static int previousIndex(int current, int size) {
        if (size <= 0) {
            return -1;
        }
        if (current < 0) {
            return size - 1;
        }
        if (current >= size) {
            return size - 1;
        }
        return (normalize(current, size) - 1 + size) % size;
    }

    public static int indexForKey(String key, int current, int size, boolean vertical) {
        return indexForKey(key, current, size, vertical, false);
    }

    public static int indexForKey(String key, int current, int size, boolean vertical, boolean rtl) {
        if (size <= 0) {
            return -1;
        }
        if (HOME.equals(key)) {
            return 0;
        }
        if (END.equals(key)) {
            return size - 1;
        }
        if (ARROW_DOWN.equals(key) || (!vertical && ARROW_RIGHT.equals(key) && !rtl) || (!vertical && ARROW_LEFT.equals(key) && rtl)) {
            return nextIndex(current, size);
        }
        if (ARROW_UP.equals(key) || (!vertical && ARROW_LEFT.equals(key) && !rtl) || (!vertical && ARROW_RIGHT.equals(key) && rtl)) {
            return previousIndex(current, size);
        }
        return normalize(current, size);
    }

    private static int normalize(int current, int size) {
        if (current < 0) {
            return 0;
        }
        if (current >= size) {
            return size - 1;
        }
        return current;
    }
}
