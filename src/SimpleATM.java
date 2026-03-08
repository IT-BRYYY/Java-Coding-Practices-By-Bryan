import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000.00;
        int choice = 0;

        System.out.println("Welcome to the ATM!");

        while (choice != 4) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Your balance: $" + balance);

            } else if (choice == 2) {
                System.out.print("Enter deposit amount: $");
                double amount = input.nextDouble();
                balance += amount;
                System.out.println("Successfully deposited $" + amount);

            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: $");
                double amount = input.nextDouble();
                if (amount > balance)
                    System.out.println("Insufficient balance!");
                else {
                    balance -= amount;
                    System.out.println("Successfully withdrawn $" + amount);
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");

            } else {
                System.out.println("Invalid choice! Please enter 1-4.");
            }
        }
    }
}
