import java.util.Scanner;
public class practice{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char random = input.next().charAt(0);

        int val = (int) random;

        System.out.println(val);
    }
}