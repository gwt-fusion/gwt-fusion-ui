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

## UI Composition

Keep UI rendering in the application or optional helpers. Typical mappings are:

- Loading query state: `Skeleton` or `Spinner`.
- Error query state: `Alert` with retry button.
- Empty success state: `EmptyState`.
- Mutation success: `ToastManager` or invalidation of related query keys.
