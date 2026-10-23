package OOP;

import java.util.Arrays;

abstract class LibraryPublication
        implements Comparable<LibraryPublication> {

    private String title;
    private int year;

    LibraryPublication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public abstract String getType();

    @Override
    public int compareTo(LibraryPublication other) {
        return Integer.compare(this.year, other.year);
    }
}

class LibraryBookRecord extends LibraryPublication {

    LibraryBookRecord(String title, int year) {
        super(title, year);
    }

    @Override
    public String getType() {
        return "Book";
    }
}

class MagazineRecord extends LibraryPublication {

    MagazineRecord(String title, int year) {
        super(title, year);
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}

public class PublicationSortingDemo {
    public static void main(String[] args) {
        LibraryPublication[] items = {
                new LibraryBookRecord("Java Fundamentals", 2022),
                new MagazineRecord("Tech Monthly", 2020),
                new LibraryBookRecord("Learning OOP", 2018)
        };

        Arrays.sort(items);

        System.out.println("Publications by year:");

        for (LibraryPublication item : items) {
            System.out.println(
                    item.getYear() + " - "
                            + item.getTitle() + " ("
                            + item.getType() + ")"
            );
        }
    }
}