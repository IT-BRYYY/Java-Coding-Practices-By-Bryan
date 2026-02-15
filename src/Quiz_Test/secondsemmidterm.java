package Quiz_Test;

import java.util.Scanner;

public class secondsemmidterm {


    //	 2NDSEM MIDTERMEXAM PRACTICE
    //         SWITCH CASE Pre-defined Methods


    static double numMin(double a,double b) {
        return Math.min(a, b);
    }
    static double numMax(double a, double b) {
        return Math.max(a, b);
    }
    static double numAbsA(double a) {
        return Math.abs(a);
    }
    static double numabsB(double b) {
        return Math.abs(b);
    }
    static double numSqrtA(double a) {
        return Math.sqrt(a);
    }
    static double numSqrtB(double b) {
        return Math.sqrt(b);
    }


    public static void main (String args[]) {
        System.out.println("Simple Computation");
        System.out.println("\nChoose the operation you need");
        System.out.println("\nA for min");
        System.out.println("B for max");
        System.out.println("C for abs");
        System.out.println("D for sqrt");
        System.out.println("E for All of the Above");


        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the operation you choose: ");
        String choice = sc.nextLine();

        switch(choice){

            case "A":
            case "a":
                System.out.print("\nEnter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("\nEnter the second number: ");
                double num2 = sc.nextDouble();
                System.out.print("The min of the two number is" + " = " +Math.min(num1, num2));
                break;

            case "B":
            case "b":
                System.out.print("\nEnter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
                System.out.println("\nThe max of the two number is" + " = " + Math.max(num1, num2));
                break;


            case "C":
            case "c":
                System.out.print("\nEnter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("\nEnter the second number: ");
                num2 = sc.nextDouble();
                System.out.println("The abs value of "+num1 + " = " + Math.abs(num1));
                System.out.println("The abs value of "+num2 + " = " + Math.abs(num2));
                break;


            case"D":
            case"d":
                System.out.print("\nEnter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("\nEnter the second number: ");
                num2 = sc.nextDouble();
                System.out.println("The sqrt value of "+num1 + " = " + Math.sqrt(num1));
                System.out.println("The sqrt value of "+num2 + " = " + Math.sqrt(num2));
                break;

            case"E":
            case"e":
                System.out.print("\nEnter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("\nEnter the second number: ");
                num2 = sc.nextDouble();

                System.out.println("\nThe min of the two number is" + " = " + Math.min(num1, num2));

                System.out.println("\nThe max of the two number is " + " = " + Math.max(num1, num2));

                System.out.println("The abs value of "+num1 + " = " + Math.abs(num1));
                System.out.println("The abs value of "+num2 + " = " + Math.abs(num2));

                System.out.println("The sqrt value of "+num1 + " = " + Math.sqrt(num1));
                System.out.println("The sqrt value of "+num2 + " = " + Math.sqrt(num2));
                break;

            default:
                System.out.println("\nInvalid!!!");
                break;

        }
    }

}