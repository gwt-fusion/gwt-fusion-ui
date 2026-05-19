package org.gwtfusion.ui.component.advanced;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.autocomplete.Autocomplete;
import org.gwtfusion.ui.component.command.CommandMenu;
import org.gwtfusion.ui.component.command.CommandPalette;
import org.gwtfusion.ui.component.combobox.Combobox;
import org.gwtfusion.ui.component.multiselect.MultiSelect;
import org.gwtfusion.ui.component.resizable.Resizable;
import org.gwtfusion.ui.component.resizable.ResizableOrientation;
import org.junit.jupiter.api.Test;

class AdvancedUxComponentsTest {
    @Test
    void commandMenuClassesExposeFilterableListStructure() {
        assertTrue(CommandMenu.ROOT_CLASSES.contains("border-border"));
        assertTrue(CommandMenu.INPUT_CLASSES.contains("focus-visible:ring-ring"));
        assertTrue(CommandMenu.LIST_CLASSES.contains("overflow-y-auto"));
        assertTrue(CommandMenu.ITEM_CLASSES.contains("hover:bg-accent"));
        assertTrue(CommandMenu.EMPTY_CLASSES.contains("text-muted-foreground"));
    }

    @Test
    void commandMenuMatchesValueLabelAndKeywords() {
        assertTrue(CommandMenu.matches("calendar", "Calendar", "date schedule", "cal"));
        assertTrue(CommandMenu.matches("profile", "Account", "user settings", "USER"));
        assertTrue(CommandMenu.matches("billing", "Invoices", "payments", "pay"));
        assertFalse(CommandMenu.matches("billing", "Invoices", "payments", "calendar"));
    }

    @Test
    void commandPaletteShortcutsMatchExactModifiers() {
        assertTrue(CommandPalette.matchesShortcut("Meta+K", "k", true, false, false, false));
        assertTrue(CommandPalette.matchesShortcut("Ctrl+Shift+P", "p", false, true, false, true));
        assertFalse(CommandPalette.matchesShortcut("Meta+K", "k", false, true, false, false));
        assertFalse(CommandPalette.matchesShortcut("Ctrl+K", "k", false, true, false, true));
    }

    @Test
    void advancedSelectClassesExposeOverlayContracts() {
        assertTrue(Combobox.TRIGGER_CLASSES.contains("border-input"));
        assertTrue(Combobox.CONTENT_CLASSES.contains("fixed"));
        assertTrue(Autocomplete.LIST_CLASSES.contains("absolute"));
        assertTrue(MultiSelect.CONTENT_CLASSES.contains("overflow-y-auto"));
        assertTrue(MultiSelect.CHECK_CLASSES.contains("w-4"));
    }

    @Test
    void resizableOrientationMapsToExpectedAxisClasses() {
        assertEquals("flex-row", ResizableOrientation.HORIZONTAL.containerClasses());
        assertTrue(ResizableOrientation.HORIZONTAL.handleClasses().contains("cursor-col-resize"));
        assertEquals("flex-col", ResizableOrientation.VERTICAL.containerClasses());
        assertTrue(ResizableOrientation.VERTICAL.handleClasses().contains("cursor-row-resize"));
    }

    @Test
    void resizableClampKeepsUsablePanelSizes() {
        assertEquals(10, Resizable.clamp(1));
        assertEquals(50, Resizable.clamp(50));
        assertEquals(90, Resizable.clamp(99));
    }
}
