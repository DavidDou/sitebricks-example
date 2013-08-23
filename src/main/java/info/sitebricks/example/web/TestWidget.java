package info.sitebricks.example.web;

import com.google.inject.Inject;
import com.google.sitebricks.headless.Request;
import com.google.sitebricks.rendering.EmbedAs;

@EmbedAs("TestWidget")
public class TestWidget {

    private String message = "hello";

    @Inject
    public TestWidget(Request request) {
        System.out.println(request.header("Accept"));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
