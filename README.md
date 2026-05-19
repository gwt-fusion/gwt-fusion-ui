# GWT Fusion

GWT Fusion is a Maven multi-module project for a GWT 2.13 and J2CL-compatible UI component library.

## Modules

- `gwt-fusion-ui`: Component library under `org.gwtfusion.ui`.
- `gwt-fusion-icons-lucide`: Optional Lucide icon module, separate from the core UI.
- `gwt-fusion-ui-demo`: Example web application with visual component demos and Java code samples.

## Build

Fast JVM build without Tailwind/Node download:

```bash
mvn -Dskip.tailwind=true verify
```

CSS build for the UI library:

```bash
mvn -pl gwt-fusion-ui generate-resources
```

Demo GWT compile is prepared:

```bash
mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package
```

## Example

```java
Button button = Button.create("Save")
    .variant(ButtonVariant.DEFAULT)
    .size(ButtonSize.MD);
```

Dark Mode:

```java
ThemeManager.setMode(ThemeMode.DARK);
```

Semantic component events:

```java
Slider.create()
    .min(0)
    .max(100)
    .value(65)
    .onValueChange(value -> {
        // Live value while dragging.
    });
```

## Current Components

| | | |
|---|---|---|
| `Accordion` | `Alert` | `AlertDialog` |
| `AspectRatio` | `Autocomplete` | `Avatar` |
| `Badge` | `Breadcrumb` | `Button` |
| `ButtonGroup` | `Calendar` | `Card` |
| `Carousel` | `Checkbox` | `CodeBlock` |
| `Collapsible` | `Combobox` | `CommandMenu` |
| `CommandPalette` | `ContextMenu` | `DataTable` |
| `DatePicker` | `Dialog` | `Drawer` |
| `DropdownMenu` | `EmptyState` | `FormDescription` |
| `FormField` | `FormLabel` | `FormMessage` |
| `HoverCard` | `Icon` | `Input` |
| `InputGroup` | `Item` | `Kbd` |
| `Label` | `MultiSelect` | `NativeSelect` |
| `Pagination` | `Popover` | `Progress` |
| `RadioGroup` | `Resizable` | `ScrollArea` |
| `Separator` | `Sheet` | `Skeleton` |
| `Slider` | `Spinner` | `StatusIndicator` |
| `Switch` | `Table` | `Tabs` |
| `Textarea` | `Timeline` | `Toast` |
| `ToastManager` | `Toggle` | `ToggleGroup` |
| `Tooltip` | `Typography` | |

## Design Principles

- DOM-based using `elemental2.dom`.
- Tailwind CSS for styling.
- shadcn-inspired theme tokens.
- Java-idiomatic API with enums and fluent methods.
- No hard coupling to classic GWT Widgets.
- Code-splitting at the application level, demonstrated via `GWT.runAsync` in the demo.

Further API details:

- `docs/events.md`
- `docs/icons.md`
- `docs/icon-modules.md`
- `docs/overlays.md`

Development rules are in `AGENTS.md`.
