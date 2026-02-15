package Algorithms_Logic;

import java.util.Scanner;
public class CompareCost {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight  = input.nextDouble();
        double price   = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2  = input.nextDouble();

        double pricePerKg  = (price / weight);
        double pricePerKg2 = (price2 / weight2);

        if(pricePerKg < pricePerKg2){
            System.out.println("Package 1 has a better price ");
        }else if (pricePerKg2 < pricePerKg){
            System.out.println("Package 2 has a better price ");
        }else {
            System.out.println("Two package have the same price ");
        }

    }

}
