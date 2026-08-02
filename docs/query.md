# Query

`gwt-fusion-query` provides TanStack Query-inspired primitives for client-side data fetching, cache state, retries, invalidation, observers, and mutations. It is UI-independent and does not require `gwt-fusion-http`; fetchers can call `HttpClient`, generated OpenAPI clients, or custom Promise-based adapters.

## Usage

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-query</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>
```

For GWT applications, inherit the module:

```xml
<inherits name="org.gwtfusion.query.GwtFusionQuery"/>
```

## Queries

Use `QueryClient` with stable `QueryKey` values and explicit fetchers.

```java
QueryClient queryClient = QueryClient.create();

Query<Project[]> projects = queryClient.query(
    QueryKey.of("projects", "list"),
    () -> api.projects(),
    QueryOptions.create()
        .staleTime(30_000)
        .gcTime(5 * 60 * 1_000)
        .retry(2)
        .retryDelay(QueryRetryDelay.exponential(250, 2_000)));

projects.observe(state -> renderProjects(state));
projects.refetch();
```

`QueryState` supports idle, loading, success, error, stale, and refreshing states. Repeated `refetch()` calls while a query is in flight return the same Promise for request de-duplication.

## Cache And Invalidation

Query keys are hierarchical.

```java
QueryKey list = QueryKey.of("projects", "list");
QueryKey detail = QueryKey.of("projects", "detail", projectId);

queryClient.invalidate(QueryKey.of("projects"));
```

Invalidation marks all matching prefix keys stale. `gcTime` controls when unobserved, idle queries can be removed by `collectGarbage()`.

## Disabled Queries

Use disabled queries when required inputs are not ready yet.

```java
QueryOptions disabled = QueryOptions.create().enabled(false);
Query<Project> project = queryClient.query(QueryKey.of("projects", "detail", id), fetcher, disabled);
```

Call `refetch()` manually when the inputs become available.

## Mutations

Use `Mutation` for write operations and submit state.

```java
Mutation<FormValue, Project> saveProject = Mutation.create(
    MutationOptions.create(value -> api.saveProject(value))
        .onMutate(value -> optimisticUpdate(value)));

saveProject.observe(state -> updateSubmitButton(state));
saveProject.execute(formValue);
```

`MutationState` supports idle, loading, success, and error states.

## Query UI Helpers

`gwt-fusion-query-ui` is an optional module that depends on both `gwt-fusion-query` and `gwt-fusion-ui`. The core query module remains usable without UI dependencies.

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-query-ui</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>
```

For GWT applications, inherit the optional module:

```xml
<inherits name="org.gwtfusion.query.ui.GwtFusionQueryUi"/>
```

`QueryView<T>` observes a query and selects idle, loading, error, empty, or success renderers. Idle, loading, error, and empty states have built-in renderers; applications normally configure the success renderer and their domain-specific empty predicate.

```java
QueryView<Project[]> view = QueryView.create(projects)
    .loading((state, retry) -> Skeleton.create().size("h-32 w-full"))
    .error((state, retry) -> Alert.create()
        .variant(AlertVariant.DESTRUCTIVE)
        .add(Alert.title("Unable to load projects"))
        .add(Alert.description(state.errorMessage()))
        .add(Button.create("Retry").onClick(event -> retry.run())))
    .emptyWhen(values -> values != null && values.length == 0)
    .empty((state, retry) -> EmptyState.create().title("No projects"))
    .success((state, retry) -> DataTable.create()
        .columns("Project", "Status")
        .rows(projectRows(state.data())));
```

Refreshing queries with cached non-empty data use the success renderer, allowing rows to remain visible while `state.isRefreshing()` is true. A matching empty predicate still selects the empty renderer. `view.phase()` exposes the selected `QueryViewPhase`, and the root element reflects it through `data-state` and `aria-busy`.

Call `view.dispose()` whenever the view is removed while its query or `QueryClient` remains retained. This removes the observer so the detached view stops rendering and the query can become eligible for garbage collection.

Mutation notifications stay outside `QueryView`: use `ToastManager` for mutation success or errors and invalidate related query keys after successful writes.
