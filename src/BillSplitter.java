import java.util.Scanner;
public class BillSplitter {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the bill amount: ");
        String billInput = input.nextLine();

        System.out.print("Enter number of people: ");
        int people = input.nextInt();

        int dotIndex = billInput.indexOf(".");
        String dollars = billInput.substring(0, dotIndex);
        String cents = billInput.substring(dotIndex + 1);

        int totalCents = Integer.parseInt(dollars) * 100 + Integer.parseInt(cents);

        int perPersonCents = totalCents / people;
        int remainder = totalCents % people;

        int perDollars = perPersonCents / 100;
        int perCents = perPersonCents % 100;

        System.out.println("\nBill: $" + billInput);
        System.out.println("People: " + people);
        System.out.println("Each person pays: $" + perDollars + "." + perCents);
        System.out.println("Remaining cents that cant be split: " + remainder + " cents");
    }
}