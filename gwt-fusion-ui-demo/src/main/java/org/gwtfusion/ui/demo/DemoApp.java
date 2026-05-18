package org.gwtfusion.ui.demo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLInputElement;
import elemental2.dom.KeyboardEvent;
import org.gwtfusion.icons.lucide.LucideIcons;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.alert.Alert;
import org.gwtfusion.ui.component.alert.AlertVariant;
import org.gwtfusion.ui.component.alertdialog.AlertDialog;
import org.gwtfusion.ui.component.accordion.Accordion;
import org.gwtfusion.ui.component.aspectratio.AspectRatio;
import org.gwtfusion.ui.component.avatar.Avatar;
import org.gwtfusion.ui.component.avatar.AvatarSize;
import org.gwtfusion.ui.component.badge.Badge;
import org.gwtfusion.ui.component.badge.BadgeVariant;
import org.gwtfusion.ui.component.breadcrumb.Breadcrumb;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.buttongroup.ButtonGroup;
import org.gwtfusion.ui.component.button.ButtonSize;
import org.gwtfusion.ui.component.button.ButtonVariant;
import org.gwtfusion.ui.component.calendar.Calendar;
import org.gwtfusion.ui.component.card.Card;
import org.gwtfusion.ui.component.carousel.Carousel;
import org.gwtfusion.ui.component.checkbox.Checkbox;
import org.gwtfusion.ui.component.code.CodeBlock;
import org.gwtfusion.ui.component.collapsible.Collapsible;
import org.gwtfusion.ui.component.contextmenu.ContextMenu;
import org.gwtfusion.ui.component.datatable.DataTable;
import org.gwtfusion.ui.component.datepicker.DatePicker;
import org.gwtfusion.ui.component.dialog.Dialog;
import org.gwtfusion.ui.component.drawer.Drawer;
import org.gwtfusion.ui.component.dropdown.DropdownMenu;
import org.gwtfusion.ui.component.emptystate.EmptyState;
import org.gwtfusion.ui.component.form.FormField;
import org.gwtfusion.ui.component.hovercard.HoverCard;
import org.gwtfusion.ui.component.icon.IconRegistry;
import org.gwtfusion.ui.component.icon.IconSize;
import org.gwtfusion.ui.component.icon.IconVariant;
import org.gwtfusion.ui.component.input.Input;
import org.gwtfusion.ui.component.inputgroup.InputGroup;
import org.gwtfusion.ui.component.item.Item;
import org.gwtfusion.ui.component.kbd.Kbd;
import org.gwtfusion.ui.component.label.Label;
import org.gwtfusion.ui.component.pagination.Pagination;
import org.gwtfusion.ui.component.popover.Popover;
import org.gwtfusion.ui.component.progress.Progress;
import org.gwtfusion.ui.component.radio.RadioGroup;
import org.gwtfusion.ui.component.radio.RadioGroupOrientation;
import org.gwtfusion.ui.component.scrollarea.ScrollArea;
import org.gwtfusion.ui.component.select.NativeSelect;
import org.gwtfusion.ui.component.separator.Separator;
import org.gwtfusion.ui.component.separator.SeparatorOrientation;
import org.gwtfusion.ui.component.sheet.Sheet;
import org.gwtfusion.ui.component.sheet.SheetSide;
import org.gwtfusion.ui.component.skeleton.Skeleton;
import org.gwtfusion.ui.component.slider.Slider;
import org.gwtfusion.ui.component.spinner.Spinner;
import org.gwtfusion.ui.component.spinner.SpinnerSize;
import org.gwtfusion.ui.component.status.StatusIndicator;
import org.gwtfusion.ui.component.status.StatusIndicatorVariant;
import org.gwtfusion.ui.component.switcher.Switch;
import org.gwtfusion.ui.component.tabs.Tabs;
import org.gwtfusion.ui.component.tabs.TabsOrientation;
import org.gwtfusion.ui.component.tabs.TabsVariant;
import org.gwtfusion.ui.component.table.Table;
import org.gwtfusion.ui.component.textarea.Textarea;
import org.gwtfusion.ui.component.timeline.Timeline;
import org.gwtfusion.ui.component.toggle.Toggle;
import org.gwtfusion.ui.component.toggle.ToggleVariant;
import org.gwtfusion.ui.component.toast.Toast;
import org.gwtfusion.ui.component.toast.ToastManager;
import org.gwtfusion.ui.component.toast.ToastStyle;
import org.gwtfusion.ui.component.toast.ToastVariant;
import org.gwtfusion.ui.component.tooltip.Tooltip;
import org.gwtfusion.ui.component.togglegroup.ToggleGroup;
import org.gwtfusion.ui.component.togglegroup.ToggleGroupType;
import org.gwtfusion.ui.component.typography.Typography;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.overlay.Aria;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;
import org.gwtfusion.ui.overlay.OutsideClick;
import org.gwtfusion.ui.overlay.OverlayLayer;
import org.gwtfusion.ui.overlay.OverlaySide;
import org.gwtfusion.ui.overlay.Portal;
import org.gwtfusion.ui.theme.ThemeManager;
import org.gwtfusion.ui.theme.ThemeMode;

public final class DemoApp implements EntryPoint {
    private static final int ICON_GALLERY_LIMIT = 120;

    private HTMLElement content;
    private HTMLElement componentTabs;
    private HTMLElement componentPanel;
    private String selectedComponentId;

    private interface ComponentRenderer {
        void render(HTMLElement grid);
    }

    private static final class ComponentDemo {
        final String id;
        final String category;
        final String title;
        final String description;
        final ComponentRenderer renderer;
        HTMLElement tab;

        ComponentDemo(String id, String category, String title, String description, ComponentRenderer renderer) {
            this.id = id;
            this.category = category;
            this.title = title;
            this.description = description;
            this.renderer = renderer;
        }
    }

    @Override
    public void onModuleLoad() {
        ThemeManager.apply();
        HTMLElement app = (HTMLElement) DomGlobal.document.getElementById("app");
        app.appendChild(shell());
        renderHome();
    }

    private HTMLElement shell() {
        HTMLElement shell = element("div", "demo-shell");
        HTMLElement header = element("header", "demo-header");
        header.appendChild(textElement("div", "demo-brand", "GWT Fusion UI"));
        header.appendChild(Button.create("Toggle theme").variant(ButtonVariant.OUTLINE).onClick(event -> toggleTheme()).element());
        shell.appendChild(header);

        HTMLElement layout = element("div", "demo-layout");
        HTMLElement nav = element("nav", "demo-nav");
        nav.appendChild(Button.create("Home").variant(ButtonVariant.GHOST).onClick(event -> renderHome()).element());
        nav.appendChild(Button.create("Components").variant(ButtonVariant.GHOST).onClick(event -> renderComponentsAsync()).element());
        nav.appendChild(Button.create("Icons").variant(ButtonVariant.GHOST).onClick(event -> renderIconsAsync()).element());
        nav.appendChild(Button.create("Theme").variant(ButtonVariant.GHOST).onClick(event -> renderTheme()).element());
        layout.appendChild(nav);

        content = element("section", "demo-content");
        layout.appendChild(content);
        shell.appendChild(layout);
        return shell;
    }

    private void toggleTheme() {
        ThemeManager.setMode(ThemeManager.mode() == ThemeMode.DARK ? ThemeMode.LIGHT : ThemeMode.DARK);
    }

    private void renderHome() {
        clearContent();
        HTMLElement hero = element("div", "demo-hero");
        hero.appendChild(textElement("h1", "", "GWT UI components with Tailwind DNA"));
        hero.appendChild(textElement("p", "demo-muted", "A DOM-based component library for GWT 2.13 and J2CL-compatible applications. The API feels natural in Java, while the styling follows Tailwind and shadcn-inspired theme tokens."));
        content.appendChild(hero);

        content.appendChild(example("First button",
                Button.create("Save").variant(ButtonVariant.DEFAULT),
                "Button.create(\"Save\")\n    .variant(ButtonVariant.DEFAULT);"));
    }

    private void renderComponentsAsync() {
        renderComponents();
    }

    private void renderIconsAsync() {
        clearContent();
        content.appendChild(textElement("p", "demo-muted", "Loading the Lucide icon gallery through GWT.runAsync keeps the full icon catalog out of the initial demo path."));
        GWT.runAsync(new RunAsyncCallback() {
            @Override
            public void onFailure(Throwable reason) {
                content.appendChild(textElement("p", "demo-muted", "Icons could not be loaded: " + reason.getMessage()));
            }

            @Override
            public void onSuccess() {
                renderIconsPage();
            }
        });
    }

    private void renderComponents() {
        clearContent();
        content.appendChild(textElement("h1", "", "Components"));
        content.appendChild(textElement("p", "demo-muted", "Pick one component from the vertical tabs. The selected component examples are loaded through GWT.runAsync, so the demo only renders the area the visitor is currently viewing."));

        ComponentDemo[] demos = componentDemos();
        HTMLElement browser = element("div", "demo-component-browser");
        componentTabs = element("nav", "demo-component-tabs");
        componentTabs.setAttribute("aria-label", "Components");
        componentTabs.setAttribute("role", "tablist");
        componentTabs.setAttribute("aria-orientation", "vertical");

        String previousCategory = "";
        for (ComponentDemo demo : demos) {
            if (!demo.category.equals(previousCategory)) {
                componentTabs.appendChild(textElement("div", "demo-component-tab-group", demo.category));
                previousCategory = demo.category;
            }
            HTMLElement tab = element("button", "demo-component-tab");
            tab.setAttribute("type", "button");
            tab.setAttribute("role", "tab");
            tab.setAttribute("aria-controls", "component-panel");
            tab.textContent = demo.title;
            tab.addEventListener("click", event -> selectComponent(demos, demo));
            demo.tab = tab;
            componentTabs.appendChild(tab);
        }

        componentPanel = element("section", "demo-component-panel");
        componentPanel.setAttribute("id", "component-panel");
        componentPanel.setAttribute("role", "tabpanel");

        browser.appendChild(componentTabs);
        browser.appendChild(componentPanel);
        content.appendChild(browser);

        ComponentDemo initial = demos[0];
        if (selectedComponentId != null) {
            for (ComponentDemo demo : demos) {
                if (demo.id.equals(selectedComponentId)) {
                    initial = demo;
                    break;
                }
            }
        }
        selectComponent(demos, initial);
    }

    private ComponentDemo[] componentDemos() {
        return new ComponentDemo[] {
                componentDemo("button", "Actions", "Button", "Action triggers with variants, sizes, icons, and disabled states.", this::renderButtonComponent),
                componentDemo("badge", "Actions", "Badge", "Inline status labels for metadata, state, and counts.", this::renderBadgeComponent),
                componentDemo("button-group", "Actions", "ButtonGroup", "Grouped buttons that read as a single segmented action surface.", this::renderButtonGroupComponent),
                componentDemo("toggle", "Actions", "Toggle", "A pressed/unpressed button primitive for local state.", this::renderToggleComponent),
                componentDemo("toggle-group", "Actions", "ToggleGroup", "Single or multiple value selection built from Toggle controls.", this::renderToggleGroupComponent),

                componentDemo("icon", "Media", "Icon", "SVG-first icons with decorative and accessible label modes.", this::renderIcons),

                componentDemo("card", "Layout", "Card", "A structured surface for related content and actions.", this::renderCardComponent),
                componentDemo("tabs", "Layout", "Tabs", "Keyboard-friendly tab panels for related content.", this::renderTabsComponent),
                componentDemo("accordion", "Layout", "Accordion", "Disclosure rows for progressively revealing content.", this::renderAccordionComponent),
                componentDemo("collapsible", "Layout", "Collapsible", "A standalone show/hide primitive for compact content.", this::renderCollapsibleComponent),
                componentDemo("aspect-ratio", "Layout", "AspectRatio", "Fixed-ratio containers for media and placeholders.", this::renderAspectRatioComponent),
                componentDemo("breadcrumb", "Navigation", "Breadcrumb", "Hierarchical navigation for page location context.", this::renderBreadcrumbComponent),
                componentDemo("pagination", "Navigation", "Pagination", "Page navigation for list and search results.", this::renderPaginationComponent),
                componentDemo("scroll-area", "Layout", "ScrollArea", "Constrained regions with native scrolling behavior.", this::renderScrollAreaComponent),
                componentDemo("separator", "Layout", "Separator", "Horizontal and vertical visual dividers.", this::renderSeparatorComponent),
                componentDemo("typography", "Layout", "Typography", "Reusable text styles for headings, body text, and muted copy.", this::renderTypographyComponent),
                componentDemo("code-block", "Layout", "CodeBlock", "Code snippets with language metadata and consistent styling.", this::renderCodeBlockComponent),

                componentDemo("table", "Data Display", "Table", "Basic table primitives for headers, rows, cells, captions, and empty-state composition.", this::renderTableComponent),
                componentDemo("data-table", "Data Display", "DataTable", "Small data table wrapper for string data, filtering, and empty states.", this::renderDataTableComponent),
                componentDemo("avatar", "Data Display", "Avatar", "Identity display with image, fallback text, and size variants.", this::renderAvatarComponent),
                componentDemo("kbd", "Data Display", "Kbd", "Keyboard shortcut tokens for documentation and command surfaces.", this::renderKbdComponent),
                componentDemo("item", "Data Display", "Item", "Reusable row primitive for lists, results, and dashboard summaries.", this::renderItemComponent),
                componentDemo("timeline", "Data Display", "Timeline", "Chronological event display for activity feeds and release notes.", this::renderTimelineComponent),
                componentDemo("calendar", "Data Display", "Calendar", "Month grid display with selected-day callbacks.", this::renderCalendarComponent),
                componentDemo("date-picker", "Data Display", "DatePicker", "Popover-backed date selection built on Calendar.", this::renderDatePickerComponent),
                componentDemo("carousel", "Data Display", "Carousel", "Simple slide display with previous and next controls.", this::renderCarouselComponent),

                componentDemo("input", "Forms", "Input", "Text, email, password, and search fields.", this::renderInputComponent),
                componentDemo("label", "Forms", "Label", "Accessible labels connected to form controls.", this::renderLabelComponent),
                componentDemo("checkbox", "Forms", "Checkbox", "Boolean controls with checked, disabled, and invalid states.", this::renderCheckboxComponent),
                componentDemo("switch", "Forms", "Switch", "Boolean toggle control with semantic checked-change callbacks.", this::renderSwitchComponent),
                componentDemo("textarea", "Forms", "Textarea", "Multiline text entry with rows, values, and disabled state.", this::renderTextareaComponent),
                componentDemo("radio-group", "Forms", "RadioGroup", "Single-choice grouped radio controls.", this::renderRadioGroupComponent),
                componentDemo("native-select", "Forms", "NativeSelect", "Native select control with Java-friendly option APIs.", this::renderNativeSelectComponent),
                componentDemo("input-group", "Forms", "InputGroup", "Input composition with leading and trailing adornments.", this::renderInputGroupComponent),
                componentDemo("slider", "Forms", "Slider", "Range input with live and committed value listeners.", this::renderSliderComponent),
                componentDemo("form-field", "Forms", "FormField", "Label, control, description, and validation message composition.", this::renderFormFieldComponent),

                componentDemo("dialog", "Overlays", "Dialog", "Modal focused tasks with Escape, backdrop close, and focus return.", this::renderDialogComponent),
                componentDemo("alert-dialog", "Overlays", "AlertDialog", "Destructive or high-risk confirmation dialog pattern.", this::renderAlertDialogComponent),
                componentDemo("popover", "Overlays", "Popover", "Non-modal floating content anchored to a trigger.", this::renderPopoverComponent),
                componentDemo("tooltip", "Overlays", "Tooltip", "Short contextual help across all overlay sides.", this::renderTooltipComponent),
                componentDemo("hover-card", "Overlays", "HoverCard", "Hover-triggered rich content with delays and anchoring.", this::renderHoverCardComponent),
                componentDemo("dropdown-menu", "Overlays", "DropdownMenu", "Trigger-anchored menus with keyboard navigation and value callbacks.", this::renderDropdownMenuComponent),
                componentDemo("context-menu", "Overlays", "ContextMenu", "Pointer-positioned menus for contextual actions.", this::renderContextMenuComponent),
                componentDemo("sheet", "Overlays", "Sheet", "Modal edge panels for secondary workflows.", this::renderSheetComponent),
                componentDemo("drawer", "Overlays", "Drawer", "Bottom panel presentation for compact layouts.", this::renderDrawerComponent),

                componentDemo("alert", "Feedback", "Alert", "Inline status, warning, and error communication.", this::renderFeedback),
                componentDemo("progress", "Feedback", "Progress", "ARIA progress feedback for loading and completion states.", this::renderProgressComponent),
                componentDemo("skeleton", "Feedback", "Skeleton", "CSS-first loading placeholders for pending content.", this::renderSkeletonComponent),
                componentDemo("spinner", "Feedback", "Spinner", "Compact loading indicator with accessible status text.", this::renderSpinnerComponent),
                componentDemo("empty-state", "Feedback", "EmptyState", "Composed empty views with title, description, and actions.", this::renderEmptyStateComponent),
                componentDemo("status-indicator", "Feedback", "StatusIndicator", "Inline success, warning, error, info, and neutral status labels.", this::renderStatusIndicatorComponent),
                componentDemo("toast", "Feedback", "Toast", "Lazy toast notifications with default and Sonner-style presentation.", this::renderToastComponent),
                componentDemo("overlay-utilities", "Utilities", "Overlay utilities", "Portal, outside-click, keyboard, focus, ARIA, and ID helpers.", this::renderOverlayUtilitiesComponent),
                componentDemo("events", "Utilities", "Events", "ListenerRegistration and semantic value-change examples.", this::renderEvents)
        };
    }

