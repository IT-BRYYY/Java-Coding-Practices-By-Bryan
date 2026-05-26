import java.util.Scanner;
public class MonthName {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String [] MonthNames = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November","December"};


        System.out.print("Enter the month number(1 to 12): ");
        int n = input.nextInt();

        if(!(n >= 1 && n <= 12)){
            System.out.println("Invalid input");
            return;
        }

        System.out.println(MonthNames[n - 1]);
    }

}
