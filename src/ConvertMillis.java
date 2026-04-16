import java.util.Scanner;

public class ConvertMillis {

    // Method to convert milliseconds to hours:minutes:seconds
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;

        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;

        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();

        String result = convertMillis(millis);

        System.out.println("Converted time: " + result);
    }
}