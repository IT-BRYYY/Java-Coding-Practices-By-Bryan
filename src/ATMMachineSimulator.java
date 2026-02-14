import java.util.Scanner;
public class ATMMachineSimulator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int transactionID = (int)(Math.random() * 9000) + 1000;
        final double INITIAL_BALANCE = 10000.0;

        System.out.print("Account holder name: ");
        String name = input.nextLine();

        System.out.println(" 1 = Deposit \n 2 = Withdraw \n 3 = Check Balance");
        System.out.print("Choose Transaction Type: ");
        int transactionType = input.nextInt();

        switch(transactionType){
            case 1:
                System.out.print("Deposit money: ");
                double deposit = input.nextDouble();

                double balanceAfterDeposit = INITIAL_BALANCE + deposit;

                if(deposit > 0){
                    System.out.println("\nTransaction ID " + transactionID);
                    System.out.println("Account Holder Name: " + name);
                    System.out.println("Transaction Type: Deposit " );
                    System.out.println("Deposit Amount: " + deposit);
                    System.out.println("Balance: " + balanceAfterDeposit);

                    if(balanceAfterDeposit > 5000){
                        double balanceWithInterest = balanceAfterDeposit * Math.pow(1.02, 1.0/12);
                        double balanceEarned = balanceWithInterest - balanceAfterDeposit;
                        System.out.printf("Potential Monthly Interest %.2f\n", balanceEarned);
                    }

                }else{
                    System.out.println("No Transaction Made");
                }
                break;

            case 2:
                System.out.print("Withdraw money: ");
                double money = input.nextDouble();

                if(money % 100 == 0){
                    if(INITIAL_BALANCE >= money){
                        int numberOfBills = (int)(money / 100);
                        double balance = INITIAL_BALANCE - money;
                        System.out.println("\nTransaction ID " + transactionID);
                        System.out.println("Account Holder Name: " + name);
                        System.out.println("Transaction Type: Withdraw " );
                        System.out.println("You receive " + numberOfBills + " 100- peso bills");
                        System.out.println("Balance: " + balance);

                        if(balance > 5000){
                            double balanceWithInterest = balance * Math.pow(1.02, 1.0/12);
                            double interestEarned = balanceWithInterest - balance;
                            System.out.printf("Potential Monthly Interest %.2f\n",interestEarned);
                        }

                    }else {
                        System.out.println("Insufficient balance");
                    }
                }else {
                    System.out.println("Amount must be in multiples of 100");
                }
                break;

            case 3:
                System.out.println("\nTransaction ID " + transactionID);
                System.out.println("\nAccount Holder Name: " + name);
                System.out.println("Transaction Type: Check Balance " );
                System.out.println("Balance: " + INITIAL_BALANCE);


                if(INITIAL_BALANCE > 5000){
                    double balanceWithInterest = INITIAL_BALANCE * Math.pow(1.02, 1.0/12);
                    double interestEarned = balanceWithInterest - INITIAL_BALANCE;

                    System.out.printf("Monthly Interest: %.2f\n",interestEarned);
                }
        }

         input.close();

    }
}
