package OOP;

abstract class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getLoanPeriod();
}

interface Reservable {
    void reserveItem();
}

class PrintedBook extends LibraryItem implements Reservable {

    public PrintedBook(String title) {
        super(title);
    }

    @Override
    public int getLoanPeriod() {
        return 14;
    }

    @Override
    public void reserveItem() {
        System.out.println(getTitle() + " has been reserved.");
    }
}

class ReferenceBook extends LibraryItem {

    public ReferenceBook(String title) {
        super(title);
    }

    @Override
    public int getLoanPeriod() {
        return 0;
    }
}

public class LibraryItemDemo {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new PrintedBook("Java Programming"),
                new ReferenceBook("Computer Science Encyclopedia")
        };

        for (LibraryItem item : items) {
            System.out.println("Title: " + item.getTitle());

            if (item.getLoanPeriod() == 0) {
                System.out.println("Loan period: Not available for borrowing");
            } else {
                System.out.println(
                        "Loan period: " + item.getLoanPeriod() + " days"
                );
            }

            System.out.println();
        }

        Reservable book = new PrintedBook("Data Structures");
        book.reserveItem();
    }
}