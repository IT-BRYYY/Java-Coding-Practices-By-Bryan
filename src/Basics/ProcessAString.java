package Basics;

import java.util.Scanner;
public class ProcessAString {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String userInput = input.nextLine().trim();

        String length = String.valueOf(userInput.length());

        char last = userInput.charAt(userInput.length() - 1);

        System.out.println(length);
        System.out.println(last);
    }
}
