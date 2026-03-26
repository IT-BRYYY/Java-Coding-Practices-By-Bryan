import java.util.Scanner;

public class LoanAmortization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int years = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble();

        // Compute values
        double monthlyRate = annualRate / 1200;
        int months = years * 12;

        double monthlyPayment = (loanAmount * monthlyRate) /
                (1 - (1 / Math.pow(1 + monthlyRate, months)));

        double totalPayment = monthlyPayment * months;

        // Display summary
        System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n", totalPayment);

        // Properly formatted header
        System.out.printf("%-10s%12s%12s%12s\n",
                "Payment#", "Interest", "Principal", "Balance");

        double balance = loanAmount;

        // Loop for amortization schedule
        for (int i = 1; i <= months; i++) {
            double interest = monthlyRate * balance;
            double principal = monthlyPayment - interest;
            balance -= principal;

            // Rounding (to match expected output better)
            interest = Math.round(interest * 100.0) / 100.0;
            principal = Math.round(principal * 100.0) / 100.0;
            balance = Math.round(balance * 100.0) / 100.0;

            if (balance < 0) balance = 0;

            // Proper alignment
            System.out.printf("%-10d%12.2f%12.2f%12.2f\n",
                    i, interest, principal, balance);
        }

        input.close();
    }
}