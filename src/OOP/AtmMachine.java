package OOP;
import java.util.Scanner;
public class AtmMachine {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Account [] accounts = new Account[10];
        for(int i = 0; i < accounts.length; i++){
            accounts[i] = new Account(0, 100.0);
        }

        while(true){
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            while(id < 0 || id >= accounts.length){
                System.out.println("Invalid id. Please enter a correct id.");
                id = input.nextInt();
            }

            Account currentAccount = accounts[id];

            boolean exit = false;
            while(!exit){
                System.out.println("\nMain menu:");
                System.out.println("1: Check balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");

                int choice = input.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("The balance is $" + currentAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        currentAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        currentAccount.deposit(depositAmount);
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Exiting....\n");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
