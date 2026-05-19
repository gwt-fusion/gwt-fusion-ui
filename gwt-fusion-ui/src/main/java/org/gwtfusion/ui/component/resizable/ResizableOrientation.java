package org.gwtfusion.ui.component.resizable;

public enum ResizableOrientation {
    HORIZONTAL("flex-row", "w-1 cursor-col-resize"),
    VERTICAL("flex-col", "h-1 cursor-row-resize");

    private final String containerClasses;
    private final String handleClasses;

    ResizableOrientation(String containerClasses, String handleClasses) {
        this.containerClasses = containerClasses;
        this.handleClasses = handleClasses;
    }

    public String containerClasses() {
        return containerClasses;
    }

    public String handleClasses() {
        return handleClasses;
    }
}
