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

- [x] Add demo examples that show switching between Lucide, Tabler, Heroicons, and Phosphor.
- [x] Add an `IconRegistry` example with independently registered providers for all icon packs.
- [x] Update `docs/icon-modules.md` with all implemented icon modules, style/weight APIs, GWT module names, and dependency examples.
- [x] Update `docs/icons.md` with multi-pack usage guidance.
- [x] Update `docs/components-index.json` non-component APIs with the new icon factories.
- [x] Update `llms.txt` and `docs/agent-guide.md` for agent discovery.
- [x] Ensure each icon module contains only its own icon assets and metadata.
- [x] Ensure no proprietary, paid, or pro icon assets are bundled.
- [x] Verify all icon modules build through Maven.
- [x] Verify the demo can use multiple icon modules together.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 16: Professional Webapp Infrastructure Foundation

Milestone 16 introduces optional application-infrastructure modules so GWT Fusion can support production webapps without coupling the UI package to backend, persistence, or authentication choices. New modules must remain GWT 2.13 and J2CL-compatible, avoid GWT-RPC as a core dependency, avoid reflection-based JSON mapping, and expose Java-idiomatic APIs.

### Milestone 16.1: HTTP And REST Client

- [x] Add Maven module `gwt-fusion-http`.
- [x] Use package `org.gwtfusion.http` and GWT module `org.gwtfusion.http.GwtFusionHttp`.
- [x] Implement a small `HttpClient` as a Java-idiomatic wrapper over Elemental2 `DomGlobal.fetch`; do not duplicate or replace the browser HTTP transport.
- [x] Implement `HttpRequest`, `HttpResponse`, `HttpMethod`, `HttpHeaders`, and `HttpError` primitives.
- [x] Support request headers, query parameters, JSON request bodies, text bodies, and empty bodies.
- [x] Support typed response parsing through explicit parser functions rather than reflection.
- [x] Support request interceptors for auth headers, CSRF headers, correlation IDs, and shared error handling.
- [x] Support response interceptors for common status handling and token-refresh handoff.
- [x] Keep the API backend-agnostic and compatible with REST, OpenAPI-generated clients, and custom endpoints.
- [x] Document why GWT-RPC/GWT Services are not part of the core HTTP module.
- [x] Add demo examples using mocked or static endpoints without depending on a live external service.
- [x] Add JVM tests for URL/query construction, headers, request options, error mapping, and parser contracts.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile if demo code changed.

### Milestone 16.2: Storage Utilities

- [x] Add Maven module `gwt-fusion-storage`.
- [x] Use package `org.gwtfusion.storage` and GWT module `org.gwtfusion.storage.GwtFusionStorage`.
- [x] Implement typed wrappers for `localStorage`, `sessionStorage`, and in-memory fallback storage.
- [x] Implement `StorageArea`, `StorageKey<T>`, `StorageCodec<T>`, and `StorageEntry<T>` primitives.
- [x] Support namespacing so apps and libraries avoid key collisions.
- [x] Support optional TTL/expiration metadata for cached entries, tokens, and preferences.
- [x] Handle unavailable or blocked browser storage gracefully with memory fallback.
- [x] Keep serialization explicit through codecs; do not use reflection-based JSON libraries.
- [x] Provide examples for theme/user preferences, draft form persistence, and token storage handoff.
- [x] Add JVM tests for key composition, TTL behavior, codec behavior, fallback storage, and null handling.
- [x] Verify `mvn -Dskip.tailwind=true verify`.

### Milestone 16.3: Auth State And Router Guards

- [x] Add Maven module `gwt-fusion-auth`.
- [x] Use package `org.gwtfusion.auth` and GWT module `org.gwtfusion.auth.GwtFusionAuth`.
- [x] Model auth state with `AuthState`, `AuthSession`, `AuthToken`, and `AuthUser` primitives.
- [x] Support anonymous, loading, authenticated, expired, and failed states.
- [x] Integrate with `gwt-fusion-storage` for token/session persistence without hard-coding storage policy.
- [x] Integrate with `gwt-fusion-http` through an auth-header interceptor.
- [x] Provide token refresh hooks without assuming a specific OAuth, JWT, or cookie strategy.
- [x] Add optional router guard helpers for `gwt-fusion-router` without making the router depend on auth.
- [x] Support listener registration for auth-state changes.
- [x] Document recommended patterns for JWT bearer tokens, cookie-backed sessions, and logout cleanup.
- [x] Add demo examples for protected routes, login/logout state, and auth-aware navigation.
- [x] Add JVM tests for state transitions, listener registration, storage handoff, and guard decisions.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile if demo code changed.

