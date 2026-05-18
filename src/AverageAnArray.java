import java.util.Scanner;
public class AverageAnArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double [] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextDouble();
        }

        double result = average(numbers);
        System.out.printf("The average is %.2f", result);

    }
    public static double average(double [] numbers){
        double sum = 0;
        for(int i = 0; i < numbers.length;i++){
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
    public static int average(int [] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length;i++){
            sum += numbers[i];
        }
        return sum / numbers.length;

    }
}
