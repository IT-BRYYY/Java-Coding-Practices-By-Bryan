package OOP;

abstract class AquariumTank {
    private String tankName;
    private double waterTemperature;

    public AquariumTank(String tankName, double waterTemperature) {
        this.tankName = tankName;
        this.waterTemperature = waterTemperature;
    }

    public String getTankName() {
        return tankName;
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public abstract void checkWaterCondition();
}

interface Feedable {
    void feedFish();
}

class TropicalTank extends AquariumTank implements Feedable {

    public TropicalTank(String tankName, double waterTemperature) {
        super(tankName, waterTemperature);
    }

    @Override
    public void checkWaterCondition() {
        if (getWaterTemperature() >= 24
                && getWaterTemperature() <= 28) {
            System.out.println("Water condition: Normal");
        } else {
            System.out.println("Water condition: Temperature warning!");
        }
    }

    @Override
    public void feedFish() {
        System.out.println("Feeding tropical fish.");
    }
}

class ColdWaterTank extends AquariumTank implements Feedable {

    public ColdWaterTank(String tankName, double waterTemperature) {
        super(tankName, waterTemperature);
    }

    @Override
    public void checkWaterCondition() {
        if (getWaterTemperature() >= 15
                && getWaterTemperature() <= 22) {
            System.out.println("Water condition: Normal");
        } else {
            System.out.println("Water condition: Temperature warning!");
        }
    }

    @Override
    public void feedFish() {
        System.out.println("Feeding cold-water fish.");
    }
}

public class AquariumMonitoringDemo {
    public static void main(String[] args) {

        AquariumTank[] tanks = {
                new TropicalTank("Tank A", 26),
                new ColdWaterTank("Tank B", 24)
        };

        for (AquariumTank tank : tanks) {
            System.out.println("Tank: " + tank.getTankName());

            System.out.println("Temperature: "
                    + tank.getWaterTemperature() + "°C");

            tank.checkWaterCondition();

            Feedable feeding = (Feedable) tank;
            feeding.feedFish();

            System.out.println();
        }
    }
}