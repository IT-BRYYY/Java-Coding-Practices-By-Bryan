package OOP;

abstract class BackupItem {
    private String itemName;

    BackupItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public abstract void displayDetails();
}

class SettingsBackup extends BackupItem
        implements Cloneable {

    private int volume;

    SettingsBackup(String itemName, int volume) {
        super(itemName);
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                getItemName() + " volume: " + volume
        );
    }

    @Override
    public SettingsBackup clone() {
        try {
            return (SettingsBackup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

public class SettingsBackupDemo {
    public static void main(String[] args) {
        SettingsBackup original =
                new SettingsBackup("Phone Settings", 35);

        SettingsBackup copy = original.clone();

        copy.setVolume(80);

        System.out.println("Original settings:");
        original.displayDetails();

        System.out.println("Copied settings:");
        copy.displayDetails();
    }
}