## Milestone 17: Data Fetching, Query State, And Forms

Milestone 17 builds on HTTP and storage with TanStack Query-inspired data fetching plus validation utilities. The goal is to make loading, error, empty, success, retry, cache, and mutation states first-class Java concepts that compose naturally with `Skeleton`, `Alert`, `EmptyState`, `Toast`, `DataTable`, and form components.

### Milestone 17.1: TanStack Query-Inspired Data Module

- [x] Add Maven module `gwt-fusion-query`.
- [x] Use package `org.gwtfusion.query` and GWT module `org.gwtfusion.query.GwtFusionQuery`.
- [x] Implement `QueryClient`, `QueryKey`, `Query<T>`, `QueryState<T>`, `QueryObserver<T>`, and `QueryOptions`.
- [x] Support loading, success, error, stale, refreshing, and idle states.
- [x] Support request de-duplication for in-flight queries with the same key.
- [x] Support `staleTime`, `cacheTime` or `gcTime`, manual `refetch()`, and `invalidate(QueryKey)`.
- [x] Support retry and retry-delay policies with simple backoff helpers.
- [x] Support disabled/lazy queries that start only after required inputs are available.
- [x] Support query observers with `ListenerRegistration` for clean subscription removal.
- [x] Support mutation primitives with loading/error/success state and optional optimistic update hooks.
- [x] Keep query fetchers generic so they can use `gwt-fusion-http`, generated OpenAPI clients, or legacy async services through adapters.
- [x] Add demo examples that wire `Skeleton`, `Alert`, `EmptyState`, `Toast`, and `DataTable` to query state.
- [x] Add JVM tests for query keys, cache behavior, observer behavior, invalidation, retry decisions, stale decisions, and mutation state.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile if demo code changed.

### Milestone 17.2: Query UI Helpers

- [x] Decide whether query UI helpers belong in `gwt-fusion-query` or a separate optional `gwt-fusion-query-ui` module.
- [x] Implement a minimal `QueryView<T>` or equivalent helper only if it reduces repeated demo/application boilerplate.
- [x] Support configurable renderers for loading, error, empty, and success states.
- [x] Keep UI helpers optional so `gwt-fusion-query` remains usable without `gwt-fusion-ui`.
- [x] Provide examples for list loading, detail loading, retry button, empty results, and mutation success toast.
- [x] Add tests for state-to-renderer selection if implemented without DOM creation.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile if demo code changed.

### Milestone 17.3: Validation Module

- [ ] Add Maven module `gwt-fusion-validation`.
- [ ] Use package `org.gwtfusion.validation` and GWT module `org.gwtfusion.validation.GwtFusionValidation`.
- [ ] Implement `Validator<T>`, `ValidationResult`, `FieldError`, `FormErrors`, and `ValidationRule<T>` primitives.
- [ ] Provide built-in validators for required, email, min length, max length, numeric min/max, regex pattern, and custom predicates.
- [ ] Support field-level and form-level validation.
- [ ] Support mapping backend validation errors from HTTP/OpenAPI responses into `FormErrors`.
- [ ] Keep the core validation module independent from UI components.
- [ ] Add optional examples showing validation state on `FormField`, `Input`, `Textarea`, `NativeSelect`, `Checkbox`, and submit buttons.
- [ ] Add JVM tests for built-in validators, custom validators, error aggregation, and backend-error mapping.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile if demo code changed.

## Milestone 18: Typed API Client Generation

Milestone 18 adds code generation so applications can work with real Java DTOs and typed API clients instead of loose JSON maps. OpenAPI should be the initial source format because it is backend-agnostic, widely supported, and fits REST-first professional applications.

### Milestone 18.1: OpenAPI Codegen Spike

- [ ] Add a small generator module or tooling package for OpenAPI-driven code generation.
- [ ] Decide whether the first implementation is a Maven plugin, a standalone generator, or both.
- [ ] Generate Java DTOs from a constrained OpenAPI schema subset: objects, strings, numbers, booleans, arrays, enums, and nested objects.
- [ ] Generate explicit `fromJson` and `toJson` methods without reflection.
- [ ] Use J2CL-friendly JSON access helpers around `JsPropertyMap` or equivalent Elemental2-compatible structures.
- [ ] Generate API client classes that call `gwt-fusion-http`.
- [ ] Generate typed methods from `operationId`, path parameters, query parameters, request bodies, and typed responses.
- [ ] Generate checked or unchecked API error models consistent with `gwt-fusion-http`.
- [ ] Include a tiny sample OpenAPI document in the demo or test resources.
- [ ] Add tests that compare generated source output for simple schemas and endpoints.
- [ ] Verify generated clients compile in a GWT/J2CL-compatible Maven build.

