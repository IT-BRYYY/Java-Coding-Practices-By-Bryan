import java.util.Scanner;

public class SortThreeNumbers {

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double[] nums = {num1, num2, num3};

        // Sort in increasing order
        if (nums[0] > nums[1]) { double temp = nums[0]; nums[0] = nums[1]; nums[1] = temp; }
        if (nums[0] > nums[2]) { double temp = nums[0]; nums[0] = nums[2]; nums[2] = temp; }
        if (nums[1] > nums[2]) { double temp = nums[1]; nums[1] = nums[2]; nums[2] = temp; }

        System.out.println("The numbers in increasing order are: " + nums[0] + " " + nums[1] + " " + nums[2]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

        input.close();
    }
}