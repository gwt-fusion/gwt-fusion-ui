package org.gwtfusion.http;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class HttpRequestTest {
    @Test
    void resolvesRelativeUrlsAgainstBaseUrl() {
        HttpClient client = HttpClient.create().baseUrl("https://api.example.test/v1/");

        assertEquals("https://api.example.test/v1/users", client.get("/users").urlWithQuery());
        assertEquals("https://other.example/users", client.get("https://other.example/users").urlWithQuery());
    }

    @Test
    void preservesSchemeAwareAbsoluteUrls() {
        HttpClient client = HttpClient.create().baseUrl("https://api.example.test/v1");

        assertEquals("HTTPS://other.example/users", client.get("HTTPS://other.example/users").urlWithQuery());
        assertEquals("//cdn.example.test/script.js", client.get("//cdn.example.test/script.js").urlWithQuery());
        assertEquals("mailto:hello@example.test", client.get("mailto:hello@example.test").urlWithQuery());
    }

    @Test
    void encodesQueryParameters() {
        HttpRequest request = HttpClient.create()
                .baseUrl("https://api.example.test")
                .get("/search")
                .query("q", "status open")
                .query("tag", "ui/forms")
                .query("tag", "über");

        assertEquals("https://api.example.test/search?q=status%20open&tag=ui%2Fforms&tag=%C3%BCber", request.urlWithQuery());
    }

    @Test
    void appendsQueryToExistingQueryString() {
        HttpRequest request = HttpClient.create().get("/users?active=true").query("page", 2);

        assertEquals("/users?active=true&page=2", request.urlWithQuery());
    }

    @Test
    void querySnapshotIsIndependent() {
        HttpRequest request = HttpClient.create().get("/search").query("tag", "ui");
        Map<String, List<String>> snapshot = request.query();

        request.query("tag", "forms");

        assertEquals(1, snapshot.get("tag").size());
        assertEquals("ui", snapshot.get("tag").get(0));
    }

    @Test
    void jsonBodySetsContentType() {
        HttpRequest request = HttpClient.create().post("/users").json("{\"name\":\"Ada\"}");

        assertTrue(request.body().hasContent());
        assertEquals("application/json;charset=UTF-8", request.headers().get("content-type"));
    }

    @Test
    void existingContentTypeIsNotOverwrittenByBodyHelper() {
        HttpRequest request = HttpClient.create()
                .post("/users")
                .header("Content-Type", "application/vnd.api+json")
                .json("{}");

        assertEquals("application/vnd.api+json", request.headers().get("content-type"));
    }

    @Test
    void managedContentTypeUpdatesWhenBodyChanges() {
        HttpRequest request = HttpClient.create().post("/users").json("{}").text("Ada");

        assertEquals("text/plain;charset=UTF-8", request.headers().get("content-type"));
    }

    @Test
    void managedContentTypeIsRemovedWhenBodyHasNoContentType() {
        HttpRequest request = HttpClient.create().post("/users").json("{}").body(HttpBody.empty());

        assertNull(request.headers().get("content-type"));
    }

    @Test
    void manuallyChangedContentTypeIsNotManaged() {
        HttpRequest request = HttpClient.create().post("/users").json("{}");

        request.headers().set("Content-Type", "application/custom");
        request.text("Ada");

        assertEquals("application/custom", request.headers().get("content-type"));
    }

    @Test
    void copyIsIndependent() {
        HttpRequest original = HttpClient.create().get("/users").header("Accept", "application/json").query("page", 1);
        HttpRequest copy = original.copy().header("Accept", "text/plain").query("page", 2);

        assertNotSame(original, copy);
        assertEquals("application/json", original.headers().get("Accept"));
        assertEquals("text/plain", copy.headers().get("Accept"));
        assertEquals("/users?page=1", original.urlWithQuery());
        assertEquals("/users?page=1&page=2", copy.urlWithQuery());
    }

    @Test
    void getAndHeadDoNotAllowBodies() {
        assertFalse(HttpMethod.GET.allowsBody());
        assertFalse(HttpMethod.HEAD.allowsBody());
        assertTrue(HttpMethod.POST.allowsBody());
    }
}
