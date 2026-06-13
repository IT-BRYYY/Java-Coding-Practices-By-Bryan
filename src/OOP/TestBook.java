package OOP;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Smith", 15.99);

        b1.displayInfo();

        System.out.println("\nUpdating book price...\n");

        b1.setPrice(25.50);

        b1.displayInfo();

        b1.checkPrize();

    }
}
