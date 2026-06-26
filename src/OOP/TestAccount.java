package OOP;

import java.util.Date;

public class TestAccount {
    public static void main(String[]args){
        Account account1 = new Account(1122, 20000, 4.5);

        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.println("Current balance: " + account1.getBalance());
        System.out.println("Monthly Interest: " + account1.getMonthlyInterest());
        System.out.println("Account created: " + account1.getDateCreated());
    }
}
