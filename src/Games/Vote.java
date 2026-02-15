package Games;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        String word2;
        int num1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        num1 = sc.nextInt();

        if  (num1>=18) {
            System.out.println("You are eligible to vote.");
        }
        else if (num1 <18) {
            System.out.println("You are not eligible to vote.");
            System.exit(0);
        }

        System.out.print("Do you have a voters ID? (Yes/No): ");
        sc.nextLine();
        word2 = sc.nextLine();

        if (word2.equals("yes") || word2.equals("Yes")|| word2.equals("omsim")){
            System.out.println("Great! You can participate in the Barangay Election");
        }
        else if (word2.equals("no")|| word2.equals("No")) {
            System.out.println("You cannot participate in the Barangay Election");
        }

    }

}
