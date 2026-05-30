# Icon Modules

Icon packs are distributed as separate Maven modules so applications can choose exactly which sets they use.

## Implemented Modules

- `gwt-fusion-icons-lucide`: Complete generated Lucide module with explicit GWT module metadata, attribution, and checked-in Java factories generated from `lucide-static`.
- `gwt-fusion-icons-tabler`: Complete generated Tabler outline module with explicit GWT module metadata, attribution, and checked-in Java factories generated from `@tabler/icons`.
- `gwt-fusion-icons-heroicons`: Complete generated Heroicons module with `OUTLINE`, `SOLID`, `MINI`, and `MICRO` styles from `@heroicons/react`.
- `gwt-fusion-icons-phosphor`: Complete generated Phosphor module with `THIN`, `LIGHT`, `REGULAR`, `BOLD`, `FILL`, and `DUOTONE` weights from `@phosphor-icons/core`.

## Usage

Add only the icon module your application needs:

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-icons-lucide</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>

<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-icons-tabler</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>

<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-icons-heroicons</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>

<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-icons-phosphor</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>
```

For GWT applications, inherit the matching module:

```xml
<inherits name="org.gwtfusion.icons.lucide.GwtFusionLucide"/>
<inherits name="org.gwtfusion.icons.tabler.GwtFusionTabler"/>
<inherits name="org.gwtfusion.icons.heroicons.GwtFusionHeroicons"/>
<inherits name="org.gwtfusion.icons.phosphor.GwtFusionPhosphor"/>
```

Use static factories for common icons or register the provider explicitly:

```java
Button.create("Search")
    .icon(LucideIcons.search());

Button.create("Settings")
    .icon(TablerIcons.settings());

Button.create("Search")
    .icon(HeroIcons.magnifyingGlass(HeroIconStyle.OUTLINE));

Button.create("Find")
    .icon(PhosphorIcons.magnifyingGlass(PhosphorWeight.REGULAR));

IconRegistry registry = IconRegistry.create()
    .register("lucide", LucideIcons.provider())
    .register("tabler", TablerIcons.provider())
    .register("heroicons", HeroIcons.provider(HeroIconStyle.OUTLINE))
    .register("phosphor", PhosphorIcons.provider(PhosphorWeight.REGULAR));
```

`HeroIcons.provider()` defaults to `HeroIconStyle.OUTLINE`; pass a style for `SOLID`, `MINI`, or `MICRO`. `PhosphorIcons.provider()` defaults to `PhosphorWeight.REGULAR`; pass a weight for `THIN`, `LIGHT`, `BOLD`, `FILL`, or `DUOTONE`.

Icon modules contain only their own icon assets, generated Java factories, GWT module metadata, and attribution/license files. They avoid global CSS, icon fonts, runtime SVG downloads, heavy static initialization, implicit global registration, and proprietary, paid, or pro assets.

## Demo Gallery

The demo includes a dedicated Icons page with Lucide, Tabler, Heroicons, and Phosphor usage examples, multi-pack switching, all-pack `IconRegistry` registration, and a searchable Lucide gallery. The Lucide gallery renders a limited initial slice of the 1960 generated icons and narrows the result set as the user types, using `LucideIcons.names()` and `LucideIcons.icon(String)`.
