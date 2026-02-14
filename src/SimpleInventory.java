import java.util.Scanner;
public class SimpleInventory {

    public static void main (String [] args){

        // Simple Inventory Quiz For my self

        int totalItem;
        float priceItem;
        float totalCost;
        char currency = 36;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Total Item: ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Price of Item: ");
        float num2 = sc.nextFloat();
        System.out.println();

        totalCost = num1 * num2;

        System.out.println("Total Items In Your Inventory : " + num1);
        System.out.println("Price of Each Item            : " + num2 + currency);
        System.out.println("Total Cost                    : " + totalCost + currency);


    }
}
