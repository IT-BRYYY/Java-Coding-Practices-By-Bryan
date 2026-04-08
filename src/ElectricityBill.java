import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ELECTRICITY BILL CALCULATOR =====");
        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Previous Reading (kWh): ");
        double previousReading = scanner.nextDouble();

        System.out.print("Current Reading (kWh): ");
        double currentReading = scanner.nextDouble();

        double consumption = computeConsumption(previousReading, currentReading);
        double charge      = computeCharge(consumption);
        double tax         = computeTax(charge);
        double penalty     = computePenalty(charge);
        double total       = computeTotal(charge, tax, penalty);

        printBill(customerName, accountNumber, previousReading,
                currentReading, consumption, charge, tax, penalty, total);

        scanner.close();
    }

    // Computes total kWh consumed
    public static double computeConsumption(double previous, double current) {
        return current - previous;
    }

    // Computes charge based on consumption brackets
    // 0-100 kWh    = 5.00 per kWh
    // 101-200 kWh  = 7.00 per kWh
    // above 200    = 9.00 per kWh
    public static double computeCharge(double consumption) {
        if (consumption <= 100)
            return consumption * 5.00;
        else if (consumption <= 200)
            return (100 * 5.00) + ((consumption - 100) * 7.00);
        else
            return (100 * 5.00) + (100 * 7.00) + ((consumption - 200) * 9.00);
    }

    // Computes 12% tax on the charge
    public static double computeTax(double charge) {
        return charge * 0.12;
    }

    // Applies 5% penalty if charge exceeds 2000
    public static boolean hasLatepenalty(double charge) {
        return charge > 2000;
    }

    public static double computePenalty(double charge) {
        if (hasLatepenalty(charge))
            return charge * 0.05;
        else
            return 0;
    }

    // Computes final total
    public static double computeTotal(double charge, double tax, double penalty) {
        return charge + tax + penalty;
    }

    // Returns label for consumption level
    public static String getConsumptionLevel(double consumption) {
        if (consumption <= 100)
            return "Low";
        else if (consumption <= 200)
            return "Moderate";
        else
            return "High";
    }

    // Prints the full bill
    public static void printBill(String customer, String accountNum,
                                 double previous, double current,
                                 double consumption, double charge,
                                 double tax, double penalty, double total) {

        System.out.println("\n========================================");
        System.out.println("          ELECTRICITY BILL");
        System.out.println("========================================");
        System.out.println("Customer       : " + customer);
        System.out.println("Account No.    : " + accountNum);
        System.out.println("----------------------------------------");
        System.out.printf("Previous Reading : %10.2f kWh%n", previous);
        System.out.printf("Current Reading  : %10.2f kWh%n", current);
        System.out.printf("Consumption      : %10.2f kWh%n", consumption);
        System.out.println("Usage Level      : " + getConsumptionLevel(consumption));
        System.out.println("----------------------------------------");
        System.out.printf("%-28s %10.2f%n", "Charge:",  charge);
        System.out.printf("%-28s %10.2f%n", "Tax (12%):", tax);

        if (hasLatepenalty(charge)) {
            System.out.printf("%-28s %10.2f%n", "Penalty (5%):", penalty);
        }

        System.out.println("========================================");
        System.out.printf("%-28s %10.2f%n", "TOTAL AMOUNT DUE:", total);
        System.out.println("========================================");
    }
}