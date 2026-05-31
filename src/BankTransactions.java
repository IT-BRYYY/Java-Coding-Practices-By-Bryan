public class BankTransactions {
    public static void main(String[] args) {

        // rows = transactions, columns = [txnID, amount, type(1=deposit/2=withdraw), fee]
        int[][] transactions = {
                {1001, 5000, 1, 10},
                {1002, 2000, 2, 15},
                {1003, 8000, 1, 10},
                {1004, 3000, 2, 20}
        };

        int balance = 0;

        System.out.println("=== RECENT TRANSACTIONS (Latest First) ===");

        // backwards - show latest transaction first
        for (int i = transactions.length - 1; i >= 0; i--) {
            String type = transactions[i][2] == 1 ? "DEPOSIT" : "WITHDRAW";
            System.out.println("TXN " + transactions[i][0] +
                    " | " + type +
                    " | Amount: " + transactions[i][1] +
                    " | Fee: " + transactions[i][3]);
        }

        System.out.println("\n=== COMPUTING BALANCE ===");

        // forward - compute balance
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i][2] == 1)
                balance += transactions[i][1] - transactions[i][3];
            else
                balance -= transactions[i][1] + transactions[i][3];

            System.out.println("After TXN " + transactions[i][0] +
                    " | Balance: " + balance);
        }

        System.out.println("\n=== LARGEST TRANSACTION ===");

        // using i+1 to compare adjacent so need length - 1
        int largestID     = transactions[0][0];
        int largestAmount = transactions[0][1];

        for (int i = 0; i < transactions.length - 1; i++) {
            if (transactions[i][1] > transactions[i + 1][1]) {
                largestID     = transactions[i][0];
                largestAmount = transactions[i][1];
            }
        }
        System.out.println("TXN " + largestID +
                " with amount: " + largestAmount);

        System.out.println("\nFinal Balance: " + balance);
    }
}