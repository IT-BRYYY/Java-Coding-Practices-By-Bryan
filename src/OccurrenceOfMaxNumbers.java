import java.util.Scanner;
public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers (0 to end program): ");
        int number  = input.nextInt();

        if(number == 0){
            System.out.println("No numbers entered");
            return;
        }

        int max = number;
        int count = 1;

        while(true){
            number = input.nextInt();

            if(number == 0) break;

            if(number > max){
                max = number;
                count = 1;
            }else if(max == number){
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
