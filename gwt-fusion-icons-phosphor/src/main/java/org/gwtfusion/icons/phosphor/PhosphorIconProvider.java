package org.gwtfusion.icons.phosphor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class PhosphorIconProvider implements IconProvider {
    private final PhosphorWeight weight;

    public PhosphorIconProvider() {
        this(PhosphorWeight.REGULAR);
    }

    public PhosphorIconProvider(PhosphorWeight weight) {
        this.weight = PhosphorIcons.normalize(weight);
    }

    @Override
    public Icon icon(String name) {
        return PhosphorIcons.icon(name, weight);
    }

    public PhosphorWeight weight() {
        return weight;
    }

    public boolean supports(String name) {
        return SupportedNames.namesFor(weight).contains(name);
    }

    private static final class SupportedNames {
        private SupportedNames() {
        }

        private static Set<String> names(PhosphorWeight weight) {
            Set<String> names = new HashSet<>();
            for (String name : PhosphorIcons.names(weight)) {
                names.add(name);
            }
            return Collections.unmodifiableSet(names);
        }

        private static Set<String> namesFor(PhosphorWeight weight) {
            switch (PhosphorIcons.normalize(weight)) {
                case THIN:
                    return ThinNames.HOLDER;
                case LIGHT:
                    return LightNames.HOLDER;
                case REGULAR:
                    return RegularNames.HOLDER;
                case BOLD:
                    return BoldNames.HOLDER;
                case FILL:
                    return FillNames.HOLDER;
                case DUOTONE:
                    return DuotoneNames.HOLDER;
                default:
                    return RegularNames.HOLDER;
            }
        }

        private static final class ThinNames {
            private static final Set<String> HOLDER = names(PhosphorWeight.THIN);
        }

        private static final class LightNames {
            private static final Set<String> HOLDER = names(PhosphorWeight.LIGHT);
        }

        private static final class RegularNames {
            private static final Set<String> HOLDER = names(PhosphorWeight.REGULAR);
        }

        private static final class BoldNames {
            private static final Set<String> HOLDER = names(PhosphorWeight.BOLD);
        }

        private static final class FillNames {
            private static final Set<String> HOLDER = names(PhosphorWeight.FILL);
        }

        private static final class DuotoneNames {
            private static final Set<String> HOLDER = names(PhosphorWeight.DUOTONE);
        }
    }
}
