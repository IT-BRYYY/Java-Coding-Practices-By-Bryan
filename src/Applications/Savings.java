package Applications;

import java.util.*;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double INTEREST_RATE = 0.003125;

        System.out.print("Enter the monthly saving amount: ");
        double savings = input.nextDouble();

        double accountValue = 0;

        int months = 1;
        while (months <= 12) {
            accountValue = (savings + accountValue) * (1 + INTEREST_RATE);

            // Show only selected months
            // Remove the if statements if you want to show all months
            if (months <= 3 || months == 6) {
                System.out.println("After the " + getOrdinal(months) +
                        " month, the account value is " + accountValue);
            }

            months++;
        }

        input.close();
    }

    public static String getOrdinal(int number) {
        switch (number) {
            case 1: return "first";
            case 2: return "second";
            case 3: return "third";
            case 4: return "fourth";
            case 5: return "fifth";
            case 6: return "sixth";
            case 7: return "seventh";
            case 8: return "eighth";
            case 9: return "ninth";
            case 10: return "tenth";
            case 11: return "eleventh";
            case 12: return "twelfth";
            default: return number + "th";
        }
    }
}
