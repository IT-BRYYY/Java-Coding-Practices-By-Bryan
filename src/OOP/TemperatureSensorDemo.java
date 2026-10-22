package OOP;

abstract class EnvironmentalSensor {
    private String location;

    EnvironmentalSensor(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public abstract double readValue();
}

interface SensorCalibratable {
    void calibrate(double adjustment);
}

class RoomTemperatureSensor extends EnvironmentalSensor
        implements SensorCalibratable {

    private double temperature;

    RoomTemperatureSensor(String location, double temperature) {
        super(location);
        this.temperature = temperature;
    }

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public void calibrate(double adjustment) {
        temperature += adjustment;
        System.out.println("Sensor calibrated.");
    }
}

public class TemperatureSensorDemo {
    public static void main(String[] args) {
        RoomTemperatureSensor sensor =
                new RoomTemperatureSensor("Living Room", 26.5);

        System.out.println(
                "Location: " + sensor.getLocation()
        );

        System.out.println(
                "Temperature: " + sensor.readValue() + " C"
        );

        sensor.calibrate(-1.5);

        System.out.println(
                "Updated temperature: "
                        + sensor.readValue() + " C"
        );
    }
}