public class ArrayStatements {
    public static void main(String[] args) {

        // a. Create an array to hold 10 double values
        double[] a = new double[10];

        // b. Assign the value 5.5 to the last element in the array
        a[9] = 5.5;

        // c. Display the sum of the first two elements
        System.out.println("Sum of first two: " + (a[0] + a[1]));

        // d. Write a loop that computes the sum of all elements in the array
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Total sum: " + sum);

        // e. Write a loop that finds the minimum element in the array
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum: " + min);

        // f. Randomly generate an index and display the element of this index in the array
        int index = (int)(Math.random() * a.length);
        System.out.println("Random element at index " + index + ": " + a[index]);

        // g. Use an array initializer to create another array with initial values 3.5, 5.5, 4.52, and 5.6
        double[] b = {3.5, 5.5, 4.52, 5.6};
    }
}