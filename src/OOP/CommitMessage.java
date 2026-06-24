package OOP;

public class CommitMessage {
    private String message;
    private String author;
    private String timestamp;

    public CommitMessage(String message, String author, String timestamp){
        this.message = message;
        this.author = author;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }
    public String getMessage() {
        return message;
    }
    public String getAuthor() {
        return author;
    }
    public String getTimestamp() {
        return timestamp;
    }

    public void display(){
        System.out.println("CommitMessage: " + message);
        System.out.println("Author: " + author);
        System.out.println("Timestamp: " + timestamp);
    }

}
