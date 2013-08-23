package info.sitebricks.example.web;

import com.google.sitebricks.At;
import com.google.sitebricks.http.Get;
import com.google.sitebricks.http.Post;

@At("/post")
public class PostPage {

    private Blog newblog = new Blog();

    @Get
    void show() {
    }

    @Post
    String create() {
        System.out.println(newblog.getSubject());
        System.out.println(newblog.getText());
        return "/";
    }

}
