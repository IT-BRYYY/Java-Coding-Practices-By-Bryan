import java.util.Scanner;
public class Displaytime {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int number = input.nextInt();

        int minutes = number/ 60;
        int remainingSeconds = number % 60;

        System.out.println(number + " seconds is " + minutes + " minutes and " + remainingSeconds + " Seconds");

    }
}