import java.util.Scanner;
public class Login{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String username = "Bry";
        String password = "bryy";

        System.out.print("Enter username: ");
        String usernameLogin = input.nextLine();

        System.out.print("Enter password: ");
        String passwordLogin = input.nextLine();

        if(username.equals(usernameLogin) && password.equals(passwordLogin)){
            System.out.println("Login Successfully");
        }else if(username.equals(usernameLogin) && !password.equals(passwordLogin)){
            System.out.println("Wrong Password");
        }else if(!username.equals(usernameLogin) && password.equals(passwordLogin)){
            System.out.println("Wrong Username");
        }else{
            System.out.println("Wrong Both Username and Password");

        }

         /*in this ide it has caution if the statement is always true so this is what I
          do all if's but u can change the 2 ifs in the middle with else if and else in the last if
        */
    }
}