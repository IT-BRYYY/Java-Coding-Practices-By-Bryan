public class ComputeCommission {

    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-20s%s%n", "Sales Amount", "Commission");
        System.out.println("--------------------------------------------");

        // Display commission for sales amounts from 10000 to 100000, step 5000
        for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            double commission = computeCommission(salesAmount);
            System.out.printf("%-20d%.1f%n", salesAmount, commission);
        }
    }

    /** Compute the commission based on the sales amount */
    public static double computeCommission(double salesAmount) {
        double commission = 0;

        if (salesAmount <= 0) {
            return 0;
        } else if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else {
            commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        }

        return commission;


        // use full when u do a
    }
}