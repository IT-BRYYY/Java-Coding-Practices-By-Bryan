public class EstimatePi {

    /**
     * Computes m(i) for estimating pi using the Leibniz formula
     * m(i) = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - ... + (-1)^(i+1)/(2i-1))
     * @param i the number of terms to sum
     * @return the approximation of pi using i terms
     */
    public static double m(int i) {
        double sum = 0.0;

        // Calculate the sum: 1 - 1/3 + 1/5 - 1/7 + ... + (-1)^(i+1)/(2i-1)
        for (int k = 1; k <= i; k++) {
            // Denominator: 2k - 1 (gives us 1, 3, 5, 7, 9, ...)
            int denominator = 2 * k - 1;

            // Sign alternates: positive when k is odd, negative when k is even
            // Using Math.pow(-1, k+1) or we can use (k % 2 == 1 ? 1 : -1)
            double sign = Math.pow(-1, k + 1);

            sum += sign / denominator;
        }

        // Multiply by 4 to get the pi approximation
        return 4 * sum;
    }

    /**
     * Main method to test the m(i) method and display the table
     */
    public static void main(String[] args) {
        // Print table header
        System.out.println("i          m(i)");
        System.out.println("-------------------");

        // Display values for i = 1, 101, 201, ..., 901
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-10d %.4f%n", i, m(i));
        }

        // Additional info: show how close we get with more terms
        System.out.println("\nComparison with actual pi:");
        System.out.println("Actual pi:     " + Math.PI);
        System.out.println("m(10000):      " + m(10000));
        System.out.println("m(100000):     " + m(100000));
    }
}