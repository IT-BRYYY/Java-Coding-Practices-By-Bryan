import java.util.Scanner;
public class OddEven{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        String OddEven = (number % 2 == 0 )? " Even number" : " Odd number";
        System.out.println(number + " is " + OddEven);

        input.close();

    }
}