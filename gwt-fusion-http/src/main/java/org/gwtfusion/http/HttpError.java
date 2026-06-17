package org.gwtfusion.http;

public final class HttpError extends RuntimeException {
    private final int status;
    private final String statusText;
    private final String url;

    private HttpError(int status, String statusText, String url) {
        super(message(status, statusText, url));
        this.status = status;
        this.statusText = statusText == null ? "" : statusText;
        this.url = url == null ? "" : url;
    }

    public static HttpError of(int status, String statusText, String url) {
        return new HttpError(status, statusText, url);
    }

    public static HttpError from(HttpResponse response) {
        return new HttpError(response.status(), response.statusText(), response.url());
    }

    public int status() {
        return status;
    }

    public String statusText() {
        return statusText;
    }

    public String url() {
        return url;
    }

    private static String message(int status, String statusText, String url) {
        String text = statusText == null || statusText.isEmpty() ? "HTTP request failed" : statusText;
        String target = url == null || url.isEmpty() ? "" : " for " + url;
        return text + " (status " + status + ")" + target;
    }
}
