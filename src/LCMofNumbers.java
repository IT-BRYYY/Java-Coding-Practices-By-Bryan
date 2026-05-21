import java.util.Scanner;
public class LCMofNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        System.out.println("The LCM of " + n1 + ", " + n2 + ", " + n3
                + ", " + n4 + ", and " + n5 + " is "
                + lcm(n1, n2, n3, n4, n5));
    }

    /** Returns the LCM of an unspecified number of integers */
    public static int lcm(int... numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }

        return result;
    }

    /** Helper: returns LCM of exactly two integers using GCD */
    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    /** Helper: returns GCD of two integers using Euclidean algorithm */
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}