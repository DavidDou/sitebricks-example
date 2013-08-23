package info.sitebricks.example.web;

public class Blog {
    
    private String subject;
    private String text;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean validate() {
        return true;
    }
}
