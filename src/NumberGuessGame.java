import java.util.Scanner;
public class NumberGuessGame {
    public static void main(String[]args){

        int secretNumber = ((int)(Math.random() * 50 ) + 1);
        Scanner input = new Scanner(System.in);


        int attempts = 0;

        System.out.print("Guess the number between 1 to 50: ");
        int guess = input.nextInt();
        attempts++;

        while(secretNumber != guess){
            if(guess > secretNumber){
                System.out.println("Too High. Try Again: ");
            }else{
                System.out.println("Too Low. Try Again: ");
            }
            guess = input.nextInt();
            attempts ++;
        }


        System.out.println("Correct!1");
        System.out.println("The number was \"" + secretNumber + "\"");
        System.out.println("Attempts: " + attempts );
    }
}
