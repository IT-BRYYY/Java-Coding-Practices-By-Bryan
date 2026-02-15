package Date_Time;

import java.util.Scanner;
public class DAY {
    public static void main (String []args){

        String day;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        day = scanner.nextLine().toLowerCase().trim();

        switch(day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's Week Day!!");
                break;

            case "saturday":
            case "sunday":
                System.out.println("It's Weekend!!");
                break;

            default:
                System.out.println("Invalid input");

        }
        if (day.equals("saturday") || day.equals("sunday")){
            System.out.println("Enjoyy your weekends");
        }
        else if (day.equals("monday")){
            System.out.println("it is first day of the week");
        }
        else if (day.equals("friday")){
            System.out.println("it is last day of the week");

        }

    }
}
