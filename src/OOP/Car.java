package OOP;

public class Car {
    String brand;
    double speed;
    double fuel;
    boolean isRunning;

    Car(){
        brand = "Unknown";
        speed = 0;
        fuel = 50;
        isRunning = false;
    }
    Car(String brand, double speed, double fuel){
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        isRunning = false;
    }

    void startEngine(){
        if(fuel > 0){
            isRunning = true;
            System.out.println(brand + " engine started!");
        }else{
            System.out.println("No fuel! Cannot start.");
        }
    }

    void stopEngine(){
        isRunning = false;
        speed = 0;
        System.out.println(brand + " engine stopped.");
    }

    void accelerate(double amount){
        if(isRunning && fuel > 0){
            speed += amount;
            fuel -= amount * 0.1;
            System.out.println("Accelerating! Speed " + speed + ", Fuel left: " + fuel);
        }else{
            System.out.println("Car is not running!");
        }
    }

    void brake(double amount){
        speed -= amount;
        if(speed < 0) speed = 0;
        System.out.println("Braking! Speed: " + speed);
    }
    double getSpeed(){
        return speed;
    }

    double getFuel(){
        return fuel;
    }
}
