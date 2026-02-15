package Applications;

import java.util.*;
public class FinancialApplication{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Good Morning/Good Evening Ma'am/Sir !!\n");
        String inputUser;

        while(true){
            System.out.print("Do you want to Compute future investment? (Yes or No): ");
            inputUser = input.nextLine().toLowerCase();

            switch(inputUser){
                case "yes":
                    System.out.print("Enter investment Amount: ");
                    double investmentAmount = input.nextDouble();

                    System.out.print("Enter annual interest in percentage: ");
                    double annualInterest = input.nextDouble();

                    System.out.print("Enter number of years: ");
                    int numberOfYears = input.nextInt();

                    double monthlyInterestRate = annualInterest / 1200;
                    double futureInvestment = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

                    System.out.printf("\nThe future value of your investment is $%.2f" , futureInvestment);

                    return;

                case "no":
                    System.out.println("Thankyou!! Have a good day!");
                    return;


                default:
                    System.out.println("Please Enter \"Yes\" or \"No\" !!\n");


            }

        }

    }

}