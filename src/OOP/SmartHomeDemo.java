
package OOP;

abstract class SmartHomeActivity {
    protected String roomName;

    SmartHomeActivity(String roomName) {
        this.roomName = roomName;
    }

    public abstract void activateDevice();
}

interface TemperatureTrackable {
    double getTemperature();
}

interface ClimateControllable extends TemperatureTrackable {
    void controlTemperature();
}

class SmartThermostat extends SmartHomeActivity
        implements ClimateControllable {

    private double temperature;

    SmartThermostat(String roomName, double temperature) {
        super(roomName);
        this.temperature = temperature;
    }

    @Override
    public void activateDevice() {
        System.out.println(
                "Smart thermostat activated in " + roomName
        );
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void controlTemperature() {
        if (temperature > 28) {
            System.out.println(
                    "Temperature is high. Cooling activated."
            );
        } else if (temperature < 18) {
            System.out.println(
                    "Temperature is low. Heating activated."
            );
        } else {
            System.out.println(
                    "Room temperature is comfortable."
            );
        }
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartThermostat thermostat =
                new SmartThermostat("Living Room", 30);

        SmartHomeActivity activity = thermostat;
        activity.activateDevice();

        ClimateControllable controller = thermostat;

        System.out.println(
                "Current temperature: "
                        + controller.getTemperature()
                        + " C"
        );

        controller.controlTemperature();
    }
}
