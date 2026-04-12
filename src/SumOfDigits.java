import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long number = input.nextLong();

        long total = sumDigits(number);
        System.out.println("Total : " + total);
    }

    public static long sumDigits(long number){
        long sum = 0;
        String result = "";

        while(number > 0){
            long digit = number % 10;
            long prevSum = sum;
            sum += digit;

            result += prevSum + " + " + digit + " = " + sum + "\n";
            number /= 10;
        }

        computationNumber(result);
        return sum;
    }
    public static void computationNumber(String result){

        System.out.println(result);

    }

}
