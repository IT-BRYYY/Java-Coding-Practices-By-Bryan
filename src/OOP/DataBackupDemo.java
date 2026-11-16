package OOP;

abstract class BackupTask {
    private String backupName;
    private double fileSize;

    public BackupTask(String backupName, double fileSize) {
        this.backupName = backupName;
        this.fileSize = fileSize;
    }

    public String getBackupName() {
        return backupName;
    }

    public double getFileSize() {
        return fileSize;
    }

    public abstract double calculateBackupTime();

    public void displayInfo() {
        System.out.println("Backup Name: " + backupName);
        System.out.println("File Size: " + fileSize + " MB");
    }
}

interface Recoverable {
    void restoreBackup();
}

class LocalBackup extends BackupTask implements Recoverable {

    public LocalBackup(String backupName, double fileSize) {
        super(backupName, fileSize);
    }

    @Override
    public double calculateBackupTime() {
        return getFileSize() / 100;
    }

    @Override
    public void restoreBackup() {
        System.out.println("Restoring backup from local storage...");
        System.out.println("Local backup restored successfully.");
    }
}

class CloudBackup extends BackupTask implements Recoverable {

    public CloudBackup(String backupName, double fileSize) {
        super(backupName, fileSize);
    }

    @Override
    public double calculateBackupTime() {
        return getFileSize() / 25;
    }

    @Override
    public void restoreBackup() {
        System.out.println("Downloading backup from cloud storage...");
        System.out.println("Cloud backup restored successfully.");
    }
}

public class DataBackupDemo {
    public static void main(String[] args) {

        BackupTask[] backups = {
                new LocalBackup("Student Records", 500),
                new CloudBackup("Database Backup", 250)
        };

        for (BackupTask backup : backups) {
            backup.displayInfo();

            System.out.printf("Estimated Backup Time: %.2f seconds%n",
                    backup.calculateBackupTime());

            if (backup instanceof Recoverable) {
                Recoverable recovery = (Recoverable) backup;
                recovery.restoreBackup();
            }

            System.out.println();
        }
    }
}