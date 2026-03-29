import java.util.Scanner;
public class HalfDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = n -1; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}