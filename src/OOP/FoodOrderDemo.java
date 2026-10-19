package OOP;

abstract class FoodOrder {
    protected String foodName;
    protected double price;

    FoodOrder(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    public abstract double calculateTotal();
}

interface DiscountEligible {
    double calculateDiscount(double percentage);
}

class RestaurantOrder extends FoodOrder
        implements DiscountEligible {

    RestaurantOrder(String foodName, double price) {
        super(foodName, price);
    }

    @Override
    public double calculateTotal() {
        return price;
    }

    @Override
    public double calculateDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException(
                    "Discount must be between 0 and 100."
            );
        }

        return price - (price * percentage / 100);
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {
        RestaurantOrder order =
                new RestaurantOrder("Burger", 150);

        System.out.println("Food: " + order.foodName);
        System.out.println(
                "Original price: PHP " + order.calculateTotal()
        );

        System.out.println(
                "Price after 10% discount: PHP "
                        + order.calculateDiscount(10)
        );
    }
}