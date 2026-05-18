package org.gwtfusion.ui.component.overlay;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.gwtfusion.ui.component.alertdialog.AlertDialog;
import org.gwtfusion.ui.component.contextmenu.ContextMenu;
import org.gwtfusion.ui.component.dialog.Dialog;
import org.gwtfusion.ui.component.drawer.Drawer;
import org.gwtfusion.ui.component.dropdown.DropdownMenu;
import org.gwtfusion.ui.component.hovercard.HoverCard;
import org.gwtfusion.ui.component.popover.Popover;
import org.gwtfusion.ui.component.sheet.Sheet;
import org.gwtfusion.ui.component.sheet.SheetSide;
import org.gwtfusion.ui.component.tooltip.Tooltip;
import org.gwtfusion.ui.overlay.OverlaySide;
import org.junit.jupiter.api.Test;

class OverlayComponentsTest {
    @Test
    void dialogClassesExposeModalStructure() {
        assertTrue(Dialog.LAYER_CLASSES.contains("fixed"));
        assertTrue(Dialog.LAYER_CLASSES.contains("bg-background/80"));
        assertTrue(Dialog.PANEL_CLASSES.contains("bg-background"));
        assertTrue(Dialog.ACTIONS_CLASSES.contains("justify-end"));
    }

    @Test
    void alertDialogUsesDestructiveBorderContext() {
        assertTrue(AlertDialog.PANEL_CLASSES.contains("border-destructive/50"));
    }

    @Test
    void floatingOverlayClassesExposeRoleSpecificPresentation() {
        assertTrue(Popover.CONTENT_CLASSES.contains("border-border"));
        assertTrue(Popover.CONTENT_CLASSES.contains("fixed"));
        assertFalse(Popover.CONTENT_CLASSES.contains("left-1/2"));
        assertFalse(Popover.CONTENT_CLASSES.contains("-translate-x-1/2"));
        assertTrue(Tooltip.CONTENT_CLASSES.contains("bg-primary"));
        assertTrue(Tooltip.CONTENT_CLASSES.contains("fixed"));
        assertFalse(Tooltip.CONTENT_CLASSES.contains("left-1/2"));
        assertFalse(Tooltip.CONTENT_CLASSES.contains("-translate-x-1/2"));
        assertTrue(HoverCard.CONTENT_CLASSES.contains("w-80"));
        assertTrue(HoverCard.CONTENT_CLASSES.contains("fixed"));
        assertFalse(HoverCard.CONTENT_CLASSES.contains("left-1/2"));
        assertFalse(HoverCard.CONTENT_CLASSES.contains("-translate-x-1/2"));
    }

    @Test
    void overlaySidesExposeAllPlacements() {
        assertTrue(DropdownMenu.OFFSET > 0);
        assertTrue(Popover.OFFSET > 0);
        assertTrue(ContextMenu.OFFSET > 0);
        assertTrue(Tooltip.OFFSET > 0);
        assertTrue(HoverCard.OFFSET > 0);
        assertTrue(hasOverlaySide(OverlaySide.TOP));
        assertTrue(hasOverlaySide(OverlaySide.RIGHT));
        assertTrue(hasOverlaySide(OverlaySide.BOTTOM));
        assertTrue(hasOverlaySide(OverlaySide.LEFT));
    }

    @Test
    void menuClassesExposeKeyboardFocusableItems() {
        assertTrue(DropdownMenu.MENU_CLASSES.contains("fixed"));
        assertTrue(DropdownMenu.MENU_CLASSES.contains("min-w-40"));
        assertFalse(DropdownMenu.MENU_CLASSES.contains("left-1/2"));
        assertFalse(DropdownMenu.MENU_CLASSES.contains("-translate-x-1/2"));
        assertTrue(DropdownMenu.ITEM_CLASSES.contains("focus-visible:ring-ring"));
        assertTrue(ContextMenu.MENU_CLASSES.contains("fixed"));
        assertFalse(ContextMenu.MENU_CLASSES.contains("left-1/2"));
        assertTrue(ContextMenu.ITEM_CLASSES.contains("hover:bg-accent"));
        assertTrue(ContextMenu.LABEL_CLASSES.contains("text-muted-foreground"));
        assertTrue(ContextMenu.SEPARATOR_CLASSES.contains("bg-border"));
        assertTrue(ContextMenu.SHORTCUT_CLASSES.contains("ml-auto"));
        assertTrue(ContextMenu.DESTRUCTIVE_ITEM_CLASSES.contains("text-destructive"));
    }

    @Test
    void sheetSidesMapToExpectedEdges() {
        assertTrue(Sheet.PANEL_BASE_CLASSES.contains("fixed"));
        assertTrue(SheetSide.TOP.classes().contains("top-0"));
        assertTrue(SheetSide.RIGHT.classes().contains("right-0"));
        assertTrue(SheetSide.BOTTOM.classes().contains("bottom-0"));
        assertTrue(SheetSide.LEFT.classes().contains("left-0"));
    }

    @Test
    void drawerUsesBottomSheetPresentation() {
        assertTrue(Drawer.PANEL_CLASSES.contains("bottom-0"));
        assertTrue(Drawer.PANEL_CLASSES.contains("rounded-t-lg"));
    }

    private boolean hasOverlaySide(OverlaySide side) {
        for (OverlaySide value : OverlaySide.values()) {
            if (value == side) {
                return true;
            }
        }
        return false;
    }
}
