import java.util.Scanner;
public class DaysOfMonthsVer2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        input.nextLine();

        System.out.print("Enter a month: ");
        String month = input.nextLine();

        int days;

        if(month.equals("Feb")){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                days = 29;
                System.out.println(month + " " + year + " has " + days + " days");
            }else {
                days = 28;
                System.out.println(month + " " + year + " has " + days + " days");

            }
        }else if(month.equals("Apr") || month.equals("Jun") || month.equals("Sep") ||
        month.equals("Nov")){

            days = 30;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if (month.equals("Jan") || month.equals("Mar") || month.equals("May") ||
        month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){

            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else{
            System.out.println(month + " is not a correct month name");

        }
    }
}
