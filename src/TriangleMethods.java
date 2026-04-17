import java.util.Scanner;

public class TriangleMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sides
        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Check validity
        if (isValid(side1, side2, side3)) {
            double result = area(side1, side2, side3);
            System.out.println("The area of the triangle is: " + result);
        } else {
            System.out.println("The input is invalid.");
        }
    }

    // Method to check if triangle is valid
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);
    }

    // Method to compute area using Heron's Formula
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}