import java.util.Scanner;

/*
 * WHY: To avoid typing large amounts of data manually.
 *      Just put your numbers in input.txt and let the program read it automatically!
 *
 * HOW TO RUN:
 * 1. Open terminal -> type: cmd
 * 2. Run: cd C:\Users\Bryan\IdeaProjects\JAVA\src && javac SentinelValue.java && java SentinelValue < input.txt > output.txt && type output.txt
 *
 * < input.txt  = reads numbers from file instead of typing manually
 * > output.txt = saves result to a file
 * NOTE: input.txt must end with 0
 */
public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number;

        number = input.nextInt();

        while (number != 0) {
            count++;
            sum += number;
            System.out.println("Number " + count + ": " + number);
            number = input.nextInt();
        }

        System.out.println("=======================");
        System.out.println("Total numbers : " + count);
        System.out.println("Total sum     : " + sum);
        System.out.println("Average       : " + (double) sum / count);
        System.out.println("=======================");
    }
}