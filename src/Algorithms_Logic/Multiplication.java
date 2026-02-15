package Algorithms_Logic;

import java.util.*;
public class Multiplication {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 to 1000: ");
        int number = input.nextInt();

        int result = 1;
        int originalNumber = number;

        if(number == 0){
            result = 0;
        }else {
            while(number > 0){
                int digit = number % 10;
                result *= digit;
                number /= 10;
            }
        }
        System.out.println("The multiplication of all digits in " +
                originalNumber + " is " + result);

    }
}