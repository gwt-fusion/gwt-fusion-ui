# Storage

`gwt-fusion-storage` provides typed wrappers for browser `localStorage`, browser `sessionStorage`, and in-memory fallback storage. Serialization is explicit through `StorageCodec<T>` and does not use reflection-based JSON mapping.

## Usage

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-storage</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>
```

For GWT applications, inherit the module:

```xml
<inherits name="org.gwtfusion.storage.GwtFusionStorage"/>
```

## Storage Areas

Use `StorageArea.localStorage()` for persisted preferences, `StorageArea.sessionStorage()` for tab/session scoped values, and `StorageArea.memory()` for tests, demos, and fallback-only state.

```java
StorageArea preferences = StorageArea.localStorage();
StorageKey<String> themeKey = StorageKey.string("app.preferences", "theme");

preferences.set(themeKey, "dark");
String theme = preferences.get(themeKey);
```

Browser storage access is defensive. If `localStorage` or `sessionStorage` is unavailable or blocked, operations fall back to memory storage for the current page lifecycle.

## Typed Keys And Codecs

Keys carry their namespace, name, and codec. Namespaces prevent app and library key collisions.

```java
StorageKey<Boolean> compactKey = StorageKey.bool("app.preferences", "compact");
StorageKey<Integer> pageSizeKey = StorageKey.integer("app.tables", "page-size");
```

Use custom codecs when values need application-specific serialization:

```java
StorageCodec<UserPreference> codec = StorageCodec.of(
    preference -> preference.toStorageString(),
    value -> UserPreference.fromStorageString(value));

StorageKey<UserPreference> key = StorageKey.of("app.preferences", "user", codec);
```

## TTL And Expiration

Values can expire after a TTL or at an absolute timestamp. Expired entries read as missing and are removed lazily.

```java
StorageArea drafts = StorageArea.localStorage();
StorageKey<String> draftKey = StorageKey.string("app.drafts", "profile-name");

drafts.set(draftKey, "Ada Lovelace", 60_000);
StorageEntry<String> entry = drafts.entry(draftKey);
```

Use negative TTL values for no expiration when calling the TTL overload. The non-TTL `set` overload also stores without expiration.

## Auth Handoff

Storage does not assume a JWT, OAuth, or cookie policy. Auth code can choose the storage area explicitly and hand tokens to HTTP interceptors.

```java
StorageArea session = StorageArea.sessionStorage();
StorageKey<String> tokenKey = StorageKey.string("app.auth", "access-token");

session.set(tokenKey, token, 15 * 60 * 1_000);

HttpClient client = HttpClient.create()
    .addRequestInterceptor(request -> request.copy()
        .header("Authorization", "Bearer " + session.get(tokenKey)));
```

Remove tokens explicitly during logout:

```java
session.remove(tokenKey);
```

When using `gwt-fusion-auth`, prefer `AuthSessionStore` so session serialization and expiration metadata stay consistent:

```java
AuthManager auth = AuthManager.create()
    .sessionStore(AuthSessionStore.create(StorageArea.sessionStorage()))
    .restore();
```
