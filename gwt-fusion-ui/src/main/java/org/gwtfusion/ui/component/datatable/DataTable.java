package org.gwtfusion.ui.component.datatable;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.table.Table;

public final class DataTable extends BaseComponent<DataTable> {
    public static final String ROOT_CLASSES = "grid gap-3";
    public static final String EMPTY_CLASSES = "rounded-md border border-dashed p-6 text-center text-sm text-muted-foreground";

    private final HTMLElement tableSlot;
    private final HTMLElement empty;
    private String[] columns = new String[0];
    private String[][] rows = new String[0][0];
    private String filter = "";
    private int sortColumn = -1;
    private boolean sortDescending;

    private DataTable(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        tableSlot = (HTMLElement) DomGlobal.document.createElement("div");
        empty = (HTMLElement) DomGlobal.document.createElement("div");
        empty.className = EMPTY_CLASSES;
        empty.textContent = "No results.";
        element.appendChild(tableSlot);
        render();
    }

    public static DataTable create() {
        return new DataTable((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public DataTable columns(String... columns) {
        this.columns = columns == null ? new String[0] : columns;
        render();
        return this;
    }

    public DataTable rows(String[][] rows) {
        this.rows = normalizeRows(rows);
        render();
        return this;
    }

    public DataTable filter(String filter) {
        this.filter = filter == null ? "" : filter.toLowerCase();
        render();
        return this;
    }

    public DataTable sortBy(int columnIndex, boolean descending) {
        sortColumn = columnIndex;
        sortDescending = descending;
        render();
        return this;
    }

    public DataTable emptyText(String text) {
        empty.textContent = text == null ? "" : text;
        return this;
    }

    private void render() {
        rows = normalizeRows(rows);
        clear(tableSlot);
        Table table = Table.create();
        Table.Part headerRow = Table.row();
        for (String column : columns) {
            headerRow.add(Table.head(column));
        }
        table.add(Table.header().add(headerRow));
        Table.Part body = Table.body();
        List<String[]> visibleRows = new ArrayList<>();
        for (String[] row : rows) {
            if (matches(row)) {
                visibleRows.add(row);
            }
        }
        sort(visibleRows);
        int rendered = 0;
        for (String[] row : visibleRows) {
            Table.Part tableRow = Table.row();
            for (int i = 0; i < columns.length; i++) {
                tableRow.add(Table.cell(i < row.length ? row[i] : ""));
            }
            body.add(tableRow);
            rendered++;
        }
        table.add(body);
        tableSlot.appendChild(rendered == 0 ? empty : table.element());
    }

    private boolean matches(String[] row) {
        if (filter.isEmpty()) {
            return true;
        }
        for (String cell : row) {
            if (cell != null && cell.toLowerCase().contains(filter)) {
                return true;
            }
        }
        return false;
    }

    private void sort(List<String[]> visibleRows) {
        if (sortColumn < 0 || sortColumn >= columns.length) {
            return;
        }
        for (int i = 0; i < visibleRows.size(); i++) {
            for (int j = i + 1; j < visibleRows.size(); j++) {
                if (compare(visibleRows.get(i), visibleRows.get(j)) > 0) {
                    String[] current = visibleRows.get(i);
                    visibleRows.set(i, visibleRows.get(j));
                    visibleRows.set(j, current);
                }
            }
        }
    }

    private int compare(String[] left, String[] right) {
        String leftValue = sortColumn < left.length && left[sortColumn] != null ? left[sortColumn] : "";
        String rightValue = sortColumn < right.length && right[sortColumn] != null ? right[sortColumn] : "";
        int result = leftValue.compareToIgnoreCase(rightValue);
        return sortDescending ? -result : result;
    }

    private static String[][] normalizeRows(String[][] rows) {
        if (rows == null) {
            return new String[0][0];
        }
        String[][] normalized = new String[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] row = rows[i];
            if (row == null) {
                normalized[i] = new String[0];
                continue;
            }
            String[] normalizedRow = new String[row.length];
            for (int j = 0; j < row.length; j++) {
                normalizedRow[j] = row[j] == null ? "" : row[j];
            }
            normalized[i] = normalizedRow;
        }
        return normalized;
    }

    private static void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
    }
}
