public class PalindromicPrime {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindromicPrime(int n) {
        return isPrime(n) && isPalindrome(n);
    }

    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 120) {
            if (isPalindromicPrime(num)) {
                System.out.print(num);
                count++;
                if (count % 10 == 0)
                    System.out.println();
                else
                    System.out.print(" ");
            }
            num++;
        }
    }
}