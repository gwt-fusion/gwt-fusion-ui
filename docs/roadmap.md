# Roadmap

This roadmap describes the next implementation phases for `gwt-fusion-ui`. It is written as an implementation guide, so future work can continue without rediscovering priorities or architectural decisions.

## Goals

- Build a practical GWT 2.13 and J2CL-compatible UI component library.
- Keep components DOM-based through `elemental2.dom`.
- Use Tailwind CSS classes statically so the Tailwind build can discover or safelist them.
- Keep the Java API idiomatic with enums, fluent methods, and explicit state methods.
- Keep the demo current with visual examples and Java usage snippets for every component.

## Phase 1: Form Controls

Focus on components used in almost every application.

### Components

- `Checkbox`
- `RadioGroup`
- `Switch`
- `Textarea`
- `Select`
- `NativeSelect`
- `InputGroup`
- `InputOtp`
- `Slider`
- `FormField`
- `FormMessage`
- `FormLabel`
- `FormDescription`

### Implementation Notes

- `Checkbox`, `Switch`, `Textarea`, and `RadioGroup` are implemented as the initial form foundation.
- Treat `NativeSelect` as a simpler native-control alternative to the richer `Select` component.
- `InputGroup` should compose existing `Input`, `Button`, icons, and addons instead of duplicating input behavior.
- `InputOtp` needs careful keyboard handling and should come after basic form controls are stable.
- `FormControl`, `FormField`, `FormLabel`, `FormDescription`, `FormMessage`, `NativeSelect`, `InputGroup`, and `Slider` are implemented as the form composition layer.
- The richer styled `Select` is intentionally deferred until overlay, popover, keyboard, and focus-management utilities exist.
- Keep native form semantics where possible, especially for `input`, `textarea`, and `label`.
- Expose state with fluent methods such as `checked(boolean)`, `disabled(boolean)`, `value(String)`, `name(String)`, and `required(boolean)`.
- Use enums for variants and sizes if the component has more than one visual style.
- Ensure changing variant, size, orientation, or state removes obsolete classes.
- Add JVM tests for enum class mappings and state-independent utility logic.
- Do not instantiate `DomGlobal.document` in ordinary JVM tests.

### Demo Requirements

- Show checked, unchecked, disabled, and invalid states where applicable.
- Show Java code next to every preview.
- Add form examples that combine `Label`, `Input`, `Textarea`, `Checkbox`, and `Button`.

## Phase 2: Navigation And Layout

Add structure for documentation pages and common application layouts.

### Components

- `Tabs`
- `Accordion`
- `AspectRatio`
- `Breadcrumb`
- `ButtonGroup`
- `Collapsible`
- `NavigationMenu`
- `Sidebar`
- `Menubar`
- `Pagination`
- `ScrollArea`
- `Toggle`
- `ToggleGroup`
- `Typography`

### Implementation Notes

- Implement `Tabs` early because it can improve the demo itself with `Preview` and `Code` tabs.
- `Tabs` is implemented with ARIA roles and arrow-key navigation.
- `CodeBlock` is implemented and used by the demo for Java snippets.
- The demo keeps a two-column preview/code layout on desktop for scannability and uses the existing stacked layout on mobile.
- `AspectRatio`, `ButtonGroup`, and `Typography` are low-interaction components and good candidates for early wins.
- `AspectRatio`, `ButtonGroup`, `Breadcrumb`, `Pagination`, `ScrollArea`, `Toggle`, `ToggleGroup`, `Typography`, `Collapsible`, and `Accordion` are implemented.
- `Toggle` and `ToggleGroup` expose pressed state and ARIA attributes.
- `Collapsible` is implemented as a reusable primitive alongside `Accordion`.
- Use explicit orientation enums where useful, for example `TabsOrientation` or `SeparatorOrientation`.
- Prefer simple DOM state over global registries.
- `Accordion` currently supports single-open behavior; add multiple-open mode only when needed by real usage.
- Keep keyboard behavior in scope for `Tabs`, `Accordion`, and menu-like components.

### Demo Requirements

- Use `Tabs` to demonstrate component states.
- Show `Accordion` with several items.
- Add navigation examples that look useful in real apps, not just isolated buttons.

## Phase 3: Overlays

Add interactive layered components. These require more attention to focus management and accessibility.

### Components

