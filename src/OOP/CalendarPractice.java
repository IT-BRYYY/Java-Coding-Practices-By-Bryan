package OOP;

import java.util.*;

public class CalendarPractice {
    public static void main(String[] args) {

        // Create a calendar for August 15, 2026
        Calendar calendar = new GregorianCalendar(2026, 7, 15);

        System.out.println("Date: " + calendar.get(Calendar.MONTH) + 1 + "/"
                + calendar.get(Calendar.DATE) + "/"
                + calendar.get(Calendar.YEAR));

        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

        // Add 10 days to the date
        calendar.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println("\nAfter adding 10 days:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

        // Get the maximum number of days in the current month
        int maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Maximum days in this month: " + maxDays);
    }
}