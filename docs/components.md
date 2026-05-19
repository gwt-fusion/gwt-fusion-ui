# Components

## Implemented

- Button
- Badge
- Card
- Alert
- AlertDialog
- Autocomplete
- Input
- Label
- Separator
- Checkbox
- Switch
- Textarea
- RadioGroup
- FormField
- FormLabel
- FormDescription
- FormMessage
- NativeSelect
- InputGroup
- Slider
- Tabs
- CodeBlock
- Accordion
- Collapsible
- Combobox
- CommandMenu
- CommandPalette
- AspectRatio
- ButtonGroup
- Breadcrumb
- Pagination
- ScrollArea
- Toggle
- ToggleGroup
- Typography
- Icon
- Tooltip
- Popover
- Dialog
- DropdownMenu
- ContextMenu
- HoverCard
- Sheet
- Drawer
- Progress
- Skeleton
- Spinner
- EmptyState
- StatusIndicator
- Toast
- ToastManager
- Table
- DataTable
- Avatar
- Kbd
- Item
- Timeline
- Calendar
- DatePicker
- Carousel
- MultiSelect
- Resizable

## Next Candidates

- InputOtp
- Select
- NavigationMenu
- Sidebar
- Menubar
- Chart

## Component Contract

- Components implement `UiComponent`.
- The root element is exposed through `element()`.
- Variants and sizes are modeled with enums.
- Tailwind classes are static or safelisted.
- Accessibility attributes belong in the component when they are required for correct behavior.
