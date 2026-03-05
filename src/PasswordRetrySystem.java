import java.util.Scanner;
public class PasswordRetrySystem {
    public static void main(String[] args) {

        String correctPassword = "java123";
        Scanner input = new Scanner(System.in);

        int attempts = 0;

        System.out.print("Enter password: ");
        String password = input.nextLine();
        attempts++;

        while (!password.equals(correctPassword)) {

            System.out.print("Incorrect password. Try again: ");
            password = input.nextLine();
            attempts++;
        }

        System.out.println("Login Successful!");
        System.out.println("Attempts: " + attempts);
    }
}