- `Dialog`
- `AlertDialog`
- `Popover`
- `Tooltip`
- `HoverCard`
- `DropdownMenu`
- `ContextMenu`
- `Sheet`
- `Drawer`

### Implementation Notes

- Implement shared utilities before or during this phase, but keep them minimal.
- Shared utilities implemented for the first overlay layer:
  - `Portal`
  - `FocusManager`
  - `OutsideClick`
  - `Keyboard`
  - `IdGenerator`
  - `Aria`
  - `OverlayLayer`
- `Dialog` should handle Escape, backdrop click, focus return, and ARIA attributes.
- `Tooltip` should support hover and focus triggers.
- `HoverCard` can share positioning and trigger behavior with `Tooltip` and `Popover`.
- `DropdownMenu` should support keyboard navigation before being considered complete.
- `Tooltip`, `Popover`, `Dialog`, `AlertDialog`, `DropdownMenu`, `ContextMenu`, `HoverCard`, `Sheet`, and `Drawer` are implemented as the first overlay component set.
- Avoid server-side Java APIs and reflection-based implementations.

### Demo Requirements

- Show open and closed states.
- Show trigger buttons and resulting overlays.
- Include keyboard/accessibility notes for each overlay component.

## Phase 4: Feedback

Add components for loading, status, and user feedback.

### Components

- `Toast`
- `Progress`
- `Skeleton`
- `Spinner`
- `EmptyState`
- `StatusIndicator`

### Implementation Notes

- `Toast` likely needs a small `ToastManager`.
- Toast presentation styles include `ToastStyle.DEFAULT` and `ToastStyle.SONNER`; Sonner is not a separate component or notification system.
- `ToastManager` must avoid unnecessary static side effects. Initialize DOM containers lazily.
- `Progress` should expose `value(double)` and ARIA progress attributes.
- `Skeleton` and `Spinner` should stay CSS-first and minimal.
- `EmptyState` can be a composed layout component with title, description, and action slot.

### Demo Requirements

- Add examples for loading states and completed states.
- Add a button that triggers a toast.
- Show both light and dark theme behavior.

## Phase 5: Data Display

Support tables, identity display, code examples, and dashboard-style content.

### Components

- `Table`
- `DataTable`
- `Avatar`
- `Calendar`
- `Carousel`
- `Chart`
- `DatePicker`
- `Item`
- `Timeline`
- `Kbd`
- `CodeBlock`

### Implementation Notes

- Start with simple `Table`, `Avatar`, `Kbd`, and `CodeBlock`.
- `CodeBlock` is already implemented for the demo and can be expanded later with syntax highlighting if needed.
- `Item` should be a small display primitive for lists, command results, and menus if it proves reusable.
- `Carousel` should be implemented after keyboard utilities exist.
- `Chart` should be evaluated carefully because it may require a charting dependency or a lightweight SVG-first implementation.
- `Chart` remains deferred until an SVG-first strategy or acceptable dependency boundary is chosen.
- Keep `DataTable` separate from `Table`; sorting, filtering, and pagination should not complicate the basic table component.
- `CodeBlock` should be useful for the demo, even without syntax highlighting initially.
- `DatePicker` depends on `Calendar`, `Popover`, and form utilities, so it should come later in this phase.

### Demo Requirements

- Use `CodeBlock` for component Java snippets once available.
- Show table variants with header, body, empty state, and pagination.
- Include realistic sample data.

## Phase 6: Advanced UX

Add richer components after the core API and interaction utilities are stable.

### Components

- `CommandPalette` - implemented in Milestone 12.
- `CommandMenu` - implemented in Milestone 12.
- `Combobox` - implemented in Milestone 12.
- `MultiSelect` - implemented in Milestone 12.
- `Autocomplete` - implemented in Milestone 12.
- `Resizable` - implemented in Milestone 12.

### Implementation Notes

- These components require stronger keyboard handling and internal state management.
- Reuse overlay, keyboard, and focus utilities from earlier phases.
- Prefer simple data models before introducing builders or complex adapters.
- Avoid locking the API into a specific data-binding framework.
- Do not model shadcn/ui `Command` as a core required component name because GWT already has `com.google.gwt.user.client.Command` as an action/callback concept.
- Treat this feature as optional advanced UX for command-palette workflows, not as a foundational GWT UI primitive.
- Prefer public names such as `CommandPalette` and `CommandMenu` to avoid confusion with GWT `Command`.
- Use `Runnable` for item selection callbacks first; do not introduce `CommandAction` unless callbacks need context later.
- `CommandPalette` combines direct overlay utilities, a filterable list, keyboard navigation, grouped items, empty state, and item selection callbacks.

