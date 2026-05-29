# Milestones

This file turns the roadmap into concrete, checkable implementation milestones. Each milestone should leave the project in a buildable state and keep the demo up to date.

## Milestone 1: Form Foundation

- [x] Implement `Checkbox` component.
- [x] Add `Checkbox` checked, unchecked, disabled, and invalid examples to the demo.
- [x] Add `Checkbox` enum/class mapping tests.
- [x] Implement `Switch` component.
- [x] Add `Switch` checked, unchecked, and disabled examples to the demo.
- [x] Add `Switch` enum/class mapping tests.
- [x] Implement `Textarea` component.
- [x] Add `Textarea` default, disabled, and placeholder examples to the demo.
- [x] Add `Textarea` API tests where possible.
- [x] Implement `RadioGroup` component.
- [x] Add `RadioGroup` horizontal, vertical, disabled, and selected-state examples to the demo.
- [x] Add `RadioGroup` enum/class mapping tests.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package`.

## Milestone 2: Form Composition

- [x] Define whether form controls should share a small `FormControl` interface.
- [x] Implement `FormField`.
- [x] Implement `FormLabel` or align existing `Label` with form-field composition.
- [x] Implement `FormDescription`.
- [x] Implement `FormMessage`.
- [x] Implement `NativeSelect` as the simple native select option.
- [x] Implement `Select` as the richer styled select option or document why it depends on overlays.
- [x] Implement `InputGroup` as a composition primitive for `Input`, `Button`, icons, and addons.
- [x] Implement `Slider`.
- [x] Add combined form examples to the demo.
- [x] Add validation-state examples to the demo.
- [x] Verify Tailwind safelist/content coverage for all new classes.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 3: Demo Experience Upgrade

- [x] Implement `Tabs`.
- [x] Add keyboard support for `Tabs`.
- [x] Add `Tabs` tests for enum/class mappings and state helpers.
- [x] Use `Tabs` in the demo for component examples where useful.
- [x] Decide whether preview/code should stay as two columns, tabs, or both depending on screen size.
- [x] Implement `CodeBlock` for Java snippets.
- [x] Replace raw `pre` snippets in the demo with `CodeBlock`.
- [x] Keep string snippets for now; reusable demo example descriptors are deferred until snippets become hard to maintain.
- [x] Verify mobile layout continues to use stacked examples through CSS media queries.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 4: Layout And Navigation Components

- [x] Implement `Accordion`.
- [x] Decide whether `Collapsible` should be implemented before or inside `Accordion`.
- [x] Implement `Collapsible` if reusable.
- [x] Implement `AspectRatio`.
- [x] Implement `ButtonGroup`.
- [x] Implement `Breadcrumb`.
- [x] Implement `Pagination`.
- [x] Implement `ScrollArea`.
- [x] Implement `Toggle`.
- [x] Implement `ToggleGroup`.
- [x] Implement `Typography` styles/components.
- [x] Add navigation and layout examples to the demo.
- [x] Verify keyboard behavior for `Accordion`, `ToggleGroup`, and menu-like components.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 5: Event Listener Foundation

- [x] Define `ListenerRegistration` as the lightweight Elemental2-oriented equivalent to GWT `HandlerRegistration`.
- [x] Add `ListenerRegistration.remove()` and a default `close()` convenience method.
- [x] Define `ValueChangeListener<T>` for semantic component value changes.
- [x] Add `BaseComponent.listen(String, EventListener)` returning `ListenerRegistration`.
- [x] Add capture/options support only if real component usage requires it.
- [x] Keep existing fluent convenience methods like `onClick(...)` source-compatible.
- [x] Add `Slider.onValueChange(ValueChangeListener<Double>)` mapped to the DOM `input` event.
- [x] Add `Slider.onValueCommit(ValueChangeListener<Double>)` mapped to the DOM `change` event.
- [x] Add `Slider.doubleValue()` or another typed value accessor for numeric event payloads.
- [x] Ensure programmatic setters like `Slider.value(double)` do not fire listeners implicitly.
- [x] Add listener examples to the demo, starting with a live `Slider` value preview.
- [x] Add JVM tests for listener registration helpers where possible without DOM execution.
- [x] Document the pattern for future semantic listeners: `onCheckedChange`, `onPressedChange`, `onOpenChange`, and `onValueChange`.
- [x] Roll the semantic listener pattern into `Checkbox`, `Switch`, `RadioGroup`, `Tabs`, `Toggle`, `ToggleGroup`, `Collapsible`, and `Accordion` as needed.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 6: Icon System Foundation

- [x] Define `Icon` as a `UiComponent`.
- [x] Define `IconProvider`.
- [x] Define `IconRegistry`.
- [x] Define `IconTheme`.
- [x] Define `IconVariant`.
- [x] Define `IconSize`.
- [x] Implement SVG-first rendering with inline SVG.
- [x] Support `size(int)`.
- [x] Support `strokeWidth(double)`.
- [x] Support inherited `currentColor`.
- [x] Support `classes(String)`.
- [x] Support `ariaLabel(String)`.
- [x] Support `decorative()`.
- [x] Add a small Lucide proof of concept.
- [x] Add `Button.icon(Icon icon)` after the base icon API is stable.
- [x] Add icon examples to the demo.
- [x] Add accessibility examples for decorative and labelled icons.
- [x] Verify no icon font loading is introduced.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 7: Icon Modules

- [x] Add Maven module `gwt-fusion-icons-lucide`.
- [x] Include Lucide attribution and license files.
- [x] Decide whether Lucide Java classes are generated or maintained manually.
- [x] Implement `LucideIconProvider`.
- [x] Implement `LucideIcons` static factory API.
- [x] Generate and check in the complete Lucide icon set from `lucide-static`.
- [x] Ensure icon modules contain only their own icon assets.
- [x] Ensure icon module code has no heavy static initialization.
- [x] Add optional module plan for `gwt-fusion-icons-tabler`.
- [x] Add optional module plan for `gwt-fusion-icons-phosphor`.
- [x] Add optional module plan for `gwt-fusion-icons-heroicons`.
- [x] Document Font Awesome as optional and license-sensitive.
- [x] Verify icon module build through Maven.
- [x] Verify demo can use Lucide module.
- [x] Add searchable demo gallery for the complete Lucide icon set.

## Milestone 8: Overlay Infrastructure

- [x] Implement `IdGenerator` for ARIA relationships.
- [x] Implement `Keyboard` utility.
- [x] Implement `OutsideClick` utility.
- [x] Implement `Portal` utility.
- [x] Implement `FocusManager` utility.
- [x] Implement `Aria` helper utility.
- [x] Implement minimal `OverlayLayer` if needed.
- [x] Ensure utilities avoid reflection and server-side Java APIs.
- [x] Ensure utilities avoid unnecessary static side effects.
- [x] Add JVM tests for pure utility behavior.
- [x] Add demo smoke examples where useful.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 9: Overlay Components

- [x] Implement `Tooltip` with hover and focus triggers.
- [x] Implement `Popover`.
- [x] Implement `Dialog`.
- [x] Add Escape handling to `Dialog`.
- [x] Add backdrop click handling to `Dialog`.
- [x] Add focus return to `Dialog`.
- [x] Add ARIA attributes to `Dialog`.
- [x] Implement `AlertDialog` using `Dialog` primitives where possible.
- [x] Implement `DropdownMenu` with keyboard navigation.
- [x] Implement `ContextMenu`.
- [x] Implement `HoverCard` sharing trigger/positioning behavior where possible.
- [x] Implement `Sheet`.
- [x] Implement `Drawer`.
- [x] Add overlay examples and accessibility notes to the demo.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 10: Feedback Components

- [x] Implement `Progress` with ARIA progress attributes.
- [x] Implement `Skeleton`.
- [x] Implement `Spinner`.
- [x] Implement `EmptyState`.
- [x] Implement `StatusIndicator`.
- [x] Implement minimal `ToastManager` with lazy DOM initialization.
- [x] Implement `Toast`.
- [x] Decide whether `Sonner` is a toast variant, presentation style, or separate higher-level API.
- [x] Add loading, empty, success, warning, and error examples to the demo.
- [x] Add a demo button that triggers a toast.
- [x] Verify dark mode behavior.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 11: Data Display Components

- [x] Implement `Table`.
- [x] Implement `Avatar`.
- [x] Implement `Kbd`.
- [x] Implement `Item` as a reusable display primitive if useful.
- [x] Implement `Timeline`.
- [x] Implement `Calendar`.
- [x] Implement `DatePicker` after `Calendar`, `Popover`, and form utilities are stable.
- [x] Implement `DataTable` separately from basic `Table`.
- [x] Add sorting support to `DataTable` only after the base table is stable.
- [x] Add filtering support to `DataTable` only after sorting is stable.
- [x] Add pagination examples using `Pagination`.
- [x] Implement `Carousel` after keyboard utilities are stable.
- [x] Evaluate `Chart` implementation strategy: SVG-first, external dependency, or deferred.
- [x] Add realistic sample data to the demo.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 12: Advanced UX Components

- [x] Treat `CommandPalette` as the first advanced UX slice for keyboard-first quick actions.
- [x] Document the distinction between GWT `Command` callbacks and the shadcn-inspired command-palette UI pattern.
- [x] Avoid a public UI component named only `Command` to prevent confusion with `com.google.gwt.user.client.Command`.
- [x] Use `Runnable` for item selection callbacks first; do not introduce `CommandAction` unless callbacks need context later.
- [x] Split the milestone conceptually into `CommandMenu`/`CommandPalette` first, then `Combobox`, `Autocomplete`, `MultiSelect`, and `Resizable`.
- [x] Implement `CommandPalette` with direct overlay utilities instead of the current `Dialog`, because `Dialog` always renders dialog actions.
- [x] Support optional keyboard shortcuts with both exact shortcuts and a default `Meta+K`/`Ctrl+K` convenience.
- [x] Start with a simple case-insensitive contains filter across value, label, and keywords; defer fuzzy search.
- [x] Hide groups with no visible matching items and show the empty state when no items match.
- [x] Show disabled items but exclude them from focus and selection.
- [x] Keep `CommandMenu` open after selection and let parent components decide whether to close.
- [x] Close `CommandPalette` automatically after a successful item selection.
- [x] Support both global `onValueChange(...)` and direct per-item `Runnable` callbacks.
- [x] Use input/listbox/option ARIA semantics rather than copying cmdk internals directly.
- [x] Implement `CommandMenu` as the reusable filterable list primitive for command-palette UX.
- [x] Implement `CommandPalette` using `CommandMenu` and overlay utilities.
- [x] Keep command entries as an internal item model without exposing a top-level `Command` component.
- [x] Implement `Combobox`.
- [x] Implement `MultiSelect`.
- [x] Implement `Autocomplete`.
- [x] Implement `Resizable`.
- [x] Reuse overlay, keyboard, and focus utilities consistently.
- [x] Add examples with filtering and empty results.
- [x] Add keyboard-first workflow examples to the demo.
- [x] Document how Java values map to rendered options.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 13: Direction, RTL, And Theming Depth

- [x] Decide how `Direction` and RTL support should be represented in Java.
- [x] Decide whether direction belongs in `ThemeManager`, a new `DirectionManager`, or document-level utilities.
- [x] Add `dir` support for components that need directional behavior.
- [x] Audit components for left/right Tailwind classes that may need logical alternatives.
- [x] Add RTL examples to the demo.
- [x] Expand theme token coverage if needed.
- [x] Add theme-aware icon examples once icons exist.
- [ ] Verify light and dark mode for all implemented components.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 14: Build, Tests, And Release Readiness

- [x] Decide how strict J2CL compatibility checks should become in Maven.
- [x] Add or document a J2CL compatibility profile.
- [x] Decide browser-test strategy: GWT tests, Playwright, or later J2CL-compatible setup.
- [x] Add browser/demo smoke tests if feasible.
- [x] Review Tailwind safelist strategy.
- [x] Decide whether Tailwind safelist entries should be generated from component enums.
- [x] Ensure every component has demo examples.
- [x] Ensure every component has at least enum/class mapping or pure Java state tests.
- [x] Ensure license and attribution files exist for bundled assets.
- [x] Review generated artifacts and `.gitignore` rules.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify `mvn -pl gwt-fusion-ui generate-resources`.
- [x] Verify `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package`.
- [x] Verify GitHub Pages deployment workflow.

## Milestone 15: Additional Icon Packs

Milestone 15 is split into four focused PR-sized sub-milestones. All additional icon packs should be complete generated Java icon sets, checked in as source, distributed as independent optional Maven modules, and kept free of icon fonts, runtime SVG downloads, global CSS, heavy static initialization, and implicit global registration.

### Milestone 15.1: Tabler Icons

- [x] Add Maven module `gwt-fusion-icons-tabler`.
- [x] Use package `org.gwtfusion.icons.tabler` and GWT module `org.gwtfusion.icons.tabler.GwtFusionTabler`.
- [x] Include the complete Tabler icon set as generated checked-in Java source.
- [x] Include Tabler attribution and license files in the module resources.
- [x] Implement `TablerIconProvider`.
- [x] Implement `TablerIcons` static factory API.
- [x] Expose `TablerIcons.names()`, `TablerIcons.icon(String)`, and `TablerIcons.provider()`.
- [x] Keep Tabler independent from Lucide, Heroicons, and Phosphor modules.
- [x] Add JVM tests for provider behavior, icon count, known icons, and unknown icon handling.
- [x] Add a small Tabler example to the demo Icons page.
- [x] Verify the Tabler module build through Maven.

### Milestone 15.2: Heroicons

- [x] Add Maven module `gwt-fusion-icons-heroicons`.
- [x] Use package `org.gwtfusion.icons.heroicons` and GWT module `org.gwtfusion.icons.heroicons.GwtFusionHeroicons`.
- [x] Include the complete Heroicons set for `OUTLINE`, `SOLID`, `MINI`, and `MICRO` styles as generated checked-in Java source.
- [x] Include Heroicons attribution and license files in the module resources.
- [x] Implement `HeroIconStyle` with `OUTLINE`, `SOLID`, `MINI`, and `MICRO`.
- [x] Implement `HeroIconProvider`.
- [x] Implement `HeroIcons` static factory API with `OUTLINE` as the default style.
- [x] Expose `HeroIcons.names(HeroIconStyle)`, `HeroIcons.icon(String, HeroIconStyle)`, and `HeroIcons.provider(HeroIconStyle)`.
- [x] Keep Heroicons independent from Lucide, Tabler, and Phosphor modules.
- [x] Add JVM tests for styles, provider behavior, icon counts, known icons, and unknown icon handling.
- [x] Add Heroicons style comparison examples to the demo Icons page.
- [x] Verify the Heroicons module build through Maven.

### Milestone 15.3: Phosphor Icons

- [x] Add Maven module `gwt-fusion-icons-phosphor`.
- [x] Use package `org.gwtfusion.icons.phosphor` and GWT module `org.gwtfusion.icons.phosphor.GwtFusionPhosphor`.
- [x] Include the complete Phosphor icon set for `THIN`, `LIGHT`, `REGULAR`, `BOLD`, `FILL`, and `DUOTONE` weights as generated checked-in Java source.
- [x] Include Phosphor attribution and license files in the module resources.
- [x] Implement `PhosphorWeight` with `THIN`, `LIGHT`, `REGULAR`, `BOLD`, `FILL`, and `DUOTONE`.
- [x] Implement `PhosphorIconProvider`.
- [x] Implement `PhosphorIcons` static factory API with `REGULAR` as the default weight.
- [x] Expose `PhosphorIcons.names(PhosphorWeight)`, `PhosphorIcons.icon(String, PhosphorWeight)`, and `PhosphorIcons.provider(PhosphorWeight)`.
- [x] Keep Phosphor independent from Lucide, Tabler, and Heroicons modules.
- [x] Add JVM tests for weights, provider behavior, icon counts, known icons, and unknown icon handling.
- [x] Add Phosphor weight comparison examples to the demo Icons page.
- [x] Verify the Phosphor module build through Maven.

### Milestone 15.4: Multi-Pack Demo, Docs, And Final Hardening

- [ ] Add demo examples that show switching between Lucide, Tabler, Heroicons, and Phosphor.
- [ ] Add an `IconRegistry` example with independently registered providers for all icon packs.
- [ ] Update `docs/icon-modules.md` with all implemented icon modules, style/weight APIs, GWT module names, and dependency examples.
- [ ] Update `docs/icons.md` with multi-pack usage guidance.
- [ ] Update `docs/components-index.json` non-component APIs with the new icon factories.
- [ ] Update `llms.txt` and `docs/agent-guide.md` for agent discovery.
- [ ] Ensure each icon module contains only its own icon assets and metadata.
- [ ] Ensure no proprietary, paid, or pro icon assets are bundled.
- [ ] Verify all icon modules build through Maven.
- [ ] Verify the demo can use multiple icon modules together.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone Definition Of Done

- [ ] All planned source changes are implemented.
- [ ] Demo is updated with preview and Java code examples.
- [ ] Tailwind classes are static or safelisted.
- [ ] Accessibility attributes are included where required.
- [ ] Tests are added or intentionally documented as not applicable.
- [ ] `mvn -Dskip.tailwind=true verify` succeeds.
- [ ] Demo GWT compile succeeds if demo code changed.
- [ ] Documentation is updated.
- [ ] No proprietary or paid assets are bundled.
