import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int i = lines; i >= 1; i--) { // controls rows

            // decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // move to next line
        }

    }
}