package OOP;

public class TestTime {
    public static void main(String[] args) {

        Time time1 = new Time();
        System.out.println("Current time: " + time1);
        System.out.println("Hour: " + time1.getHour() +
                ", Minute: " + time1.getMinute() +
                ", Second: " + time1.getSecond());

        System.out.println();

        long elapsed = 1_000_000;
        Time time2 = new Time(elapsed);
        System.out.println("Time for " + elapsed + " ms: " + time2);
        System.out.println("Hour: " + time2.getHour() +
                ", Minute: " + time2.getMinute() +
                ", Second: " + time2.getSecond());

        System.out.println();

        Time time3 = new Time(14, 30, 45);
        System.out.println("Specific time (14:30:45): " + time3);
        System.out.println();

        long oneDayMs = 84_400_000;
        Time time4 = new Time(oneDayMs);
        System.out.println("Time for 1 day from epoch " + time4);
        System.out.println("This should be 00:00:00 (next day)");
        System.out.println();

        long customElapsed = 36_000_000;
        Time time5 = new Time(customElapsed);
        System.out.println("Time for " + customElapsed + " ms (10 hours): " + time5);

        System.out.println("Hour: " + time5.getHour() +
                ", Minute: " + time5.getMinute() +
                ", Second: " + time5.getSecond());
        System.out.println();

        Time time6 = new Time();
        System.out.println("Before setTime: " + time6);
        time6.setTime(5_000_000);
        System.out.println("After setTime(5,000,000 ms): " + time6);

    }
}
