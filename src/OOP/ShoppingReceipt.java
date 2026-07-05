package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.println("🛒 WELCOME TO SHOPPING RECEIPT GENERATOR");
        System.out.println("========================================");

        // Add items
        while (true) {
            System.out.print("Enter item name (or 'done' to finish): ");
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) break;

            System.out.print("Enter price: ₱");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            items.add(item);
            prices.add(price);
        }

        // Generate receipt using STRINGBUILDER
        String receipt = generateReceipt("Maria Santos", items, prices);
        System.out.println("\n" + receipt);

        scanner.close();
    }

    public static String generateReceipt(String customerName,
                                         ArrayList<String> items,
                                         ArrayList<Double> prices) {
        StringBuilder receipt = new StringBuilder();

        // Header
        receipt.append("═══════════════════════════════════════\n");
        receipt.append("          🧾 OFFICIAL RECEIPT         \n");
        receipt.append("═══════════════════════════════════════\n");
        receipt.append("Customer: ").append(customerName).append("\n");
        receipt.append("Date: ").append(new java.util.Date()).append("\n");
        receipt.append("───────────────────────────────────────\n");

        // Items (DYNAMIC - KEEPS CHANGING!)
        receipt.append("ITEMS:\n");
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            receipt.append(String.format("  %-20s ₱%.2f\n", items.get(i), prices.get(i)));
            total += prices.get(i);
        }

        // Footer
        receipt.append("───────────────────────────────────────\n");
        receipt.append(String.format("SUBTOTAL: ₱%.2f\n", total));
        double tax = total * 0.12;
        receipt.append(String.format("TAX (12%%): ₱%.2f\n", tax));
        receipt.append(String.format("TOTAL: ₱%.2f\n", total + tax));
        receipt.append("═══════════════════════════════════════\n");
        receipt.append("     THANK YOU FOR SHOPPING WITH US!   \n");
        receipt.append("═══════════════════════════════════════\n");

        return receipt.toString();
    }
}
