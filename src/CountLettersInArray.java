public class CountLettersInArray {
    public static void main(String []args){
        char [] chars = createArray();

        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        int [] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }

    public static char[] createArray(){
        char [] chars = new char[100];

        for (int i = 0; i < chars.length; i ++)
            chars [i] = RandomCharacter.getRandomLowerCaseLetter();

        return chars;
    }

    public static void displayArray(char [] chars){
        for (int i = 0; i < chars.length; i++){
            // i + 1 to avoid triggering new line at index 0
            if(((i + 1) % 20) == 0)
                System.out.println(chars[i]);
            else System.out.println(chars[i] + " ");
        }
    }

    public static int[] countLetters(char [] chars){
        // 26 slots, one for each letter a-z
        int [] counts = new int[26];

        // Subtracting 'a' converts char to index (a=0, b=1, z=25)
        for (char aChar : chars) counts[aChar - 'a']++;
        return counts;
    }

    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){
            // i + 1 to avoid triggering new line at index 0
            if((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }
}