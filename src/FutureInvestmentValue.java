import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter interest rate: ");
        double monthlyRate = input.nextDouble() / 1200;

        System.out.println("Years\t  Future Investment Value");
        for (int years = 1; years <= 30; years++) {
            double value = futureInvestmentValue(amount, monthlyRate, years);
            System.out.printf("%-10d%-10.2f%n", years, value);
        }
    }
    public static double futureInvestmentValue(double amount, double monthlyRate, int years){
        return Math.pow(1 + monthlyRate, years * 12) * amount;
    }
}
