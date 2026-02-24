import java.util.Scanner;
public class ISBN10Validator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ISBN - 10 numbers: ");
        String isbn = input.nextLine().trim();
        System.out.println("You entered: " + isbn);

        if(isbn.length() != 10){
            System.out.println("Invalid ISBN-10: must be exactly 10 characters.");
            return;
        }

        int sum = 0;

        for(int i = 0; i < 9; i++){
            char c = isbn.charAt(i);
            if(!Character.isDigit(c)){
                System.out.println("Invalid ISBN - 10: ");
                return;
            }
            sum+=(c - '0' ) * (i + 1);
        }

        char last = isbn.charAt(9);
        if(last == 'X' || last == 'x'){
            sum+= 10 * 10;
        }else if (Character.isDigit(last)){
            sum+= (last - '0') * 10;
        }else{
            System.out.println("Invalid ISBN - 10 last character must be digit or x");
            return;
        }

        if(sum % 11 == 0){
            System.out.println(isbn + " is a valid ISBN - 10 number.");
        }else {
            System.out.println(isbn + " is not a valid ISBN - 10 number");
        }


    }

}
