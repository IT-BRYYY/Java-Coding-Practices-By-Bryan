public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        boolean[] flag = new boolean[n + 1];

        // Initialize all elements to true
        for (int i = 0; i < flag.length; i++) {
            flag[i] = true;
        }

        // Sieve algorithm
        for (int i = 2; i <= n; i++) {
            if (flag[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    flag[j] = false;
                }
            }
        }

        // Display prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (flag[i]) {
                System.out.print(i + " ");
            }
        }
    }
}