package Algorithms_Logic;

import java.util.*;
public class GratuityRate {
    /* gratuityRate means given a paycheck for a
    person who resigned its given for those who serve
     long in the company its a sign of appreciation
     for long term service
    */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a subtotal and a gratuity: ");
        double subtotal = input.nextDouble();
        int gratuity = input.nextInt();

        double gratuityRate = gratuity / 100.0;
        double gratuityAmount = subtotal * gratuityRate;
        double total = subtotal + gratuityAmount;

        System.out.printf("The gratuity is $%.1f and total is $%.2f", gratuityAmount, total );

        // use printf, %.2f\n and this , if you are computing money measurements or adjusting decimals (currency, decimals)

    }
}