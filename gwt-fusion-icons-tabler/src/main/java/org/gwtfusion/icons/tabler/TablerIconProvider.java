package org.gwtfusion.icons.tabler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class TablerIconProvider implements IconProvider {
    @Override
    public Icon icon(String name) {
        return TablerIcons.icon(name);
    }

    public boolean supports(String name) {
        return SupportedNames.HOLDER.contains(name);
    }

    private static final class SupportedNames {
        private static final Set<String> HOLDER = names();

        private SupportedNames() {
        }

        private static Set<String> names() {
            Set<String> names = new HashSet<>();
            for (String name : TablerIcons.names()) {
                names.add(name);
            }
            return Collections.unmodifiableSet(names);
        }
    }
}
