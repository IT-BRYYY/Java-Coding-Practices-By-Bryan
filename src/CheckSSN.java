import java.util.Scanner;
public class CheckSSN {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter SSN: ");
        String ssn = input.nextLine();

        // equals()  - checks if two strings are exactly the same
        // matches() - checks if a string fits a pattern (e.g. \\d = any digit, {3} = exactly 3 times)

        if(ssn.matches("\\d{3}-\\d{2}-\\d{4}")){
            System.out.println(ssn + " is valid social security number");
        }else{
            System.out.println(ssn + " is an invalid social security number");
        }


    }
}
