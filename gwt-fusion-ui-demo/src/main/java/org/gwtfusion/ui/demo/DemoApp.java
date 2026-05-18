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
import org.gwtfusion.ui.component.badge.Badge;
import org.gwtfusion.ui.component.badge.BadgeVariant;
import org.gwtfusion.ui.component.breadcrumb.Breadcrumb;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.buttongroup.ButtonGroup;
import org.gwtfusion.ui.component.button.ButtonSize;
import org.gwtfusion.ui.component.button.ButtonVariant;
import org.gwtfusion.ui.component.card.Card;
import org.gwtfusion.ui.component.checkbox.Checkbox;
import org.gwtfusion.ui.component.code.CodeBlock;
import org.gwtfusion.ui.component.collapsible.Collapsible;
import org.gwtfusion.ui.component.contextmenu.ContextMenu;
import org.gwtfusion.ui.component.dialog.Dialog;
import org.gwtfusion.ui.component.drawer.Drawer;
import org.gwtfusion.ui.component.dropdown.DropdownMenu;
import org.gwtfusion.ui.component.form.FormField;
import org.gwtfusion.ui.component.hovercard.HoverCard;
import org.gwtfusion.ui.component.icon.IconRegistry;
import org.gwtfusion.ui.component.icon.IconSize;
import org.gwtfusion.ui.component.icon.IconVariant;
import org.gwtfusion.ui.component.input.Input;
import org.gwtfusion.ui.component.inputgroup.InputGroup;
import org.gwtfusion.ui.component.label.Label;
import org.gwtfusion.ui.component.pagination.Pagination;
import org.gwtfusion.ui.component.popover.Popover;
import org.gwtfusion.ui.component.radio.RadioGroup;
import org.gwtfusion.ui.component.radio.RadioGroupOrientation;
import org.gwtfusion.ui.component.scrollarea.ScrollArea;
import org.gwtfusion.ui.component.select.NativeSelect;
import org.gwtfusion.ui.component.separator.Separator;
import org.gwtfusion.ui.component.separator.SeparatorOrientation;
import org.gwtfusion.ui.component.sheet.Sheet;
import org.gwtfusion.ui.component.sheet.SheetSide;
import org.gwtfusion.ui.component.slider.Slider;
import org.gwtfusion.ui.component.switcher.Switch;
import org.gwtfusion.ui.component.tabs.Tabs;
import org.gwtfusion.ui.component.textarea.Textarea;
import org.gwtfusion.ui.component.toggle.Toggle;
import org.gwtfusion.ui.component.toggle.ToggleVariant;
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
        clearContent();
        content.appendChild(textElement("p", "demo-muted", "Components are loaded through GWT.runAsync in this demo, making split points visible from the start."));
        GWT.runAsync(new RunAsyncCallback() {
            @Override
            public void onFailure(Throwable reason) {
                content.appendChild(textElement("p", "demo-muted", "Components could not be loaded: " + reason.getMessage()));
            }

            @Override
            public void onSuccess() {
                renderComponents();
            }
        });
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
        content.appendChild(textElement("p", "demo-muted", "Each example shows the rendered component on the left and the matching Java code on the right. Variants and sizes are intentionally shown side by side."));
        content.appendChild(categoryNav());

        HTMLElement actions = componentSection("actions", "Actions", "Interactive elements for triggering actions and highlighting state.");
        HTMLElement actionsGrid = examplesGrid();
        renderActions(actionsGrid);
        actions.appendChild(actionsGrid);
        content.appendChild(actions);

        HTMLElement icons = componentSection("icons", "Icons", "SVG-first icon primitives with accessible labels, decorative mode, and Button composition.");
        HTMLElement iconsGrid = examplesGrid();
        renderIcons(iconsGrid);
        icons.appendChild(iconsGrid);
        content.appendChild(icons);

        HTMLElement layout = componentSection("layout", "Layout", "Structural components for grouping content and organizing interface regions.");
        HTMLElement layoutGrid = examplesGrid();
        renderLayout(layoutGrid);
        layout.appendChild(layoutGrid);
        content.appendChild(layout);

        HTMLElement forms = componentSection("forms", "Forms", "Controls and composition primitives for accessible user input.");
        HTMLElement formsGrid = examplesGrid();
        renderForms(formsGrid);
        forms.appendChild(formsGrid);
        content.appendChild(forms);

        HTMLElement events = componentSection("events", "Events", "Elemental2-oriented listener registrations and semantic value-change callbacks for interactive components.");
        HTMLElement eventsGrid = examplesGrid();
        renderEvents(eventsGrid);
        events.appendChild(eventsGrid);
        content.appendChild(events);

        HTMLElement overlays = componentSection("overlays", "Overlays", "Shared portal, focus, keyboard, outside-click, and ARIA utilities for layered components.");
        HTMLElement overlaysGrid = examplesGrid();
        renderOverlays(overlaysGrid);
        overlays.appendChild(overlaysGrid);
        content.appendChild(overlays);

        HTMLElement feedback = componentSection("feedback", "Feedback", "Components for communicating status, warnings, and contextual messages.");
        HTMLElement feedbackGrid = examplesGrid();
        renderFeedback(feedbackGrid);
        feedback.appendChild(feedbackGrid);
        content.appendChild(feedback);
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
