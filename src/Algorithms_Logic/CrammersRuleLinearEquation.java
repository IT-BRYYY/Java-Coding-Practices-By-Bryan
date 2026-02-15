package Algorithms_Logic;

import java.util.Scanner;
public class CrammersRuleLinearEquation{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b,c,d,e,f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();


        double discriminant = (a * d) - (b*c);
        double x = ((e*d) - (b*f)) / ((a*d) - (b*c));
        double y = ((a*f) - (e*c)) / ((a*d) - (b*c));

        if(discriminant != 0){
            System.out.println(x + " and " + y);

        }else {

            System.out.println("The equation has no solution! ");
        }



    }
}
// Cramer's rule and formula Linear