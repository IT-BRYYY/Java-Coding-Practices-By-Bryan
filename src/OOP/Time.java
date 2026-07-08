package OOP;

public class Time {
    private long hour;
    private long minute;
    private long second;

    Time(){
        this(System.currentTimeMillis());
    }
    Time(long elapsedTime){
        setTime(elapsedTime);
    }
    Time(long hours, long minutes, long seconds){
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
    }

    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        this.second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
    }

    public long getHour(){
        return hour;
    }
    public long getMinute(){
        return minute;
    }
    public long getSecond(){
        return second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
