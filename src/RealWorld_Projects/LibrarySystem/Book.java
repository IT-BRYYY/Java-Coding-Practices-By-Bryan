package RealWorld_Projects.LibrarySystem;

public class Book {
    String title;
    String author;
    int yearPublished;
    boolean isCheckedOut;

    public Book(String title, String author, int yearPublished, boolean isCheckedOut){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isCheckedOut = isCheckedOut;
    }
    public Book(String title, String author){
        this(title,author,2020,false);
    }
    public Book(String title){
        this(title,"Unknown",2020,false);
    }

    public void displayInfo(){
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("Year Published " + yearPublished);
        System.out.println("Is Checked Out " + isCheckedOut);
    }
}