    private ComponentDemo componentDemo(String id, String category, String title, String description, ComponentRenderer renderer) {
        return new ComponentDemo(id, category, title, description, renderer);
    }

    private void selectComponent(ComponentDemo[] demos, ComponentDemo selected) {
        selectedComponentId = selected.id;
        for (ComponentDemo demo : demos) {
            boolean active = demo.id.equals(selected.id);
            if (demo.tab != null) {
                demo.tab.className = active ? "demo-component-tab is-active" : "demo-component-tab";
                demo.tab.setAttribute("aria-selected", active ? "true" : "false");
                demo.tab.setAttribute("tabindex", active ? "0" : "-1");
            }
        }

        clear(componentPanel);
        componentPanel.appendChild(textElement("p", "demo-muted", "Loading " + selected.title + " examples..."));
        GWT.runAsync(new RunAsyncCallback() {
            @Override
            public void onFailure(Throwable reason) {
                clear(componentPanel);
                componentPanel.appendChild(textElement("p", "demo-muted", selected.title + " examples could not be loaded: " + reason.getMessage()));
            }

            @Override
            public void onSuccess() {
                clear(componentPanel);
                HTMLElement section = componentSection(selected.id, selected.title, selected.description);
                HTMLElement grid = examplesGrid();
                selected.renderer.render(grid);
                section.appendChild(grid);
                componentPanel.appendChild(section);
            }
        });
    }

    private void renderButtonComponent(HTMLElement grid) {
        HTMLElement variants = preview();
        variants.appendChild(Button.create("Default").element());
        variants.appendChild(Button.create("Destructive").variant(ButtonVariant.DESTRUCTIVE).element());
        variants.appendChild(Button.create("Secondary").variant(ButtonVariant.SECONDARY).element());
        variants.appendChild(Button.create("Outline").variant(ButtonVariant.OUTLINE).element());
        variants.appendChild(Button.create("Ghost").variant(ButtonVariant.GHOST).element());
        variants.appendChild(Button.create("Link").variant(ButtonVariant.LINK).element());
        grid.appendChild(example("Variants", variants,
                "Button.create(\"Default\");\n"
                        + "Button.create(\"Destructive\").variant(ButtonVariant.DESTRUCTIVE);\n"
                        + "Button.create(\"Secondary\").variant(ButtonVariant.SECONDARY);\n"
                        + "Button.create(\"Outline\").variant(ButtonVariant.OUTLINE);\n"
                        + "Button.create(\"Ghost\").variant(ButtonVariant.GHOST);\n"
                        + "Button.create(\"Link\").variant(ButtonVariant.LINK);"));

        HTMLElement sizes = preview();
        sizes.appendChild(Button.create("Small").size(ButtonSize.SM).element());
        sizes.appendChild(Button.create("Default").element());
        sizes.appendChild(Button.create("Large").size(ButtonSize.LG).element());
        sizes.appendChild(Button.create("").size(ButtonSize.ICON).icon(LucideIcons.search()).aria("label", "Search").element());
        sizes.appendChild(Button.create("Disabled").disabled(true).element());
        grid.appendChild(example("Sizes and state", sizes,
                "Button.create(\"Small\").size(ButtonSize.SM);\n"
                        + "Button.create(\"Default\");\n"
                        + "Button.create(\"Large\").size(ButtonSize.LG);\n"
                        + "Button.create(\"\").size(ButtonSize.ICON).icon(LucideIcons.search());\n"
                        + "Button.create(\"Disabled\").disabled(true);"));

        HTMLElement icons = preview();
        icons.appendChild(Button.create("Save").icon(LucideIcons.check()).element());
        icons.appendChild(Button.create("Search").variant(ButtonVariant.OUTLINE).icon(LucideIcons.search()).element());
        icons.appendChild(Button.create("").size(ButtonSize.ICON).variant(ButtonVariant.GHOST).icon(LucideIcons.x()).aria("label", "Close").element());
        grid.appendChild(example("With icons", icons,
                "Button.create(\"Save\").icon(LucideIcons.check());\n\n"
                        + "Button.create(\"Search\")\n"
                        + "    .variant(ButtonVariant.OUTLINE)\n"
                        + "    .icon(LucideIcons.search());\n\n"
                        + "Button.create(\"\")\n"
                        + "    .size(ButtonSize.ICON)\n"
                        + "    .variant(ButtonVariant.GHOST)\n"
                        + "    .icon(LucideIcons.x())\n"
                        + "    .aria(\"label\", \"Close\");"));
    }

    private void renderBadgeComponent(HTMLElement grid) {
        HTMLElement badges = preview();
        badges.appendChild(Badge.create("Default").element());
        badges.appendChild(Badge.create("Secondary").variant(BadgeVariant.SECONDARY).element());
        badges.appendChild(Badge.create("Destructive").variant(BadgeVariant.DESTRUCTIVE).element());
        badges.appendChild(Badge.create("Outline").variant(BadgeVariant.OUTLINE).element());
        grid.appendChild(example("Variants", badges,
                "Badge.create(\"Default\");\n"
                        + "Badge.create(\"Secondary\").variant(BadgeVariant.SECONDARY);\n"
                        + "Badge.create(\"Destructive\").variant(BadgeVariant.DESTRUCTIVE);\n"
                        + "Badge.create(\"Outline\").variant(BadgeVariant.OUTLINE);"));

        HTMLElement usage = preview();
        usage.appendChild(Badge.create("Beta").variant(BadgeVariant.OUTLINE).element());
        usage.appendChild(Badge.create("12 updates").variant(BadgeVariant.SECONDARY).element());
        usage.appendChild(Badge.create("Failed").variant(BadgeVariant.DESTRUCTIVE).element());
        grid.appendChild(example("Status labels", usage,
                "Badge.create(\"Beta\").variant(BadgeVariant.OUTLINE);\n"
                        + "Badge.create(\"12 updates\").variant(BadgeVariant.SECONDARY);\n"
                        + "Badge.create(\"Failed\").variant(BadgeVariant.DESTRUCTIVE);"));
    }

    private void renderButtonGroupComponent(HTMLElement grid) {
        HTMLElement group = preview();
        group.appendChild(ButtonGroup.create()
                .add(Button.create("Left").variant(ButtonVariant.OUTLINE))
                .add(Button.create("Center").variant(ButtonVariant.OUTLINE))
                .add(Button.create("Right").variant(ButtonVariant.OUTLINE))
                .element());
        grid.appendChild(example("Segmented actions", group,
                "ButtonGroup.create()\n"
                        + "    .add(Button.create(\"Left\").variant(ButtonVariant.OUTLINE))\n"
                        + "    .add(Button.create(\"Center\").variant(ButtonVariant.OUTLINE))\n"
                        + "    .add(Button.create(\"Right\").variant(ButtonVariant.OUTLINE));"));

        HTMLElement icons = preview();
        icons.appendChild(ButtonGroup.create()
                .add(Button.create("").size(ButtonSize.ICON).variant(ButtonVariant.OUTLINE).icon(LucideIcons.chevronLeft()).aria("label", "Previous"))
                .add(Button.create("").size(ButtonSize.ICON).variant(ButtonVariant.OUTLINE).icon(LucideIcons.chevronRight()).aria("label", "Next"))
                .element());
        grid.appendChild(example("Icon group", icons,
                "ButtonGroup.create()\n"
                        + "    .add(Button.create(\"\").size(ButtonSize.ICON).icon(LucideIcons.chevronLeft()))\n"
                        + "    .add(Button.create(\"\").size(ButtonSize.ICON).icon(LucideIcons.chevronRight()));"));
    }

    private void renderToggleComponent(HTMLElement grid) {
        HTMLElement toggles = preview();
        toggles.appendChild(Toggle.create("Bold").pressed(true).element());
        toggles.appendChild(Toggle.create("Italic").variant(ToggleVariant.OUTLINE).element());
        toggles.appendChild(Toggle.create("Disabled").disabled(true).element());
        grid.appendChild(example("Pressed states", toggles,
                "Toggle.create(\"Bold\").pressed(true);\n"
                        + "Toggle.create(\"Italic\").variant(ToggleVariant.OUTLINE);\n"
                        + "Toggle.create(\"Disabled\").disabled(true);"));
    }

    private void renderToggleGroupComponent(HTMLElement grid) {
        HTMLElement groups = preview("demo-stack-preview");
        groups.appendChild(ToggleGroup.create()
                .type(ToggleGroupType.SINGLE)
                .addItem("left", "Left")
                .addItem("center", "Center")
                .addItem("right", "Right")
                .value("center")
                .element());
        groups.appendChild(ToggleGroup.create()
                .type(ToggleGroupType.MULTIPLE)
                .addItem("bold", "Bold")
                .addItem("italic", "Italic")
                .addItem("underline", "Underline")
                .element());
        grid.appendChild(example("Single and multiple selection", groups,
                "ToggleGroup.create()\n"
                        + "    .type(ToggleGroupType.SINGLE)\n"
                        + "    .addItem(\"left\", \"Left\")\n"
                        + "    .addItem(\"center\", \"Center\")\n"
                        + "    .value(\"center\");\n\n"
                        + "ToggleGroup.create()\n"
                        + "    .type(ToggleGroupType.MULTIPLE)\n"
                        + "    .addItem(\"bold\", \"Bold\")\n"
                        + "    .addItem(\"italic\", \"Italic\");"));
    }

    private void renderCardComponent(HTMLElement grid) {
        Card card = Card.create()
                .add(Card.header()
                        .add(Card.title("Card Title"))
                        .add(Card.description("A structured surface for related content.")))
                .add(Card.content().add(Button.create("Action")));
        grid.appendChild(example("Basic card", card,
                "Card.create()\n"
                        + "    .add(Card.header()\n"
                        + "        .add(Card.title(\"Card Title\"))\n"
                        + "        .add(Card.description(\"A structured surface for related content.\")))\n"
                        + "    .add(Card.content().add(Button.create(\"Action\")));"));

        HTMLElement formCard = preview("demo-stack-preview");
        formCard.appendChild(Card.create()
                .add(Card.header().add(Card.title("Team settings")).add(Card.description("Invite members and adjust access.")))
                .add(Card.content().add(FormField.create("team-name")
                        .label("Team name")
                        .control(Input.create().value("Design Systems"))))
                .element());
        grid.appendChild(example("With form content", formCard,
                "Card.create()\n"
                        + "    .add(Card.header()\n"
                        + "        .add(Card.title(\"Team settings\")))\n"
                        + "    .add(Card.content().add(FormField.create(\"team-name\")\n"
                        + "        .label(\"Team name\")\n"
                        + "        .control(Input.create().value(\"Design Systems\"))));"));
    }

    private void renderTabsComponent(HTMLElement grid) {
        HTMLElement overview = preview("demo-tabs-preview");
        overview.appendChild(Tabs.create()
                .addTab("overview", "Overview", raw(textElement("p", "demo-muted", "View key metrics and recent project activity across all active projects.")))
                .addTab("analytics", "Analytics", raw(textElement("p", "demo-muted", "Track traffic, conversions, and component usage over time.")))
                .addTab("reports", "Reports", raw(textElement("p", "demo-muted", "Export weekly status reports and release summaries.")))
                .addTab("settings", "Settings", raw(textElement("p", "demo-muted", "Configure project defaults, notifications, and team access.")))
                .element());
        grid.appendChild(example("Overview tabs", overview,
                "Tabs.create()\n"
                        + "    .addTab(\"overview\", \"Overview\", overviewContent)\n"
                        + "    .addTab(\"analytics\", \"Analytics\", analyticsContent)\n"
                        + "    .addTab(\"reports\", \"Reports\", reportsContent);"));

        HTMLElement line = preview("demo-tabs-preview");
        line.appendChild(Tabs.create()
                .variant(TabsVariant.LINE)
                .addTab("overview", "Overview", raw(textElement("p", "demo-muted", "Line tabs keep the active state subtle and compact.")))
                .addTab("analytics", "Analytics", raw(textElement("p", "demo-muted", "Use them in dense dashboards or page headers.")))
                .addTab("reports", "Reports", raw(textElement("p", "demo-muted", "The active tab uses a primary bottom border.")))
                .element());
        grid.appendChild(example("Line", line,
                "Tabs.create()\n"
                        + "    .variant(TabsVariant.LINE)\n"
                        + "    .addTab(\"overview\", \"Overview\", overviewContent)\n"
                        + "    .addTab(\"analytics\", \"Analytics\", analyticsContent);"));

        HTMLElement vertical = preview("demo-tabs-preview");
        vertical.appendChild(Tabs.create()
                .orientation(TabsOrientation.VERTICAL)
                .addTab("account", "Account", raw(textElement("p", "demo-muted", "Manage profile details and public account information.")))
                .addTab("password", "Password", raw(textElement("p", "demo-muted", "Update credentials and recovery settings.")))
                .addTab("notifications", "Notifications", raw(textElement("p", "demo-muted", "Choose which product updates should notify you.")))
                .element());
        grid.appendChild(example("Vertical", vertical,
                "Tabs.create()\n"
                        + "    .orientation(TabsOrientation.VERTICAL)\n"
                        + "    .addTab(\"account\", \"Account\", accountContent)\n"
                        + "    .addTab(\"password\", \"Password\", passwordContent);"));

        HTMLElement disabled = preview("demo-tabs-preview");
        disabled.appendChild(Tabs.create()
                .addTab("home", "Home", raw(textElement("p", "demo-muted", "Home content is available.")))
                .addTab("disabled", "Disabled", raw(textElement("p", "demo-muted", "This content cannot be selected while disabled.")), true)
                .addTab("settings", "Settings", raw(textElement("p", "demo-muted", "Settings stay selectable.")))
                .element());
        grid.appendChild(example("Disabled", disabled,
                "Tabs.create()\n"
                        + "    .addTab(\"home\", \"Home\", homeContent)\n"
                        + "    .addTab(\"disabled\", \"Disabled\", disabledContent, true)\n"
                        + "    .addTab(\"settings\", \"Settings\", settingsContent);"));

        HTMLElement icons = preview("demo-tabs-preview");
        icons.appendChild(Tabs.create()
                .addTab("preview", "Preview", LucideIcons.appWindow().variant(IconVariant.MUTED), raw(textElement("p", "demo-muted", "Preview renders the live component output.")))
                .addTab("code", "Code", LucideIcons.code().variant(IconVariant.MUTED), CodeBlock.create("Tabs.create()\n    .addTab(\"preview\", \"Preview\", icon, previewContent)\n    .addTab(\"code\", \"Code\", codeIcon, codeContent);").language("java"))
                .element());
        grid.appendChild(example("Icons", icons,
                "Tabs.create()\n"
                        + "    .addTab(\"preview\", \"Preview\", LucideIcons.appWindow(), previewContent)\n"
                        + "    .addTab(\"code\", \"Code\", LucideIcons.code(), codeContent);"));
    }

