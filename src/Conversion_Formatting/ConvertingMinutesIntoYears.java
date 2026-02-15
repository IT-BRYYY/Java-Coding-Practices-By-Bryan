package Conversion_Formatting;

import java.util.*;
public class ConvertingMinutesIntoYears  {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Choose the number u want to compute below:  ");
            System.out.println("1. Converting minutes to years and days");
            System.out.println("2. Converting year to days and minutes");
            System.out.println("3. Compute Converting days to years");
            System.out.println("4. Exit");
            System.out.print("\nChoose the number u want to compute:  ");
            byte choice = input.nextByte();

            switch (choice){
                case 1: {
                    System.out.print("\nEnter the minutes that you want to covert in years and days: ");
                    long minutes = input.nextLong();

                    long minutesInYear = 365 * 24 * 60;
                    long years = minutes / minutesInYear;

                    long remainingMinutes = minutes % minutesInYear;
                    long days = remainingMinutes / (24 * 60);

                    System.out.println(minutes + " minutes is " + years + " years and " + days + " days\n");
                    break;
                }

                case 2: {
                    System.out.print("\nEnter the years you want to convert in days and minutes ");
                    long years = input.nextLong();

                    long minutesInYear = 365 * 24 * 60;
                    long days = years * 365;
                    long Totalminutes = years * minutesInYear;

                    System.out.println(years + " years is " + days + " days and " + Totalminutes + " minutes\n");
                    break;
                }

                case 3: {

                    System.out.print("\nEnter the days u want to convert into years (Enter days over 365 days): ");
                    long days = input.nextLong();

                    long years = days / 365;
                    System.out.println(days + " is " + years + " years\n");

                    if(days <= 364){
                        System.out.println("\nPlease put a number higher than 365 ");

                    }
                    break;

                }

                case 4:
                    System.out.println("\nThankyou!");
                    return;

            }
        }

    }
}