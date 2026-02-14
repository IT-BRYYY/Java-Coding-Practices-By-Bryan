import java.util.Scanner;
public class PasswordChecker{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password with at least 8 characters: ");
        String password = input.nextLine().trim();

        //pass1234word
        String first4 = password.substring(0,4);
        String last4 = password.substring(8);
        String middle4 = password.substring(4,8);

        System.out.println("First 4 characters: " + first4);
        System.out.println("Last 4 characters: " + last4);
        System.out.println("Middle 4 characters: " + middle4);
        System.out.println("Password length: " + password.length());
        System.out.println("Contains '1234': " + password.contains("%@"));


        //
    }
}