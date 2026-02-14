import java.util.Scanner;
public class practice{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter q1,q2,q3 scores for lakers:  ");
        int q1 = input.nextInt();
        int q2 = input.nextInt();
        int q3 = input.nextInt();

        System.out.print("Enter q1,q2,q3 scores for celtics: ");
        int l1 = input.nextInt();
        int l2 = input.nextInt();
        int l3 = input.nextInt();

        int totalLakers = q1 + q2 + q3;
        int totalCeltics = l1 + l2 + l3;


        String time = "3:15";

        System.out.println("=".repeat(30));
        System.out.printf("%25s", "NBA GAME - LIVE - Q3\n");
        System.out.println("=".repeat(30));
        System.out.printf("%-8s %-2s %-2s %-2s %-2s\n","Team","Q1","Q2","Q3","TOTAL");
        System.out.printf("%-8s %-2d %-2d %-2s %-2d\n","Lakers", q1,q2,q3,totalLakers);
        System.out.printf("%-8s %-2d %-2d %-2s %-2d\n","Celtics", l1,l2,l3,totalCeltics);
        System.out.println("=".repeat(30));
        System.out.printf("%-1s %s\n","Time Remaining: ",time);

        if(totalCeltics>totalLakers){
            System.out.printf("%s\n","Leading Celtics");
        }else if(totalCeltics<totalLakers){
            System.out.printf("%s\n","Leading Lakers");
        }else{
            System.out.printf("%s\n","Score is OLL");
        }

        System.out.println("=".repeat(30));




    }
}