import java.util.Scanner;
public class VowelOrConsonant{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        if(userInput.length() != 1){
            System.out.println("Invalid Input!");
            return;
        }

        char ch = userInput.charAt(0);

        if(!Character.isLetter(ch)){
            System.out.println(ch + " is an invalid input!");
        }else{
            ch = Character.toLowerCase(ch);

            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
                System.out.println(userInput + " is a vowel");
            }else{
                System.out.println(userInput + " is consonant");
            }
        }
    }
}