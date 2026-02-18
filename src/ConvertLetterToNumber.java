import java.util.Scanner;
public class ConvertLetterToNumber {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a letter grade: ");
        String userInput = input.nextLine();

        if(userInput.length() != 1){
            System.out.println("Invalid Input");
            return;
        }

        char ch = userInput.charAt(0);

        if(!Character.isLetter(ch)){
            System.out.println("Invalid Input!!");

        }else{
            if(ch == 'A' ){
                System.out.println("The numeric value for grade A is 4");
            }else if(ch == 'B'){
                System.out.println("The numeric value for grade B is 3");
            }else if (ch == 'C'){
                System.out.println("The numeric value for grade C is 2");
            }else if(ch == 'D'){
                System.out.println("The numeric value for grade D is 1");
            }else if(ch == 'F') {
                System.out.println("The numeric value for grade F is 0");
            }else {
                System.out.println(userInput + " is an invalid grade!!");
            }
        }

    }
}