package Conversion_Formatting;

import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press F if Conversion_Formatting.Fahrenheit to Celsius and C if Celsius to Conversion_Formatting.Fahrenheit: ");
        System.out.print("What you want to convert: ");
        String letter = input.nextLine();

        if(letter.equalsIgnoreCase("F") ){
            System.out.print("Enter Conversion_Formatting.Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double tocelsius = (5.0 / 9) * (fahrenheit - 32);
            System.out.println("Conversion_Formatting.Fahrenheit " + fahrenheit + " converted to celsius is " + tocelsius);
        }

        else if(letter.equalsIgnoreCase("C")){
            System.out.print("Enter Celsius: ");
            double celsius = input.nextDouble();
            double tofahrenheit = (5.0 / 9) * (celsius + 32);
            System.out.println("Celcius " + celsius + " converted to fahrenheit is " + tofahrenheit);
        }
        else{
            System.out.println("Just choose the letter between F and C!!!");
        }
        input.close();
    }
}