    private void renderAccordionComponent(HTMLElement grid) {
        HTMLElement basic = preview("demo-stack-preview");
        basic.appendChild(Accordion.create()
                .addItem("password", "How do I reset my password?", raw(textElement("p", "demo-muted", "Click Forgot Password on the login page, enter your email address, and we will send you a reset link.")))
                .addItem("subscription", "Can I change my subscription plan?", raw(textElement("p", "demo-muted", "Yes. You can switch plans from billing settings and the change is applied to your next invoice.")))
                .addItem("payment", "What payment methods do you accept?", raw(textElement("p", "demo-muted", "We accept major credit cards and invoice-based billing for teams.")))
                .value("password")
                .element());
        grid.appendChild(example("Single item", basic,
                "Accordion.create()\n"
                        + "    .addItem(\"password\", \"How do I reset my password?\", passwordContent)\n"
                        + "    .addItem(\"subscription\", \"Can I change my subscription plan?\", subscriptionContent)\n"
                        + "    .value(\"password\");"));

        HTMLElement multiple = preview("demo-stack-preview");
        multiple.appendChild(Accordion.create()
                .multiple()
                .addItem("notifications", "Notification Settings", raw(textElement("p", "demo-muted", "Enable email alerts for account updates or push notifications for mobile devices.")))
                .addItem("privacy", "Privacy & Security", raw(textElement("p", "demo-muted", "Review active sessions, two-factor settings, and recovery contacts.")))
                .addItem("billing", "Billing & Subscription", raw(textElement("p", "demo-muted", "Manage invoices, seats, plans, and renewal preferences.")))
                .value("notifications")
                .element());
        grid.appendChild(example("Multiple items", multiple,
                "Accordion.create()\n"
                        + "    .multiple()\n"
                        + "    .addItem(\"notifications\", \"Notification Settings\", notificationsContent)\n"
                        + "    .addItem(\"privacy\", \"Privacy & Security\", privacyContent)\n"
                        + "    .value(\"notifications\");"));

        HTMLElement disabled = preview("demo-stack-preview");
        disabled.appendChild(Accordion.create()
                .addItem("history", "Can I access my account history?", raw(textElement("p", "demo-muted", "Account history is available from the activity page for all workspace owners.")))
                .addItem("premium", "Premium feature information", raw(textElement("p", "demo-muted", "This panel is disabled to show unavailable or gated content.")), true)
                .addItem("email", "How do I update my email address?", raw(textElement("p", "demo-muted", "Open profile settings, change your email, then confirm the verification message.")))
                .disabled("premium", true)
                .value("history")
                .element());
        grid.appendChild(example("Disabled item", disabled,
                "Accordion.create()\n"
                        + "    .addItem(\"history\", \"Can I access my account history?\", historyContent)\n"
                        + "    .addItem(\"premium\", \"Premium feature information\", premiumContent, true)\n"
                        + "    .addItem(\"email\", \"How do I update my email address?\", emailContent)\n"
                        + "    .disabled(\"premium\", true);"));

        HTMLElement card = preview("demo-stack-preview");
        card.appendChild(Card.create()
                .add(Card.header()
                        .add(Card.title("Subscription & Billing"))
                        .add(Card.description("Common questions about your account, plans, payments, and cancellations.")))
                .add(Card.content().add(Accordion.create()
                        .addItem("plans", "What subscription plans do you offer?", raw(textElement("p", "demo-muted", "Starter, Professional, and Enterprise plans include increasing storage limits, API access, and support levels.")))
                        .addItem("billing", "How does billing work?", raw(textElement("p", "demo-muted", "Billing is charged at the beginning of each cycle and can be canceled anytime.")))
                        .addItem("cancel", "How do I cancel my subscription?", raw(textElement("p", "demo-muted", "Workspace owners can cancel from billing settings.")))
                        .value("plans")))
                .element());
        grid.appendChild(example("Card wrapper", card,
                "Card.create()\n"
                        + "    .add(Card.header()\n"
                        + "        .add(Card.title(\"Subscription & Billing\"))\n"
                        + "        .add(Card.description(\"Common questions about your account.\")))\n"
                        + "    .add(Card.content().add(Accordion.create()\n"
                        + "        .addItem(\"plans\", \"What subscription plans do you offer?\", plansContent)));"));
    }

    private void renderCollapsibleComponent(HTMLElement grid) {
        HTMLElement collapsible = preview("demo-stack-preview");
        collapsible.appendChild(Collapsible.create("Show implementation note")
                .content(raw(textElement("p", "demo-muted", "Collapsible is reusable on its own and also informs Accordion behavior.")))
                .element());
        grid.appendChild(example("Standalone disclosure", collapsible,
                "Collapsible.create(\"Show implementation note\")\n"
                        + "    .content(content);"));
    }

    private void renderAspectRatioComponent(HTMLElement grid) {
        HTMLElement aspectRatios = preview("demo-aspect-preview");
        aspectRatios.appendChild(AspectRatio.create()
                .ratio(16, 9)
                .add(raw(textElement("div", "demo-aspect-box", "16:9")))
                .element());
        grid.appendChild(example("Media frame", aspectRatios,
                "AspectRatio.create()\n"
                        + "    .ratio(16, 9)\n"
                        + "    .add(content);"));
    }

    private void renderBreadcrumbComponent(HTMLElement grid) {
        HTMLElement breadcrumbs = preview();
        breadcrumbs.appendChild(Breadcrumb.create()
                .link("Docs", "#")
                .link("Components", "#")
                .current("Navigation")
                .element());
        grid.appendChild(example("Current location", breadcrumbs,
                "Breadcrumb.create()\n"
                        + "    .link(\"Docs\", \"#\")\n"
                        + "    .link(\"Components\", \"#\")\n"
                        + "    .current(\"Navigation\");"));
    }

    private void renderPaginationComponent(HTMLElement grid) {
        HTMLElement pages = preview();
        pages.appendChild(Pagination.create()
                .previous("#")
                .page(1, "#", false)
                .page(2, "#", true)
                .page(3, "#", false)
                .next("#")
                .element());
        grid.appendChild(example("Page links", pages,
                "Pagination.create()\n"
                        + "    .previous(\"#\")\n"
                        + "    .page(1, \"#\", false)\n"
                        + "    .page(2, \"#\", true)\n"
                        + "    .page(3, \"#\", false)\n"
                        + "    .next(\"#\");"));
    }

    private void renderScrollAreaComponent(HTMLElement grid) {
        HTMLElement scroll = preview("demo-stack-preview");
        scroll.appendChild(ScrollArea.create()
                .height(120)
                .add(raw(textElement("p", "demo-muted", "Scroll areas keep overflowing content contained without forcing custom scrollbars. This paragraph is intentionally long so the example demonstrates constrained content and native scrolling behavior in a compact surface.")))
                .element());
        grid.appendChild(example("Constrained content", scroll,
                "ScrollArea.create()\n"
                        + "    .height(120)\n"
                        + "    .add(content);"));
    }

    private void renderSeparatorComponent(HTMLElement grid) {
        HTMLElement separators = preview();
        separators.appendChild(Separator.create().element());
        separators.appendChild(Separator.create().orientation(SeparatorOrientation.VERTICAL).classes("mx-4 min-h-12").element());
        grid.appendChild(example("Orientations", separators,
                "Separator.create();\n"
                        + "Separator.create()\n"
                        + "    .orientation(SeparatorOrientation.VERTICAL)\n"
                        + "    .classes(\"mx-4 min-h-12\");"));
    }

    private void renderTypographyComponent(HTMLElement grid) {
        HTMLElement type = preview("demo-stack-preview");
        type.appendChild(Typography.h2("Typography scale").element());
        type.appendChild(Typography.muted("Reusable text styles keep documentation and application content visually consistent.").element());
        grid.appendChild(example("Text primitives", type,
                "Typography.h2(\"Typography scale\");\n"
                        + "Typography.muted(\"Reusable text styles...\");"));
    }

    private void renderCodeBlockComponent(HTMLElement grid) {
        HTMLElement codePreview = preview("demo-stack-preview");
        codePreview.appendChild(CodeBlock.create("Button.create(\"Save\")\n    .variant(ButtonVariant.DEFAULT);").language("java").element());
        grid.appendChild(example("Java snippet", codePreview,
                "CodeBlock.create(\"Button.create(\\\"Save\\\")...\")\n"
                        + "    .language(\"java\");"));
    }

    private void renderTableComponent(HTMLElement grid) {
        HTMLElement tablePreview = preview("demo-stack-preview");
        tablePreview.appendChild(sampleTable().element());
        grid.appendChild(example("Project table", tablePreview,
                "Table.create()\n"
                        + "    .add(Table.caption(\"Current release work\"))\n"
                        + "    .add(Table.header().add(Table.row()\n"
                        + "        .add(Table.head(\"Component\"))\n"
                        + "        .add(Table.head(\"Status\"))))\n"
                        + "    .add(Table.body().add(Table.row()\n"
                        + "        .add(Table.cell(\"Table\"))\n"
                        + "        .add(Table.cell(\"Ready\"))));"));

        HTMLElement empty = preview("demo-stack-preview");
        empty.appendChild(Table.create()
                .add(Table.header().add(Table.row().add(Table.head("Name")).add(Table.head("Owner"))))
                .add(Table.body().add(Table.row().add(Table.cell(EmptyState.create()
                        .title("No rows")
                        .description("Connect a data source or adjust filters.")))))
                .element());
        grid.appendChild(example("Empty table composition", empty,
                "Table.create()\n"
                        + "    .add(Table.header().add(headerRow))\n"
                        + "    .add(Table.body().add(Table.row()\n"
                        + "        .add(Table.cell(EmptyState.create()\n"
                        + "            .title(\"No rows\")))));"));
    }

    private void renderDataTableComponent(HTMLElement grid) {
        String[][] rows = new String[][] {
                { "Button", "Stable", "Ana" },
                { "Toast", "Review", "Mika" },
                { "Table", "Preview", "Sam" }
        };
        HTMLElement data = preview("demo-stack-preview");
        data.appendChild(DataTable.create()
                .columns("Component", "Status", "Owner")
                .rows(rows)
                .sortBy(0, false)
                .element());
        grid.appendChild(example("String data", data,
                "DataTable.create()\n"
                        + "    .columns(\"Component\", \"Status\", \"Owner\")\n"
                        + "    .rows(rows)\n"
                        + "    .sortBy(0, false);"));

        HTMLElement filtered = preview("demo-stack-preview");
        filtered.appendChild(DataTable.create()
                .columns("Component", "Status", "Owner")
                .rows(rows)
                .filter("toast")
                .emptyText("No matching components.")
                .element());
        filtered.appendChild(Pagination.create().previous("#").page(1, "#", true).page(2, "#", false).next("#").element());
        grid.appendChild(example("Filtering with pagination", filtered,
                "DataTable.create()\n"
                        + "    .columns(\"Component\", \"Status\", \"Owner\")\n"
                        + "    .rows(rows)\n"
                        + "    .filter(\"toast\")\n"
                        + "    .emptyText(\"No matching components.\");\n\n"
                        + "Pagination.create().page(1, \"#\", true).next(\"#\");"));
    }

    private void renderAvatarComponent(HTMLElement grid) {
        HTMLElement avatars = preview();
        avatars.appendChild(Avatar.create().fallback("AV").size(AvatarSize.SM).element());
        avatars.appendChild(Avatar.create().fallback("GF").element());
        avatars.appendChild(Avatar.create().fallback("UI").size(AvatarSize.LG).element());
        grid.appendChild(example("Fallbacks and sizes", avatars,
                "Avatar.create().fallback(\"AV\").size(AvatarSize.SM);\n"
                        + "Avatar.create().fallback(\"GF\");\n"
                        + "Avatar.create().fallback(\"UI\").size(AvatarSize.LG);"));

        HTMLElement profile = preview("demo-stack-preview");
        profile.appendChild(Item.create()
                .media(Avatar.create().fallback("MR"))
                .title("Mira Rodrigues")
                .description("Design systems lead")
                .action(Badge.create("Owner").variant(BadgeVariant.SECONDARY))
                .element());
        grid.appendChild(example("Inside Item", profile,
                "Item.create()\n"
                        + "    .media(Avatar.create().fallback(\"MR\"))\n"
                        + "    .title(\"Mira Rodrigues\")\n"
                        + "    .description(\"Design systems lead\")\n"
                        + "    .action(Badge.create(\"Owner\"));"));
    }

    private void renderKbdComponent(HTMLElement grid) {
        HTMLElement shortcuts = preview();
        shortcuts.appendChild(Kbd.create("Cmd").element());
        shortcuts.appendChild(Kbd.create("K").element());
        shortcuts.appendChild(Kbd.create("Esc").element());
        grid.appendChild(example("Keyboard tokens", shortcuts,
                "Kbd.create(\"Cmd\");\n"
                        + "Kbd.create(\"K\");\n"
                        + "Kbd.create(\"Esc\");"));
    }

    private void renderItemComponent(HTMLElement grid) {
        HTMLElement iconItems = preview("demo-stack-preview");
        iconItems.appendChild(Item.create()
                .media(LucideIcons.gitPullRequest().variant(IconVariant.PRIMARY))
                .title("Review pull request")
                .description("Milestone 11 data display components")
                .action(Badge.create("Open"))
                .element());
        iconItems.appendChild(Item.create()
                .media(LucideIcons.circleCheck().variant(IconVariant.PRIMARY))
                .title("Maven Verify")
                .description("All JVM tests passed")
                .action(StatusIndicator.create("Healthy").variant(StatusIndicatorVariant.SUCCESS))
                .element());
        grid.appendChild(example("Icon rows", iconItems,
                "Item.create()\n"
                        + "    .media(LucideIcons.gitPullRequest())\n"
                        + "    .title(\"Review pull request\")\n"
                        + "    .description(\"Milestone 11 data display components\")\n"
                        + "    .action(Badge.create(\"Open\"));"));

        HTMLElement teamItems = preview("demo-stack-preview");
        teamItems.appendChild(Item.create()
                .media(Avatar.create().size(AvatarSize.SM).fallback("ER"))
                .title("Evil Rabbit")
                .description("Last seen 5 months ago")
                .action(Badge.create("Owner").variant(BadgeVariant.SECONDARY))
                .element());
        teamItems.appendChild(Item.create()
                .media(Avatar.create().size(AvatarSize.SM).fallback("CN"))
                .title("No Team Members")
                .description("Invite your team to collaborate on this project.")
                .action(Button.create("Invite").size(ButtonSize.SM))
                .element());
        grid.appendChild(example("Avatar rows", teamItems,
                "Item.create()\n"
                        + "    .media(Avatar.create().size(AvatarSize.SM).fallback(\"ER\"))\n"
                        + "    .title(\"Evil Rabbit\")\n"
                        + "    .description(\"Last seen 5 months ago\")\n"
                        + "    .action(Badge.create(\"Owner\"));"));

        HTMLElement coverOne = element("img", "h-10 w-10 rounded-md object-cover");
        coverOne.setAttribute("src", "https://avatar.vercel.sh/Midnight%20City%20Lights");
        coverOne.setAttribute("alt", "Midnight City Lights");
        HTMLElement coverTwo = element("img", "h-10 w-10 rounded-md object-cover");
        coverTwo.setAttribute("src", "https://avatar.vercel.sh/Coffee%20Shop%20Conversations");
        coverTwo.setAttribute("alt", "Coffee Shop Conversations");
        HTMLElement coverThree = element("img", "h-10 w-10 rounded-md object-cover");
        coverThree.setAttribute("src", "https://avatar.vercel.sh/Digital%20Rain");
        coverThree.setAttribute("alt", "Digital Rain");

        HTMLElement mediaItems = preview("demo-stack-preview");
        mediaItems.appendChild(Item.create()
                .media(raw(coverOne))
                .title("Midnight City Lights - Electric Nights")
                .description("Neon Dreams")
                .action(Kbd.create("3:45"))
                .element());
        mediaItems.appendChild(Item.create()
                .media(raw(coverTwo))
                .title("Coffee Shop Conversations - Urban Stories")
                .description("The Morning Brew")
                .action(Kbd.create("4:05"))
                .element());
        mediaItems.appendChild(Item.create()
                .media(raw(coverThree))
                .title("Digital Rain - Binary Beats")
                .description("Cyber Symphony")
                .action(Kbd.create("3:30"))
                .element());
        grid.appendChild(example("Image media", mediaItems,
                "HTMLElement cover = element(\"img\", \"h-10 w-10 rounded-md object-cover\");\n"
                        + "cover.setAttribute(\"src\", \"https://avatar.vercel.sh/Midnight%20City%20Lights\");\n\n"
                        + "Item.create()\n"
                        + "    .media(raw(cover))\n"
                        + "    .title(\"Midnight City Lights - Electric Nights\")\n"
                        + "    .description(\"Neon Dreams\")\n"
                        + "    .action(Kbd.create(\"3:45\"));"));

        HTMLElement linkItems = preview("demo-stack-preview");
        linkItems.appendChild(Item.create()
                .media(LucideIcons.search().variant(IconVariant.MUTED))
                .title("Visit our documentation")
                .description("Learn how to get started with GWT Fusion components.")
                .action(Button.create("").size(ButtonSize.ICON).variant(ButtonVariant.GHOST).icon(LucideIcons.chevronRight()).aria("label", "Open documentation"))
                .element());
        linkItems.appendChild(Item.create()
                .media(LucideIcons.x().variant(IconVariant.MUTED))
                .title("External resource")
                .description("Opens in a new tab with security attributes.")
                .action(Button.create("").size(ButtonSize.ICON).variant(ButtonVariant.GHOST).icon(LucideIcons.chevronRight()).aria("label", "Open resource"))
                .element());
        grid.appendChild(example("Navigation rows", linkItems,
                "Item.create()\n"
                        + "    .media(LucideIcons.search())\n"
                        + "    .title(\"Visit our documentation\")\n"
                        + "    .description(\"Learn how to get started with GWT Fusion components.\")\n"
                        + "    .action(Button.create(\"\")\n"
                        + "        .size(ButtonSize.ICON)\n"
                        + "        .variant(ButtonVariant.GHOST)\n"
                        + "        .icon(LucideIcons.chevronRight()));"));
    }

