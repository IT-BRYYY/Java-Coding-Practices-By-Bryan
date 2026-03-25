import java.util.Scanner;
public class FinancialApplicationCompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthlyInterest;
        String output = "";
        int count = 0;
        System.out.println("(Financial application: compound value)");

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter an interest rate: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of months: ");
        int numberOfMonths = input.nextInt();

        for(int i = 1 ; i <= numberOfMonths; i++) {
            monthlyInterest = interestRate / 12 / 100 ;
            amount += (amount * monthlyInterest);
            count += 1;

            output += "\nMonth " + count + " value is $" + String.format("%.2f", amount);
        }
        System.out.println(output);
    }
}