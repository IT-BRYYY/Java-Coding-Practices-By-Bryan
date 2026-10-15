package OOP;

abstract class LibraryMaterial {
    protected String title;

    LibraryMaterial(String title) {
        this.title = title;
    }

    abstract void displayDetails();
}

interface Borrowable {
    void borrowItem();
}

class MagazineItem extends LibraryMaterial
        implements Borrowable {

    MagazineItem(String title) {
        super(title);
    }

    @Override
    void displayDetails() {
        System.out.println("Magazine: " + title);
    }

    @Override
    public void borrowItem() {
        System.out.println(title + " has been borrowed.");
    }
}

class LibraryDemo {
    public static void main(String[] args) {
        MagazineItem magazine =
                new MagazineItem("Technology Today");

        magazine.displayDetails();
        magazine.borrowItem();
    }
}