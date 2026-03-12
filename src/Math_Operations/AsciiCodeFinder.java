package Math_Operations;

import java.util.Scanner;
public class AsciiCodeFinder {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int asciiValue = (int) ch;

        System.out.println("The ASCII code for character " + ch + " is " + asciiValue);

    }
}
