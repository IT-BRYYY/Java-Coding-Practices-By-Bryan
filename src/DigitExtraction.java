import java.util.Scanner;
public class DigitExtraction{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter International Standard Book Number consist of 9 digits: ");
        int number = input.nextInt();

        int d9 = number % 10;
        int d8 = (number / 10) % 10;
        int d7 = (number / 100) % 10;
        int d6 = (number / 1000) % 10;
        int d5 = (number / 10000) % 10;
        int d4 = (number / 100000) % 10;
        int d3 = (number / 1000000) % 10;
        int d2 = (number / 10000000) % 10;
        int d1 = (number / 100000000) % 10;

        int checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) +
                (d8 * 8) + (d9 * 9)) % 11;


        if(checksum == 10){
            System.out.println("The ISBN 10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X");
        }else{
            System.out.println("The ISBN 10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + ""+ checksum);
        }


    }
}