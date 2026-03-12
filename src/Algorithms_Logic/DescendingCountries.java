package Algorithms_Logic;

import java.util.Scanner;

public class DescendingCountries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();

        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();

        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();

        String first, second, third;

        // Compare country1 and country2
        if (country1.compareTo(country2) > 0) {
            first = country1;
            second = country2;
        } else {
            first = country2;
            second = country1;
        }

        // Compare first with country3
        if (country3.compareTo(first) > 0) {
            third = second;
            second = first;
            first = country3;
        }
        // Compare country3 with second
        else if (country3.compareTo(second) > 0) {
            third = second;
            second = country3;
        } else {
            third = country3;
        }

        System.out.println("\nThe three countries in descending order are:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}