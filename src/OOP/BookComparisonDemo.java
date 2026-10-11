package OOP;

class ComparableBook implements Comparable<ComparableBook> {
    private String title;
    private int pages;

    ComparableBook(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(ComparableBook other) {
        return Integer.compare(this.pages, other.pages);
    }

    void displayInfo() {
        System.out.println(title + " - " + pages + " pages");
    }
}

public class BookComparisonDemo {
    public static void main(String[] args) {
        ComparableBook book1 =
                new ComparableBook("Java Basics", 250);

        ComparableBook book2 =
                new ComparableBook("Learning OOP", 350);

        book1.displayInfo();
        book2.displayInfo();

        int result = book1.compareTo(book2);

        if (result < 0) {
            System.out.println(
                    book1.getTitle() + " has fewer pages."
            );
        } else if (result > 0) {
            System.out.println(
                    book1.getTitle() + " has more pages."
            );
        } else {
            System.out.println("Both books have equal pages.");
        }
    }
}