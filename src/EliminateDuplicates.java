import java.util.Scanner;

public class EliminateDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");  // Fixed: 0 → 10
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] result = eliminateDuplicates(numbers);  // ✅ Passing method is correct

        // Print the result
        System.out.print("Distinct numbers are: ");
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0 && i != 0) break; // stop at unfilled slots
            System.out.print(result[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = list[i];
                count++;
            }
        }

        // Copy only the unique values into a properly sized array
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}