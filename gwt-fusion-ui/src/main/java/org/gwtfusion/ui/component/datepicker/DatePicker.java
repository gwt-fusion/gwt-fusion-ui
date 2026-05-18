package org.gwtfusion.ui.component.datepicker;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.button.ButtonVariant;
import org.gwtfusion.ui.component.calendar.Calendar;
import org.gwtfusion.ui.component.popover.Popover;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.OverlaySide;

public final class DatePicker extends BaseComponent<DatePicker> {
    public static final String ROOT_CLASSES = "inline-flex";

    private final Button trigger;
    private final Calendar calendar;
    private final Popover popover;
    private String month = "";

    private DatePicker(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        trigger = Button.create("Pick a date").variant(ButtonVariant.OUTLINE);
        calendar = Calendar.create();
        popover = Popover.create().side(OverlaySide.BOTTOM).trigger(trigger).content(calendar);
        calendar.onDaySelect(day -> {
            trigger.text(month.isEmpty() ? String.valueOf(day) : month + " " + day);
            popover.open(false);
        });
        element.appendChild(popover.element());
    }

    public static DatePicker create() {
        return new DatePicker((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public DatePicker month(String month) {
        this.month = month == null ? "" : month;
        calendar.month(this.month);
        return this;
    }

    public DatePicker days(int daysInMonth, int firstDayOffset) {
        calendar.days(daysInMonth, firstDayOffset);
        return this;
    }

    public DatePicker selectedDay(int selectedDay) {
        calendar.selectedDay(selectedDay);
        int actualSelectedDay = calendar.selectedDay();
        trigger.text(month.isEmpty() ? String.valueOf(actualSelectedDay) : month + " " + actualSelectedDay);
        return this;
    }

    public ListenerRegistration onDaySelect(ValueChangeListener<Integer> listener) {
        return calendar.onDaySelect(listener);
    }
}