### Demo Requirements

- Show keyboard-first workflows.
- Include examples with filtering and empty results.
- Clearly document how Java values map to rendered options.
- Document the distinction between GWT `Command` callbacks and the shadcn-inspired command-palette UI pattern.

## Flexible SVG Icon System

Add a modern, modular, SVG-based icon architecture for `gwt-fusion-ui`. The system should be a modern alternative to legacy icon fonts and align visually with shadcn/ui, Tailwind UI, and Radix-style ecosystems.

### Goals

- Support multiple icon sets.
- Preserve GWT-native Java APIs.
- Stay compatible with GWT 2.13 and J2CL.
- Support code splitting and lazy loading where possible.
- Integrate with themes, dark mode, inherited colors, and Tailwind utility classes.
- Avoid global icon fonts and FOUT issues.

### SVG-First Architecture

- Do not use icon fonts as the primary implementation.
- Render all icons as SVG.
- Prefer inline SVG elements for styling, accessibility, and bundling control.
- Keep SVG definitions static and discoverable by Java tooling.
- Avoid runtime parsing of arbitrary SVG strings unless there is a clear need.

### GWT-Native API

The API should feel natural for Java/GWT developers.

```java
Icon search = LucideIcons.search();

Button.create("Search")
    .icon(search);

Icon settings = LucideIcons.settings()
    .size(18)
    .strokeWidth(2);
```

### Provider-Based Architecture

Introduce a pluggable provider system so applications can use one icon set, combine multiple icon sets, or override icons globally.

Core types:

- `Icon`
- `IconProvider`
- `IconRegistry`
- `IconTheme`
- `IconVariant`
- `IconSize`

Example:

```java
IconRegistry registry = IconRegistry.create()
    .register("lucide", LucideIcons.provider())
    .register("tabler", TablerIcons.provider());
```

### Foundation Status

- `Icon`, `IconProvider`, `IconRegistry`, `IconTheme`, `IconVariant`, and `IconSize` are implemented in the core UI module.
- `Icon` uses an `HTMLElement` root with an inline SVG child to preserve the existing `UiComponent.element()` contract.
- The complete `lucide-static` icon set is available in the separate `gwt-fusion-icons-lucide` module; core stays icon-set agnostic.
- `Button.icon(Icon icon)` is implemented and treats composed button icons as decorative.

### Default Icon Set

Use Lucide as the default and recommended icon system.

Reasons:

- Modern appearance.
- Lightweight SVGs.
- Consistent stroke-based design.
- Strong compatibility with shadcn-inspired UI.
- ISC license.

### Optional Icon Modules

Create independent Maven modules for optional icon packs.

- `gwt-fusion-icons-lucide`
- `gwt-fusion-icons-tabler`
- `gwt-fusion-icons-phosphor`
- `gwt-fusion-icons-heroicons`
- Optional: `gwt-fusion-icons-fontawesome`

`gwt-fusion-icons-lucide` is implemented as the reference module. Tabler, Phosphor, and Heroicons remain planned optional modules.

Each module should:

- Contain only its own icon assets.
- Be independently loadable.
- Support code splitting and tree-shakable usage patterns.
- Avoid global CSS or font loading.
- Include attribution and license files in distributable artifacts.

Example Maven dependency:

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-icons-lucide</artifactId>
</dependency>
```

### Performance Requirements

- Applications should only load icons they actually use.
- Support code splitting through application-level loading and provider modules.
- Avoid global icon registries with heavy static initialization.
- Keep icon factory methods small and direct.
- Do not load global icon fonts.
- Avoid FOUT by relying on SVG rendering.
- Prefer static Java factories over dynamic lookups for common icons.

### Styling Support

Icons must support:

- Size.
- Stroke width.
- Inherited text color via `currentColor`.
- CSS utility classes.
- Dark mode.
- Design tokens.

Example:

```java
LucideIcons.search()
    .size(18)
    .strokeWidth(2)
    .classes("text-muted-foreground");
```

### Accessibility

Support both decorative and accessible icons.

- Decorative icons should be hidden from assistive technology.
- Meaningful icons should support `aria-label`.
- Icons inside buttons and controls should not duplicate accessible labels unnecessarily.

Example:

```java
LucideIcons.x()
    .ariaLabel("Warning");

