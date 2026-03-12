package Math_Operations;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits: ");
        String binary = input.nextLine();

        int decimal = 0;
        int power = 0;

        for(int i = binary.length() - 1; i >= 0; i--){
            char digit = binary.charAt(i);

            if(digit == '1'){
                decimal += Math.pow(2, power);
            }else if (digit != '0'){
                System.out.println("Invalid binary number!");
                return;
            }
            power++;
        }

        System.out.println("The decimal value is " + decimal);



    }
}
