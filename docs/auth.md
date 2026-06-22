# Auth

`gwt-fusion-auth` provides auth state primitives, session persistence helpers, HTTP auth-header interceptors, and optional router guard helpers. It does not implement OAuth, OIDC, JWT validation, cookie management, or server-side auth policy.

## Usage

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-auth</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>
```

For GWT applications, inherit the module:

```xml
<inherits name="org.gwtfusion.auth.GwtFusionAuth"/>
```

## Auth State

Use `AuthManager` for local auth state and listener registration.

```java
AuthManager auth = AuthManager.create();

auth.onStateChange(state -> {
    if (state.status() == AuthStatus.AUTHENTICATED) {
        // update navigation
    }
});

AuthSession session = AuthSession.of(
    AuthUser.of("ada", "Ada Lovelace", "ada@example.test"),
    AuthToken.bearer(accessToken, expiresAtMillis));

auth.login(session);
auth.logout();
```

`AuthStatus` supports `ANONYMOUS`, `LOADING`, `AUTHENTICATED`, `EXPIRED`, and `FAILED` states. Cookie-backed sessions can use `AuthSession.of(user)` without an access token.

## Storage Handoff

Auth persistence is explicit. Applications choose `localStorage`, `sessionStorage`, or memory storage.

```java
AuthManager auth = AuthManager.create()
    .sessionStore(AuthSessionStore.create(StorageArea.sessionStorage()))
    .restore();
```

`AuthSessionStore` uses a reflection-free `AuthSessionCodec`. When a refresh token exists, its expiration controls storage TTL; otherwise the access-token expiration is used.

## HTTP Headers

Use `AuthHttp.authorization(auth)` with `HttpClient` to add an `Authorization` header only when the current state is authenticated and the access token is not expired.

```java
HttpClient client = HttpClient.create()
    .addRequestInterceptor(AuthHttp.authorization(auth));
```

Existing `Authorization` headers are preserved.

## Refresh Hooks

Refresh behavior is application-defined.

```java
auth.refresh(context -> {
    api.refresh(context.session().refreshToken()).then(newSession -> {
        context.complete(newSession);
        return null;
    });
});
```

Use the hook for OAuth, JWT refresh endpoints, cookie-session refresh, or custom auth flows. Call `context.fail(message)` or `context.logout()` when refresh cannot continue.

## Router Guards

Router guard helpers live in `gwt-fusion-auth`, so `gwt-fusion-router` stays independent from auth.

```java
Route.of("/account", AuthGuard.requireAuthenticated(auth, context -> {
    return accountElement();
}, "/login"));
```

Anonymous, expired, and failed states redirect to the configured login route with a UTF-8 encoded `redirect` query parameter. Loading state renders nothing and is re-evaluated automatically when auth leaves `LOADING`, as long as the user is still on the guarded route.

## Recommended Patterns

- JWT bearer tokens: store an `AuthSession` with access and refresh tokens, use `AuthHttp.authorization(auth)`, and refresh on application-specific `401` handling.
- Cookie-backed sessions: store only `AuthUser` in `AuthSession.of(user)`, rely on browser cookies for transport, and do not add an auth-header interceptor.
- Logout cleanup: call `auth.logout()` so persisted session state is cleared and listeners are notified.