    private void renderTimelineComponent(HTMLElement grid) {
        HTMLElement timeline = preview("demo-stack-preview");
        timeline.appendChild(Timeline.create()
                .addItem("Branch created", "Started Milestone 11 data display work.", "09:10")
                .addItem("Components added", "Table, Avatar, Kbd, Item, Timeline, Calendar, and related primitives.", "09:34")
                .addItem("Verification", "Maven and demo GWT compile are expected before PR.", "Next")
                .element());
        grid.appendChild(example("Activity feed", timeline,
                "Timeline.create()\n"
                        + "    .addItem(\"Branch created\", \"Started Milestone 11.\", \"09:10\")\n"
                        + "    .addItem(\"Components added\", \"Data display primitives.\", \"09:34\");"));
    }

    private void renderCalendarComponent(HTMLElement grid) {
        HTMLElement calendars = preview("demo-stack-preview");
        HTMLElement selected = textElement("p", "demo-muted", "Selected day: 18");
        Calendar calendar = Calendar.create().month("May 2026").days(31, 4).selectedDay(18);
        calendar.onDaySelect(day -> selected.textContent = "Selected day: " + day);
        calendars.appendChild(calendar.element());
        calendars.appendChild(selected);
        grid.appendChild(example("Selectable month", calendars,
                "Calendar calendar = Calendar.create()\n"
                        + "    .month(\"May 2026\")\n"
                        + "    .days(31, 4)\n"
                        + "    .selectedDay(18);\n\n"
                        + "calendar.onDaySelect(day -> { ... });"));
    }

    private void renderDatePickerComponent(HTMLElement grid) {
        HTMLElement datePicker = preview("demo-stack-preview");
        HTMLElement selected = textElement("p", "demo-muted", "Pick a date to update this text.");
        DatePicker picker = DatePicker.create().month("May 2026").days(31, 4).selectedDay(18);
        picker.onDaySelect(day -> selected.textContent = "Selected: May 2026 " + day);
        datePicker.appendChild(picker.element());
        datePicker.appendChild(selected);
        grid.appendChild(example("Popover calendar", datePicker,
                "DatePicker picker = DatePicker.create()\n"
                        + "    .month(\"May 2026\")\n"
                        + "    .days(31, 4)\n"
                        + "    .selectedDay(18);\n\n"
                        + "picker.onDaySelect(day -> { ... });"));
    }

    private void renderCarouselComponent(HTMLElement grid) {
        HTMLElement carouselPreview = preview("demo-stack-preview");
        carouselPreview.appendChild(Carousel.create()
                .addSlide(raw(textElement("div", "demo-muted", "Slide 1: Component APIs stay Java-first.")))
                .addSlide(raw(textElement("div", "demo-muted", "Slide 2: Tailwind classes remain static.")))
                .addSlide(raw(textElement("div", "demo-muted", "Slide 3: GWT.runAsync keeps demos focused.")))
                .element());
        grid.appendChild(example("Simple carousel", carouselPreview,
                "Carousel.create()\n"
                        + "    .addSlide(raw(slideOne))\n"
                        + "    .addSlide(raw(slideTwo))\n"
                        + "    .addSlide(raw(slideThree));"));
    }

    private Table sampleTable() {
        return Table.create()
                .add(Table.caption("Current release work"))
                .add(Table.header().add(Table.row()
                        .add(Table.head("Component"))
                        .add(Table.head("Status"))
                        .add(Table.head("Owner"))))
                .add(Table.body()
                        .add(Table.row()
                                .add(Table.cell("Table"))
                                .add(Table.cell(StatusIndicator.create("Ready").variant(StatusIndicatorVariant.SUCCESS)))
                                .add(Table.cell("Ana")))
                        .add(Table.row()
                                .add(Table.cell("Calendar"))
                                .add(Table.cell(StatusIndicator.create("Review").variant(StatusIndicatorVariant.WARNING)))
                                .add(Table.cell("Mika"))));
    }

    private void renderInputComponent(HTMLElement grid) {
        HTMLElement form = preview();
        form.appendChild(Input.create().type("email").placeholder("name@example.com").element());
        form.appendChild(Input.create().type("text").value("With value").element());
        form.appendChild(Input.create().type("password").placeholder("Password").element());
        grid.appendChild(example("Types and values", form,
                "Input.create().type(\"email\").placeholder(\"name@example.com\");\n"
                        + "Input.create().type(\"text\").value(\"With value\");\n"
                        + "Input.create().type(\"password\").placeholder(\"Password\");"));
    }

    private void renderLabelComponent(HTMLElement grid) {
        HTMLElement labelledInput = preview("demo-stack-preview");
        labelledInput.appendChild(Label.create("Email").forId("label-demo-email").element());
        labelledInput.appendChild(Input.create().type("email").placeholder("name@example.com").attr("id", "label-demo-email").element());
        grid.appendChild(example("Connected control", labelledInput,
                "Label.create(\"Email\").forId(\"label-demo-email\");\n"
                        + "Input.create()\n"
                        + "    .type(\"email\")\n"
                        + "    .attr(\"id\", \"label-demo-email\");"));
    }

    private void renderCheckboxComponent(HTMLElement grid) {
        HTMLElement checkboxes = preview();
        checkboxes.appendChild(labelled("Accept terms", Checkbox.create().checked(true)));
        checkboxes.appendChild(labelled("Disabled", Checkbox.create().disabled(true)));
        checkboxes.appendChild(labelled("Invalid", Checkbox.create().invalid(true)));
        grid.appendChild(example("States", checkboxes,
                "Checkbox.create().checked(true);\n"
                        + "Checkbox.create().disabled(true);\n"
                        + "Checkbox.create().invalid(true);"));
    }

    private void renderSwitchComponent(HTMLElement grid) {
        HTMLElement switches = preview();
        switches.appendChild(labelled("Notifications", Switch.create().checked(true)));
        switches.appendChild(labelled("Marketing", Switch.create()));
        switches.appendChild(labelled("Disabled", Switch.create().disabled(true)));
        grid.appendChild(example("States", switches,
                "Switch.create().checked(true);\n"
                        + "Switch.create();\n"
                        + "Switch.create().disabled(true);"));
    }

    private void renderTextareaComponent(HTMLElement grid) {
        HTMLElement textareas = preview();
        textareas.appendChild(Textarea.create().placeholder("Write a message...").rows(4).element());
        textareas.appendChild(Textarea.create().value("Existing content").rows(3).element());
        textareas.appendChild(Textarea.create().placeholder("Disabled").disabled(true).element());
        grid.appendChild(example("Content states", textareas,
                "Textarea.create().placeholder(\"Write a message...\").rows(4);\n"
                        + "Textarea.create().value(\"Existing content\").rows(3);\n"
                        + "Textarea.create().placeholder(\"Disabled\").disabled(true);"));
    }

    private void renderRadioGroupComponent(HTMLElement grid) {
        HTMLElement radios = preview();
        radios.appendChild(RadioGroup.create()
                .name("density-demo")
                .addOption("compact", "Compact")
                .addOption("comfortable", "Comfortable")
                .addOption("spacious", "Spacious")
                .value("comfortable")
                .element());
        radios.appendChild(RadioGroup.create()
                .name("billing-demo")
                .orientation(RadioGroupOrientation.HORIZONTAL)
                .addOption("monthly", "Monthly")
                .addOption("yearly", "Yearly")
                .value("yearly")
                .element());
        grid.appendChild(example("Orientation", radios,
                "RadioGroup.create()\n"
                        + "    .name(\"density-demo\")\n"
                        + "    .addOption(\"compact\", \"Compact\")\n"
                        + "    .addOption(\"comfortable\", \"Comfortable\")\n"
                        + "    .value(\"comfortable\");\n\n"
                        + "RadioGroup.create()\n"
                        + "    .orientation(RadioGroupOrientation.HORIZONTAL)\n"
                        + "    .addOption(\"monthly\", \"Monthly\");"));
    }

    private void renderNativeSelectComponent(HTMLElement grid) {
        HTMLElement selectPreview = preview();
        selectPreview.appendChild(NativeSelect.create()
                .name("role")
                .option("admin", "Admin")
                .option("editor", "Editor")
                .option("viewer", "Viewer")
                .value("editor")
                .element());
        selectPreview.appendChild(NativeSelect.create().option("", "Disabled select").disabled(true).element());
        grid.appendChild(example("Options", selectPreview,
                "NativeSelect.create()\n"
                        + "    .name(\"role\")\n"
                        + "    .option(\"admin\", \"Admin\")\n"
                        + "    .option(\"editor\", \"Editor\")\n"
                        + "    .option(\"viewer\", \"Viewer\")\n"
                        + "    .value(\"editor\");"));
    }

    private void renderInputGroupComponent(HTMLElement grid) {
        HTMLElement inputGroups = preview();
        inputGroups.appendChild(InputGroup.create().startText("https://").add(Input.create().placeholder("example.com")).element());
        inputGroups.appendChild(InputGroup.create().add(Input.create().type("number").placeholder("Amount")).endText("EUR").element());
        grid.appendChild(example("Adornments", inputGroups,
                "InputGroup.create()\n"
                        + "    .startText(\"https://\")\n"
                        + "    .add(Input.create().placeholder(\"example.com\"));\n\n"
                        + "InputGroup.create()\n"
                        + "    .add(Input.create().type(\"number\"))\n"
                        + "    .endText(\"EUR\");"));
    }

    private void renderSliderComponent(HTMLElement grid) {
        HTMLElement sliders = preview();
        sliders.appendChild(Slider.create().name("volume").min(0).max(100).step(1).value(65).element());
        sliders.appendChild(Slider.create().min(0).max(10).step(0.5).value(4.5).disabled(true).element());
        grid.appendChild(example("Range values", sliders,
                "Slider.create()\n"
                        + "    .name(\"volume\")\n"
                        + "    .min(0)\n"
                        + "    .max(100)\n"
                        + "    .step(1)\n"
                        + "    .value(65);\n\n"
                        + "Slider.create().min(0).max(10).step(0.5).value(4.5).disabled(true);"));
        renderEvents(grid);
    }

    private void renderFormFieldComponent(HTMLElement grid) {
        HTMLElement composedForm = preview("demo-form-preview");
        composedForm.appendChild(FormField.create("profile-email")
                .label("Email")
                .control(Input.create().type("email").placeholder("name@example.com").required(true))
                .description("Used for account notifications.")
                .element());
        composedForm.appendChild(FormField.create("profile-name")
                .label("Validation state")
                .control(Input.create().value("A").invalid(true))
                .message("Name must contain at least 2 characters.")
                .element());
        grid.appendChild(example("Composed fields", composedForm,
                "FormField.create(\"profile-email\")\n"
                        + "    .label(\"Email\")\n"
                        + "    .control(Input.create().type(\"email\"))\n"
                        + "    .description(\"Used for account notifications.\");\n\n"
                        + "FormField.create(\"profile-name\")\n"
                        + "    .label(\"Validation state\")\n"
                        + "    .control(Input.create().value(\"A\").invalid(true))\n"
                        + "    .message(\"Name must contain at least 2 characters.\");"));
    }

    private void renderDialogComponent(HTMLElement grid) {
        HTMLElement dialogs = preview();
        dialogs.appendChild(Dialog.create()
                .trigger(Button.create("Open dialog"))
                .title("Edit profile")
                .description("Dialog sets aria-modal, supports Escape, closes on backdrop click, and returns focus to the trigger.")
                .content(raw(textElement("p", "demo-muted", "Use dialogs for focused tasks that should interrupt the current workflow.")))
                .element());
        grid.appendChild(example("Modal task", dialogs,
                "Dialog.create()\n"
                        + "    .trigger(Button.create(\"Open dialog\"))\n"
                        + "    .title(\"Edit profile\")\n"
                        + "    .description(\"Dialog sets aria-modal and returns focus.\")\n"
                        + "    .content(raw(content));"));
    }

    private void renderAlertDialogComponent(HTMLElement grid) {
        HTMLElement dialogs = preview();
        dialogs.appendChild(AlertDialog.create()
                .trigger(Button.create("Delete item").variant(ButtonVariant.DESTRUCTIVE))
                .title("Are you absolutely sure?")
                .description("AlertDialog uses role=alertdialog for destructive confirmations.")
                .content(raw(textElement("p", "demo-muted", "Provide a clear escape path and make the primary destructive action explicit.")))
                .element());
        grid.appendChild(example("Destructive confirmation", dialogs,
                "AlertDialog.create()\n"
                        + "    .trigger(Button.create(\"Delete item\").variant(ButtonVariant.DESTRUCTIVE))\n"
                        + "    .title(\"Are you absolutely sure?\")\n"
                        + "    .description(\"AlertDialog uses role=alertdialog.\");"));
    }

    private void renderPopoverComponent(HTMLElement grid) {
        HTMLElement floating = preview();
        floating.appendChild(Popover.create()
                .side(OverlaySide.BOTTOM)
                .trigger(Button.create("Open popover").variant(ButtonVariant.OUTLINE))
                .content(raw(textElement("p", "demo-muted", "Popover is non-modal and closes on outside click or Escape.")))
                .element());
        floating.appendChild(Popover.create()
                .side(OverlaySide.RIGHT)
                .trigger(Button.create("Right side").variant(ButtonVariant.SECONDARY))
                .content(raw(textElement("p", "demo-muted", "Use side(...) to choose the anchor placement.")))
                .element());
        grid.appendChild(example("Anchored content", floating,
                "Popover.create()\n"
                        + "    .side(OverlaySide.BOTTOM)\n"
                        + "    .trigger(Button.create(\"Open popover\"))\n"
                        + "    .content(raw(content));"));
    }

    private void renderTooltipComponent(HTMLElement grid) {
        HTMLElement tooltips = preview();
        tooltips.appendChild(Tooltip.create("Tooltip above the trigger.").side(OverlaySide.TOP).trigger(Button.create("Top").variant(ButtonVariant.SECONDARY)).element());
        tooltips.appendChild(Tooltip.create("Tooltip to the right of the trigger.").side(OverlaySide.RIGHT).trigger(Button.create("Right").variant(ButtonVariant.SECONDARY)).element());
        tooltips.appendChild(Tooltip.create("Tooltip below the trigger.").side(OverlaySide.BOTTOM).trigger(Button.create("Bottom").variant(ButtonVariant.SECONDARY)).element());
        tooltips.appendChild(Tooltip.create("Tooltip to the left of the trigger.").side(OverlaySide.LEFT).trigger(Button.create("Left").variant(ButtonVariant.SECONDARY)).element());
        grid.appendChild(example("Placements", tooltips,
                "Tooltip.create(\"Tooltip above the trigger.\")\n"
                        + "    .side(OverlaySide.TOP)\n"
                        + "    .trigger(Button.create(\"Top\"));\n\n"
                        + "Tooltip.create(\"Tooltip to the right.\")\n"
                        + "    .side(OverlaySide.RIGHT)\n"
                        + "    .trigger(Button.create(\"Right\"));"));
    }

