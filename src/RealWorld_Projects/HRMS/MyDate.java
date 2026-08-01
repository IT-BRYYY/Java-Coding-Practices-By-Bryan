package RealWorld_Projects.HRMS;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.year = calendar.get(java.util.Calendar.YEAR);
        this.month = calendar.get(java.util.Calendar.MONTH);
        this.day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }
    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }

    public void setDate(long elapsedTime){
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(java.util.Calendar.YEAR);
        this.month = calendar.get(java.util.Calendar.MONTH);
        this.day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    }
}
