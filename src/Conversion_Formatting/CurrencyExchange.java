package Conversion_Formatting;

import java.util.Scanner;
public class CurrencyExchange{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int conversion = input.nextInt();

        if(conversion == 0){
            System.out.print("Enter dollar amount: ");
            double dollarToRMB = input.nextDouble();

            double total = dollarToRMB * rate;
            System.out.println("$"+dollarToRMB + " is " + total + " yuan ");

        }else if(conversion == 1){
            System.out.print("Enter the RMB amount: ");
            double RMBtoDollar = input.nextDouble();

            double total = RMBtoDollar / rate;
            System.out.printf("%.0f yuan is $%.2f", RMBtoDollar, total);

        }else{
            System.out.println("Incorrect input!!!");
        }
    }
}