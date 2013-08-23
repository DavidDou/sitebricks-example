package info.sitebricks.example.web;

import com.google.sitebricks.At;
import com.google.sitebricks.Visible;
import com.google.sitebricks.http.Get;
import com.google.sitebricks.http.Post;

/**
 * The home page that our users will see at the top level URI "/".
 * <p/>
 * This page is created once per request and has "no scope" in Guice
 * terminology. See the <a href="http://code.google.com/p/google-guice">Guice wiki</a>
 * for details.
 *
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 */
@At("/")
public class HomePage {

    @Visible
    String message;

    @Get
    void showHome() {
        // This is where you would normally fetch stuff from a database, for example.
        message = "Hello from Sitebricks!";
    }

    @Post
    void post() {

    }

    public boolean getShouldShow() {
        // Always show our message.
        return true;
    }

    public String getMessage() {
        return message;
    }
}
