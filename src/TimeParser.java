import java.util.Scanner;
public class TimeParser {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter time (HH:MM): ");
        String timeInput = input.nextLine();

        int colonIndex = timeInput.indexOf(":");
        String hours = timeInput.substring(0, colonIndex);
        String minutes = timeInput.substring(colonIndex + 1);

        int totalMinutes = Integer.parseInt(hours) * 60 + Integer.parseInt(minutes);
        int remainingMinutes = totalMinutes % 60;
        int totalHours = totalMinutes / 60;

        System.out.println("\nTime entered: " + timeInput);
        System.out.println("Total minutes: " + totalMinutes);
        System.out.println("Hours: " + totalHours);
        System.out.println("Remaining minutes: " + remainingMinutes);
    }
}