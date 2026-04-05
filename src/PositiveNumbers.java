public class PositiveNumbers {
    public static void main(String[] args) {
        System.out.println("5 Positive Numbers!");
        printPositiveNumbers(5);
    }

    public static boolean isPositive(int num) {
        return num >= 1;

    }

    public static void printPositiveNumbers(int n){
        for(int i = -5; i <= n; i++ ){
            if(isPositive(i)){
                System.out.println(i + "  ");
            }
        }
    }
}
