import java.util.Scanner;
public class FindHighestScore {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many student: ");
        int students = input.nextInt();

        String nameOfHighestScore = "";
        int highestScore = 0;

        int score;
        String name;

        String others = "";

        for(int i = students; i > 0; i--   ){

            System.out.print("\nEnter name: ");
            name = input.next();

            System.out.print("Enter score: ");
            score = input.nextInt();

            if(score > highestScore){
                highestScore = score;
                nameOfHighestScore = name;
            }

            others += "\n" + name + " score is " + score;
        }


        System.out.println("\nScore of all student " + others);
        System.out.println("\nThe highest score is " + nameOfHighestScore + " with the score of " + highestScore);
    }
}
