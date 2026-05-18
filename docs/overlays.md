# Overlay Infrastructure

`gwt-fusion-ui` provides small overlay primitives under `org.gwtfusion.ui.overlay`. They back components such as `Dialog`, `Popover`, `Tooltip`, `DropdownMenu`, and the richer `Select`.

The utilities stay explicit and side-effect free where possible. DOM listeners and portals are only attached when application or component code calls the relevant method.

## Utilities

- `IdGenerator`: creates stable, sanitized IDs for ARIA relationships.
- `Keyboard`: centralizes common key names and index navigation helpers.
- `FocusManager`: provides pure index helpers plus focused-element/focus convenience methods for browser code.
- `Aria`: centralizes common ARIA string values and attribute wiring helpers.
- `Portal`: appends overlay DOM to a target element or the document body and returns a removable `ListenerRegistration`.
- `OutsideClick`: registers capture-phase pointer listeners and calls back only when an event target is outside the boundary element.
- `OverlayLayer`: minimal fixed layer with a pointer-events-disabled root and pointer-events-enabled surface.

## Usage Pattern

```java
IdGenerator ids = IdGenerator.create("dialog");
String titleId = ids.next("title");

OverlayLayer layer = OverlayLayer.create();
ListenerRegistration portal = Portal.appendToBody(layer.element());

// Later, close and remove the overlay.
portal.remove();
```

Overlay components should compose these utilities instead of adding separate global registries or static DOM initialization.

## Components

- `Tooltip`: opens on hover and focus, renders `role="tooltip"` content, and supports `OverlaySide.TOP`, `RIGHT`, `BOTTOM`, and `LEFT` placement.
- `Popover`: non-modal trigger/content overlay with outside-click, Escape handling, and configurable `OverlaySide` placement.
- `Dialog`: modal overlay with `aria-modal`, Escape handling, backdrop click close, and focus return.
- `AlertDialog`: `Dialog` wrapper using `role="alertdialog"` for confirmation flows.
- `DropdownMenu`: trigger menu with menu roles, configurable `OverlaySide` placement, and Arrow/Home/End/Enter/Space/Escape keyboard support.
- `ContextMenu`: right-click menu using the same menu keyboard behavior and configurable `OverlaySide` pointer offset direction.
- `HoverCard`: hover/focus-triggered rich content panel with trigger-anchored placement, scroll/resize repositioning, and configurable show/hide delays in milliseconds.
- `Sheet`: modal edge panel built on `Dialog` behavior.
- `Drawer`: modal bottom panel built on `Dialog` behavior.

Overlay examples in the demo include accessibility notes for focus return, Escape handling, ARIA roles, and keyboard menu navigation.
