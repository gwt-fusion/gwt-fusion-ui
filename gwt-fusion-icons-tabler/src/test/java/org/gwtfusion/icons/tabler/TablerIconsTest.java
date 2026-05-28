package org.gwtfusion.icons.tabler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.icon.Icon;
import org.junit.jupiter.api.Test;

class TablerIconsTest {
    @Test
    void exposesProviderAndSupportedNamesWithoutGlobalRegistration() throws NoSuchMethodException {
        assertNotNull(TablerIcons.provider());
        assertEquals(5093, TablerIcons.names().length);
        TablerIcons.class.getMethod("icon", String.class);
        TablerIcons.class.getMethod("search");
        TablerIcons.class.getMethod("settings");
        TablerIcons.class.getMethod("x");
        assertEquals(Icon.class, TablerIcons.class.getMethod("icon", String.class).getReturnType());
        assertTrue(new TablerIconProvider().supports("search"));
        assertTrue(new TablerIconProvider().supports("settings"));
        assertTrue(new TablerIconProvider().supports("a-b"));
        assertFalse(new TablerIconProvider().supports("unknown"));
        assertNull(TablerIcons.icon("unknown"));
    }

    @Test
    void generatedNameChunksReturnDefensiveCopies() {
        String[] names = TablerIconsC5.names();
        names[0] = "mutated";

        assertEquals("cursor-text", TablerIconsC5.names()[0]);
    }
}
