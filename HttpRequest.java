package Q1;

import java.util.ArrayList;
import java.util.List;

public class HttpRequest {

    public enum Method {
        GET,
        PUT,
        POST,
        HEAD,
        DELETE
    }

    private String url;
    private String body;
    private List<String> params;
    private Method method;
    private List<String> headers;

    public HttpRequest() {
    }

    public static HttpRequest aHttpRequest() {
        return new HttpRequest();
    }

    public HttpRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequest withBody(String body) {
        this.body = body;
        return this;
    }

    public HttpRequest withParams(List<String> params) {
        this.params = params;
        return this;
    }

    public HttpRequest withMethod(Method method) {
        this.method = method;
        return this;
    }

    public HttpRequest withHeaders(List<String> headers) {
        this.headers = headers;
        return this;
    }

    public static void main(String[] args) {
        HttpRequest httpRequest = aHttpRequest().withMethod(Method.POST).withUrl("http://exams.imperial.ac.uk/220").withBody("mark=100").withHeaders(List.of("Date=02-05-2018"));
    }
}

