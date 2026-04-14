public class BasicCalculatorMethods {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        // calling methods
        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
    }

    // method for addition
    public static void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    // method for subtraction
    public static void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    // method for multiplication
    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    // method for division
    public static void divide(int a, int b) {
        int result = a / b;
        System.out.println("Division: " + result);
    }
}