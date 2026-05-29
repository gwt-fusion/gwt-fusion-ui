package org.gwtfusion.icons.phosphor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.icon.Icon;
import org.junit.jupiter.api.Test;

class PhosphorIconsTest {
    @Test
    void exposesDefaultRegularApiWithoutGlobalRegistration() throws NoSuchMethodException {
        assertNotNull(PhosphorIcons.provider());
        assertEquals(PhosphorWeight.REGULAR, new PhosphorIconProvider().weight());
        assertEquals(PhosphorIcons.REGULAR_COUNT, PhosphorIcons.COUNT);
        assertEquals(1512, PhosphorIcons.names().length);
        PhosphorIcons.class.getMethod("icon", String.class);
        PhosphorIcons.class.getMethod("magnifyingGlass");
        PhosphorIcons.class.getMethod("x");
        PhosphorIcons.class.getMethod("alarm", PhosphorWeight.class);
        assertEquals(Icon.class, PhosphorIcons.class.getMethod("icon", String.class).getReturnType());
    }

    @Test
    void exposesWeightSpecificNamesAndCounts() {
        assertEquals(1512, PhosphorIcons.THIN_COUNT);
        assertEquals(1512, PhosphorIcons.LIGHT_COUNT);
        assertEquals(1512, PhosphorIcons.REGULAR_COUNT);
        assertEquals(1512, PhosphorIcons.BOLD_COUNT);
        assertEquals(1512, PhosphorIcons.FILL_COUNT);
        assertEquals(1512, PhosphorIcons.DUOTONE_COUNT);
        assertEquals(PhosphorIcons.THIN_COUNT, PhosphorIcons.names(PhosphorWeight.THIN).length);
        assertEquals(PhosphorIcons.LIGHT_COUNT, PhosphorIcons.names(PhosphorWeight.LIGHT).length);
        assertEquals(PhosphorIcons.REGULAR_COUNT, PhosphorIcons.names(PhosphorWeight.REGULAR).length);
        assertEquals(PhosphorIcons.BOLD_COUNT, PhosphorIcons.names(PhosphorWeight.BOLD).length);
        assertEquals(PhosphorIcons.FILL_COUNT, PhosphorIcons.names(PhosphorWeight.FILL).length);
        assertEquals(PhosphorIcons.DUOTONE_COUNT, PhosphorIcons.names(PhosphorWeight.DUOTONE).length);
        assertEquals(PhosphorIcons.REGULAR_COUNT, PhosphorIcons.count(null));
    }

    @Test
    void providersUseTheirConfiguredWeight() {
        PhosphorIconProvider thin = new PhosphorIconProvider(PhosphorWeight.THIN);
        PhosphorIconProvider light = new PhosphorIconProvider(PhosphorWeight.LIGHT);
        PhosphorIconProvider regular = new PhosphorIconProvider(PhosphorWeight.REGULAR);
        PhosphorIconProvider bold = new PhosphorIconProvider(PhosphorWeight.BOLD);
        PhosphorIconProvider fill = new PhosphorIconProvider(PhosphorWeight.FILL);
        PhosphorIconProvider duotone = new PhosphorIconProvider(PhosphorWeight.DUOTONE);

        assertEquals(PhosphorWeight.THIN, thin.weight());
        assertEquals(PhosphorWeight.LIGHT, light.weight());
        assertEquals(PhosphorWeight.REGULAR, regular.weight());
        assertEquals(PhosphorWeight.BOLD, bold.weight());
        assertEquals(PhosphorWeight.FILL, fill.weight());
        assertEquals(PhosphorWeight.DUOTONE, duotone.weight());
        assertTrue(thin.supports("magnifying-glass"));
        assertTrue(light.supports("magnifying-glass"));
        assertTrue(regular.supports("magnifying-glass"));
        assertTrue(bold.supports("magnifying-glass"));
        assertTrue(fill.supports("magnifying-glass"));
        assertTrue(duotone.supports("magnifying-glass"));
        assertFalse(regular.supports("unknown"));
    }

    @Test
    void unknownIconsReturnNullWithoutDomCreation() {
        assertNull(PhosphorIcons.icon(null));
        assertNull(PhosphorIcons.icon(""));
        assertNull(PhosphorIcons.icon("unknown"));
        assertNull(PhosphorIcons.icon("unknown", PhosphorWeight.THIN));
        assertNull(PhosphorIcons.icon("unknown", PhosphorWeight.DUOTONE));
    }

    @Test
    void generatedNameListsReturnDefensiveCopies() {
        String[] names = PhosphorIcons.names(PhosphorWeight.REGULAR);
        names[0] = "mutated";

        assertEquals("acorn", PhosphorIcons.names(PhosphorWeight.REGULAR)[0]);
    }
}