    private void renderHoverCardComponent(HTMLElement grid) {
        HTMLElement hoverCards = preview();
        hoverCards.appendChild(HoverCard.create()
                .side(OverlaySide.BOTTOM)
                .showDelay(200)
                .hideDelay(250)
                .trigger(Button.create("Hover card").variant(ButtonVariant.GHOST))
                .content(raw(textElement("p", "demo-muted", "HoverCard shares the same trigger pattern as Tooltip, but can render richer content.")))
                .element());
        hoverCards.appendChild(HoverCard.create()
                .side(OverlaySide.RIGHT)
                .showDelay(0)
                .hideDelay(400)
                .trigger(Button.create("Fast open").variant(ButtonVariant.OUTLINE))
                .content(raw(textElement("p", "demo-muted", "Delays are configured in milliseconds.")))
                .element());
        grid.appendChild(example("Delayed hover content", hoverCards,
                "HoverCard.create()\n"
                        + "    .side(OverlaySide.BOTTOM)\n"
                        + "    .showDelay(200)\n"
                        + "    .hideDelay(250)\n"
                        + "    .trigger(Button.create(\"Hover card\"))\n"
                        + "    .content(raw(content));"));
    }

    private void renderDropdownMenuComponent(HTMLElement grid) {
        HTMLElement menus = preview("demo-stack-preview");
        HTMLElement menuStatus = textElement("p", "demo-muted", "No menu item selected yet.");
        DropdownMenu dropdownMenu = DropdownMenu.create()
                .side(OverlaySide.BOTTOM)
                .trigger(Button.create("Open menu").variant(ButtonVariant.OUTLINE))
                .addItem("profile", "Profile")
                .addItem("billing", "Billing")
                .addItem("logout", "Log out");
        dropdownMenu.onValueChange(value -> menuStatus.textContent = "Dropdown selected: " + value);
        menus.appendChild(dropdownMenu.element());
        menus.appendChild(menuStatus);
        menus.appendChild(textElement("p", "demo-muted", "Menu items support ArrowUp, ArrowDown, Home, End, Enter, Space, and Escape."));
        grid.appendChild(example("Trigger menu", menus,
                "DropdownMenu.create()\n"
                        + "    .side(OverlaySide.BOTTOM)\n"
                        + "    .trigger(Button.create(\"Open menu\"))\n"
                        + "    .addItem(\"profile\", \"Profile\")\n"
                        + "    .addItem(\"billing\", \"Billing\")\n"
                        + "    .onValueChange(value -> { ... });"));
    }

    private void renderContextMenuComponent(HTMLElement grid) {
        HTMLElement basic = preview("demo-stack-preview");
        HTMLElement basicStatus = textElement("p", "demo-muted", "Right-click the target.");
        HTMLElement basicAction = textElement("p", "demo-muted", "No direct action yet.");
        ContextMenu basicMenu = ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Right-click here").variant(ButtonVariant.SECONDARY))
                .addItem("profile", "Profile", () -> basicAction.textContent = "Direct action: Profile opened.")
                .addItem("billing", "Billing")
                .addItem("team", "Team")
                .addItem("subscription", "Subscription");
        basicMenu.onValueChange(value -> basicStatus.textContent = "Context menu selected: " + value);
        basic.appendChild(basicMenu.element());
        basic.appendChild(basicStatus);
        basic.appendChild(basicAction);
        grid.appendChild(example("Basic", basic,
                "ContextMenu.create()\n"
                        + "    .side(OverlaySide.RIGHT)\n"
                        + "    .target(Button.create(\"Right-click here\"))\n"
                        + "    .addItem(\"profile\", \"Profile\", () -> { ... })\n"
                        + "    .addItem(\"billing\", \"Billing\")\n"
                        + "    .addItem(\"team\", \"Team\")\n"
                        + "    .addItem(\"subscription\", \"Subscription\")\n"
                        + "    .onValueChange(value -> { ... });"));

        HTMLElement submenu = preview("demo-stack-preview");
        HTMLElement submenuStatus = textElement("p", "demo-muted", "Open the submenu with hover, click, or ArrowRight.");
        ContextMenu submenuMenu = ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Submenu target").variant(ButtonVariant.SECONDARY))
                .addItem("back", "Back")
                .addItem("forward", "Forward")
                .addSubmenu(ContextMenu.submenu("More tools")
                        .addItem("save-page", "Save page")
                        .addShortcutItem("create-shortcut", "Create shortcut", "Cmd+S")
                        .addDestructiveItem("clear-cache", "Clear cache"))
                .addItem("reload", "Reload");
        submenuMenu.onValueChange(value -> submenuStatus.textContent = "Submenu selected: " + value);
        submenu.appendChild(submenuMenu.element());
        submenu.appendChild(submenuStatus);
        grid.appendChild(example("Submenu", submenu,
                "ContextMenu.create()\n"
                        + "    .target(Button.create(\"Submenu target\"))\n"
                        + "    .addItem(\"back\", \"Back\")\n"
                        + "    .addSubmenu(ContextMenu.submenu(\"More tools\")\n"
                        + "        .addItem(\"save-page\", \"Save page\")\n"
                        + "        .addShortcutItem(\"create-shortcut\", \"Create shortcut\", \"Cmd+S\"));"));

        HTMLElement shortcuts = preview("demo-stack-preview");
        shortcuts.appendChild(ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Shortcut target").variant(ButtonVariant.SECONDARY))
                .addShortcutItem("copy", "Copy", "Cmd+C")
                .addShortcutItem("paste", "Paste", "Cmd+V")
                .addShortcutItem("reload", "Reload", "Cmd+R")
                .element());
        shortcuts.appendChild(textElement("p", "demo-muted", "Shortcut hints are visual metadata; selection still comes through onValueChange."));
        grid.appendChild(example("Shortcuts", shortcuts,
                "ContextMenu.create()\n"
                        + "    .target(Button.create(\"Shortcut target\"))\n"
                        + "    .addShortcutItem(\"copy\", \"Copy\", \"Cmd+C\")\n"
                        + "    .addShortcutItem(\"paste\", \"Paste\", \"Cmd+V\");"));

        HTMLElement groups = preview("demo-stack-preview");
        groups.appendChild(ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Grouped target").variant(ButtonVariant.SECONDARY))
                .addLabel("Account")
                .addItem("profile", "Profile")
                .addItem("billing", "Billing")
                .separator()
                .addLabel("Workspace")
                .addItem("team", "Team")
                .addItem("settings", "Settings")
                .element());
        grid.appendChild(example("Groups", groups,
                "ContextMenu.create()\n"
                        + "    .addLabel(\"Account\")\n"
                        + "    .addItem(\"profile\", \"Profile\")\n"
                        + "    .addItem(\"billing\", \"Billing\")\n"
                        + "    .separator()\n"
                        + "    .addLabel(\"Workspace\")\n"
                        + "    .addItem(\"team\", \"Team\");"));

        HTMLElement icons = preview("demo-stack-preview");
        icons.appendChild(ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Icon target").variant(ButtonVariant.SECONDARY))
                .addItem("copy", "Copy", LucideIcons.check().variant(IconVariant.MUTED), "Cmd+C")
                .addItem("search", "Search", LucideIcons.search().variant(IconVariant.MUTED), "Cmd+F")
                .addItem("close", "Close", LucideIcons.x().variant(IconVariant.MUTED), "Esc")
                .element());
        grid.appendChild(example("Icons", icons,
                "ContextMenu.create()\n"
                        + "    .addItem(\"copy\", \"Copy\", LucideIcons.check(), \"Cmd+C\")\n"
                        + "    .addItem(\"search\", \"Search\", LucideIcons.search(), \"Cmd+F\");"));

        HTMLElement checks = preview("demo-stack-preview");
        checks.appendChild(ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Preference target").variant(ButtonVariant.SECONDARY))
                .addCheckboxItem("bookmarks", "Show bookmarks bar", true)
                .addCheckboxItem("urls", "Show full URLs", false)
                .separator()
                .addRadioItem("density", "comfortable", "Comfortable", true)
                .addRadioItem("density", "compact", "Compact", false)
                .element());
        grid.appendChild(example("Checkboxes and radio", checks,
                "ContextMenu.create()\n"
                        + "    .addCheckboxItem(\"bookmarks\", \"Show bookmarks bar\", true)\n"
                        + "    .addCheckboxItem(\"urls\", \"Show full URLs\", false)\n"
                        + "    .separator()\n"
                        + "    .addRadioItem(\"density\", \"comfortable\", \"Comfortable\", true)\n"
                        + "    .addRadioItem(\"density\", \"compact\", \"Compact\", false);"));

        HTMLElement destructive = preview("demo-stack-preview");
        destructive.appendChild(ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Destructive target").variant(ButtonVariant.SECONDARY))
                .addItem("rename", "Rename")
                .addItem("share", "Share")
                .separator()
                .addDestructiveItem("delete", "Delete")
                .element());
        grid.appendChild(example("Destructive", destructive,
                "ContextMenu.create()\n"
                        + "    .addItem(\"rename\", \"Rename\")\n"
                        + "    .addItem(\"share\", \"Share\")\n"
                        + "    .separator()\n"
                        + "    .addDestructiveItem(\"delete\", \"Delete\");"));
    }

    private void renderSheetComponent(HTMLElement grid) {
        HTMLElement panels = preview();
        panels.appendChild(Sheet.create()
                .side(SheetSide.RIGHT)
                .trigger(Button.create("Open sheet").variant(ButtonVariant.OUTLINE))
                .title("Settings")
                .description("Sheets slide from an edge and use the same modal behavior as Dialog.")
                .content(raw(textElement("p", "demo-muted", "Use a sheet for secondary workflows that need more room than a popover.")))
                .element());
        grid.appendChild(example("Edge panel", panels,
                "Sheet.create()\n"
                        + "    .side(SheetSide.RIGHT)\n"
                        + "    .trigger(Button.create(\"Open sheet\"))\n"
                        + "    .title(\"Settings\")\n"
                        + "    .content(raw(content));"));
    }

    private void renderDrawerComponent(HTMLElement grid) {
        HTMLElement panels = preview();
        panels.appendChild(Drawer.create()
                .trigger(Button.create("Open drawer").variant(ButtonVariant.OUTLINE))
                .title("Mobile drawer")
                .description("Drawer uses a bottom sheet presentation for compact layouts.")
                .content(raw(textElement("p", "demo-muted", "Drawers are useful for mobile navigation, filters, and contextual actions.")))
                .element());
        grid.appendChild(example("Bottom panel", panels,
                "Drawer.create()\n"
                        + "    .trigger(Button.create(\"Open drawer\"))\n"
                        + "    .title(\"Mobile drawer\")\n"
                        + "    .content(raw(content));"));
    }

    private void renderOverlayUtilitiesComponent(HTMLElement grid) {
        HTMLElement overlayPreview = preview("demo-stack-preview");
        Button openButton = Button.create("Open overlay smoke").variant(ButtonVariant.OUTLINE);
        HTMLElement status = textElement("p", "demo-muted", "Overlay is closed.");
        IdGenerator ids = IdGenerator.create("overlay smoke");
        String dialogId = ids.next("dialog");
        String titleId = ids.next("title");
        ListenerRegistration[] cleanup = new ListenerRegistration[] { ListenerRegistration.empty() };

        Aria.buttonPopup(openButton.element(), "dialog", dialogId, false);
        openButton.onClick(event -> {
            cleanup[0].remove();

            OverlayLayer layer = OverlayLayer.create().attr("tabindex", "-1");
            layer.element().setAttribute("id", dialogId);
            HTMLElement panel = element("div", "demo-overlay-panel");
            Aria.dialog(panel, titleId, true);
            HTMLElement title = textElement("h3", "", "Overlay infrastructure");
            title.setAttribute("id", titleId);
            panel.appendChild(title);
            panel.appendChild(textElement("p", "demo-muted", "This smoke example uses Portal, OutsideClick, Keyboard, FocusManager, Aria, IdGenerator, and OverlayLayer."));
            panel.appendChild(Button.create("Close").variant(ButtonVariant.SECONDARY).onClick(closeEvent -> cleanup[0].remove()).element());
            layer.add(raw(panel));

            ListenerRegistration portal = Portal.appendToBody(layer.element());
            ListenerRegistration outside = OutsideClick.listen(panel, outsideEvent -> cleanup[0].remove());
            ListenerRegistration escape = layer.listen("keydown", keyEvent -> {
                if (Keyboard.isEscape(((KeyboardEvent) keyEvent).key)) {
                    keyEvent.preventDefault();
                    cleanup[0].remove();
                }
            });
            cleanup[0] = () -> {
                ListenerRegistration.combine(escape, outside, portal).remove();
                cleanup[0] = ListenerRegistration.empty();
                Aria.buttonPopup(openButton.element(), "dialog", dialogId, false);
                status.textContent = "Overlay is closed.";
                FocusManager.focus(openButton.element());
            };
            Aria.buttonPopup(openButton.element(), "dialog", dialogId, true);
            status.textContent = "Overlay is open. Press Escape or click outside to close it.";
            FocusManager.focus(layer.element());
        });

        overlayPreview.appendChild(openButton.element());
        overlayPreview.appendChild(status);
        grid.appendChild(example("Infrastructure smoke test", overlayPreview,
                "IdGenerator ids = IdGenerator.create(\"overlay smoke\");\n"
                        + "OverlayLayer layer = OverlayLayer.create();\n"
                        + "Aria.dialog(panel, titleId, true);\n"
                        + "ListenerRegistration portal = Portal.appendToBody(layer.element());\n"
                        + "ListenerRegistration outside = OutsideClick.listen(panel, event -> close());\n"
                        + "layer.listen(\"keydown\", event -> {\n"
                        + "    if (Keyboard.isEscape(((KeyboardEvent) event).key)) {\n"
                        + "        close();\n"
                        + "    }\n"
                        + "});\n"
                        + "FocusManager.focus(layer.element());"));
    }

    private void renderActions(HTMLElement grid) {
        HTMLElement buttons = preview();
        buttons.appendChild(Button.create("Default").element());
        buttons.appendChild(Button.create("Destructive").variant(ButtonVariant.DESTRUCTIVE).element());
        buttons.appendChild(Button.create("Secondary").variant(ButtonVariant.SECONDARY).element());
        buttons.appendChild(Button.create("Outline").variant(ButtonVariant.OUTLINE).element());
        buttons.appendChild(Button.create("Ghost").variant(ButtonVariant.GHOST).element());
        buttons.appendChild(Button.create("Link").variant(ButtonVariant.LINK).element());
        buttons.appendChild(Button.create("Small").size(ButtonSize.SM).element());
        buttons.appendChild(Button.create("Large").size(ButtonSize.LG).element());
        buttons.appendChild(Button.create("Disabled").disabled(true).element());
        grid.appendChild(example("Button", buttons,
                "Button.create(\"Default\");\n"
                        + "Button.create(\"Destructive\").variant(ButtonVariant.DESTRUCTIVE);\n"
                        + "Button.create(\"Secondary\").variant(ButtonVariant.SECONDARY);\n"
                        + "Button.create(\"Outline\").variant(ButtonVariant.OUTLINE);\n"
                        + "Button.create(\"Ghost\").variant(ButtonVariant.GHOST);\n"
                        + "Button.create(\"Link\").variant(ButtonVariant.LINK);\n"
                        + "Button.create(\"Small\").size(ButtonSize.SM);\n"
                        + "Button.create(\"Large\").size(ButtonSize.LG);\n"
                        + "Button.create(\"Disabled\").disabled(true);"));

        HTMLElement badges = preview();
        badges.appendChild(Badge.create("Default").element());
        badges.appendChild(Badge.create("Secondary").variant(BadgeVariant.SECONDARY).element());
        badges.appendChild(Badge.create("Destructive").variant(BadgeVariant.DESTRUCTIVE).element());
        badges.appendChild(Badge.create("Outline").variant(BadgeVariant.OUTLINE).element());
        grid.appendChild(example("Badge", badges,
                "Badge.create(\"Default\");\n"
                        + "Badge.create(\"Secondary\").variant(BadgeVariant.SECONDARY);\n"
                        + "Badge.create(\"Destructive\").variant(BadgeVariant.DESTRUCTIVE);\n"
                        + "Badge.create(\"Outline\").variant(BadgeVariant.OUTLINE);"));

        HTMLElement buttonGroups = preview();
        buttonGroups.appendChild(ButtonGroup.create()
                .add(Button.create("Left").variant(ButtonVariant.OUTLINE))
                .add(Button.create("Center").variant(ButtonVariant.OUTLINE))
                .add(Button.create("Right").variant(ButtonVariant.OUTLINE))
                .element());
        grid.appendChild(example("ButtonGroup", buttonGroups,
                "ButtonGroup.create()\n"
                        + "    .add(Button.create(\"Left\").variant(ButtonVariant.OUTLINE))\n"
                        + "    .add(Button.create(\"Center\").variant(ButtonVariant.OUTLINE))\n"
                        + "    .add(Button.create(\"Right\").variant(ButtonVariant.OUTLINE));"));

        HTMLElement toggles = preview();
        toggles.appendChild(Toggle.create("Bold").pressed(true).element());
        toggles.appendChild(Toggle.create("Italic").variant(ToggleVariant.OUTLINE).element());
        toggles.appendChild(ToggleGroup.create()
                .type(ToggleGroupType.SINGLE)
                .addItem("left", "Left")
                .addItem("center", "Center")
                .addItem("right", "Right")
                .value("center")
                .element());
        grid.appendChild(example("Toggle", toggles,
                "Toggle.create(\"Bold\").pressed(true);\n"
                        + "Toggle.create(\"Italic\").variant(ToggleVariant.OUTLINE);\n\n"
                        + "ToggleGroup.create()\n"
                        + "    .type(ToggleGroupType.SINGLE)\n"
                        + "    .addItem(\"left\", \"Left\")\n"
                        + "    .addItem(\"center\", \"Center\")\n"
                        + "    .addItem(\"right\", \"Right\")\n"
                        + "    .value(\"center\");"));
    }

