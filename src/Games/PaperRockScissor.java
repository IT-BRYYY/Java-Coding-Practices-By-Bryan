package Games;

import java.util.Scanner;
public class PaperRockScissor {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int RSP = (int)(Math.random() * 3);
        System.out.print("Scissor(0),Rock(1),Paper(2): ");
        int guess = input.nextInt();
        String comp = "";
        String usr = "";

        if(RSP == 0)
            comp = "Scissor";
        else if(RSP == 1)
            comp = "Rock";
        else if(RSP == 2)
            comp = "Paper";

        if(guess == 0)
            usr = "Scissor";
        else if(guess == 1)
            usr = "Rock";
        else if(guess == 2)
            usr = "Paper";

        if(RSP == guess){
            System.out.print("The computer is " + comp + "." + " You are " + usr + " too." + " Its a Draw");
        }else if((RSP == 1 && guess == 0 ) || (RSP == 2 && guess == 1) || (RSP == 0 && guess == 2)){
            System.out.print("The computer is " + comp + "." + " You are " + usr + " Computer Win");
        }else if((guess == 1 && RSP == 0 ) || (guess == 2 && RSP == 1) || (guess == 0 && RSP == 2)) {
            System.out.print("The computer is " + comp + "." + " You are " + usr + " You Win");
        }else{
            System.out.println("Invalid input");
        }
    }
}
