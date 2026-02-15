package Games;

import java.util.Scanner;
public class Dice {
    public static void main (String []args){

        String choice;
        boolean yes = true;
        int random = (int) (Math.random() * 6 + 1);

        System.out.println("Type Yes if you want to roll a dice");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll a Games.Dice: ");
        choice = scanner.nextLine();

        if (choice.equals("yes")||choice.equals("Yes")) {
            System.out.println();
            System.out.println("You got " + random);
        }
            else{
                System.out.println("You need to Roll a Games.Dice");
            }

    }
}
