package Calculators;

import java.util.Scanner;

public class BasicCalculator {
    public static void main (String [] args) {

        System.out.println("Basic Calculator");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a first number: ");
        double num1 = sc.nextInt();
        System.out.print("Input a second number: ");
        double num2 = sc.nextInt();

        System.out.println();

        System.out.print("ENTER ARITHMETIC OPERATION (+,-,*,/): ");
        char operation = sc.next().charAt(0);
        double result;
        boolean validoperation = true;

        switch (operation) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;

            case '*':
                result = num1 * num2;

            case '/':

                if (num2 != 0 ) {
                    result = num1 / num2;
                }
                else {
                    System.out.println("Cannot divide to zero ");
                    validoperation = false;
                    result = 0;
                }
                break;

            default:
                System.out.println("Invalid operator");
                validoperation = false;
                result = 0;
                break;
        }

        if(validoperation){
            System.out.println("The result is: " + result);
        }
    }

}
