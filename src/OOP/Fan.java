package OOP;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed ;
    private boolean isOn ;
    private double radius ;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.isOn = false;
        this.radius = 5;
        this.color = "blue";

    }
    public Fan(int speed,boolean isOn, double radius,String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public  String toString() {
        if(isOn) {
            return "Fan is On: " + "\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
        }else {
            return "Fan is Off: " + "\nColor: " + color + "\nRadius: " + radius;
        }
    }
}
