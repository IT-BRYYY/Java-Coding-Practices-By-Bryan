package OOP;

class Bank {

    String ownerName;
    double balance;

    static double interestRate = 0.05;
    static String bankName = "Java Bank";
    static int totalAccounts = 0;

    Bank(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount){
        balance += amount;
    }

    void showInfo(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Bank: " + bankName);
    }

    static void showBankInfo(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Total Accounts: " + totalAccounts);

    }
}
public class BankAccount{
    public static void main(String []args){
        System.out.println("=== BEFORE ANY ACCOUNT ===");
        Bank.showBankInfo();

        Bank john = new Bank("John", 1000);

        Bank jane = new Bank("Jane", 5000);

        Bank bob = new Bank("Bob", 6000);
        System.out.println("=== AFTER ANY ACCOUNT ===");
        Bank.showBankInfo();

        System.out.println("=== JOHN'S INFO ===");
        john.showInfo();

        System.out.println("=== JANE'S INFO ===");
        jane.showInfo();

        System.out.println("=== BOB'S INFO ===");
        bob.showInfo();

        john.deposit(500);

        System.out.println("=== AFTER JOHN DEPOSITS 500 ===");
        System.out.println("John balance: " + john.balance);
        System.out.println("Mary balance: " + jane.balance);

        Bank.interestRate = 0.10;
        System.out.println("=== AFTER INTEREST RATE CHANGE ===");
        System.out.println("John sees rate: " + john.interestRate);
        System.out.println("Mary sees rate: " + jane.interestRate);
        System.out.println("Bob sees rate: " + bob.interestRate);


    }
}
