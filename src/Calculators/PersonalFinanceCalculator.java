package Calculators;

import java.util.Scanner;
public class PersonalFinanceCalculator{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Monthly Income: ");
        double income = input.nextDouble();

        System.out.print("Rent/Mortgage: ");
        double rent = input.nextDouble();

        System.out.print("Utilities: ");
        double Uti= input.nextDouble();

        System.out.print("Transportation: ");
        double transportation = input.nextDouble();

        System.out.print("Food Budget: ");
        double food = input.nextDouble();

        System.out.print("Entertainment Budget: ");
        double entertain = input.nextDouble();

        System.out.print("Applications.Savings goal percentage (between 0 - 100): ");
        double savings = input.nextDouble();

        String suggestion;


        double totalExpenses = rent + Uti + food + entertain + transportation;
        double remainingMoneyAfterExpenses = income - totalExpenses;
        double targetSavings = income * (savings / 100);
        double remainingMoney = income - (targetSavings + totalExpenses);

        if(totalExpenses > income){
            System.out.println ("Warning you will be a broke");
        }if(totalExpenses + targetSavings < income){
            System.out.println ("You can have a good savings with this Budget");
        }

        if(remainingMoney < 0){
            suggestion = "suggest reducing the savings percentage";
        }else if(savings > 20){
            suggestion = "Excellent";
        }else if(savings >= 10 && savings <= 20){
            suggestion = "Good";
        }else if(savings > 0 && savings < 10){
            suggestion = "Consider save more ";
        }else{
            suggestion = " you should save something";
        }

        System.out.printf("\nTotal Expenses                 : %.2f ", totalExpenses);
        System.out.printf("\nRemaining Money after Expense  : %.2f", remainingMoneyAfterExpenses);
        System.out.printf("\nTarget Saving Amounts          : %.2f", targetSavings);
        System.out.printf("\nMoney Left After Applications.Savings       : %.2f", remainingMoney);
        System.out.print("\nFeedback: " + suggestion);

    }
}