    private void renderIcons(HTMLElement grid) {
        HTMLElement iconPreview = preview();
        iconPreview.appendChild(LucideIcons.check().variant(IconVariant.PRIMARY).ariaLabel("Confirmed").element());
        iconPreview.appendChild(LucideIcons.search().variant(IconVariant.MUTED).decorative().element());
        iconPreview.appendChild(LucideIcons.x().variant(IconVariant.DESTRUCTIVE).size(IconSize.LG).ariaLabel("Close").element());
        grid.appendChild(example("Icon", iconPreview,
                "LucideIcons.check()\n"
                        + "    .variant(IconVariant.PRIMARY)\n"
                        + "    .ariaLabel(\"Confirmed\");\n\n"
                        + "LucideIcons.search()\n"
                        + "    .variant(IconVariant.MUTED)\n"
                        + "    .decorative();\n\n"
                        + "LucideIcons.x()\n"
                        + "    .size(IconSize.LG)\n"
                        + "    .ariaLabel(\"Close\");"));

        HTMLElement buttonIcons = preview();
        buttonIcons.appendChild(Button.create("Save").icon(LucideIcons.check()).element());
        buttonIcons.appendChild(Button.create("Search").variant(ButtonVariant.OUTLINE).icon(LucideIcons.search()).element());
        buttonIcons.appendChild(Button.create("").size(ButtonSize.ICON).variant(ButtonVariant.GHOST).icon(LucideIcons.x()).aria("label", "Close").element());
        grid.appendChild(example("Button icons", buttonIcons,
                "Button.create(\"Save\")\n"
                        + "    .icon(LucideIcons.check());\n\n"
                        + "Button.create(\"Search\")\n"
                        + "    .variant(ButtonVariant.OUTLINE)\n"
                        + "    .icon(LucideIcons.search());\n\n"
                        + "Button.create(\"\")\n"
                        + "    .size(ButtonSize.ICON)\n"
                        + "    .variant(ButtonVariant.GHOST)\n"
                        + "    .icon(LucideIcons.x())\n"
                        + "    .aria(\"label\", \"Close\");"));

        HTMLElement registryPreview = preview("demo-stack-preview");
        IconRegistry registry = IconRegistry.create().register("lucide", LucideIcons.provider());
        registryPreview.appendChild(registry.icon("lucide", "search").ariaLabel("Search").element());
        registryPreview.appendChild(textElement("p", "demo-muted", "IconRegistry keeps providers explicit and avoids global icon registration."));
        grid.appendChild(example("IconRegistry", registryPreview,
                "IconRegistry registry = IconRegistry.create()\n"
                        + "    .register(\"lucide\", LucideIcons.provider());\n\n"
                        + "registry.icon(\"lucide\", \"search\")\n"
                        + "    .ariaLabel(\"Search\");"));
    }

    private void renderIconsPage() {
        clearContent();
        content.appendChild(textElement("h1", "", "Icons"));
        content.appendChild(textElement("p", "demo-muted", "The Lucide module is separate from the core UI module and exposes 1960 generated SVG icons. The gallery initially renders a limited slice; use search to narrow the catalog."));

        HTMLElement usage = componentSection("icon-usage", "Icon Usage", "Standalone icons, Button composition, and explicit provider registration.");
        HTMLElement usageGrid = examplesGrid();
        renderIcons(usageGrid);
        usage.appendChild(usageGrid);
        content.appendChild(usage);

        HTMLElement gallerySection = componentSection("lucide-gallery", "Lucide Gallery", "Browse the generated Lucide icon factories available from gwt-fusion-icons-lucide.");
        HTMLElement controls = element("div", "demo-icon-gallery-controls");
        HTMLInputElement search = (HTMLInputElement) Input.create()
                .type("search")
                .placeholder("Filter icons, e.g. search, arrow, calendar")
                .element();
        HTMLElement status = textElement("p", "demo-muted", "");
        controls.appendChild(search);
        controls.appendChild(status);
        HTMLElement gallery = element("div", "demo-icon-gallery");
        search.addEventListener("input", event -> renderLucideGallery(search.value, gallery, status));
        gallerySection.appendChild(controls);
        gallerySection.appendChild(gallery);
        content.appendChild(gallerySection);
        renderLucideGallery("", gallery, status);
    }

    private void renderLucideGallery(String query, HTMLElement gallery, HTMLElement status) {
        clear(gallery);
        String filter = query == null ? "" : query.toLowerCase();
        String[] names = LucideIcons.names();
        int matched = 0;
        int rendered = 0;
        for (String name : names) {
            if (!filter.isEmpty() && !name.toLowerCase().contains(filter)) {
                continue;
            }
            matched++;
            if (rendered >= ICON_GALLERY_LIMIT) {
                continue;
            }
            HTMLElement item = element("div", "demo-icon-card");
            item.appendChild(LucideIcons.icon(name).size(24).decorative().element());
            item.appendChild(textElement("span", "demo-icon-name", name));
            item.appendChild(textElement("code", "demo-icon-code", "LucideIcons.icon(\"" + name + "\")"));
            gallery.appendChild(item);
            rendered++;
        }
        status.textContent = "Showing " + rendered + " of " + matched + " matching icons (" + names.length + " total).";
    }

    private void renderLayout(HTMLElement grid) {
        HTMLElement tabPreview = preview("demo-tabs-preview");
        tabPreview.appendChild(Tabs.create()
                .addTab("preview", "Preview", raw(textElement("p", "demo-muted", "Tabs keep related panels in the same flow and support arrow-key navigation.")))
                .addTab("code", "Code", CodeBlock.create("Tabs.create()\n    .addTab(\"preview\", \"Preview\", previewContent)\n    .addTab(\"code\", \"Code\", codeContent);").language("java"))
                .element());
        grid.appendChild(example("Tabs", tabPreview,
                "Tabs.create()\n"
                        + "    .addTab(\"preview\", \"Preview\", previewContent)\n"
                        + "    .addTab(\"code\", \"Code\", codeContent);"));

        Card card = Card.create()
                .add(Card.header()
                        .add(Card.title("Card Title"))
                        .add(Card.description("A structured surface for related content.")))
                .add(Card.content().add(Button.create("Action")));
        grid.appendChild(example("Card", card,
                "Card.create()\n    .add(Card.header()\n        .add(Card.title(\"Card Title\"))\n        .add(Card.description(\"A structured surface for related content.\")))\n    .add(Card.content().add(Button.create(\"Action\")));"));

        HTMLElement aspectRatios = preview("demo-aspect-preview");
        aspectRatios.appendChild(AspectRatio.create()
                .ratio(16, 9)
                .add(raw(textElement("div", "demo-aspect-box", "16:9")))
                .element());
        grid.appendChild(example("AspectRatio", aspectRatios,
                "AspectRatio.create()\n"
                        + "    .ratio(16, 9)\n"
                        + "    .add(content);"));

        HTMLElement accordions = preview("demo-stack-preview");
        accordions.appendChild(Accordion.create()
                .addItem("api", "Java-first API", raw(textElement("p", "demo-muted", "Fluent methods keep component usage natural in GWT applications.")))
                .addItem("styles", "Tailwind styling", raw(textElement("p", "demo-muted", "Class names stay static and discoverable by the Tailwind build.")))
                .value("api")
                .element());
        accordions.appendChild(Collapsible.create("Show implementation note")
                .content(raw(textElement("p", "demo-muted", "Collapsible is reusable on its own and also informs Accordion behavior.")))
                .element());
        grid.appendChild(example("Accordion", accordions,
                "Accordion.create()\n"
                        + "    .addItem(\"api\", \"Java-first API\", apiContent)\n"
                        + "    .addItem(\"styles\", \"Tailwind styling\", styleContent)\n"
                        + "    .value(\"api\");\n\n"
                        + "Collapsible.create(\"Show implementation note\")\n"
                        + "    .content(content);"));

        HTMLElement navExamples = preview("demo-stack-preview");
        navExamples.appendChild(Breadcrumb.create()
                .link("Docs", "#")
                .link("Components", "#")
                .current("Navigation")
                .element());
        navExamples.appendChild(Pagination.create()
                .previous("#")
                .page(1, "#", false)
                .page(2, "#", true)
                .page(3, "#", false)
                .next("#")
                .element());
        grid.appendChild(example("Navigation", navExamples,
                "Breadcrumb.create()\n"
                        + "    .link(\"Docs\", \"#\")\n"
                        + "    .link(\"Components\", \"#\")\n"
                        + "    .current(\"Navigation\");\n\n"
                        + "Pagination.create()\n"
                        + "    .previous(\"#\")\n"
                        + "    .page(1, \"#\", false)\n"
                        + "    .page(2, \"#\", true)\n"
                        + "    .next(\"#\");"));

        HTMLElement utilityLayout = preview("demo-stack-preview");
        utilityLayout.appendChild(ScrollArea.create()
                .height(120)
                .add(raw(textElement("p", "demo-muted", "Scroll areas keep overflowing content contained without forcing custom scrollbars. This paragraph is intentionally long so the example demonstrates constrained content and native scrolling behavior in a compact surface.")))
                .element());
        utilityLayout.appendChild(Typography.h2("Typography scale").element());
        utilityLayout.appendChild(Typography.muted("Reusable text styles keep documentation and application content visually consistent.").element());
        grid.appendChild(example("ScrollArea & Typography", utilityLayout,
                "ScrollArea.create()\n"
                        + "    .height(120)\n"
                        + "    .add(content);\n\n"
                        + "Typography.h2(\"Typography scale\");\n"
                        + "Typography.muted(\"Reusable text styles...\");"));

        HTMLElement separators = preview();
        separators.appendChild(Separator.create().element());
        separators.appendChild(Separator.create().orientation(SeparatorOrientation.VERTICAL).classes("mx-4 min-h-12").element());
        grid.appendChild(example("Separator", separators,
                "Separator.create();\n"
                        + "Separator.create()\n"
                        + "    .orientation(SeparatorOrientation.VERTICAL)\n"
                        + "    .classes(\"mx-4 min-h-12\");"));
    }

    private void renderForms(HTMLElement grid) {
        HTMLElement form = preview();
        form.appendChild(Label.create("Email").forId("email-demo").element());
        form.appendChild(Input.create().type("email").placeholder("name@example.com").attr("id", "email-demo").element());
        form.appendChild(Input.create().type("text").value("With value").element());
        form.appendChild(Input.create().type("password").placeholder("Password").element());
        grid.appendChild(example("Input", form,
                "Label.create(\"Email\").forId(\"email-demo\");\n"
                        + "Input.create()\n"
                        + "    .type(\"email\")\n"
                        + "    .placeholder(\"name@example.com\")\n"
                        + "    .attr(\"id\", \"email-demo\");\n"
                        + "Input.create().type(\"text\").value(\"With value\");\n"
                        + "Input.create().type(\"password\").placeholder(\"Password\");"));

        HTMLElement checkboxes = preview();
        checkboxes.appendChild(labelled("Accept terms", Checkbox.create().checked(true)));
        checkboxes.appendChild(labelled("Disabled", Checkbox.create().disabled(true)));
        checkboxes.appendChild(labelled("Invalid", Checkbox.create().invalid(true)));
        grid.appendChild(example("Checkbox", checkboxes,
                "Checkbox.create().checked(true);\n"
                        + "Checkbox.create().disabled(true);\n"
                        + "Checkbox.create().invalid(true);"));

        HTMLElement switches = preview();
        switches.appendChild(labelled("Notifications", Switch.create().checked(true)));
        switches.appendChild(labelled("Marketing", Switch.create()));
        switches.appendChild(labelled("Disabled", Switch.create().disabled(true)));
        grid.appendChild(example("Switch", switches,
                "Switch.create().checked(true);\n"
                        + "Switch.create();\n"
                        + "Switch.create().disabled(true);"));

        HTMLElement textareas = preview();
        textareas.appendChild(Textarea.create().placeholder("Write a message...").rows(4).element());
        textareas.appendChild(Textarea.create().value("Existing content").rows(3).element());
        textareas.appendChild(Textarea.create().placeholder("Disabled").disabled(true).element());
        grid.appendChild(example("Textarea", textareas,
                "Textarea.create()\n"
                        + "    .placeholder(\"Write a message...\")\n"
                        + "    .rows(4);\n"
                        + "Textarea.create().value(\"Existing content\").rows(3);\n"
                        + "Textarea.create().placeholder(\"Disabled\").disabled(true);"));

        HTMLElement radios = preview();
        radios.appendChild(RadioGroup.create()
                .name("density")
                .addOption("compact", "Compact")
                .addOption("comfortable", "Comfortable")
                .addOption("spacious", "Spacious")
                .value("comfortable")
                .element());
        radios.appendChild(RadioGroup.create()
                .name("billing")
                .orientation(RadioGroupOrientation.HORIZONTAL)
                .addOption("monthly", "Monthly")
                .addOption("yearly", "Yearly")
                .value("yearly")
                .element());
        radios.appendChild(RadioGroup.create()
                .name("disabled-plan")
                .addOption("team", "Team")
                .addOption("enterprise", "Enterprise")
                .disabled(true)
                .element());
        grid.appendChild(example("RadioGroup", radios,
                "RadioGroup.create()\n"
                        + "    .name(\"density\")\n"
                        + "    .addOption(\"compact\", \"Compact\")\n"
                        + "    .addOption(\"comfortable\", \"Comfortable\")\n"
                        + "    .addOption(\"spacious\", \"Spacious\")\n"
                        + "    .value(\"comfortable\");\n\n"
                        + "RadioGroup.create()\n"
                        + "    .orientation(RadioGroupOrientation.HORIZONTAL)\n"
                        + "    .addOption(\"monthly\", \"Monthly\")\n"
                        + "    .addOption(\"yearly\", \"Yearly\")\n"
                        + "    .value(\"yearly\");"));

        HTMLElement selectPreview = preview();
        selectPreview.appendChild(NativeSelect.create()
                .name("role")
                .option("admin", "Admin")
                .option("editor", "Editor")
                .option("viewer", "Viewer")
                .value("editor")
                .element());
        selectPreview.appendChild(NativeSelect.create()
                .option("", "Disabled select")
                .disabled(true)
                .element());
        grid.appendChild(example("NativeSelect", selectPreview,
                "NativeSelect.create()\n"
                        + "    .name(\"role\")\n"
                        + "    .option(\"admin\", \"Admin\")\n"
                        + "    .option(\"editor\", \"Editor\")\n"
                        + "    .option(\"viewer\", \"Viewer\")\n"
                        + "    .value(\"editor\");\n\n"
                        + "NativeSelect.create()\n"
                        + "    .option(\"\", \"Disabled select\")\n"
                        + "    .disabled(true);"));

        HTMLElement inputGroups = preview();
        inputGroups.appendChild(InputGroup.create()
                .startText("https://")
                .add(Input.create().placeholder("example.com"))
                .element());
        inputGroups.appendChild(InputGroup.create()
                .add(Input.create().type("number").placeholder("Amount"))
                .endText("EUR")
                .element());
        grid.appendChild(example("InputGroup", inputGroups,
                "InputGroup.create()\n"
                        + "    .startText(\"https://\")\n"
                        + "    .add(Input.create().placeholder(\"example.com\"));\n\n"
                        + "InputGroup.create()\n"
                        + "    .add(Input.create().type(\"number\").placeholder(\"Amount\"))\n"
                        + "    .endText(\"EUR\");"));

        HTMLElement sliders = preview();
        sliders.appendChild(Slider.create().name("volume").min(0).max(100).step(1).value(65).element());
        sliders.appendChild(Slider.create().min(0).max(10).step(0.5).value(4.5).disabled(true).element());
        grid.appendChild(example("Slider", sliders,
                "Slider.create()\n"
                        + "    .name(\"volume\")\n"
                        + "    .min(0)\n"
                        + "    .max(100)\n"
                        + "    .step(1)\n"
                        + "    .value(65);\n\n"
                        + "Slider.create().min(0).max(10).step(0.5).value(4.5).disabled(true);"));

        HTMLElement composedForm = preview("demo-form-preview");
        composedForm.appendChild(FormField.create("profile-email")
                .label("Email")
                .control(Input.create().type("email").placeholder("name@example.com").required(true))
                .description("Used for account notifications.")
                .element());
        composedForm.appendChild(FormField.create("profile-bio")
                .label("Bio")
                .control(Textarea.create().placeholder("Tell us about your work...").rows(3))
                .description("Keep it short and specific.")
                .element());
        composedForm.appendChild(FormField.create("profile-role")
                .label("Role")
                .control(NativeSelect.create()
                        .option("admin", "Admin")
                        .option("editor", "Editor")
                        .option("viewer", "Viewer")
                        .value("viewer"))
                .element());
        composedForm.appendChild(FormField.create("profile-name")
                .label("Validation state")
                .control(Input.create().value("A").invalid(true))
                .message("Name must contain at least 2 characters.")
                .element());
        grid.appendChild(example("Form composition", composedForm,
                "FormField.create(\"profile-email\")\n"
                        + "    .label(\"Email\")\n"
                        + "    .control(Input.create()\n"
                        + "        .type(\"email\")\n"
                        + "        .placeholder(\"name@example.com\")\n"
                        + "        .required(true))\n"
                        + "    .description(\"Used for account notifications.\");\n\n"
                        + "FormField.create(\"profile-name\")\n"
                        + "    .label(\"Validation state\")\n"
                        + "    .control(Input.create().value(\"A\").invalid(true))\n"
                        + "    .message(\"Name must contain at least 2 characters.\");"));
    }

