package Applications;

import java.util.Scanner;
public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two characters (major and year, e.g., C2): ");
        String input = scanner.nextLine().trim();

        char majorChar = Character.toUpperCase(input.charAt(0));
        char statusChar = input.charAt(1);

        // Determine major
        if (majorChar == 'I')
            System.out.println("Major: Information Management");
        else if (majorChar == 'C')
            System.out.println("Major: Computer Science");
        else if (majorChar == 'A')
            System.out.println("Major: Accounting");
        else
            System.out.println("Invalid major code.");

        // Determine status
        if (statusChar == '1')
            System.out.println("Status: Freshman");
        else if (statusChar == '2')
            System.out.println("Status: Sophomore");
        else if (statusChar == '3')
            System.out.println("Status: Junior");
        else if (statusChar == '4')
            System.out.println("Status: Senior");
        else
            System.out.println("Invalid status code.");

        scanner.close();
    }
}