import java.util.Scanner;

public class CreditCardValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }
    }

    // Return true if the card number is valid
    public static boolean isValid(long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (total % 10 == 0) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                (getSize(number) >= 13 && getSize(number) <= 16);
    }

    // Get the result from Step 2: sum of doubled even-place digits
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = number + "";

        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Integer.parseInt(numStr.charAt(i) + "");
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    // Return single digit if < 10, otherwise return sum of two digits
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    // Return sum of odd-place digits from right
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = number + "";

        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(numStr.charAt(i) + "");
        }
        return sum;
    }

    // Return true if the number d is a prefix of number
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    // Return the number of digits in d
    public static int getSize(long d) {
        String numStr = d + "";
        return numStr.length();
    }

    // Return the first k digits from number
    public static long getPrefix(long number, int k) {
        String numStr = number + "";
        if (k >= numStr.length()) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }
}