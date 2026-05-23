package org.gwtfusion.ui.component.layout;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.aspectratio.AspectRatio;
import org.gwtfusion.ui.component.breadcrumb.Breadcrumb;
import org.gwtfusion.ui.component.buttongroup.ButtonGroup;
import org.gwtfusion.ui.component.card.Card;
import org.gwtfusion.ui.component.pagination.Pagination;
import org.gwtfusion.ui.component.scrollarea.ScrollArea;
import org.gwtfusion.ui.component.typography.Typography;
import org.junit.jupiter.api.Test;

class LayoutComponentsTest {
    @Test
    void lowRiskLayoutComponentsExposeStableClasses() {
        assertTrue(AspectRatio.ROOT_CLASSES.contains("relative"));
        assertTrue(ButtonGroup.BASE_CLASSES.contains("inline-flex"));
        assertTrue(Breadcrumb.LIST_CLASSES.contains("text-muted-foreground"));
        assertTrue(Card.ROOT_CLASSES.contains("bg-card"));
        assertTrue(Card.ROOT_CLASSES.contains("text-card-foreground"));
        assertTrue(Pagination.LINK_CLASSES.contains("hover:bg-accent"));
        assertTrue(ScrollArea.BASE_CLASSES.contains("overflow-auto"));
        assertTrue(Typography.H1_CLASSES.contains("text-4xl"));
    }
}
