package OOP;

abstract class Ch13BankAccount {
    private String accountName;
    private double balance;

    Ch13BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public abstract void displayAccountType();
}

interface Ch13Transferable {
    void transferTo(Ch13BankAccount target, double amount);
}

class Ch13SavingsAccount extends Ch13BankAccount
        implements Ch13Transferable {

    Ch13SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account type: Savings Account");
    }

    @Override
    public void transferTo(
            Ch13BankAccount target, double amount) {

        if (withdraw(amount)) {
            target.deposit(amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed.");
        }
    }
}

public class Ch13BankTransferDemo {
    public static void main(String[] args) {
        Ch13SavingsAccount account1 =
                new Ch13SavingsAccount("Alex", 5000);

        Ch13SavingsAccount account2 =
                new Ch13SavingsAccount("Jordan", 2000);

        account1.displayAccountType();

        account1.transferTo(account2, 1000);

        System.out.println(
                account1.getAccountName() + "'s balance: PHP "
                        + account1.getBalance()
        );

        System.out.println(
                account2.getAccountName() + "'s balance: PHP "
                        + account2.getBalance()
        );
    }
}