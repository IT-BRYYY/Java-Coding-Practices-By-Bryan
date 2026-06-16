package OOP;

public class Product {

    String productId;
    String name;
    double price;
    int stock;

    static int totalProducts = 0;
    static String shopName = "JAVA SHOP";

    Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
        totalProducts++;
        this.productId = "PROD-" + String.format("%03d", totalProducts);
    }

    boolean isAvailable(int quantity){
        return stock >= quantity;
    }
    void restock (int quantity){
        stock += quantity;
        System.out.println(name + "restocked . New stock: " + stock);
    }

    void showInfo(){
        System.out.println("ID: " + productId + " | Name: " + name + "| Price: $" + price + " | Stock: " + stock);
    }
    static void showShopInfo(){
        System.out.println("Shop: " + shopName);
        System.out.println("Total Products Listed: " + totalProducts);
    }
}
