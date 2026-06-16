package OOP;

public class CartItem {
    Product product;
    int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double getSubtotal(){
        return product.price * quantity;
    }
}
