package OOP;

abstract class ParkingVehicle {
    protected String plateNumber;
    protected int hours;

    ParkingVehicle(String plateNumber, int hours) {
        this.plateNumber = plateNumber;
        this.hours = hours;
    }

    public abstract double calculateFee();
}

interface ParkingDiscount {
    double applyDiscount(double percentage);
}

class ParkedCar extends ParkingVehicle
        implements ParkingDiscount {

    private double hourlyRate;

    ParkedCar(String plateNumber, int hours, double hourlyRate) {
        super(plateNumber, hours);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateFee() {
        return hours * hourlyRate;
    }

    @Override
    public double applyDiscount(double percentage) {
        return calculateFee() * (1 - percentage / 100);
    }
}

public class ParkingFeeDemo {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("ABC-1234", 3, 40);

        System.out.println("Plate Number: " + car.plateNumber);
        System.out.println("Parking Hours: " + car.hours);

        System.out.println("Regular Fee: PHP "
                + car.calculateFee());

        System.out.println("Discounted Fee: PHP "
                + car.applyDiscount(20));
    }
}