import java.util.Scanner;
public class FindingOddAndEvenNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int [] odd = new int [11];
        int [] even = new int [11];
        int oddCount = 0, evenCount = 0;

        System.out.print("Enter numbers (0 to stop): ");
        int n = input.nextInt();

        while(n != 0){
            if(n % 2 != 0){
                odd[oddCount++] = n;
            }else{
                even[evenCount++] = n;
            }
            n = input.nextInt();
        }


        System.out.println("The number of odd numbers: " + oddCount);
        System.out.println("The number of even numbers: " + evenCount);

    }
}
