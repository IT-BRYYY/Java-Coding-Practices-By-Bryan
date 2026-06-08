import java.util.Scanner;
import java.util.Arrays;

public class RowSorting {

    // Method to sort rows in a 2D array (original array remains intact)
    public static double[][] sortRows(double[][] m) {
        // Create a new array with the same dimensions
        double[][] result = new double[m.length][m[0].length];

        // Copy each row and sort it
        for (int i = 0; i < m.length; i++) {
            result[i] = Arrays.copyOf(m[i], m[i].length); // copy row
            Arrays.sort(result[i]);                        // sort the copied row
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];

        // Prompt user to enter the 4x4 matrix
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Get the sorted matrix
        double[][] sortedMatrix = sortRows(matrix);

        // Display the sorted matrix
        System.out.println("The row-sorted array is");
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix[i].length; j++) {
                System.out.print(sortedMatrix[i][j]);
                if (j < sortedMatrix[i].length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }

        input.close();
    }
}