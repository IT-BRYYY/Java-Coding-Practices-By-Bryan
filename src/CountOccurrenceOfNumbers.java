import java.util.Scanner;
public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create an array of size 51 (index 0 to 50)
        int[] counts = new int[51];

        // Step 2: Read input
        System.out.print("Enter the integers between 1 and 50: ");
        int number = input.nextInt();

        while (number != 0) {
            counts[number]++;  // Step 3: Count the number
            number = input.nextInt();
        }

        // Step 4: Display results
        for (int i = 1; i <= 50; i++) {
            if (counts[i] > 0) {
                if (counts[i] == 1)
                    System.out.println(i + " occurs 1 time");
                else
                    System.out.println(i + " occurs " + counts[i] + " times");
            }
        }
    }
}