LucideIcons.search()
    .decorative();
```

### Future Enhancements

- Animated icons.
- Theme-aware icon variants.
- Custom icon packs.
- Sprite optimization.
- Deeper design-token integration.
- Runtime icon switching.

### Licensing Strategy

- Prefer MIT and ISC licensed icon sets.
- Include proper attribution and license files in all distributable artifacts.
- Avoid bundling proprietary, paid, or pro icon packs.
- Treat Font Awesome as optional and review license implications before distributing assets.

### Implementation Notes

- `Icon`, `IconProvider`, and `IconRegistry` are implemented in core; the complete Lucide set is generated into `gwt-fusion-icons-lucide`.
- `Icon` stays a `UiComponent` so it can be composed into buttons, inputs, menu items, and alerts.
- `Button.icon(Icon icon)` is implemented after the base `Icon` API was introduced.
- Store path data in Java constants or generated Java classes, not in runtime-loaded font files.
- Consider source generation for large icon packs to avoid hand-maintaining hundreds of icons.
- Keep generated code J2CL-friendly and free of reflection.

### Strategic Vision

The icon system should help position `gwt-fusion-ui` as:

- A modern enterprise-ready UI framework.
- Visually competitive with modern React/Tailwind ecosystems.
- Fully aligned with GWT/J2CL paradigms.
- Optimized for long-term maintainability and performance.

## Recommended Next Order

1. `InputOtp`
2. `Tooltip`
3. `Dialog`
4. `DropdownMenu`
5. `Select`
6. `Toast`
7. `Table`
8. `NavigationMenu`
9. `Sidebar`
10. `Menubar`

## shadcn/ui Parity Gaps

The shadcn/ui component list was checked against this roadmap. The following components were missing and have now been added to the roadmap:

- `AspectRatio`
- `ButtonGroup`
- `Carousel`
- `Chart`
- `Collapsible`
- `HoverCard`
- `InputGroup`
- `InputOtp`
- `Item`
- `NativeSelect`
- `Toggle`
- `ToggleGroup`
- `Typography`

The following shadcn/ui entries are already represented under different names or concepts:

- `Data Table` maps to `DataTable`.
- `Date Picker` maps to `DatePicker`.
- `Alert Dialog` maps to `AlertDialog`.
- `Context Menu` maps to `ContextMenu`.
- `Dropdown Menu` maps to `DropdownMenu`.
- `Sonner` maps to the toast subsystem via `ToastStyle.SONNER`.
- `Navigation Menu` maps to `NavigationMenu`.
- `Radio Group` maps to `RadioGroup`.
- `Scroll Area` maps to `ScrollArea`.
- `Empty` maps to `EmptyState`.
- `Field` maps to `FormField`, `FormLabel`, `FormDescription`, and `FormMessage`.

The following shadcn/ui entries are already implemented in this repository and therefore are not part of the future-component roadmap:

- `Alert`
- `Badge`
- `Button`
- `Card`
- `Input`
- `Label`
- `Separator`

The following entry should be handled as infrastructure rather than a normal component:

- `Direction`: implemented as direction infrastructure through `DirectionManager` rather than a normal component.

## Open Architecture Points

- Decide whether form components should share a small `FormControl` interface.
- Decide how component IDs are generated for ARIA relationships.
- Decide how controlled and uncontrolled component state should be represented in Java.
- Decide whether demo code snippets stay as strings or move into reusable example descriptors.
- Decide whether Tailwind safelist entries should remain manual or be generated from component enums.
- Decide how strict the J2CL compatibility checks should become in Maven.
- Decide whether browser-based tests should use GWT tests, Playwright, or a later J2CL-compatible setup.
- Continue hardening RTL coverage as new components add keyboard or placement behavior.

## Definition Of Done For New Components

- Component implements `UiComponent` directly or through `BaseComponent`.
- Root element is exposed through `element()`.
- Tailwind classes are static strings or safelisted.
- Variant and size changes remove obsolete classes.
- Accessibility attributes are set when part of the semantic contract.
- Demo includes rendered preview and Java code.
- JVM tests cover enums, CSS class mappings, or pure Java state helpers.
- `mvn -Dskip.tailwind=true verify` succeeds.
- If demo behavior changed, `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package` succeeds.
