package org.gwtfusion.ui.overlay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.theme.Direction;
import org.junit.jupiter.api.Test;

class OverlayUtilitiesTest {
    @Test
    void idGeneratorSanitizesPartsAndIncrements() {
        IdGenerator generator = IdGenerator.create("Menu Trigger!");

        assertEquals("menu-trigger-panel-1", generator.next("Panel"));
        assertEquals("menu-trigger-option-item-2", generator.next("Option Item"));
        assertEquals(2, generator.current());
    }

    @Test
    void idGeneratorFallsBackForBlankValues() {
        IdGenerator generator = IdGenerator.create(null);

        assertEquals("gfu-id-1", generator.next(null));
        assertEquals("id", IdGenerator.sanitize("#$%"));
    }

    @Test
    void keyboardIdentifiesCommonKeys() {
        assertTrue(Keyboard.isEscape(Keyboard.ESCAPE));
        assertTrue(Keyboard.isActivationKey(Keyboard.ENTER));
        assertTrue(Keyboard.isActivationKey(Keyboard.SPACE));
        assertTrue(Keyboard.isArrowKey(Keyboard.ARROW_DOWN));
        assertFalse(Keyboard.isArrowKey(Keyboard.ENTER));
    }

    @Test
    void keyboardNavigationWrapsAndNormalizesIndexes() {
        assertEquals(-1, Keyboard.nextIndex(0, 0));
        assertEquals(0, Keyboard.nextIndex(-10, 3));
        assertEquals(0, Keyboard.nextIndex(10, 3));
        assertEquals(0, Keyboard.nextIndex(2, 3));
        assertEquals(2, Keyboard.previousIndex(-10, 3));
        assertEquals(2, Keyboard.previousIndex(10, 3));
        assertEquals(2, Keyboard.previousIndex(0, 3));
        assertEquals(1, Keyboard.previousIndex(2, 3));
    }

    @Test
    void keyboardIndexForKeyHonorsOrientation() {
        assertEquals(0, Keyboard.indexForKey(Keyboard.HOME, 2, 4, true));
        assertEquals(3, Keyboard.indexForKey(Keyboard.END, 1, 4, true));
        assertEquals(2, Keyboard.indexForKey(Keyboard.ARROW_DOWN, 1, 4, true));
        assertEquals(0, Keyboard.indexForKey(Keyboard.ARROW_UP, 1, 4, true));
        assertEquals(2, Keyboard.indexForKey(Keyboard.ARROW_RIGHT, 1, 4, false));
        assertEquals(0, Keyboard.indexForKey(Keyboard.ARROW_LEFT, 1, 4, false));
        assertEquals(1, Keyboard.indexForKey(Keyboard.ARROW_RIGHT, 1, 4, true));
        assertEquals(0, Keyboard.indexForKey(Keyboard.ARROW_RIGHT, 1, 4, false, true));
        assertEquals(2, Keyboard.indexForKey(Keyboard.ARROW_LEFT, 1, 4, false, true));
    }

    @Test
    void overlaySidesResolveLogicalEdges() {
        assertEquals(OverlaySide.LEFT, OverlaySide.START.resolve(Direction.LTR));
        assertEquals(OverlaySide.RIGHT, OverlaySide.START.resolve(Direction.RTL));
        assertEquals(OverlaySide.RIGHT, OverlaySide.END.resolve(Direction.LTR));
        assertEquals(OverlaySide.LEFT, OverlaySide.END.resolve(Direction.RTL));
    }

    @Test
    void focusManagerExposesIndexHelpers() {
        assertEquals(-1, FocusManager.firstIndex(0));
        assertEquals(0, FocusManager.firstIndex(3));
        assertEquals(-1, FocusManager.lastIndex(0));
        assertEquals(2, FocusManager.lastIndex(3));
        assertEquals(0, FocusManager.nextIndex(2, 3));
        assertEquals(2, FocusManager.previousIndex(0, 3));
    }

    @Test
    void ariaStringHelpersUseDomAttributeValues() {
        assertEquals("true", Aria.expanded(true));
        assertEquals("false", Aria.expanded(false));
        assertEquals("true", Aria.modal(true));
        assertEquals("false", Aria.selected(false));
        assertEquals("panel-id", Aria.controls("panel-id"));
        assertEquals("label-id", Aria.labelledBy("label-id"));
        assertNull(Aria.controls(""));
        assertNull(Aria.labelledBy(null));
    }

    @Test
    void overlayLayerKeepsStaticTailwindClassesVisible() {
        assertTrue(OverlayLayer.ROOT_CLASSES.contains("fixed"));
        assertTrue(OverlayLayer.ROOT_CLASSES.contains("z-50"));
        assertTrue(OverlayLayer.ROOT_CLASSES.contains("pointer-events-none"));
        assertEquals("pointer-events-auto", OverlayLayer.SURFACE_CLASSES);
    }
}
