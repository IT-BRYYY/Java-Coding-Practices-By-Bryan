import java.util.Scanner;
public class EmailExtractor {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = input.nextLine();

        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".", atIndex);

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1, dotIndex);
        String extension = email.substring(dotIndex + 1);

        System.out.println("\nEmail: " + email);
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        System.out.println("Extension: " + extension);

        if(atIndex == -1){
            System.out.println("Invalid email!");
        } else {
            System.out.println("Valid email format!");
        }
    }
}