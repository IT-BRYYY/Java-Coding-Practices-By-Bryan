import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        // Original array with values
        int[] numbers = {5, 6, 8, 9, 7, 3};

        // Target array with same size as source
        int[] targetArray = new int[numbers.length];

        // Copy numbers array to targetArray starting from index 0
        System.arraycopy(numbers, 0, targetArray, 0, numbers.length);

        // Arrays.toString() is needed to print the whole array values
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Copied: " + Arrays.toString(targetArray));
    }
}