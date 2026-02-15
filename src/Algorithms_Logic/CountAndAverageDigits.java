package Algorithms_Logic;

import java.util.Scanner;
public class CountAndAverageDigits{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 9999: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        int count = 0;

        if(number <= 99){
            System.out.println("Please enter a number between 100 and 9999!! ");
        }else{
            while(number > 0){ //963
                int digit = number % 10;
                sum += digit;
                number /= 10;
                count ++;

            }
            double average = (double)sum / count;

            System.out.println("The number is                 :" + originalNumber);
            System.out.println("How many digits               :" + count);
            System.out.println("The sum of number is          :" + sum);
            System.out.printf("The average of a number is    :%.2f", average);

        }

    }
}