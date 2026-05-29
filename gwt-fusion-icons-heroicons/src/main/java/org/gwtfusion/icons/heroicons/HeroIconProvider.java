package org.gwtfusion.icons.heroicons;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class HeroIconProvider implements IconProvider {
    private final HeroIconStyle style;

    public HeroIconProvider() {
        this(HeroIconStyle.OUTLINE);
    }

    public HeroIconProvider(HeroIconStyle style) {
        this.style = HeroIcons.normalize(style);
    }

    @Override
    public Icon icon(String name) {
        return HeroIcons.icon(name, style);
    }

    public HeroIconStyle style() {
        return style;
    }

    public boolean supports(String name) {
        return SupportedNames.namesFor(style).contains(name);
    }

    private static final class SupportedNames {
        private SupportedNames() {
        }

        private static Set<String> names(HeroIconStyle style) {
            Set<String> names = new HashSet<>();
            for (String name : HeroIcons.names(style)) {
                names.add(name);
            }
            return Collections.unmodifiableSet(names);
        }

        private static Set<String> namesFor(HeroIconStyle style) {
            switch (HeroIcons.normalize(style)) {
                case SOLID:
                    return SolidNames.HOLDER;
                case MINI:
                    return MiniNames.HOLDER;
                case MICRO:
                    return MicroNames.HOLDER;
                case OUTLINE:
                default:
                    return OutlineNames.HOLDER;
            }
        }

        private static final class OutlineNames {
            private static final Set<String> HOLDER = names(HeroIconStyle.OUTLINE);
        }

        private static final class SolidNames {
            private static final Set<String> HOLDER = names(HeroIconStyle.SOLID);
        }

        private static final class MiniNames {
            private static final Set<String> HOLDER = names(HeroIconStyle.MINI);
        }

        private static final class MicroNames {
            private static final Set<String> HOLDER = names(HeroIconStyle.MICRO);
        }
    }
}
