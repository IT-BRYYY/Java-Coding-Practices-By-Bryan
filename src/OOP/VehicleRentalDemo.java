package OOP;

abstract class RentalVehicle {
    protected String vehicleName;
    protected double dailyRate;

    RentalVehicle(String vehicleName, double dailyRate) {
        this.vehicleName = vehicleName;
        this.dailyRate = dailyRate;
    }

    public abstract double calculateRentalCost(int days);
}

interface LocationTrackable {
    void trackLocation();
}

interface Rentable {
    void rentVehicle();
}

class MotorcycleRental extends RentalVehicle
        implements LocationTrackable, Rentable {

    MotorcycleRental(String vehicleName, double dailyRate) {
        super(vehicleName, dailyRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Rental days must be greater than zero."
            );
        }

        return dailyRate * days;
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking motorcycle location...");
    }

    @Override
    public void rentVehicle() {
        System.out.println(vehicleName + " has been rented.");
    }
}

public class VehicleRentalDemo {
    public static void main(String[] args) {
        MotorcycleRental motorcycle =
                new MotorcycleRental("Honda Click", 500);

        motorcycle.rentVehicle();
        motorcycle.trackLocation();

        System.out.println(
                "Three-day rental cost: PHP "
                        + motorcycle.calculateRentalCost(3)
        );
    }
}