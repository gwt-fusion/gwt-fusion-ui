package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class TablerIconProvider implements IconProvider {
    @Override
    public Icon icon(String name) {
        return TablerIcons.icon(name);
    }

    public boolean supports(String name) {
        for (String supportedName : TablerIcons.names()) {
            if (supportedName.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
