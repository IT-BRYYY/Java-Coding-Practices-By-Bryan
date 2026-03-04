import java.util.Scanner;
public class RepeatAdditionQuiz {
    public static void main(String[]args){

        int num1 = ((int)(Math.random() * 1000));
        int num2 = ((int)(Math.random() * 1000));

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + num1 + " + " + num2 + " ?: ");
        int answer = input.nextInt();
        int attempts = 0;

        while(num1 + num2 != answer){
            System.out.print("Wrong answer. Try again. " + " What is "
            + num1 + " + " + num2 + " ?: ");
            answer = input.nextInt();
            attempts++;
        }

        System.out.println("\nCorrect!!");
        System.out.println("The answer is \"" + (num1 + num2) + "\"");
        System.out.println("Attempts: " + attempts);




    }
}
