import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

            // decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}