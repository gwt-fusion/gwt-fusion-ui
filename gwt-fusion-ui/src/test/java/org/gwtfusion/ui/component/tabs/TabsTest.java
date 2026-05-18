package org.gwtfusion.ui.component.tabs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TabsTest {
    @Test
    void classesExposeTabStructureAndStates() {
        assertTrue(Tabs.ROOT_CLASSES.contains("grid"));
        assertTrue(Tabs.LIST_CLASSES.contains("tab") || Tabs.LIST_CLASSES.contains("inline-flex"));
        assertTrue(Tabs.TRIGGER_CLASSES.contains("focus-visible:ring-ring"));
        assertTrue(Tabs.TRIGGER_CLASSES.contains("disabled:pointer-events-none"));
        assertTrue(Tabs.TRIGGER_ACTIVE_CLASSES.contains("bg-background"));
        assertTrue(Tabs.TRIGGER_INACTIVE_CLASSES.contains("hover:bg-background"));
        assertTrue(Tabs.PANEL_CLASSES.contains("mt-2"));
        assertTrue(TabsVariant.LINE.listClasses().contains("border-b"));
        assertTrue(TabsOrientation.VERTICAL.rootClasses().contains("flex"));
    }
}
