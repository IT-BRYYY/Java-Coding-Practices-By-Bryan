import java.util.*;
public class NumberOfYears {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        final int YR = 525600;
        final int DS = 1440;

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long years = minutes / YR;
        long remainingMinutes = minutes % YR;

        long days = remainingMinutes / DS;

        System.out.println(minutes + " is approximately " + years + " years and " + days + " days");


    }
}