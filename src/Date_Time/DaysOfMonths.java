package Date_Time;

import java.util.Scanner;
public class DaysOfMonths{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of month: ");
        int month = input.nextInt();
        System.out.print("Enter a number of year: ");
        int year = input.nextInt();

        String name = "";
        int days;

        if(month == 2){
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                days = 29;
            }else{
                days = 28;
            }
        }else if(month== 4 || month == 6 || month == 9 || month == 11 ){
            days = 30;
        }else{
            days = 31;
        }

        switch(month){
            case 1:
                name = year + "January" + " has " + days;
                break;
            case 2:
                name = year + " February" + " has " + days;
                break;
            case 3:
                name = year + " March" + " has " + days;
                break;
            case 4:
                name = year + " April" + " has " + days;
                break;
            case 5:
                name = year + " May" + " has " + days;
                break;
            case 6:
                name = year + " June" + " has " + days;
                break;
            case 7:
                name = year + " July" + " has " + days;
                break;
            case 8:
                name = year + " August" + " has " + days;
                break;
            case 9:
                name = year + " September" + " has " + days;
                break;
            case 10:
                name = year + " October" + " has " + days;
                break;
            case 11:
                name = year + " November" + " has " + days;
                break;
            case 12:
                name = year + " December" + " has " + days;
                break;
            default:
                System.out.println("Invalid number for months");
        }
        System.out.println(name + " days");

    }
}