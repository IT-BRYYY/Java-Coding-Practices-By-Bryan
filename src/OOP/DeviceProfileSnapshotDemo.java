package OOP;

abstract class DeviceProfileBase {
    private String owner;

    DeviceProfileBase(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public abstract void displayProfile();
}

class DeviceProfileRecord extends DeviceProfileBase
        implements Cloneable {

    private String deviceName;
    private int volume;

    DeviceProfileRecord(
            String owner, String deviceName, int volume) {
        super(owner);
        this.deviceName = deviceName;
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void displayProfile() {
        System.out.println("Owner: " + getOwner());
        System.out.println("Device: " + deviceName);
        System.out.println("Volume: " + volume);
    }

    @Override
    public DeviceProfileRecord clone() {
        try {
            return (DeviceProfileRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

public class DeviceProfileSnapshotDemo {
    public static void main(String[] args) {
        DeviceProfileRecord original =
                new DeviceProfileRecord("Alex", "Laptop", 50);

        DeviceProfileRecord backup = original.clone();
        backup.setVolume(80);

        System.out.println("Original profile:");
        original.displayProfile();

        System.out.println("\nBackup profile:");
        backup.displayProfile();
    }
}