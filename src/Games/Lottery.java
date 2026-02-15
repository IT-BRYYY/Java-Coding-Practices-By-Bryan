package Games;

import java.util.Scanner;
public class Lottery{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random()* 999) + 1;
        System.out.print("Enter lottery number (3digits): " );
        int guess = input.nextInt();

        if(guess < 100) {
            System.out.println("Invalid enter 3 numbers, zero is not counted ");
            return;
        }else if (guess > 999) {
            while(guess > 999) {
                guess = guess / 10;
            }
        }

        int guess1 = guess % 10;
        int guess2 = (guess / 10) % 10;
        int guess3 = (guess / 100) % 10;

        int lottery1 = lottery % 10;
        int lottery2 = (lottery / 10) % 10;
        int lottery3 = (lottery / 100) % 10;

        if (guess == lottery) {
            System.out.println("The lottery is " + lottery + " \nYour guess is " + guess + " \nYou winn 12000");
        } else if (
                (guess1 == lottery1 || guess2 == lottery1 || guess3 == lottery1) &&
                        (guess1 == lottery2 || guess2 == lottery2 || guess3 == lottery2) &&
                        (guess1 == lottery3 || guess2 == lottery3 || guess3 == lottery3)
        ) {
            System.out.println("The lottery is " + lottery + " \nYour guess is " + guess + " \nYou winn 5000");
        } else if (
                guess1 == lottery1 || guess2 == lottery1 || guess3 == lottery1 ||
                        guess1 == lottery2 || guess2 == lottery2 || guess3 == lottery2 ||
                        guess1 == lottery3 || guess2 == lottery3 || guess3 == lottery3
        ) {
            System.out.println("The lottery is " + lottery + " \nYour guess is " + guess + " \nYou winn 2000");
        } else {
            System.out.println("The lottery is " + lottery + " \nYour guess is " + guess + " \nNo Match");
        }

        input.close();
    }
}