    private void renderEvents(HTMLElement grid) {
        HTMLElement sliderEvents = preview("demo-stack-preview");
        Slider liveSlider = Slider.create().min(0).max(100).step(1).value(65);
        HTMLElement liveValue = textElement("p", "demo-muted", "Live value: 65.0");
        HTMLElement commitValue = textElement("p", "demo-muted", "Committed value: not yet");
        liveSlider.onValueChange(value -> liveValue.textContent = "Live value: " + value);
        liveSlider.onValueCommit(value -> commitValue.textContent = "Committed value: " + value);
        sliderEvents.appendChild(textElement("p", "demo-muted", "Drag the slider to see input events update immediately. Release it to commit the value."));
        sliderEvents.appendChild(liveSlider.element());
        sliderEvents.appendChild(liveValue);
        sliderEvents.appendChild(commitValue);
        grid.appendChild(example("Slider events", sliderEvents,
                "Slider slider = Slider.create()\n"
                        + "    .min(0)\n"
                        + "    .max(100)\n"
                        + "    .step(1)\n"
                        + "    .value(65);\n\n"
                        + "slider.onValueChange(value -> {\n"
                        + "    // DOM input: fires while dragging\n"
                        + "});\n\n"
                        + "slider.onValueCommit(value -> {\n"
                        + "    // DOM change: fires when committed\n"
                        + "});"));

        HTMLElement stateEvents = preview("demo-stack-preview");
        Switch notifications = Switch.create().checked(true);
        HTMLElement switchStatus = textElement("p", "demo-muted", "Notifications: on");
        notifications.onCheckedChange(checked -> switchStatus.textContent = "Notifications: " + (checked ? "on" : "off"));

        ToggleGroup alignment = ToggleGroup.create()
                .type(ToggleGroupType.SINGLE)
                .addItem("left", "Left")
                .addItem("center", "Center")
                .addItem("right", "Right")
                .value("center");
        HTMLElement alignmentStatus = textElement("p", "demo-muted", "Alignment: center");
        alignment.onValueChange(value -> alignmentStatus.textContent = "Alignment: " + value);

        stateEvents.appendChild(labelled("Notifications", notifications));
        stateEvents.appendChild(switchStatus);
        stateEvents.appendChild(alignment.element());
        stateEvents.appendChild(alignmentStatus);
        grid.appendChild(example("State change listeners", stateEvents,
                "Switch notifications = Switch.create().checked(true);\n"
                        + "notifications.onCheckedChange(checked -> {\n"
                        + "    // checked is Boolean\n"
                        + "});\n\n"
                        + "ToggleGroup alignment = ToggleGroup.create()\n"
                        + "    .type(ToggleGroupType.SINGLE)\n"
                        + "    .addItem(\"left\", \"Left\")\n"
                        + "    .addItem(\"center\", \"Center\")\n"
                        + "    .addItem(\"right\", \"Right\")\n"
                        + "    .value(\"center\");\n\n"
                        + "alignment.onValueChange(value -> {\n"
                        + "    // value is the selected item key\n"
                        + "});"));
    }

    private void renderOverlays(HTMLElement grid) {
        HTMLElement overlayPreview = preview("demo-stack-preview");
        Button openButton = Button.create("Open overlay smoke").variant(ButtonVariant.OUTLINE);
        HTMLElement status = textElement("p", "demo-muted", "Overlay is closed.");
        IdGenerator ids = IdGenerator.create("overlay smoke");
        String dialogId = ids.next("dialog");
        String titleId = ids.next("title");
        ListenerRegistration[] cleanup = new ListenerRegistration[] { ListenerRegistration.empty() };

        Aria.buttonPopup(openButton.element(), "dialog", dialogId, false);
        openButton.onClick(event -> {
            cleanup[0].remove();

            OverlayLayer layer = OverlayLayer.create().attr("tabindex", "-1");
            layer.element().setAttribute("id", dialogId);
            HTMLElement panel = element("div", "demo-overlay-panel");
            Aria.dialog(panel, titleId, true);
            HTMLElement title = textElement("h3", "", "Overlay infrastructure");
            title.setAttribute("id", titleId);
            panel.appendChild(title);
            panel.appendChild(textElement("p", "demo-muted", "This smoke example uses Portal, OutsideClick, Keyboard, FocusManager, Aria, IdGenerator, and OverlayLayer."));
            panel.appendChild(Button.create("Close")
                    .variant(ButtonVariant.SECONDARY)
                    .onClick(closeEvent -> cleanup[0].remove())
                    .element());
            layer.add(raw(panel));

            ListenerRegistration portal = Portal.appendToBody(layer.element());
            ListenerRegistration outside = OutsideClick.listen(panel, outsideEvent -> cleanup[0].remove());
            ListenerRegistration escape = layer.listen("keydown", keyEvent -> {
                if (Keyboard.isEscape(((KeyboardEvent) keyEvent).key)) {
                    keyEvent.preventDefault();
                    cleanup[0].remove();
                }
            });
            cleanup[0] = () -> {
                ListenerRegistration.combine(escape, outside, portal).remove();
                cleanup[0] = ListenerRegistration.empty();
                Aria.buttonPopup(openButton.element(), "dialog", dialogId, false);
                status.textContent = "Overlay is closed.";
                FocusManager.focus(openButton.element());
            };
            Aria.buttonPopup(openButton.element(), "dialog", dialogId, true);
            status.textContent = "Overlay is open. Press Escape or click outside to close it.";
            FocusManager.focus(layer.element());
        });

        overlayPreview.appendChild(openButton.element());
        overlayPreview.appendChild(status);
        grid.appendChild(example("Overlay utilities", overlayPreview,
                "IdGenerator ids = IdGenerator.create(\"overlay smoke\");\n"
                        + "OverlayLayer layer = OverlayLayer.create();\n"
                        + "Aria.dialog(panel, titleId, true);\n"
                        + "ListenerRegistration portal = Portal.appendToBody(layer.element());\n"
                        + "ListenerRegistration outside = OutsideClick.listen(panel, event -> close());\n"
                        + "layer.listen(\"keydown\", event -> {\n"
                        + "    if (Keyboard.isEscape(((KeyboardEvent) event).key)) {\n"
                        + "        close();\n"
                        + "    }\n"
                        + "});\n"
                        + "FocusManager.focus(layer.element());"));

        HTMLElement dialogs = preview();
        dialogs.appendChild(Dialog.create()
                .trigger(Button.create("Open dialog"))
                .title("Edit profile")
                .description("Dialog sets aria-modal, supports Escape, closes on backdrop click, and returns focus to the trigger.")
                .content(raw(textElement("p", "demo-muted", "Use dialogs for focused tasks that should interrupt the current workflow.")))
                .element());
        dialogs.appendChild(AlertDialog.create()
                .trigger(Button.create("Delete item").variant(ButtonVariant.DESTRUCTIVE))
                .title("Are you absolutely sure?")
                .description("AlertDialog uses role=alertdialog for destructive confirmations.")
                .content(raw(textElement("p", "demo-muted", "Provide a clear escape path and make the primary destructive action explicit.")))
                .element());
        grid.appendChild(example("Dialog and AlertDialog", dialogs,
                "Dialog.create()\n"
                        + "    .trigger(Button.create(\"Open dialog\"))\n"
                        + "    .title(\"Edit profile\")\n"
                        + "    .description(\"Dialog sets aria-modal and returns focus.\")\n"
                        + "    .content(raw(content));\n\n"
                        + "AlertDialog.create()\n"
                        + "    .trigger(Button.create(\"Delete item\").variant(ButtonVariant.DESTRUCTIVE))\n"
                        + "    .title(\"Are you absolutely sure?\");"));

        HTMLElement floating = preview();
        floating.appendChild(Popover.create()
                .side(OverlaySide.BOTTOM)
                .trigger(Button.create("Open popover").variant(ButtonVariant.OUTLINE))
                .content(raw(textElement("p", "demo-muted", "Popover is non-modal and closes on outside click or Escape.")))
                .element());
        floating.appendChild(Tooltip.create("Tooltip above the trigger.")
                .side(OverlaySide.TOP)
                .trigger(Button.create("Tooltip top").variant(ButtonVariant.SECONDARY))
                .element());
        floating.appendChild(Tooltip.create("Tooltip to the right of the trigger.")
                .side(OverlaySide.RIGHT)
                .trigger(Button.create("Tooltip right").variant(ButtonVariant.SECONDARY))
                .element());
        floating.appendChild(Tooltip.create("Tooltip below the trigger.")
                .side(OverlaySide.BOTTOM)
                .trigger(Button.create("Tooltip bottom").variant(ButtonVariant.SECONDARY))
                .element());
        floating.appendChild(Tooltip.create("Tooltip to the left of the trigger.")
                .side(OverlaySide.LEFT)
                .trigger(Button.create("Tooltip left").variant(ButtonVariant.SECONDARY))
                .element());
        floating.appendChild(HoverCard.create()
                .side(OverlaySide.BOTTOM)
                .showDelay(200)
                .hideDelay(250)
                .trigger(Button.create("Hover card").variant(ButtonVariant.GHOST))
                .content(raw(textElement("p", "demo-muted", "HoverCard shares the same trigger pattern as Tooltip, but can render richer content.")))
                .element());
        grid.appendChild(example("Popover, Tooltip, and HoverCard", floating,
                "Popover.create()\n"
                        + "    .side(OverlaySide.BOTTOM)\n"
                        + "    .trigger(Button.create(\"Open popover\"))\n"
                        + "    .content(raw(content));\n\n"
                        + "Tooltip.create(\"Tooltip above the trigger.\")\n"
                        + "    .side(OverlaySide.TOP)\n"
                        + "    .trigger(Button.create(\"Tooltip top\"));\n\n"
                        + "Tooltip.create(\"Tooltip to the right of the trigger.\")\n"
                        + "    .side(OverlaySide.RIGHT)\n"
                        + "    .trigger(Button.create(\"Tooltip right\"));\n\n"
                        + "Tooltip.create(\"Tooltip below the trigger.\")\n"
                        + "    .side(OverlaySide.BOTTOM)\n"
                        + "    .trigger(Button.create(\"Tooltip bottom\"));\n\n"
                        + "Tooltip.create(\"Tooltip to the left of the trigger.\")\n"
                        + "    .side(OverlaySide.LEFT)\n"
                        + "    .trigger(Button.create(\"Tooltip left\"));\n\n"
                        + "HoverCard.create()\n"
                        + "    .side(OverlaySide.BOTTOM)\n"
                        + "    .showDelay(200)\n"
                        + "    .hideDelay(250)\n"
                        + "    .trigger(Button.create(\"Hover card\"))\n"
                        + "    .content(raw(content));"));

        HTMLElement menus = preview("demo-stack-preview");
        HTMLElement menuStatus = textElement("p", "demo-muted", "No menu item selected yet.");
        DropdownMenu dropdownMenu = DropdownMenu.create()
                .side(OverlaySide.BOTTOM)
                .trigger(Button.create("Open menu").variant(ButtonVariant.OUTLINE))
                .addItem("profile", "Profile")
                .addItem("billing", "Billing")
                .addItem("logout", "Log out");
        dropdownMenu.onValueChange(value -> menuStatus.textContent = "Dropdown selected: " + value);
        ContextMenu contextMenu = ContextMenu.create()
                .side(OverlaySide.RIGHT)
                .target(Button.create("Right-click target").variant(ButtonVariant.SECONDARY))
                .addItem("copy", "Copy")
                .addItem("paste", "Paste")
                .addItem("inspect", "Inspect");
        contextMenu.onValueChange(value -> menuStatus.textContent = "Context menu selected: " + value);
        menus.appendChild(dropdownMenu.element());
        menus.appendChild(contextMenu.element());
        menus.appendChild(menuStatus);
        menus.appendChild(textElement("p", "demo-muted", "Menu items support ArrowUp, ArrowDown, Home, End, Enter, Space, and Escape."));
        grid.appendChild(example("DropdownMenu and ContextMenu", menus,
                "DropdownMenu.create()\n"
                        + "    .side(OverlaySide.BOTTOM)\n"
                        + "    .trigger(Button.create(\"Open menu\"))\n"
                        + "    .addItem(\"profile\", \"Profile\")\n"
                        + "    .onValueChange(value -> { ... });\n\n"
                        + "ContextMenu.create()\n"
                        + "    .side(OverlaySide.RIGHT)\n"
                        + "    .target(Button.create(\"Right-click target\"))\n"
                        + "    .addItem(\"copy\", \"Copy\");"));

        HTMLElement panels = preview();
        panels.appendChild(Sheet.create()
                .side(SheetSide.RIGHT)
                .trigger(Button.create("Open sheet").variant(ButtonVariant.OUTLINE))
                .title("Settings")
                .description("Sheets slide from an edge and use the same modal behavior as Dialog.")
                .content(raw(textElement("p", "demo-muted", "Use a sheet for secondary workflows that need more room than a popover.")))
                .element());
        panels.appendChild(Drawer.create()
                .trigger(Button.create("Open drawer").variant(ButtonVariant.OUTLINE))
                .title("Mobile drawer")
                .description("Drawer uses a bottom sheet presentation for compact layouts.")
                .content(raw(textElement("p", "demo-muted", "Drawers are useful for mobile navigation, filters, and contextual actions.")))
                .element());
        grid.appendChild(example("Sheet and Drawer", panels,
                "Sheet.create()\n"
                        + "    .side(SheetSide.RIGHT)\n"
                        + "    .trigger(Button.create(\"Open sheet\"))\n"
                        + "    .title(\"Settings\");\n\n"
                        + "Drawer.create()\n"
                        + "    .trigger(Button.create(\"Open drawer\"))\n"
                        + "    .title(\"Mobile drawer\");"));
    }

