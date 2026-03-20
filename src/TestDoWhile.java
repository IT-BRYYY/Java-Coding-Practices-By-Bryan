import java.util.Scanner;
public class TestDoWhile{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;
        String name = "";

        do{
            System.out.print("Enter an integer " + " (the input ends if it is 0): ");
            number = input.nextInt();
            int prevSum = sum;
            sum += number;


            name += "\n" + prevSum + " + " + number + " = " + sum;

        }while(number !=0);
        System.out.println("\nTotal Sum " + sum);
        System.out.println(name);
    }

}