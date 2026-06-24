package OOP;

public class CommitMessage {
    private String message;
    private String author;


    public CommitMessage(String message, String author){
        this.message = message;
        this.author = author;

    }
    public String getMessage() {
        return message;
    }
    public String getAuthor() {
        return author;
    }


    public void display(){
        System.out.println("CommitMessage: " + message);
        System.out.println("Author: " + author);

    }

}
