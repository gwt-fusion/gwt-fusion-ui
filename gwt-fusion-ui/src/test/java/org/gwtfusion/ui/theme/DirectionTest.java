package org.gwtfusion.ui.theme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class DirectionTest {
    @Test
    void parsesDirectionAttributes() {
        assertEquals(Direction.LTR, Direction.fromAttribute("ltr"));
        assertEquals(Direction.RTL, Direction.fromAttribute(" RTL "));
        assertNull(Direction.fromAttribute("auto"));
    }

    @Test
    void detectsDirectionFromLanguageTags() {
        assertEquals(Direction.LTR, Direction.fromLanguageTag("de-DE"));
        assertEquals(Direction.RTL, Direction.fromLanguageTag("ar"));
        assertEquals(Direction.RTL, Direction.fromLanguageTag("he-IL"));
        assertEquals(Direction.RTL, Direction.fromLanguageTag("az-Arab"));
        assertEquals(Direction.LTR, Direction.fromLanguageTag("az-Latn"));
    }
}
