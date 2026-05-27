package org.gwtfusion.ui.component.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.alert.Alert;
import org.gwtfusion.ui.component.alert.AlertVariant;
import org.gwtfusion.ui.component.badge.Badge;
import org.gwtfusion.ui.component.badge.BadgeVariant;
import org.gwtfusion.ui.component.input.Input;
import org.gwtfusion.ui.component.label.Label;
import org.gwtfusion.ui.component.separator.Separator;
import org.gwtfusion.ui.component.separator.SeparatorOrientation;
import org.junit.jupiter.api.Test;

class CoreComponentsTest {
    @Test
    void coreActionAndFeedbackComponentsExposeStableContracts() throws NoSuchMethodException {
        assertTrue(Badge.BASE_CLASSES.contains("inline-flex"));
        assertTrue(BadgeVariant.DEFAULT.classes().contains("bg-primary"));
        assertTrue(AlertVariant.DESTRUCTIVE.classes().contains("text-destructive"));

        Alert.class.getMethod("variant", AlertVariant.class);
        Badge.class.getMethod("variant", BadgeVariant.class);
    }

    @Test
    void coreFormAndLayoutComponentsExposeStableContracts() throws NoSuchMethodException {
        assertTrue(Input.BASE_CLASSES.contains("border-input"));
        assertTrue(Input.INVALID_CLASSES.contains("border-destructive"));
        assertEquals("h-px w-full", SeparatorOrientation.HORIZONTAL.classes());
        assertEquals("h-full w-px", SeparatorOrientation.VERTICAL.classes());

        Label.class.getMethod("forId", String.class);
        Separator.class.getMethod("orientation", SeparatorOrientation.class);
    }
}
