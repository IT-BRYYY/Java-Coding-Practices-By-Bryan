import java.sql.SQLOutput;
import java.util.Scanner;
public class FactorsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int divisor = 2;
        boolean first = true;

        System.out.print("Prime factors ");

        while(number > 1){
            if(number % divisor == 0){
                if(!first){
                    System.out.print(", ");
                }
                System.out.print(divisor);
                first = false;

                number = number / divisor;
            }else{
                divisor++;
            }
        }
        System.out.println();
    }
}
