package org.gwtfusion.icons.heroicons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.icon.Icon;
import org.junit.jupiter.api.Test;

class HeroIconsTest {
    @Test
    void exposesDefaultOutlineApiWithoutGlobalRegistration() throws NoSuchMethodException {
        assertNotNull(HeroIcons.provider());
        assertEquals(HeroIconStyle.OUTLINE, new HeroIconProvider().style());
        assertEquals(HeroIcons.OUTLINE_COUNT, HeroIcons.COUNT);
        assertEquals(324, HeroIcons.names().length);
        HeroIcons.class.getMethod("icon", String.class);
        HeroIcons.class.getMethod("magnifyingGlass");
        HeroIcons.class.getMethod("xMark");
        HeroIcons.class.getMethod("academicCap", HeroIconStyle.class);
        assertEquals(Icon.class, HeroIcons.class.getMethod("icon", String.class).getReturnType());
    }

    @Test
    void exposesStyleSpecificNamesAndCounts() {
        assertEquals(324, HeroIcons.OUTLINE_COUNT);
        assertEquals(324, HeroIcons.SOLID_COUNT);
        assertEquals(324, HeroIcons.MINI_COUNT);
        assertEquals(316, HeroIcons.MICRO_COUNT);
        assertEquals(HeroIcons.OUTLINE_COUNT, HeroIcons.names(HeroIconStyle.OUTLINE).length);
        assertEquals(HeroIcons.SOLID_COUNT, HeroIcons.names(HeroIconStyle.SOLID).length);
        assertEquals(HeroIcons.MINI_COUNT, HeroIcons.names(HeroIconStyle.MINI).length);
        assertEquals(HeroIcons.MICRO_COUNT, HeroIcons.names(HeroIconStyle.MICRO).length);
        assertEquals(HeroIcons.OUTLINE_COUNT, HeroIcons.count(null));
    }

    @Test
    void providersUseTheirConfiguredStyle() {
        HeroIconProvider outline = new HeroIconProvider(HeroIconStyle.OUTLINE);
        HeroIconProvider solid = new HeroIconProvider(HeroIconStyle.SOLID);
        HeroIconProvider mini = new HeroIconProvider(HeroIconStyle.MINI);
        HeroIconProvider micro = new HeroIconProvider(HeroIconStyle.MICRO);

        assertEquals(HeroIconStyle.OUTLINE, outline.style());
        assertEquals(HeroIconStyle.SOLID, solid.style());
        assertEquals(HeroIconStyle.MINI, mini.style());
        assertEquals(HeroIconStyle.MICRO, micro.style());
        assertTrue(outline.supports("magnifying-glass"));
        assertTrue(solid.supports("magnifying-glass"));
        assertTrue(mini.supports("magnifying-glass"));
        assertTrue(micro.supports("magnifying-glass"));
        assertFalse(outline.supports("unknown"));
        assertFalse(micro.supports("arrow-small-down"));
    }

    @Test
    void unknownIconsReturnNullWithoutDomCreation() {
        assertNull(HeroIcons.icon(null));
        assertNull(HeroIcons.icon(""));
        assertNull(HeroIcons.icon("unknown"));
        assertNull(HeroIcons.icon("unknown", HeroIconStyle.SOLID));
        assertNull(HeroIcons.icon("arrow-small-down", HeroIconStyle.MICRO));
    }

    @Test
    void generatedNameListsReturnDefensiveCopies() {
        String[] names = HeroIcons.names(HeroIconStyle.OUTLINE);
        names[0] = "mutated";

        assertEquals("academic-cap", HeroIcons.names(HeroIconStyle.OUTLINE)[0]);
    }
}
