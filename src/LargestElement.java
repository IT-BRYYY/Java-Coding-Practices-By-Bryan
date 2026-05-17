import java.util.Scanner;

public class LargestElement {

    // Method that finds the largest element in an array
    public static double max(double[] array) {
        double max = array[0]; // Assume first element is the largest

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is larger
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        // Prompt user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Call max method and display result
        double maximum = max(numbers);
        System.out.println("The maximum number is: " + maximum);

        input.close();
    }
}