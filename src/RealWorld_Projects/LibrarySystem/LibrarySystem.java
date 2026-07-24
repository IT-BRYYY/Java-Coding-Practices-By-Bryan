package RealWorld_Projects.LibrarySystem;

public class LibrarySystem {
    public static void main(String[] args) {
        System.out.println("=== LIBRARY SYSTEM ===\n");

        System.out.println("--- Creating Physical Books ---");
        PhysicalBook pb1 = new PhysicalBook("The Hobbit", "J.R.R. Tolkien", 1937, false, 310, "Good");
        PhysicalBook pb2 = new PhysicalBook("1984", "George Orwell", 328);
        PhysicalBook pb3 = new PhysicalBook("The Alchemist");

        System.out.println("\n--- Creating E-Books ---");
        EBook eb1 = new EBook("Clean Code", "Robert Martin", 2008, false, 5.2, "PDF");
        EBook eb2 = new EBook("The Pragmatic Programmer", "Andrew Hunt", 3.7);
        EBook eb3 = new EBook("The Hobbit");

        System.out.println("\n--- Displaying All Books ---\n");
        pb1.displayInfo();
        System.out.println();
        pb2.displayInfo();
        System.out.println();
        pb3.displayInfo();
        System.out.println();
        eb1.displayInfo();
        System.out.println();
        eb2.displayInfo();
        System.out.println();
        eb3.displayInfo();
    }
}