package org.gwtfusion.ui.component.datadisplay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.avatar.Avatar;
import org.gwtfusion.ui.component.avatar.AvatarSize;
import org.gwtfusion.ui.component.calendar.Calendar;
import org.gwtfusion.ui.component.carousel.Carousel;
import org.gwtfusion.ui.component.datatable.DataTable;
import org.gwtfusion.ui.component.item.Item;
import org.gwtfusion.ui.component.kbd.Kbd;
import org.gwtfusion.ui.component.table.Table;
import org.gwtfusion.ui.component.timeline.Timeline;
import org.junit.jupiter.api.Test;

class DataDisplayComponentsTest {
    @Test
    void dataDisplayComponentsExposeStableClasses() {
        assertTrue(Table.TABLE_CLASSES.contains("caption-bottom"));
        assertTrue(Table.ROW_CLASSES.contains("hover:bg-muted"));
        assertTrue(Avatar.ROOT_CLASSES.contains("rounded-full"));
        assertTrue(Kbd.BASE_CLASSES.contains("font-mono"));
        assertTrue(Item.ROOT_CLASSES.contains("flex"));
        assertTrue(Timeline.ITEM_CLASSES.contains("before:absolute"));
        assertTrue(Calendar.ROOT_CLASSES.contains("w-72"));
        assertTrue(DataTable.EMPTY_CLASSES.contains("border-dashed"));
        assertTrue(Carousel.VIEWPORT_CLASSES.contains("overflow-hidden"));
    }

    @Test
    void avatarSizesMapToStaticClasses() {
        assertEquals("h-8 w-8", AvatarSize.SM.classes());
        assertEquals("h-10 w-10", AvatarSize.MD.classes());
        assertEquals("h-14 w-14", AvatarSize.LG.classes());
    }
}
