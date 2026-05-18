package org.gwtfusion.ui.component.calendar;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Calendar extends BaseComponent<Calendar> {
    public static final String ROOT_CLASSES = "grid w-72 gap-3 rounded-md border bg-background p-3 text-sm";
    public static final String HEADER_CLASSES = "flex items-center justify-between font-medium";
    public static final String WEEKDAYS_CLASSES = "grid grid-cols-7 gap-1 text-center text-xs text-muted-foreground";
    public static final String GRID_CLASSES = "grid grid-cols-7 gap-1";
    public static final String DAY_CLASSES = "inline-flex h-8 w-8 items-center justify-center rounded-md text-sm hover:bg-accent hover:text-accent-foreground";
    public static final String SELECTED_DAY_CLASSES = "bg-primary text-primary-foreground hover:bg-primary hover:text-primary-foreground";
    public static final String EMPTY_DAY_CLASSES = "h-8 w-8";

    private final HTMLElement header;
    private final HTMLElement weekdays;
    private final HTMLElement grid;
    private final List<ValueChangeListener<Integer>> daySelectListeners = new ArrayList<>();
    private String month = "";
    private int daysInMonth = 31;
    private int firstDayOffset;
    private int selectedDay;

    private Calendar(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        header = (HTMLElement) DomGlobal.document.createElement("div");
        header.className = HEADER_CLASSES;
        weekdays = (HTMLElement) DomGlobal.document.createElement("div");
        weekdays.className = WEEKDAYS_CLASSES;
        grid = (HTMLElement) DomGlobal.document.createElement("div");
        grid.className = GRID_CLASSES;
        element.appendChild(header);
        element.appendChild(weekdays);
        element.appendChild(grid);
        weekdays("Mo", "Tu", "We", "Th", "Fr", "Sa", "Su");
        render();
    }

    public static Calendar create() {
        return new Calendar((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Calendar month(String month) {
        this.month = month == null ? "" : month;
        render();
        return this;
    }

    public Calendar days(int daysInMonth, int firstDayOffset) {
        this.daysInMonth = Math.max(1, Math.min(31, daysInMonth));
        this.firstDayOffset = Math.max(0, Math.min(6, firstDayOffset));
        render();
        return this;
    }

    public Calendar selectedDay(int selectedDay) {
        this.selectedDay = selectedDay < 1 || selectedDay > daysInMonth ? 0 : selectedDay;
        render();
        return this;
    }

    public int selectedDay() {
        return selectedDay;
    }

    public Calendar weekdays(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
        clear(weekdays);
        addWeekday(monday);
        addWeekday(tuesday);
        addWeekday(wednesday);
        addWeekday(thursday);
        addWeekday(friday);
        addWeekday(saturday);
        addWeekday(sunday);
        return this;
    }

    public ListenerRegistration onDaySelect(ValueChangeListener<Integer> listener) {
        daySelectListeners.add(listener);
        return () -> daySelectListeners.remove(listener);
    }

    private void render() {
        header.textContent = month;
        clear(grid);
        for (int i = 0; i < firstDayOffset; i++) {
            HTMLElement empty = (HTMLElement) DomGlobal.document.createElement("span");
            empty.className = EMPTY_DAY_CLASSES;
            grid.appendChild(empty);
        }
        for (int day = 1; day <= daysInMonth; day++) {
            final int currentDay = day;
            HTMLButtonElement button = (HTMLButtonElement) DomGlobal.document.createElement("button");
            button.type = "button";
            button.className = day == selectedDay ? DAY_CLASSES + " " + SELECTED_DAY_CLASSES : DAY_CLASSES;
            button.textContent = String.valueOf(day);
            button.setAttribute("aria-pressed", String.valueOf(day == selectedDay));
            button.addEventListener("click", event -> {
                selectedDay(currentDay);
                for (ValueChangeListener<Integer> listener : new ArrayList<>(daySelectListeners)) {
                    listener.onValueChange(currentDay);
                }
            });
            grid.appendChild(button);
        }
    }

    private void addWeekday(String label) {
        HTMLElement weekday = (HTMLElement) DomGlobal.document.createElement("div");
        weekday.textContent = label == null ? "" : label;
        weekdays.appendChild(weekday);
    }

    private static void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
    }
}
