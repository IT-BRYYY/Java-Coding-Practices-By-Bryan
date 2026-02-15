package Applications;

import java.util.Scanner;

public class OrderingSystem {
    public static void main (String []args){

        //Switch

        byte code ;
        String ar;

        System.out.println("Menu's");
        System.out.println("Code 1 for Burger");
        System.out.println("Code 2 for Fries");
        System.out.println("Code 3 for Soft Drink");
        System.out.println("Code 4 for Salad");
        System.out.println("Code 5 for Ice Cream Sundae");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code: ");
         code = sc.nextByte();

        switch (code) {

            case 1:
                System.out.println("1 Burger $5.99");
                break;

            case 2:
                System.out.println("2 Fries $2.49");
                break;

            case 3:
                System.out.println("3 Soft Drink $1.99");
                break;

            case 4:
                System.out.println("4 Salad $6.99");
                break;

            case 5:
                System.out.println("5 Ice Cream Sundae $3.25");
                break;

            default:
                System.out.println("Appropriate Message");

        }
        System.out.println();

        Scanner bk = new Scanner(System.in);
        System.out.print("Purchase Yes or No:");
        ar = bk.nextLine();

        if (ar.equalsIgnoreCase("yes")){
            System.out.print("\nPlease settle your money");
            System.out.println("\nThankyou!!!");
        }
        else if (ar.equals("no") || ar.equals("No")){
            System.out.println("Please choose again your order: ");
        }

        else {
            System.out.println("Read the description nigga");
        }

    }
}
