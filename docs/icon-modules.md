# Icon Modules

Icon packs are distributed as separate Maven modules so applications can choose exactly which sets they use.

## Implemented Modules

- `gwt-fusion-icons-lucide`: Complete generated Lucide module with explicit GWT module metadata, attribution, and checked-in Java factories generated from `lucide-static`.
- `gwt-fusion-icons-tabler`: Complete generated Tabler outline module with explicit GWT module metadata, attribution, and checked-in Java factories generated from `@tabler/icons`.

## Planned Modules

- `gwt-fusion-icons-phosphor`: optional pack that needs variant modeling for weights such as regular, bold, fill, and duotone.
- `gwt-fusion-icons-heroicons`: optional pack with outline and solid variants.

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
```

For GWT applications, inherit the matching module:

```xml
<inherits name="org.gwtfusion.icons.lucide.GwtFusionLucide"/>
<inherits name="org.gwtfusion.icons.tabler.GwtFusionTabler"/>
```

Use static factories for common icons or register the provider explicitly:

```java
Button.create("Search")
    .icon(LucideIcons.search());

Button.create("Settings")
    .icon(TablerIcons.settings());

IconRegistry registry = IconRegistry.create()
    .register("lucide", LucideIcons.provider())
    .register("tabler", TablerIcons.provider());
```

Icon modules should contain only their own icon assets and metadata. They should avoid global CSS, icon fonts, heavy static initialization, and implicit global registration.

## Demo Gallery

The demo includes a dedicated Icons page with Lucide and Tabler usage examples plus a searchable Lucide gallery. The Lucide gallery renders a limited initial slice of the 1960 generated icons and narrows the result set as the user types, using `LucideIcons.names()` and `LucideIcons.icon(String)`.
