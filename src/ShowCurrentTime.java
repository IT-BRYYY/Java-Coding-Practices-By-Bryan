import java.util.Scanner;
public class ShowCurrentTime{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        long totalMillisSecond = System.currentTimeMillis();

        long totalSeconds = totalMillisSecond / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        int localHour = (int)currentHours + offset;

        if(localHour >= 24){
            localHour -= 24;
        }if(localHour < 0){
            localHour += 24;
        }

        int hours12 = localHour % 12;
        if(hours12 == 0 ){
            hours12 = 12;
        }
        String ampm = (localHour < 12)?"AM" : "PM";

        System.out.printf("The current time is %02d:%02d:%02d %s",hours12, currentMinutes,currentSeconds, ampm  );

    }
}