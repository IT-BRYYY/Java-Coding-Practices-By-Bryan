package OOP;

abstract class MediaDeviceBase {
    private String deviceName;

    MediaDeviceBase(String deviceName) {
        this.deviceName = deviceName;
    }

    public void showDeviceName() {
        System.out.println("Device: " + deviceName);
    }

    public abstract void playAudio();
}

interface BluetoothReady {
    void connectBluetooth();
}

interface Rechargeable {
    void chargeBattery();
}

class PortableSpeaker extends MediaDeviceBase
        implements BluetoothReady, Rechargeable {

    PortableSpeaker(String deviceName) {
        super(deviceName);
    }

    @Override
    public void playAudio() {
        System.out.println("Playing music...");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Bluetooth connected.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Speaker battery is charging.");
    }
}

public class PortableSpeakerDemo {
    public static void main(String[] args) {
        PortableSpeaker speaker =
                new PortableSpeaker("JBL Speaker");

        speaker.showDeviceName();
        speaker.connectBluetooth();
        speaker.playAudio();
        speaker.chargeBattery();
    }
}