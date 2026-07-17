import java.util.GregorianCalendar;

public class MyDate {
    // Data fields
    private int year;
    private int month; // 0-based: 0 = January
    private int day;

    // No-arg constructor that creates a MyDate object for the current date
    public MyDate() {
        this(System.currentTimeMillis());
    }

    // Constructor that constructs a MyDate object with a specified elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor that constructs a MyDate object with the specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Method that sets a new date for the object using the elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);

        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Optional: Override toString() method for easy display
    @Override
    public String toString() {
        // Adding 1 to month because month is 0-based
        return year + "/" + (month + 1) + "/" + day;
    }
}
