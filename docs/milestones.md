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

- [ ] Decide whether `CommandPalette` is needed for the first public release or should remain optional advanced UX.
- [ ] Document the distinction between GWT `Command` callbacks and the shadcn-inspired command-palette UI pattern.
- [ ] Avoid a public UI component named only `Command` to prevent confusion with `com.google.gwt.user.client.Command`.
- [ ] Implement `CommandMenu` as the reusable filterable list primitive if command-palette UX is needed.
- [ ] Implement `CommandPalette` using `CommandMenu` and overlay utilities.
- [ ] Define `CommandItem` and `CommandAction` naming if callbacks need a dedicated API.
- [ ] Implement `Combobox`.
- [ ] Implement `MultiSelect`.
- [ ] Implement `Autocomplete`.
- [ ] Implement `Resizable`.
- [ ] Reuse overlay, keyboard, and focus utilities consistently.
- [ ] Add examples with filtering and empty results.
- [ ] Add keyboard-first workflow examples to the demo.
- [ ] Document how Java values map to rendered options.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 13: Direction, RTL, And Theming Depth

- [ ] Decide how `Direction` and RTL support should be represented in Java.
- [ ] Decide whether direction belongs in `ThemeManager`, a new `DirectionManager`, or document-level utilities.
- [ ] Add `dir` support for components that need directional behavior.
- [ ] Audit components for left/right Tailwind classes that may need logical alternatives.
- [ ] Add RTL examples to the demo.
- [ ] Expand theme token coverage if needed.
- [ ] Add theme-aware icon examples once icons exist.
- [ ] Verify light and dark mode for all implemented components.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 14: Build, Tests, And Release Readiness

- [ ] Decide how strict J2CL compatibility checks should become in Maven.
- [ ] Add or document a J2CL compatibility profile.
- [ ] Decide browser-test strategy: GWT tests, Playwright, or later J2CL-compatible setup.
- [ ] Add browser/demo smoke tests if feasible.
- [ ] Review Tailwind safelist strategy.
- [ ] Decide whether Tailwind safelist entries should be generated from component enums.
- [ ] Ensure every component has demo examples.
- [ ] Ensure every component has at least enum/class mapping or pure Java state tests.
- [ ] Ensure license and attribution files exist for bundled assets.
- [ ] Review generated artifacts and `.gitignore` rules.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify `mvn -pl gwt-fusion-ui generate-resources`.
- [ ] Verify `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package`.
- [ ] Verify GitHub Pages deployment workflow.

## Milestone 15: Additional Icon Packs

- [ ] Add Maven module `gwt-fusion-icons-tabler`.
- [ ] Include Tabler attribution and license files.
- [ ] Implement `TablerIconProvider`.
- [ ] Implement `TablerIcons` static factory API.
- [ ] Add a minimal set of commonly used Tabler icons.
- [ ] Add Maven module `gwt-fusion-icons-heroicons`.
- [ ] Include Heroicons attribution and license files.
- [ ] Decide how Heroicons outline, solid, and mini variants should be represented.
- [ ] Implement `HeroIconProvider`.
- [ ] Implement `HeroIcons` static factory API.
- [ ] Add a minimal set of commonly used Heroicons.
- [ ] Add Maven module `gwt-fusion-icons-phosphor`.
- [ ] Include Phosphor attribution and license files.
- [ ] Decide how Phosphor weights such as thin, light, regular, bold, fill, and duotone should be represented.
- [ ] Implement `PhosphorIconProvider`.
- [ ] Implement `PhosphorIcons` static factory API.
- [ ] Add a minimal set of commonly used Phosphor icons.
- [ ] Ensure each icon pack remains independently usable without pulling in the other icon modules.
- [ ] Ensure each icon module contains only its own icon assets and metadata.
- [ ] Ensure each icon module avoids global CSS, icon fonts, heavy static initialization, and implicit global registration.
- [ ] Add demo examples that show switching between independently imported icon packs.
- [ ] Verify each icon module build through Maven.
- [ ] Verify demo can use multiple icon modules together.
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
