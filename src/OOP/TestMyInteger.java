package OOP;

public class TestMyInteger {
    public static void main(String[]args){

        MyInteger num1 = new MyInteger(7);
        System.out.println("Value: " + num1.getValue());
        System.out.println("Is Even? " + num1.isEven());
        System.out.println("Is Odd? " + num1.isOdd());
        System.out.println("Is prime? " + num1.isPrime());

        System.out.println("Is 10 even? " + MyInteger.isEven(10));
        System.out.println("Is 9 odd? " + MyInteger.isOdd(9));
        System.out.println("Is 17 prime? " + MyInteger.isPrime(17));

        char[] chars = {'1','2','3'};
        System.out.println("Parsed char array: " + MyInteger.parseInt(chars));

        System.out.println("Parse string: " + MyInteger.parseInt("456"));

        System.out.println("Parse negative: " + MyInteger.parseInt("-789"));

        MyInteger num2 = new MyInteger(7);
        System.out.println("num1 equals num2? " + num1.equals(num2));
        System.out.println("num1 equals 7? " + num1.equals(7));
    }
}
