package OOP;

class StoreItemComparable implements Comparable<StoreItemComparable> {
    private String name;
    private double price;

    StoreItemComparable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(StoreItemComparable other) {
        return Double.compare(this.price, other.price);
    }
}

public class ProductCompareDemo {
    public static void main(String[] args) {
        StoreItemComparable item1 =
                new StoreItemComparable("Keyboard", 850.00);

        StoreItemComparable item2 =
                new StoreItemComparable("Mouse", 500.00);

        System.out.println(item1.getName()
                + ": PHP " + item1.getPrice());

        System.out.println(item2.getName()
                + ": PHP " + item2.getPrice());

        int result = item1.compareTo(item2);

        if (result < 0) {
            System.out.println(item1.getName()
                    + " is cheaper.");
        } else if (result > 0) {
            System.out.println(item2.getName()
                    + " is cheaper.");
        } else {
            System.out.println("Both items have the same price.");
        }
    }
}