import java.util.Scanner;
public class ZellersCongruence{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        String day = "";

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter month: ");
        int m = input.nextInt();

        System.out.print("Enter the day of the month: ");
        int q = input.nextInt();


        if(q > 31 || m <1 || m > 12 || q < 1){
            System.out.println("Invalid input ");
            return;
        }

        if(m == 1){
            m = 13;
            year -= 1;
        }else if(m == 2){
            m = 14;
            year -= 1;
        }

        int j = year/100;
        int k = year % 100;

        int h = (q + (26*(m+1) / 10) + k + (k/4) + (j/4) + (5*j))%7;

        switch(h){
            case 0: day = "Saturday"; break;
            case 1: day = "Sunday"; break;
            case 2: day = "Monday"; break;
            case 3: day = "Tuesday"; break;
            case 4: day = "Wednesday"; break;
            case 5: day = "Thursday"; break;
            case 6: day = "Friday"; break;
        }


        System.out.println("The day of the week is " + day);

        //Zellers Calander created before the computers, calculators, google, cellphones
        // so its old math algorithm to know the future day or even past day

    }
}
