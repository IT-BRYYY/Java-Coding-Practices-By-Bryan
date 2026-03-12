import java.util.Scanner;
public class PasswordRetrySystem {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "ADMIN";

        System.out.print("Enter a username: ");
        String userName = input.nextLine();

        System.out.print("Enter a password: ");
        String userPass = input.nextLine();

        while(true){
            if(userName.equals(correctUser) && userPass.equals(correctPass)){
                break;
            }

            else if(!userName.equals(correctUser) && !userPass.equals(correctPass)){
                System.out.print("Both Incorrect Re-enter username: ");
                userName = input.nextLine();
                System.out.print("Re-enter password: ");
                userPass = input.nextLine();
            }else if(!userName.equals(correctUser)){
                System.out.print("Incorrect Username Retry: ");
                userName = input.nextLine();
            }else{
                System.out.print("Incorrect Password. Retry ");
                userPass = input.nextLine();
            }

        }

        System.out.println("\nSuccessfully Login!!");
    }
}
