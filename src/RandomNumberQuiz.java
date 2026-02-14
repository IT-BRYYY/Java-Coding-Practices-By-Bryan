import java.util.Scanner;
public class RandomNumberQuiz{
    public static void main(String []args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 20 items Math Quiz!\n");
        int score = 0;
 
        for(int i = 1; i <=20; i++){
            int number1 = (int)(System.currentTimeMillis() %10);
            int number2 = (int)(System.currentTimeMillis() / 10 % 10);

            System.out.printf("Question %d: What is %d * %d? ", i, number1, number2);
            int answer = input.nextInt();

            boolean CorrectAnswer = (number1 * number2 == answer);

            if(CorrectAnswer){
                System.out.println("Correct!\n");
                score++;
            }else{
                System.out.printf("Incorrect. The correct answer is %d\n\n", (number1 * number2));
            }

            Thread.sleep(1000);


        }
        System.out.printf("You got %d out of 20!", score);

    }
    /*
    for subtraction quiz
     int temp = number1;
                number1 = number2;
                number2 = temp;
     */
}