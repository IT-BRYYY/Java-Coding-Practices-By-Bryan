public class RandomLowerCaseAndUpperCaseLetter {
    public static void main(String[]args){

        char randomLowerCase = (char)((int)(Math.random() * ('z' - 'a' + 1)) + 'a');
        char randomUpperCase = (char)((int)(Math.random() * ('Z' - 'A' + 1)) + 'A');


        System.out.println("Random lowercase: " + randomLowerCase);
        System.out.println("Random UpperCase: " + randomUpperCase);

        String random = "";

        //with 4 random letters
        for(int i = 0; i <4; i++){
            char randomLetter = (char)((int)(Math.random() *  26 + 'A'));
            random += randomLetter;

        }
        System.out.println("\n"+random);
    }
}