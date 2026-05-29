# Icons

`gwt-fusion-ui` provides an SVG-first icon foundation under `org.gwtfusion.ui.component.icon`.

`Icon` is a `UiComponent`. Its root is a lightweight `span` so it fits the existing `HTMLElement element()` contract, and the rendered graphic is an inline SVG child.

Concrete icon sets are provided by separate modules. Lucide icons live in `gwt-fusion-icons-lucide` under `org.gwtfusion.icons.lucide`, and Tabler outline icons live in `gwt-fusion-icons-tabler` under `org.gwtfusion.icons.tabler`.

## Basic Usage

```java
import org.gwtfusion.icons.lucide.LucideIcons;
import org.gwtfusion.icons.tabler.TablerIcons;

LucideIcons.check()
    .variant(IconVariant.PRIMARY)
    .ariaLabel("Confirmed");

TablerIcons.settings()
    .variant(IconVariant.MUTED)
    .ariaLabel("Settings");
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
    .register("tabler", TablerIcons.provider());

registry.icon("lucide", "search")
    .ariaLabel("Search");

registry.icon("tabler", "settings")
    .ariaLabel("Settings");
```

The Lucide support in the optional `gwt-fusion-icons-lucide` module is generated from `lucide-static` and checked in. The Tabler support in the optional `gwt-fusion-icons-tabler` module is generated from `@tabler/icons` outline SVGs and checked in. Larger icon packs should stay in optional modules and follow the same generated-source pattern.

The demo has a dedicated Icons page with multi-pack usage examples and a searchable Lucide gallery for browsing the full generated Lucide set.
