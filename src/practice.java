import java.util.Scanner;
public class practice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String [] months = {"Jan","Feb","Mar","Apr","May","Jun",
                "Jul","Aug","Sep","Oct","Nov","Dec"};

        System.out.print("Enter a number ( 1 to 12 ): ");
        int monthNumber = input.nextInt();

        System.out.print("The month is " + months[monthNumber - 1]);
    }
}