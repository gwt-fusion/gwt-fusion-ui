# AGENTS.md

## Project Goal

This repository contains `gwt-fusion-ui`, a UI component library for GWT 2.13 and J2CL-compatible applications. The components are inspired by shadcn, use Tailwind CSS as their styling foundation, and provide a Java-idiomatic API with enums, `ThemeManager`, and fluent component methods.

## Module

- `gwt-fusion-ui`: Reusable component library under the `org.gwtfusion.ui` package.
- `gwt-fusion-icons-lucide`: Optional Lucide icon module under `org.gwtfusion.icons.lucide`.
- `gwt-fusion-ui-demo`: GWT demo website with visual component examples and code snippets.

## Architecture Rules

- Components remain DOM-based and use `elemental2.dom`.
- Do not build new components on classic GWT widgets such as `com.google.gwt.user.client.ui.Widget`.
- Do not introduce GWT-RPC dependencies.
- Do not use `GWT.create()` as a core mechanism.
- Keep browser-capable code J2CL-friendly: no reflection assumptions, no server-side Java APIs, and no unnecessary static side effects.
- Every component implements `UiComponent` directly or indirectly and exposes its root element through `element()`.
- Components should represent local state changes cleanly. When a variant or size changes, old classes must be removed.
- Code splitting is considered at the application level. The demo uses `GWT.runAsync`; components themselves should not force global registrations.

## Styling Rules

- Tailwind is the styling source. Java code may use Tailwind classes, but avoid dynamic class names such as `"bg-" + color`.
- Variants and sizes are preferably modeled with enums.
- Theme colors use CSS variables following the shadcn pattern.
- Dark mode is controlled through the root `.dark` class.
- `ThemeManager` is the central Java API for theme switching.
- Tailwind must be able to detect classes from Java sources. Keep new component classes static in Java strings or safelist them in `tailwind.config.js`.

## Maven And Build

- Everything is built with Maven.
- Standard verification without Node download: `mvn -Dskip.tailwind=true verify`.
- Full CSS build: `mvn -pl gwt-fusion-ui generate-resources`.
- Demo GWT compile is prepared through the `demo` profile in the demo `package`: `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package`.
- GitHub Pages deployment is prepared through `.github/workflows/deploy-demo.yml` and builds the demo website.

## Tests

- Prefer JVM tests for pure Java logic: variants, CSS classes, theme state, and API contracts.
- Do not directly execute DOM creation through `DomGlobal.document` in normal JVM tests.
- Add browser/GWT tests separately later.
- New components need at least tests for enum classes and class mappings.

## Component Guidelines

- Use minimal HTML structure close to shadcn.
- Set accessibility attributes directly in the component when they belong to the semantic contract.
- New interactive components should expose semantic listeners such as `onValueChange`, `onCheckedChange`, `onPressedChange`, or `onOpenChange` when appropriate, returning `ListenerRegistration` for removal.
- Keep API examples in the demo current.
- Do not over-abstract Tailwind classes. Small enums are better than complex builders.

## Current Status

- Implemented components: `Button`, `Badge`, `Card`, `Alert`, `AlertDialog`, `Input`, `Label`, `Separator`, `Checkbox`, `Switch`, `Textarea`, `RadioGroup`, `FormField`, `NativeSelect`, `InputGroup`, `Slider`, `Tabs`, `CodeBlock`, `Accordion`, `Collapsible`, `AspectRatio`, `ButtonGroup`, `Breadcrumb`, `Pagination`, `ScrollArea`, `Toggle`, `ToggleGroup`, `Typography`, `Icon`, `Tooltip`, `Popover`, `Dialog`, `DropdownMenu`, `ContextMenu`, `HoverCard`, `Sheet`, `Drawer`, `Progress`, `Skeleton`, `Spinner`, `EmptyState`, `StatusIndicator`, `Toast`, `ToastManager`.
- Base classes: `UiComponent`, `BaseComponent`, `CssClasses`, `ThemeManager`.
- Demo: home page, component view with categorized preview/Java code examples, form foundation examples, layout/navigation examples, overlay examples, icon gallery, events examples, and theme view.
- Tailwind 3 is configured and executed through `frontend-maven-plugin`.
- Current working status: Milestone 10 Feedback Components is in progress.
