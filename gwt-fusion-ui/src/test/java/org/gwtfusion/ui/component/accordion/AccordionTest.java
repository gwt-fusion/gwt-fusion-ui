package org.gwtfusion.ui.component.accordion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AccordionTest {
    @Test
    void classesExposeAccordionStructureAndKeyboardTargets() {
        assertTrue(Accordion.ROOT_CLASSES.contains("grid"));
        assertTrue(Accordion.TRIGGER_CLASSES.contains("focus-visible:ring-ring"));
        assertTrue(Accordion.TRIGGER_CLASSES.contains("disabled:cursor-not-allowed"));
        assertTrue(Accordion.CONTENT_CLASSES.contains("text-muted-foreground"));
    }
}
