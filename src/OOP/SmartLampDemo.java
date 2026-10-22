package OOP;

abstract class HomeDevice {
    private String deviceName;

    HomeDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public abstract void showStatus();
}

interface WiFiCapable {
    void connectToWiFi();
}

interface PowerSwitchable {
    void turnOn();

    void turnOff();
}

class SmartLamp extends HomeDevice
        implements WiFiCapable, PowerSwitchable {

    private boolean isOn;

    SmartLamp(String deviceName) {
        super(deviceName);
        this.isOn = false;
    }

    @Override
    public void connectToWiFi() {
        System.out.println("WiFi connected.");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Lamp turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Lamp turned off.");
    }

    @Override
    public void showStatus() {
        System.out.println(
                getDeviceName() + " status: "
                        + (isOn ? "ON" : "OFF")
        );
    }
}

public class SmartLampDemo {
    public static void main(String[] args) {
        SmartLamp lamp = new SmartLamp("Bedroom Lamp");

        lamp.connectToWiFi();
        lamp.turnOn();
        lamp.showStatus();

        lamp.turnOff();
        lamp.showStatus();
    }
}