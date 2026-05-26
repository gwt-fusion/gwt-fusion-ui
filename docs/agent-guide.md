# Agent Guide

This guide is for coding agents that generate application code using GWT Fusion.

## Discovery

- Read `llms.txt` first.
- Use `docs/components-index.json` as the canonical machine-readable catalog.
- Use `docs/snippets` if snippet files are added later.
- Use `docs/router.md` for standalone routing examples.
- Use `docs/release-readiness.md` for build, compatibility, test, artifact, and deployment checks.

## Rules

- Use `elemental2.dom` for custom DOM nodes.
- Use GWT Fusion components for UI primitives.
- Do not use classic GWT widgets such as `com.google.gwt.user.client.ui.Widget`.
- Do not introduce GWT-RPC.
- Do not rely on reflection or server-side Java APIs in browser code.
- Prefer fluent component factories over constructors.
- Prefer enum variants and sizes over stringly typed APIs.
- Use static Tailwind class strings only. Do not concatenate dynamic Tailwind class names.
- Every custom component-like object should expose an `HTMLElement` or implement `UiComponent` when it belongs to the UI module.

## Common Imports

```java
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.button.ButtonVariant;
import org.gwtfusion.ui.component.card.Card;
import org.gwtfusion.ui.theme.Direction;
import org.gwtfusion.ui.theme.DirectionManager;
```

## Basic Component Usage

```java
Button save = Button.create("Save")
    .variant(ButtonVariant.DEFAULT)
    .onClick(event -> save());
```

## Composition

```java
Card card = Card.create()
    .add(Card.header()
        .add(Card.title("Project"))
        .add(Card.description("Project details")))
    .add(Card.content()
        .add(Button.create("Open").variant(ButtonVariant.OUTLINE)));
```

## Events

Use semantic listeners when components expose them:

```java
Checkbox.create()
    .checked(true)
    .onCheckedChange(checked -> updateEnabledState(checked));

Slider.create()
    .min(0)
    .max(100)
    .value(50)
    .onValueChange(value -> updatePreview(value));
```

Store `ListenerRegistration` values when listeners need to be removed later.

## Direction And RTL

Direction is separate from theme mode. Use `DirectionManager` to set or detect the root document `dir` attribute explicitly:

```java
DirectionManager.applyDetected();
DirectionManager.set(Direction.RTL);
```

Use logical `START` and `END` sides for overlays and sheets when placement should follow LTR/RTL. Keep physical `LEFT` and `RIGHT` when the edge should not change.

## Theme Tokens

Use token-backed Tailwind classes for themed surfaces instead of hard-coded colors. Cards should use `bg-card text-card-foreground`; floating surfaces such as popovers and menus should use `bg-popover text-popover-foreground`.

## Icons

```java
Button.create("Search")
    .variant(ButtonVariant.OUTLINE)
    .icon(LucideIcons.search());
```

Icon variants use `currentColor` and theme token classes, so `IconVariant.PRIMARY`, `IconVariant.MUTED`, and `IconVariant.DESTRUCTIVE` follow light and dark mode automatically.

## Router

The router is independent from the UI module and renders `HTMLElement` values.

```java
Router router = Router.create(HistoryStrategy.hash())
    .route("/", context -> homeElement())
    .route("/components/:id", context -> componentElement(context.params().get("id")));

router.attach(outlet);
router.navigate("/components/button");
```

Use `HistoryStrategy.hash()` for static hosting. Use `HistoryStrategy.browser()` only when the server has an SPA fallback.

## Do Not Generate

```java
// Do not use classic widgets.
new com.google.gwt.user.client.ui.Button("Save");

// Do not build Tailwind classes dynamically.
component.classes("bg-" + color);
```

## Maintaining Agent Documentation

When adding, renaming, moving, or removing a component, update these files in the same change:

- `llms.txt` if discovery guidance changes.
- `docs/agent-guide.md` if usage rules or examples change.
- `docs/components-index.json` for component metadata.
- Demo examples and human-facing docs when applicable.
