package RealWorld_Projects.LibrarySystem;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isCheckedOut;

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
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public boolean isCheckedOut(){
        return isCheckedOut;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setYearPublished(int yearPublished){
        if(yearPublished > 0){
            this.yearPublished = yearPublished;
        }else
            System.out.println("Invalid year Published");
    }
    public void setIsCheckedOut(boolean isCheckedOut){
        this.isCheckedOut = isCheckedOut;
    }

    public void displayInfo(){
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("Year Published " + yearPublished);
        System.out.println("Is Checked Out " + isCheckedOut);
    }
}

