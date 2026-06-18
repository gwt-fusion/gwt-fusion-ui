# HTTP

`gwt-fusion-http` is a thin Java-idiomatic layer over Elemental2 `DomGlobal.fetch`. It does not replace the browser transport and does not introduce GWT-RPC.

## Usage

```xml
<dependency>
  <groupId>org.gwtfusion</groupId>
  <artifactId>gwt-fusion-http</artifactId>
  <version>${gwt-fusion.version}</version>
</dependency>
```

For GWT applications, inherit the module:

```xml
<inherits name="org.gwtfusion.http.GwtFusionHttp"/>
```

## Requests

```java
HttpClient client = HttpClient.create().baseUrl("/api");

client.get("/users")
    .query("q", "status open")
    .query("page", 1)
    .header("Accept", "application/json")
    .send(HttpResponseParser.json());
```

JSON and text request bodies are explicit:

```java
client.post("/users")
    .json("{\"name\":\"Ada\"}")
    .send(HttpResponseParser.json());
```

## Interceptors

Use request interceptors for auth headers, CSRF headers, and correlation IDs. Use response interceptors for shared status handling and token-refresh handoff.

```java
HttpClient client = HttpClient.create()
    .addRequestInterceptor(request -> request.copy()
        .header("Authorization", "Bearer " + token))
    .addResponseInterceptor(response -> {
        if (response.status() == 401) {
            // trigger token refresh handoff
        }
        return response;
    });
```

## Typed Parsing

Parsing is explicit and reflection-free. Generated OpenAPI clients or application code can provide parser functions:

```java
client.get("/users/1")
    .send(HttpResponseParser.json(json -> User.fromJson(json)));
```

Use `HttpResponseParser.text()` or `HttpResponseParser.json()` for simple cases. Use `HttpResponseParser.of(...)` when the parser only needs response metadata such as headers or status.

## Why Not GWT-RPC

GWT Fusion keeps HTTP infrastructure REST-first and backend-agnostic. GWT-RPC/GWT Services can still be used by existing applications, but they are not a core dependency because they couple client and server Java APIs, do not fit all modern API gateways, and are less aligned with J2CL-friendly generated clients.