    private void renderFeedback(HTMLElement grid) {
        HTMLElement alerts = preview();
        alerts.appendChild(Alert.create()
                .add(Alert.title("Heads up"))
                .add(Alert.description("Alert components use roles and theme tokens."))
                .element());
        alerts.appendChild(Alert.create()
                .variant(AlertVariant.DESTRUCTIVE)
                .add(Alert.title("Error"))
                .add(Alert.description("The destructive style uses its own variant."))
                .element());
        grid.appendChild(example("Alert", alerts,
                "Alert.create()\n"
                        + "    .add(Alert.title(\"Heads up\"))\n"
                        + "    .add(Alert.description(\"Alert components use roles and theme tokens.\"));\n\n"
                        + "Alert.create()\n"
                        + "    .variant(AlertVariant.DESTRUCTIVE)\n"
                        + "    .add(Alert.title(\"Error\"))\n"
                        + "    .add(Alert.description(\"The destructive style uses its own variant.\"));"));
    }

    private void renderProgressComponent(HTMLElement grid) {
        HTMLElement progress = preview("demo-stack-preview");
        progress.appendChild(Progress.create().value(35).element());
        progress.appendChild(Progress.create().value(100).element());
        progress.appendChild(Progress.create().indeterminate().element());
        grid.appendChild(example("Loading and completed states", progress,
                "Progress.create().value(35);\n"
                        + "Progress.create().value(100);\n"
                        + "Progress.create().indeterminate();"));

        HTMLElement custom = preview("demo-stack-preview");
        custom.appendChild(Progress.create().max(200).value(125).element());
        custom.appendChild(StatusIndicator.create("Deployment complete").variant(StatusIndicatorVariant.SUCCESS).element());
        grid.appendChild(example("Custom max with status", custom,
                "Progress.create()\n"
                        + "    .max(200)\n"
                        + "    .value(125);\n\n"
                        + "StatusIndicator.create(\"Deployment complete\")\n"
                        + "    .variant(StatusIndicatorVariant.SUCCESS);"));
    }

    private void renderSkeletonComponent(HTMLElement grid) {
        HTMLElement skeletons = preview("demo-stack-preview");
        skeletons.appendChild(Skeleton.create().size("h-4 w-48").element());
        skeletons.appendChild(Skeleton.create().size("h-4 w-72").element());
        skeletons.appendChild(Skeleton.create().size("h-24 w-full").element());
        grid.appendChild(example("Content placeholder", skeletons,
                "Skeleton.create().size(\"h-4 w-48\");\n"
                        + "Skeleton.create().size(\"h-4 w-72\");\n"
                        + "Skeleton.create().size(\"h-24 w-full\");"));

        HTMLElement card = preview("demo-stack-preview");
        card.appendChild(Skeleton.create().size("h-32 w-full").element());
        card.appendChild(Skeleton.create().size("h-5 w-40").element());
        card.appendChild(Skeleton.create().size("h-4 w-64").element());
        grid.appendChild(example("Card loading state", card,
                "Skeleton.create().size(\"h-32 w-full\");\n"
                        + "Skeleton.create().size(\"h-5 w-40\");\n"
                        + "Skeleton.create().size(\"h-4 w-64\");"));
    }

    private void renderSpinnerComponent(HTMLElement grid) {
        HTMLElement spinners = preview();
        spinners.appendChild(Spinner.create().size(SpinnerSize.SM).element());
        spinners.appendChild(Spinner.create().element());
        spinners.appendChild(Spinner.create().size(SpinnerSize.LG).label("Saving").element());
        grid.appendChild(example("Sizes", spinners,
                "Spinner.create().size(SpinnerSize.SM);\n"
                        + "Spinner.create();\n"
                        + "Spinner.create().size(SpinnerSize.LG).label(\"Saving\");"));

        HTMLElement buttons = preview();
        buttons.appendChild(loadingButton("Loading...", false).disabled(true).element());
        buttons.appendChild(loadingButton("Please wait", true).variant(ButtonVariant.OUTLINE).disabled(true).element());
        buttons.appendChild(Button.create("Processing").disabled(true).icon(LucideIcons.loaderCircle().classes("animate-spin")).element());
        grid.appendChild(example("Button", buttons,
                "Button loading = loadingButton(\"Loading...\", false)\n"
                        + "    .disabled(true);\n\n"
                        + "Button.create(\"Processing\")\n"
                        + "    .disabled(true)\n"
                        + "    .icon(LucideIcons.loaderCircle().classes(\"animate-spin\"));"));

        HTMLElement badges = preview();
        badges.appendChild(loadingBadge("Syncing", false).element());
        badges.appendChild(loadingBadge("Updating", true).variant(BadgeVariant.SECONDARY).element());
        badges.appendChild(loadingBadge("Processing", false).variant(BadgeVariant.OUTLINE).element());
        grid.appendChild(example("Badge", badges,
                "loadingBadge(\"Syncing\", false);\n"
                        + "loadingBadge(\"Updating\", true).variant(BadgeVariant.SECONDARY);\n"
                        + "loadingBadge(\"Processing\", false).variant(BadgeVariant.OUTLINE);"));

        HTMLElement inputGroup = preview("demo-stack-preview");
        InputGroup validating = InputGroup.create()
                .add(Input.create().placeholder("Validating...").value("team@example.com"));
        HTMLElement validatingAction = element("span", InputGroup.ADDON_CLASSES + " " + InputGroup.END_ADDON_CLASSES + " gap-2");
        validatingAction.appendChild(Spinner.create().size(SpinnerSize.SM).label("Validating").element());
        validatingAction.appendChild(textElement("span", "", "Send"));
        validating.element().appendChild(validatingAction);
        inputGroup.appendChild(validating.element());
        grid.appendChild(example("Input Group", inputGroup,
                "InputGroup group = InputGroup.create()\n"
                        + "    .add(Input.create().placeholder(\"Validating...\"));\n"
                        + "group.element().appendChild(spinnerAddon);"));

        HTMLElement empty = preview("demo-stack-preview");
        empty.appendChild(EmptyState.create()
                .title("Processing your request")
                .description("Please wait while we process your request. Do not refresh the page.")
                .action(Spinner.create().label("Processing request"))
                .action(Button.create("Cancel").variant(ButtonVariant.OUTLINE))
                .element());
        grid.appendChild(example("Empty", empty,
                "EmptyState.create()\n"
                        + "    .title(\"Processing your request\")\n"
                        + "    .description(\"Please wait while we process your request.\")\n"
                        + "    .action(Spinner.create().label(\"Processing request\"))\n"
                        + "    .action(Button.create(\"Cancel\").variant(ButtonVariant.OUTLINE));"));
    }

    private Button loadingButton(String text, boolean spinnerAtEnd) {
        Button button = Button.create("");
        HTMLElement label = textElement("span", "", text);
        if (spinnerAtEnd) {
            button.element().appendChild(label);
            button.element().appendChild(Spinner.create().size(SpinnerSize.SM).element());
        } else {
            button.element().appendChild(Spinner.create().size(SpinnerSize.SM).element());
            button.element().appendChild(label);
        }
        return button;
    }

    private Badge loadingBadge(String text, boolean spinnerAtEnd) {
        Badge badge = Badge.create("").classes("gap-1");
        HTMLElement label = textElement("span", "", text);
        Spinner spinner = Spinner.create().size(SpinnerSize.SM).label(text);
        if (spinnerAtEnd) {
            badge.element().appendChild(label);
            badge.element().appendChild(spinner.element());
        } else {
            badge.element().appendChild(spinner.element());
            badge.element().appendChild(label);
        }
        return badge;
    }

    private void renderEmptyStateComponent(HTMLElement grid) {
        HTMLElement empty = preview("demo-stack-preview");
        empty.appendChild(EmptyState.create()
                .title("No projects yet")
                .description("Create a project to start organizing components, examples, and release notes.")
                .action(Button.create("Create project"))
                .action(Button.create("Import").variant(ButtonVariant.OUTLINE))
                .element());
        grid.appendChild(example("Empty list", empty,
                "EmptyState.create()\n"
                        + "    .title(\"No projects yet\")\n"
                        + "    .description(\"Create a project to start organizing work.\")\n"
                        + "    .action(Button.create(\"Create project\"))\n"
                        + "    .action(Button.create(\"Import\").variant(ButtonVariant.OUTLINE));"));

        HTMLElement search = preview("demo-stack-preview");
        search.appendChild(EmptyState.create()
                .title("No results found")
                .description("Try another search term or clear the current filters.")
                .action(Button.create("Clear filters").variant(ButtonVariant.SECONDARY))
                .element());
        grid.appendChild(example("Empty search", search,
                "EmptyState.create()\n"
                        + "    .title(\"No results found\")\n"
                        + "    .description(\"Try another search term.\")\n"
                        + "    .action(Button.create(\"Clear filters\"));"));
    }

    private void renderStatusIndicatorComponent(HTMLElement grid) {
        HTMLElement statuses = preview();
        statuses.appendChild(StatusIndicator.create("Queued").element());
        statuses.appendChild(StatusIndicator.create("Healthy").variant(StatusIndicatorVariant.SUCCESS).element());
        statuses.appendChild(StatusIndicator.create("Delayed").variant(StatusIndicatorVariant.WARNING).element());
        statuses.appendChild(StatusIndicator.create("Failed").variant(StatusIndicatorVariant.ERROR).element());
        statuses.appendChild(StatusIndicator.create("Syncing").variant(StatusIndicatorVariant.INFO).element());
        grid.appendChild(example("Status variants", statuses,
                "StatusIndicator.create(\"Queued\");\n"
                        + "StatusIndicator.create(\"Healthy\").variant(StatusIndicatorVariant.SUCCESS);\n"
                        + "StatusIndicator.create(\"Delayed\").variant(StatusIndicatorVariant.WARNING);\n"
                        + "StatusIndicator.create(\"Failed\").variant(StatusIndicatorVariant.ERROR);\n"
                        + "StatusIndicator.create(\"Syncing\").variant(StatusIndicatorVariant.INFO);"));
    }

    private void renderToastComponent(HTMLElement grid) {
        ToastManager toastManager = ToastManager.create();

        HTMLElement toastPreviews = preview("demo-stack-preview");
        toastPreviews.appendChild(Toast.create()
                .title("Saved")
                .description("Your changes are ready for review.")
                .variant(ToastVariant.SUCCESS)
                .duration(0)
                .element());
        toastPreviews.appendChild(Toast.create()
                .title("Build warning")
                .description("The build finished with one non-blocking warning.")
                .variant(ToastVariant.WARNING)
                .style(ToastStyle.SONNER)
                .duration(0)
                .element());
        grid.appendChild(example("Toast surfaces", toastPreviews,
                "Toast.create()\n"
                        + "    .title(\"Saved\")\n"
                        + "    .description(\"Your changes are ready for review.\")\n"
                        + "    .variant(ToastVariant.SUCCESS);\n\n"
                        + "Toast.create()\n"
                        + "    .title(\"Build warning\")\n"
                        + "    .variant(ToastVariant.WARNING)\n"
                        + "    .style(ToastStyle.SONNER);"));

        HTMLElement trigger = preview("demo-stack-preview");
        HTMLElement note = textElement("p", "demo-muted", "Click the button to append a toast to the lazy viewport in the top-right corner.");
        trigger.appendChild(Button.create("Show toast")
                .onClick(event -> toastManager.show(Toast.create()
                        .title("Toast triggered")
                        .description("ToastManager created the viewport only when this button was clicked.")
                        .variant(ToastVariant.DEFAULT)
                        .style(ToastStyle.SONNER)))
                .element());
        trigger.appendChild(Button.create("Show error")
                .variant(ButtonVariant.DESTRUCTIVE)
                .onClick(event -> toastManager.show(Toast.create()
                        .title("Something failed")
                        .description("Use error toasts for short-lived failure feedback.")
                        .variant(ToastVariant.ERROR)))
                .element());
        trigger.appendChild(note);
        grid.appendChild(example("Trigger a toast", trigger,
                "ToastManager toastManager = ToastManager.create();\n\n"
                        + "Button.create(\"Show toast\")\n"
                        + "    .onClick(event -> toastManager.show(Toast.create()\n"
                        + "        .title(\"Toast triggered\")\n"
                        + "        .description(\"Created lazily on click.\")\n"
                        + "        .style(ToastStyle.SONNER)));"));
    }

    private HTMLElement categoryNav() {
        HTMLElement nav = element("nav", "demo-category-nav");
        nav.setAttribute("aria-label", "Component categories");
        nav.appendChild(categoryLink("Actions", "#actions"));
        nav.appendChild(categoryLink("Icons", "#icons"));
        nav.appendChild(categoryLink("Layout", "#layout"));
        nav.appendChild(categoryLink("Forms", "#forms"));
        nav.appendChild(categoryLink("Events", "#events"));
        nav.appendChild(categoryLink("Overlays", "#overlays"));
        nav.appendChild(categoryLink("Feedback", "#feedback"));
        return nav;
    }

    private HTMLElement categoryLink(String label, String href) {
        HTMLElement link = element("a", "demo-category-link");
        link.setAttribute("href", href);
        link.textContent = label;
        return link;
    }

    private HTMLElement componentSection(String id, String title, String description) {
        HTMLElement section = element("section", "demo-section");
        section.setAttribute("id", id);
        HTMLElement header = element("div", "demo-section-header");
        header.appendChild(textElement("h2", "demo-section-title", title));
        header.appendChild(textElement("p", "demo-muted", description));
        section.appendChild(header);
        return section;
    }

    private HTMLElement examplesGrid() {
        return element("div", "demo-grid");
    }

    private void renderTheme() {
        clearContent();
        content.appendChild(textElement("h1", "", "Theme"));
        content.appendChild(textElement("p", "demo-muted", "Themes are controlled through CSS variables and the root .dark class. ThemeManager.setMode(...) is the Java API for switching modes."));
        boolean dark = ThemeManager.mode() == ThemeMode.DARK;
        HTMLElement themeControls = preview();
        themeControls.appendChild(textElement("p", "demo-muted", "Current mode: " + ThemeManager.mode().name()));
        themeControls.appendChild(Button.create(dark ? "Switch to light mode" : "Switch to dark mode")
                .variant(ButtonVariant.OUTLINE)
                .onClick(event -> {
                    toggleTheme();
                    renderTheme();
                })
                .element());
        content.appendChild(example("ThemeManager", themeControls,
                "ThemeManager.setMode(\n"
                        + "    ThemeManager.mode() == ThemeMode.DARK\n"
                        + "        ? ThemeMode.LIGHT\n"
                        + "        : ThemeMode.DARK\n"
                        + ");"));
    }

    private HTMLElement example(String title, UiComponent component, String code) {
        return example(title, wrap(component), code);
    }

    private HTMLElement example(String title, HTMLElement preview, String code) {
        HTMLElement example = element("article", "demo-example");
        example.appendChild(textElement("h2", "", title));
        HTMLElement body = element("div", "demo-example-body");
        body.appendChild(preview);
        body.appendChild(code(code));
        example.appendChild(body);
        return example;
    }

    private HTMLElement wrap(UiComponent component) {
        HTMLElement preview = preview();
        preview.appendChild(component.element());
        return preview;
    }

    private HTMLElement preview() {
        return element("div", "demo-preview");
    }

    private HTMLElement preview(String extraClass) {
        HTMLElement preview = preview();
        preview.className = preview.className + " " + extraClass;
        return preview;
    }

    private HTMLElement code(String code) {
        return CodeBlock.create(code).language("java").classes("demo-code").element();
    }

    private UiComponent raw(HTMLElement element) {
        return () -> element;
    }

    private HTMLElement labelled(String label, UiComponent component) {
        HTMLElement wrapper = element("label", "demo-control-label");
        wrapper.appendChild(component.element());
        wrapper.appendChild(textElement("span", "", label));
        return wrapper;
    }

    private HTMLElement textElement(String tagName, String classes, String text) {
        HTMLElement element = element(tagName, classes);
        element.textContent = text;
        return element;
    }

    private HTMLElement element(String tagName, String classes) {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement(tagName);
        if (classes != null && !classes.isEmpty()) {
            element.className = classes;
        }
        return element;
    }

    private void clearContent() {
        clear(content);
    }

    private void clear(HTMLElement element) {
        while (element.firstChild != null) {
            element.removeChild(element.firstChild);
        }
    }
}
