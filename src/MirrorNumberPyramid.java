import java.util.Scanner;
public class MirrorNumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();

        for(int i = num; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
