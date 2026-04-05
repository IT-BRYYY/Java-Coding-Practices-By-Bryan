public class practice {
    public static void main(String[] args) {
        System.out.println("Multiplication!");
        printMultiplication(3);
    }
    public static void printMultiplication(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}