### Milestone 18.2: Query-Aware Generated Clients

- [ ] Generate query key helpers for list, detail, and parameterized endpoints.
- [ ] Generate optional query factory helpers that integrate typed API client methods with `gwt-fusion-query`.
- [ ] Generate mutation helpers for POST, PUT, PATCH, and DELETE operations.
- [ ] Support invalidation hints for related generated query keys where OpenAPI tags or operation metadata are sufficient.
- [ ] Add demo examples showing generated API clients feeding query state, skeletons, empty states, and tables.
- [ ] Document how generated code avoids reflection and why it is preferred over raw JSON handling.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile if demo code changed.

## Milestone 19: Internationalization, Runtime Config, And Notifications

Milestone 19 rounds out production-app needs after HTTP/query/codegen foundations exist. These modules are important but should not block the core data stack.

### Milestone 19.1: Internationalization

- [ ] Add Maven module `gwt-fusion-i18n`.
- [ ] Use package `org.gwtfusion.i18n` and GWT module `org.gwtfusion.i18n.GwtFusionI18n`.
- [ ] Implement locale selection, message lookup, parameter interpolation, and fallback locale behavior.
- [ ] Decide whether message bundles are generated Java classes, JSON resources, or both.
- [ ] Support explicit locale switching without global static side effects.
- [ ] Provide examples for UI labels, validation messages, date labels, and route titles.
- [ ] Add JVM tests for fallback, interpolation, missing keys, and locale switching.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.

### Milestone 19.2: Runtime Config And Feature Flags

- [ ] Add Maven module `gwt-fusion-config`.
- [ ] Use package `org.gwtfusion.config` and GWT module `org.gwtfusion.config.GwtFusionConfig`.
- [ ] Implement `RuntimeConfig`, `ConfigKey<T>`, and `FeatureFlag` primitives.
- [ ] Support config loaded from generated constants, embedded JSON, or a runtime endpoint.
- [ ] Support typed config access without reflection.
- [ ] Support feature flags for enabling routes, UI sections, or experimental query behavior.
- [ ] Add examples for API base URL, environment label, and feature-gated demo content.
- [ ] Add JVM tests for typed keys, default values, parsing, and feature flag decisions.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.

### Milestone 19.3: Browser Notifications

- [ ] Add Maven module `gwt-fusion-notifications` if browser notification support should be separate from UI `Toast`.
- [ ] Use package `org.gwtfusion.notifications` and GWT module `org.gwtfusion.notifications.GwtFusionNotifications`.
- [ ] Implement permission-state helpers for the Browser Notification API.
- [ ] Implement notification creation helpers with title, body, icon, tag, and click callback support where browser APIs allow it.
- [ ] Provide a bridge pattern from query/mutation outcomes to `ToastManager` and optional browser notifications.
- [ ] Document that `Toast` remains the in-page notification system and browser notifications require permission.
- [ ] Defer Web Push/service-worker delivery unless a concrete PWA milestone is started.
- [ ] Add demo examples for permission request, granted/denied/default states, and fallback to toast.
- [ ] Add JVM tests for permission-state mapping and notification option construction where possible.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.

## Milestone 20: Shared Base Module

Milestone 20 extracts small cross-module primitives that currently appear in multiple independent modules. The goal is to reduce duplication without making infrastructure modules depend on `gwt-fusion-ui`, preserving standalone use for router, auth, query, storage, and future modules.

### Milestone 20.1: Core Primitives Extraction

- [ ] Add Maven module `gwt-fusion-core`.
- [ ] Use package `org.gwtfusion.core` and GWT module `org.gwtfusion.core.GwtFusionCore`.
- [ ] Move shared `ListenerRegistration` semantics into `gwt-fusion-core`.
- [ ] Provide `ListenerRegistration.empty()` and `ListenerRegistration.combine(...)` in the core module.
- [ ] Audit existing duplicates in `gwt-fusion-ui`, `gwt-fusion-router`, and `gwt-fusion-query`.
- [ ] Decide whether to keep module-local adapter types temporarily for source compatibility or migrate imports directly.
- [ ] Update `gwt-fusion-ui`, `gwt-fusion-router`, `gwt-fusion-auth`, and `gwt-fusion-query` to depend on `gwt-fusion-core` only where needed.
- [ ] Evaluate whether other tiny shared contracts belong in core, such as value-change listener primitives, while avoiding UI-specific APIs.
- [ ] Keep `gwt-fusion-core` free of DOM dependencies unless a primitive explicitly requires Elemental2.
- [ ] Update docs, agent guide, and component index with the new module.
- [ ] Add JVM tests for shared listener behavior.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.

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
