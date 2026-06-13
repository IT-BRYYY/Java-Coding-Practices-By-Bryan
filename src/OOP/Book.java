package OOP;

public class Book {
    String title;
    String author;
    double price;

    public Book(String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public void setPrice (double newPrice){
        price = newPrice;
    }

    public void checkPrize(){
        if(price >= 20){
            System.out.println(title + " is expensive.");
        }else{
            System.out.println(title + " is affordable.");
        }
    }

}
