package OOP;

public class OnlineShop {

    public static void main(String[] args) {

        System.out.println("=== SHOP INFO ===");
        Product.showShopInfo();

        Product laptop = new Product("Laptop", 999.99, 5);
        Product phone = new Product("Phone", 499.99, 10);
        Product headphones = new Product("Headphones", 79.99, 20);
        Product keyboard = new Product("Keyboard", 49.99, 15);

        System.out.println("\n=== AVAILABLE PRODUCTS ===");
        laptop.showInfo();
        phone.showInfo();
        headphones.showInfo();
        keyboard.showInfo();

        Customer alice = new Customer("Alice", 2000.00);
        Customer bob = new Customer("Bob", 300.00);

        System.out.println("\n=== CUSTOMER INFO ===");
        alice.showInfo();
        bob.showInfo();

        System.out.println("\n=== ALICE SHOPPING ===");
        alice.addToCart(laptop, 1);
        alice.addToCart(headphones, 2);
        alice.addToCart(keyboard, 1);
        alice.showCart();
        alice.checkout();

        System.out.println("\n=== BOB SHOPPING ===");
        bob.addToCart(phone, 1);
        bob.showCart();
        bob.checkout();

        System.out.println("\n=== BOB GETS MORE BALANCE ===");
        bob.balance += 300;
        System.out.println("Bob's new balance: $" + bob.balance);
        bob.addToCart(phone, 1);
        bob.checkout();

        System.out.println("\n=== STOCK CHECK ===");
        alice.addToCart(laptop, 10);

        System.out.println("\n=== UPDATED PRODUCT STOCK ===");
        laptop.showInfo();
        phone.showInfo();
        headphones.showInfo();
        keyboard.showInfo();

        alice.showOrderHistory();
        bob.showOrderHistory();

        System.out.println("\n=== FINAL SHOP INFO ===");
        Product.showShopInfo();
        System.out.println("Total Customers: " + Customer.totalCustomers);
    }
}