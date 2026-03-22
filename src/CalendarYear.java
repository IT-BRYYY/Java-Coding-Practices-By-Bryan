import java.util.Scanner;

public class CalendarYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.println("Enter the first day of January 1:");
        System.out.println("0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday,");
        System.out.println("4 = Thursday, 5 = Friday, 6 = Saturday");
        System.out.print("Enter start day (0-6): ");
        int startDay = scanner.nextInt();

        // Check leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int currentStartDay = startDay;

        for (int month = 1; month <= 12; month++) {

            // Determine days in current month
            int daysInMonth;
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                daysInMonth = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else if (isLeapYear) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }

            // Print month name
            if      (month == 1)  System.out.println("\n        January " + year);
            else if (month == 2)  System.out.println("\n        February " + year);
            else if (month == 3)  System.out.println("\n        March " + year);
            else if (month == 4)  System.out.println("\n        April " + year);
            else if (month == 5)  System.out.println("\n        May " + year);
            else if (month == 6)  System.out.println("\n        June " + year);
            else if (month == 7)  System.out.println("\n        July " + year);
            else if (month == 8)  System.out.println("\n        August " + year);
            else if (month == 9)  System.out.println("\n        September " + year);
            else if (month == 10) System.out.println("\n        October " + year);
            else if (month == 11) System.out.println("\n        November " + year);
            else                  System.out.println("\n        December " + year);

            // Print day headers
            System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            // Print leading spaces for the first week
            for (int i = 0; i < currentStartDay; i++) {
                System.out.print("     ");
            }

            int dayOfWeek = currentStartDay;

            // Print each day
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%4d ", day);

                if (dayOfWeek == 6) {
                    System.out.println();
                }

                dayOfWeek = (dayOfWeek + 1) % 7;
            }

            // Move to next line if last week is incomplete
            if (dayOfWeek != 0) {
                System.out.println();
            }

            // Update start day for next month
            currentStartDay = (currentStartDay + daysInMonth) % 7;
        }

        scanner.close();
    }
}