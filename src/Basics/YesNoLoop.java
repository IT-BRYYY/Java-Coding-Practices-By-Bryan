package Basics;

import java.util.Scanner;
public class YesNoLoop{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        char continueLoop = 'Y';
        int sum = 0;

        while(continueLoop == 'Y'){
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            sum += number;
            System.out.println("Current sum: " + sum);

            input.nextLine();

            System.out.print("Enter Y to continue and N to quit: ");
            continueLoop = input.nextLine().charAt(0);

        }
        System.out.println("Final Sum: " + sum);
    }
}

/*
 * This program continuously asks the user to enter numbers
 * and adds them together. After each number, the user can
 * choose to continue (Y) or quit (N) to see the final sum.
 */