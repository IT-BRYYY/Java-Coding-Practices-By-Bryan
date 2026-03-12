package Applications;

import java.util.Scanner;
public class SimpleShoppingCart {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        char continueLoop = 'Y';
        int items = 0;
        double sum = 0;


        while(continueLoop == 'Y'){
            System.out.print("Enter item price: ");
            double price = input.nextDouble();
            sum += price;
            items ++;

            System.out.printf("Items: %d | Total: %.2f%n", items , sum);
            input.nextLine();

            System.out.print("Enter Y to add more items and N to checkout: ");
            continueLoop = input.nextLine().charAt(0);

        }
        System.out.println("==== RECEIPT ====");
        System.out.printf("Total items: %d%n",items);
        System.out.printf("Total Price: %.2f%n", sum);
        System.out.println("=================");


    }
}
