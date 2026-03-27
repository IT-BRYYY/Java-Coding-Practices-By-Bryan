import java.util.Scanner;
public class VowelsAndConsonantCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countVowel = 0;
        int countConsonant = 0;

        System.out.print("Enter a string: ");
        String text = input.nextLine().toLowerCase();

        for(int i = 0; i < text.length(); i++){

            if(text.charAt(i) == 'a'  || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
            || text.charAt(i) == 'u'){
                countVowel++;
            }else if(Character.isLetter(text.charAt(i))){
                countConsonant++;
            }
        }

        System.out.println("Number of vowels is " + countVowel);
        System.out.println("Number of consonants is " + countConsonant);

    }
}
