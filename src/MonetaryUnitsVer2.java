import java.util.Scanner;
public class MonetaryUnitsVer2{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        String userInput = input.nextLine();

        int dotIndex = userInput.indexOf(".");
        String dollars = userInput.substring(0,dotIndex);
        String cents = userInput.substring(dotIndex + 1);

        int totalCent = Integer.parseInt(dollars) * 100 + Integer.parseInt(cents);

        int quarters = totalCent / 25;
        totalCent %= 25;

        int dimes = totalCent / 10;
        totalCent %= 10;

        int nickels = totalCent / 5;
        totalCent %= 5;

        int pennies = totalCent;

        System.out.println("\nYour " + userInput + " is consists of \n");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels );
        System.out.println("Pennies: " + pennies);



    }
}