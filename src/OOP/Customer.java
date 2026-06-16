package OOP;

import java.util.ArrayList;

public class Customer {

    String customerId;
    String name;
    double balance;
    ArrayList<CartItem> cart;
    ArrayList<String> orderHistory;

    static int totalCustomers = 0;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
        totalCustomers++;
        this.customerId = "CUST-" + String.format("%03d", totalCustomers);
    }

    void addToCart(Product product, int quantity) {
        if (!product.isAvailable(quantity)) {
            System.out.println("Sorry, not enough stock for: " + product.name);
            return;
        }
        cart.add(new CartItem(product, quantity));
        System.out.println(name + " added " + quantity + "x " + product.name + " to cart.");
    }

    void showCart() {
        if (cart.isEmpty()) {
            System.out.println(name + "'s cart is empty.");
            return;
        }
        System.out.println("\n--- " + name + "'s Cart ---");
        double total = 0;
        for (CartItem item : cart) {
            System.out.println("  " + item.product.name + " x" + item.quantity + " = $" + item.getSubtotal());
            total += item.getSubtotal();
        }
        System.out.println("  Total: $" + total);
    }

    void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout.");
            return;
        }

        double total = 0;
        for (CartItem item : cart) {
            total += item.getSubtotal();
        }

        if (balance < total) {
            System.out.println("Insufficient balance. You need $" + total + " but have $" + balance);
            return;
        }

        for (CartItem item : cart) {
            item.product.stock -= item.quantity;
        }

        balance -= total;
        orderHistory.add("Paid $" + total + " for " + cart.size() + " item(s).");
        cart.clear();

        System.out.println(name + " checked out successfully! Paid: $" + total + " | Remaining balance: $" + balance);
    }

    void showOrderHistory() {
        System.out.println("\n--- " + name + "'s Order History ---");
        if (orderHistory.isEmpty()) {
            System.out.println("  No orders yet.");
        } else {
            for (String order : orderHistory) {
                System.out.println("  " + order);
            }
        }
    }

    void showInfo() {
        System.out.println("ID: " + customerId + " | Name: " + name + " | Balance: $" + balance);
    }
}