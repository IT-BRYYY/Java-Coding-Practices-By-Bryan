import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        // Calculations
        double grossPay = hours * payRate;
        double federalWithholding = grossPay * federalRate;
        double stateWithholding = grossPay * stateRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        // Output
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.printf("Pay Rate: $%.2f%n", payRate);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("   Federal Withholding (%.1f%%): $%.2f%n", federalRate * 100, federalWithholding);
        System.out.printf("   State Withholding (%.1f%%): $%.2f%n", stateRate * 100, stateWithholding);
        System.out.printf("   Total Deduction: $%.2f%n", totalDeduction);
        System.out.printf("Net Pay: $%.2f%n", netPay);

        input.close();
    }
}