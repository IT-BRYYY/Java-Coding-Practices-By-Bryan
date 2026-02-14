import java.util.Scanner;

public class secondsemmidtermtwo {
    //	2NDSEM MIDTERMEXAM PRACTICE
    //  CONDITIONAL STATEMENTS

    public static void main (String args[]) {

        System.out.println("Simple computation ");
        System.out.println("\nChoose an operation that you need");
        System.out.println("A for min");
        System.out.println("B for max");
        System.out.println("C for abs");
        System.out.println("D for sqrt");
        System.out.println("E for All of the above");

        Scanner sc = new Scanner(System.in);
        Scanner sr = new Scanner(System.in);


        System.out.print("\nEnter the letter of operation that you need: ");
        String a = sc.nextLine();

        System.out.print("\nEnter the first number: ");
        double num1 = sr.nextDouble();

        System.out.print("\nEnter the second number: ");
        double num2 = sr.nextDouble();

        if(a.equals("A")||a.equals("a")) {
            System.out.println("\nThe min of the 2 numbers is" + " = "+ Math.min(num1, num2));
        }

        if(a.equals("B")||a.equals("b")){
            System.out.println("\nThe max of the 2 numbers is"+ " = " + Math.max(num1, num2));
        }

        if (a.equals("C")||a.equals("c")) {
            System.out.println("\nThe absolute value of " +num1+ " = " + Math.abs(num1));
            System.out.println("\nThe absolute value of " +num2+ " = " + Math.abs(num2));
        }

        if (a.equals("D")||a.equals("d")) {
            System.out.println("\nThe sqrt value of " +num1+ "= "+ Math.sqrt(num1));
            System.out.println("The sqrt value of " +num2+ "= "+ Math.sqrt(num2));
        }

        if (a.equals("E")||a.equals("e")) {
            System.out.println("\nThe min of the 2 numbers is" + " = "+ Math.min(num1, num2));
            System.out.println("The max of the 2 numbers is"+ " = " + Math.max(num1, num2));
            System.out.println("The absolute value of " +num1+ " = " + Math.abs(num1));
            System.out.println("The absolute value of " +num2+ " = " + Math.abs(num2));
            System.out.println("The sqrt value of " +num1+ " = "+ Math.sqrt(num1));
            System.out.println("The sqrt value of " +num2+ " = "+ Math.sqrt(num2));
        }




    }

}