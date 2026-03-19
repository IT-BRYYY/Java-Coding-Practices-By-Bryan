public class MinimizingNumericErrors {
    public static void main(String[]args){

        double sum = 0;

        for(int i = 1; i <= 100; i++)
            sum+= i/ 100.0;

        System.out.println("The sum is " + sum);
    }
}

/*
 * EXPLANATION:
 *
 * - Uses int counter to avoid floating point errors in the loop.
 * - i / 100.0 converts int back to decimal (1 -> 0.01, 2 -> 0.02, etc.)
 * - double is used instead of float for better precision.
 *   float -> 50.500004 (inaccurate)
 *   double -> 50.50000000000001 (more accurate)
 */