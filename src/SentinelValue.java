import java.util.Scanner;
public class SentinelValue {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;

        while(data !=0){
            sum+= data;

            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);

        /*
         * WHY: To avoid typing large amounts of data manually.
         *      Just put your numbers in input.txt and let the program read it automatically!
         *
         * HOW TO RUN:
         * 1. Open terminal -> type: cmd
         * 2. Run: cd C:\Users\Bryan\IdeaProjects\JAVA\src && javac SentinelValue.java && java SentinelValue < input.txt
         *
         * < input.txt  = reads numbers from file instead of typing manually
         * > output.txt = saves result to a file
         * NOTE: input.txt must end with 0
         */
    }
}
