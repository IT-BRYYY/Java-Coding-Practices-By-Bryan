public class EvenNumberWithMultipleMethods {
    public static void main(String[] args) {
        System.out.println("10 Even numbers!\n");
        printEvenNumbers(10);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void printEvenNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            if(isEven(i)){
                System.out.print(i + " ");
            }
        }
    }
}
