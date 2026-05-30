# Icons

`gwt-fusion-ui` provides an SVG-first icon foundation under `org.gwtfusion.ui.component.icon`.

`Icon` is a `UiComponent`. Its root is a lightweight `span` so it fits the existing `HTMLElement element()` contract, and the rendered graphic is an inline SVG child.

Concrete icon sets are provided by separate modules. Lucide icons live in `gwt-fusion-icons-lucide`, Tabler outline icons live in `gwt-fusion-icons-tabler`, Heroicons live in `gwt-fusion-icons-heroicons`, and Phosphor icons live in `gwt-fusion-icons-phosphor`.

## Basic Usage

```java
import org.gwtfusion.icons.lucide.LucideIcons;
import org.gwtfusion.icons.tabler.TablerIcons;
import org.gwtfusion.icons.heroicons.HeroIconStyle;
import org.gwtfusion.icons.heroicons.HeroIcons;
import org.gwtfusion.icons.phosphor.PhosphorIcons;
import org.gwtfusion.icons.phosphor.PhosphorWeight;

LucideIcons.check()
    .variant(IconVariant.PRIMARY)
    .ariaLabel("Confirmed");

TablerIcons.settings()
    .variant(IconVariant.MUTED)
    .ariaLabel("Settings");

HeroIcons.magnifyingGlass(HeroIconStyle.OUTLINE)
    .variant(IconVariant.PRIMARY)
    .ariaLabel("Search");

PhosphorIcons.magnifyingGlass(PhosphorWeight.REGULAR)
    .variant(IconVariant.PRIMARY)
    .ariaLabel("Search");
```

Use `decorative()` when the icon is only visual and nearby text already describes the action or state.

```java
LucideIcons.search().decorative();
```

## Sizing And Stroke

```java
LucideIcons.x()
    .size(IconSize.LG)
    .strokeWidth(1.5);
```

`size(int)` is available for exact pixel sizes.

## Button Composition

```java
Button.create("Save")
    .icon(LucideIcons.check());

Button.create("")
    .size(ButtonSize.ICON)
    .icon(LucideIcons.search())
    .aria("label", "Search");
```

`Button.icon(Icon icon)` treats the icon as decorative because the button text or button ARIA label should provide the accessible name.

## Providers

`IconProvider` and `IconRegistry` keep icon packs explicit and avoid global registration side effects.

```java
IconRegistry registry = IconRegistry.create()
    .register("lucide", LucideIcons.provider())
    .register("tabler", TablerIcons.provider())
    .register("heroicons", HeroIcons.provider(HeroIconStyle.OUTLINE))
    .register("phosphor", PhosphorIcons.provider(PhosphorWeight.REGULAR));

registry.icon("lucide", "search")
    .ariaLabel("Search");

registry.icon("tabler", "settings")
    .ariaLabel("Settings");

registry.icon("heroicons", "magnifying-glass")
    .ariaLabel("Heroicons search");

registry.icon("phosphor", "magnifying-glass")
    .ariaLabel("Phosphor search");
```

## Multi-Pack Guidance

Add only the Maven dependencies and GWT module inherits for icon packs your application uses. Packs are independent and do not register globally, so applications can mix them explicitly through direct factories or an `IconRegistry`.

Use pack-specific style APIs when a family has multiple visual styles:

```java
HeroIcons.magnifyingGlass(HeroIconStyle.SOLID);
HeroIcons.magnifyingGlass(HeroIconStyle.MINI).size(20);
HeroIcons.magnifyingGlass(HeroIconStyle.MICRO).size(16);

PhosphorIcons.magnifyingGlass(PhosphorWeight.THIN);
PhosphorIcons.magnifyingGlass(PhosphorWeight.BOLD);
PhosphorIcons.magnifyingGlass(PhosphorWeight.DUOTONE);
```

The Lucide support in the optional `gwt-fusion-icons-lucide` module is generated from `lucide-static` and checked in. Tabler support is generated from `@tabler/icons` outline SVGs. Heroicons support is generated from `@heroicons/react`. Phosphor support is generated from `@phosphor-icons/core`. Larger icon packs should stay in optional modules and follow the same generated-source pattern.

The demo has a dedicated Icons page with multi-pack usage examples, pack switching, an all-pack `IconRegistry` example, and a searchable multi-pack gallery. The gallery can switch between Lucide, Tabler, Heroicons, and Phosphor, and shows style or weight controls for packs that expose variants.
