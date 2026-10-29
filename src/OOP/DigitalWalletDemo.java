package OOP;

abstract class WalletAccount {
    private String ownerName;

    WalletAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public abstract void displayBalance();
}

class DigitalWallet extends WalletAccount
        implements Cloneable {

    private double balance;

    DigitalWallet(String ownerName, double balance) {
        super(ownerName);
        this.balance = balance;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Balance: PHP " + balance);
    }

    @Override
    public DigitalWallet clone() {
        try {
            return (DigitalWallet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

public class DigitalWalletDemo {
    public static void main(String[] args) {
        DigitalWallet original =
                new DigitalWallet("Alex", 1000);

        DigitalWallet backup = original.clone();

        backup.addBalance(500);

        System.out.println("Original Wallet:");
        original.displayBalance();

        System.out.println("\nCloned Wallet:");
        backup.displayBalance();
    }
}