import java.util.Scanner;
public class While {
    public static void main(String[] args) {


        //You don’t want to process the input until you're sure it’s valid,
        // so you keep prompting the user until they enter a valid number.

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter a number between 1 to 20: ");
        num = scanner.nextInt();

        while(num>20 || num<1){
            System.out.println("\nWrong Input!! Please Try Again...");
            System.out.print("Enter a number between 1 to 20: ");
            num = scanner.nextInt();

        }

        System.out.println("You Entered " + num);


    }
}
