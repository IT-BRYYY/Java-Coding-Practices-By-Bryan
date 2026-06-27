package OOP;
import java.util.Arrays;
import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {

        int[] numbers = new int[100000];
        Random random = new Random();

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        selectionSort(numbers);

        stopWatch.stop();

        System.out.println("Elapsed time for sorting 100,000 numbers: "
                + stopWatch.getElapsedTime() + " milliseconds");
        System.out.println("That's " + (stopWatch.getElapsedTime() / 1000.0) + " seconds");

        // Optional: Display a few sorted numbers to verify
        System.out.println("\nFirst 10 numbers after sorting:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nLast 10 numbers after sorting:");
        for (int i = numbers.length - 10; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        // Find the minimum element in the unsorted portion
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap the found minimum with the first element of unsorted portion
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
}
