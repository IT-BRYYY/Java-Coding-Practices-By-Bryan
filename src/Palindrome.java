import java.util.Scanner;
public class Palindrome{
    public static void main (String []args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter 3 number: ");
        int num= input.nextInt();

        if(num <= -1){
            num = Math.abs(num);
        }

        int num1 = (num % 10);
        int num2 = (num / 10) % 10;
        int num3 = (num / 100) % 10;

        String combine1 = "" + num1 + num2 + num3;
        String combine2 = "" + num3 + num2 + num1;

        if(combine1.equals(String.valueOf(num)) && combine2.equals(String.valueOf(num))){
            System.out.println(num + " is a Palindrome");
        }else{
            System.out.println(num + " is not Palindrome");
        }

        //simple way compare num1 and num3
        //if its has a 5 number compare first and last and second and second to the last
    }
}

