package OOP;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println("Car1 - Brand: " + car1.brand +
                ", Speed " + car1.speed +
                ", Fuel: " + car1.fuel +
                ", Running: " + car1.isRunning);

        Car car2 = new Car("Toyota", 0, 100);
        System.out.println("Car  Brand: " + car2.brand +
                ", Speed " + car2.speed +
                ", Fuel: " + car2.fuel +
                ", Running: " + car2.isRunning);

        car2.startEngine();
        car2.accelerate(60);
        car2.brake(20);
        System.out.println("After driving - speed: " + car2.speed + ", Fuel: " + car2.fuel);

        car2.stopEngine();
        System.out.println("Engine running: " + car2.isRunning);


    }
}
