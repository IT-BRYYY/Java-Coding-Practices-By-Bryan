
package OOP;

abstract class BankingActivity {
    protected String accountName;

    BankingActivity(String accountName) {
        this.accountName = accountName;
    }

    public abstract void displayAccount();
}

interface Balanceable {
    double getBalance();
}

interface SavingsEligible extends Balanceable {
    void checkSavingsGoal();
}

class SavingsAccount extends BankingActivity
        implements SavingsEligible {

    private double balance;
    private double savingsGoal;

    SavingsAccount(String accountName, double balance,
                   double savingsGoal) {
        super(accountName);
        this.balance = balance;
        this.savingsGoal = savingsGoal;
    }

    @Override
    public void displayAccount() {
        System.out.println(
                "Account holder: " + accountName
        );
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void checkSavingsGoal() {
        if (balance >= savingsGoal) {
            System.out.println(
                    "Congratulations! Savings goal achieved!"
            );
        } else {
            System.out.println(
                    "Remaining amount: "
                            + (savingsGoal - balance)
            );
        }
    }
}

public class BankingActivityDemo {
    public static void main(String[] args) {
        SavingsAccount account =
                new SavingsAccount("Alex", 12000, 10000);

        BankingActivity activity = account;
        activity.displayAccount();

        SavingsEligible eligible = account;

        System.out.println(
                "Current balance: " + eligible.getBalance()
        );

        eligible.checkSavingsGoal();
    }
}
