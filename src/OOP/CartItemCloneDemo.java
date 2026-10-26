package OOP;

abstract class ShoppingItem {
    private String productName;

    ShoppingItem(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public abstract double calculateTotal();
}

class CartProduct extends ShoppingItem
        implements Cloneable {

    private double price;
    private int quantity;

    CartProduct(String name, double price, int quantity) {
        super(name);
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calculateTotal() {
        return price * quantity;
    }

    @Override
    public CartProduct clone() {
        try {
            return (CartProduct) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

public class CartItemCloneDemo {
    public static void main(String[] args) {
        CartProduct original =
                new CartProduct("USB Flash Drive", 350, 2);

        CartProduct backup = original.clone();
        backup.setQuantity(5);

        System.out.println("Original Item:");
        System.out.println("Product: " + original.getProductName());
        System.out.println("Total: PHP " + original.calculateTotal());

        System.out.println("\nCloned Item:");
        System.out.println("Product: " + backup.getProductName());
        System.out.println("Total: PHP " + backup.calculateTotal());
    }
}