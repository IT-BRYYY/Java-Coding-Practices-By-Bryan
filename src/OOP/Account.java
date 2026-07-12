package OOP;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate ;
    private java.util.Date dateCreated;

    public Account(){
        this(0, 0);
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new java.util.Date();
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

}
