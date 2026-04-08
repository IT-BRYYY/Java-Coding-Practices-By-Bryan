import java.util.Scanner;
public class SimpleInvoiceMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== BASIC INVOICE MAKER =====");
        System.out.print("Customer Name: ");
        String customerName = input.nextLine();

        System.out.print("\nEnter Item 1 Name: ");
        String item1 = input.nextLine();
        System.out.print("Price: ");
        double price1 = input.nextDouble();
        System.out.print("Quantity: ");
        int qty1 = input.nextInt();
        input.nextLine();

        System.out.print("\nEnter Item 2 Name: ");
        String item2 = input.nextLine();
        System.out.print("Price: ");
        double price2 = input.nextDouble();
        System.out.print("Quantity: ");
        int qty2 = input.nextInt();
        input.nextLine();

        System.out.print("\nEnter Item 3 Name: ");
        String item3 = input.nextLine();
        System.out.print("Price: ");
        double price3 = input.nextDouble();
        System.out.print("Quantity: ");
        int qty3 = input.nextInt();
        input.nextLine();

        double subtotal = computeSubtotal(
                computeLineTotal(price1, qty1),
                computeLineTotal(price2, qty2),
                computeLineTotal(price3, qty3)
        );

        double tax     = computeTax(subtotal);
        double total   = computeTotal(subtotal, tax);

        printReceipt(customerName,
                item1, price1, qty1,
                item2, price2, qty2,
                item3, price3, qty3,
                subtotal, tax, total
        );

        input.close();
    }

    public static double computeLineTotal(double price, int qty){
        return price * qty;
    }

    public static double computeSubtotal(double line1, double line2, double line3){
        return line1 + line2 + line3;
    }
    public static double computeTax(double subtotal ){
        return subtotal * 0.12;
    }
    public static double computeTotal(double subtotal, double tax){
        return subtotal + tax;
    }
    public static boolean hasDiscount(double subtotal){
        return subtotal >= 1000;
    }
    public static double computeDiscount(double subtotal){
        if(hasDiscount(subtotal))
            return subtotal * 0.05;
        else return 0;
    }

    public static void printReceipt(String customer,
                                    String item1, double price1, int qty1,
                                    String item2, double price2, int qty2,
                                    String item3, double price3, int qty3,
                                    double subtotal, double tax, double total){

        double discount = computeDiscount(subtotal);
        double finalTotal = total - discount;

        System.out.println("\n========================================");
        System.out.println("               RECEIPT");
        System.out.println("========================================");
        System.out.println("Customer : " + customer);
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %6s %5s %10s%n","Item", "Price", "Qty", "Line Total");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %6.2f %5d %10.2f%n", item1, price1, qty1, computeLineTotal(price1, qty1));
        System.out.printf("%-15s %6.2f %5d %10.2f%n", item2, price2, qty2, computeLineTotal(price2, qty2));
        System.out.printf("%-15s %6.2f %5d %10.2f%n", item3, price3, qty3, computeLineTotal(price3, qty3));
        System.out.println("----------------------------------------");
        System.out.printf("%-28s %10.2f%n", "Subtotal:", subtotal);
        System.out.printf("%-28s %10.2f%n", "Tax (12%):", tax);

        if (hasDiscount(subtotal)) {
            System.out.printf("%-28s %10.2f%n", "Discount (5%):", discount);
        }

        System.out.println("========================================");
        System.out.printf("%-28s %10.2f%n", "TOTAL:", finalTotal);
        System.out.println("========================================");



    }
}
