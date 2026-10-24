
package OOP;

abstract class TransportActivity {
    protected String vehicleName;

    TransportActivity(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public abstract void startJourney();
}

interface FuelTrackable {
    double getFuelEfficiency();
}

interface EcoFriendly extends FuelTrackable {
    void checkEfficiency();
}

class HybridCar extends TransportActivity
        implements EcoFriendly {

    private double fuelEfficiency;

    HybridCar(String vehicleName, double fuelEfficiency) {
        super(vehicleName);
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void startJourney() {
        System.out.println(
                vehicleName + " has started its journey."
        );
    }

    @Override
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void checkEfficiency() {
        if (fuelEfficiency >= 20) {
            System.out.println(
                    "Excellent fuel efficiency!"
            );
        } else {
            System.out.println(
                    "Fuel efficiency needs improvement."
            );
        }
    }
}

public class VehicleEfficiencyDemo {
    public static void main(String[] args) {
        HybridCar car =
                new HybridCar("Eco Hybrid", 25.5);

        TransportActivity activity = car;
        activity.startJourney();

        EcoFriendly ecoCar = car;

        System.out.println(
                "Fuel efficiency: "
                        + ecoCar.getFuelEfficiency()
                        + " km/L"
        );

        ecoCar.checkEfficiency();
    }
}
