package OOP;

abstract class DeliveryDrone {
    private String droneId;
    private double batteryLevel;
    private double packageWeight;

    public DeliveryDrone(String droneId, double batteryLevel,
                         double packageWeight) {
        this.droneId = droneId;
        this.batteryLevel = batteryLevel;
        this.packageWeight = packageWeight;
    }

    public String getDroneId() {
        return droneId;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    protected void reduceBattery(double amount) {
        batteryLevel -= amount;
    }

    public abstract void deliverPackage();
}

interface ReturnableDrone {
    void returnToBase();
}

class LightDeliveryDrone extends DeliveryDrone
        implements ReturnableDrone {

    public LightDeliveryDrone(String droneId, double batteryLevel,
                              double packageWeight) {
        super(droneId, batteryLevel, packageWeight);
    }

    @Override
    public void deliverPackage() {
        if (getPackageWeight() > 2) {
            System.out.println("Package exceeds the weight limit.");
        } else if (getBatteryLevel() < 20) {
            System.out.println("Insufficient battery for delivery.");
        } else {
            System.out.println("Light drone delivering package...");
            reduceBattery(15);
            System.out.println("Package delivered successfully.");
        }
    }

    @Override
    public void returnToBase() {
        System.out.println("Light drone returning to base.");
    }
}

class HeavyDeliveryDrone extends DeliveryDrone
        implements ReturnableDrone {

    public HeavyDeliveryDrone(String droneId, double batteryLevel,
                              double packageWeight) {
        super(droneId, batteryLevel, packageWeight);
    }

    @Override
    public void deliverPackage() {
        if (getPackageWeight() > 10) {
            System.out.println("Package exceeds the weight limit.");
        } else if (getBatteryLevel() < 40) {
            System.out.println("Insufficient battery for delivery.");
        } else {
            System.out.println("Heavy drone delivering package...");
            reduceBattery(30);
            System.out.println("Package delivered successfully.");
        }
    }

    @Override
    public void returnToBase() {
        System.out.println("Heavy drone returning to base.");
    }
}

public class DroneDeliveryDemo {
    public static void main(String[] args) {

        DeliveryDrone[] drones = {
                new LightDeliveryDrone("DRONE-001", 80, 1.5),
                new HeavyDeliveryDrone("DRONE-002", 90, 8)
        };

        for (DeliveryDrone drone : drones) {
            System.out.println("Drone ID: " + drone.getDroneId());
            System.out.println("Package Weight: "
                    + drone.getPackageWeight() + " kg");
            System.out.println("Initial Battery: "
                    + drone.getBatteryLevel() + "%");

            drone.deliverPackage();

            System.out.println("Remaining Battery: "
                    + drone.getBatteryLevel() + "%");

            ReturnableDrone returning = (ReturnableDrone) drone;
            returning.returnToBase();

            System.out.println();
        }
    }
}