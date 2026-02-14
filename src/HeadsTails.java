import java.util.Scanner;
public class HeadsTails{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int num = (int)(Math.random()*2);

        System.out.print("Guess Heads or Tails ?: ");
        String guess = input.nextLine().trim();

        String answer = (num == 0) ? "Heads" : "Tails";

        if(guess.equalsIgnoreCase(answer)){
            System.out.println(guess + " Correct Guess");
        }else{
            System.out.println(guess + " Wrong Guess");
        }

        input.close();
    }
}