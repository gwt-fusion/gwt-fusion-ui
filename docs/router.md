# Router

`gwt-fusion-router` is a standalone client router for GWT 2.13 and J2CL-compatible applications. It does not depend on `gwt-fusion-ui`; route renderers return `HTMLElement` so applications can use it with any DOM composition style.

## Maven

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-router</artifactId>
  <version>${project.version}</version>
</dependency>
```

GWT module:

```xml
<inherits name="org.gwtfusion.router.GwtFusionRouter"/>
```

## Usage

```java
Router router = Router.create(HistoryStrategy.hash())
    .route("/", context -> homeElement())
    .route("/components", context -> componentsIndexElement())
    .route("/components/:id", context -> componentElement(context.params().get("id")))
    .route("/docs/*", context -> docsElement(context.params().get("*")))
    .notFound(context -> notFoundElement());

router.attach(outletElement);
router.navigate("/components/button");
```

## History Strategies

- `HistoryStrategy.hash()` creates URLs like `#/components/button`. Use this for static hosting such as GitHub Pages because the fragment is not sent to the server.
- `HistoryStrategy.browser()` creates clean URLs like `/components/button`. Use this when the server returns the host page for application routes on reload.
- `HistoryStrategy.memory()` keeps routing state in memory. Use this for tests, embedded flows, or non-browser-owned navigation.

The same route definitions work with every strategy. Use `router.href(path)` when creating links so the URL format follows the selected strategy.

## Matching

- Static routes match exactly: `/components`.
- Named parameters use `:name`: `/components/:id`.
- Splat routes use `*` and expose the remaining path as `params().get("*")`.
- Search parameters are available through `context.search()`.
