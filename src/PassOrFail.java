import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int score;

        do{
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if(score != -1){
                if(score >=60){
                    System.out.println("You pass the Exam");
                }else{
                    System.out.println("You don't pass the Exam");
                }
            }

        }while(score != -1);
        System.out.println("No numbers are entered except 0 ");

    }
}
