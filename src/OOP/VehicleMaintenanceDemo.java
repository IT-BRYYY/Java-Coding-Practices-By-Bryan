package OOP;

abstract class VehicleMaintenance {
    private String vehicleModel;
    private int mileage;

    public VehicleMaintenance(String vehicleModel, int mileage) {
        this.vehicleModel = vehicleModel;
        this.mileage = mileage;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getMileage() {
        return mileage;
    }

    public abstract double calculateMaintenanceCost();
}

interface Serviceable {
    void performService();
}

class CarMaintenance extends VehicleMaintenance implements Serviceable {

    public CarMaintenance(String vehicleModel, int mileage) {
        super(vehicleModel, mileage);
    }

    @Override
    public double calculateMaintenanceCost() {
        return 1500 + (getMileage() * 0.50);
    }

    @Override
    public void performService() {
        System.out.println("Car oil change and engine inspection completed.");
    }
}

class MotorcycleMaintenance extends VehicleMaintenance
        implements Serviceable {

    public MotorcycleMaintenance(String vehicleModel, int mileage) {
        super(vehicleModel, mileage);
    }

    @Override
    public double calculateMaintenanceCost() {
        return 500 + (getMileage() * 0.25);
    }

    @Override
    public void performService() {
        System.out.println("Motorcycle chain and brake inspection completed.");
    }
}

public class VehicleMaintenanceDemo {
    public static void main(String[] args) {

        VehicleMaintenance[] vehicles = {
                new CarMaintenance("Toyota Vios", 10000),
                new MotorcycleMaintenance("Honda Click", 5000)
        };

        for (VehicleMaintenance vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getVehicleModel());
            System.out.println("Mileage: " + vehicle.getMileage() + " km");

            System.out.println("Maintenance Cost: PHP "
                    + vehicle.calculateMaintenanceCost());

            Serviceable service = (Serviceable) vehicle;
            service.performService();

            System.out.println();
        }
    }
}