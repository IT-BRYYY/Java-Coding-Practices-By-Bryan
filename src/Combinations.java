public class Combinations {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 7; i++) {          // first number
            for (int j = i + 1; j <= 7; j++) {  // second number
                System.out.println(i + " " + j);
                count++;
            }
        }

        System.out.println("The total number of all combinations is " + count);
    }
}