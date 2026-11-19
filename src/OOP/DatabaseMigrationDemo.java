package OOP;

abstract class DatabaseMigration {
    private String version;
    private String description;
    private boolean applied;

    public DatabaseMigration(String version, String description) {
        this.version = version;
        this.description = description;
        this.applied = false;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public boolean isApplied () {
        return applied;
    }

    protected void markApplied(){
        applied = true;
    }

    public abstract void migrate();

    public void displayInfo(){
        System.out.println("Version: " + version);
        System.out.println("Description: " + description);
        System.out.println("Applied: " + applied);
    }
}

interface Rollbackable {
    void rollback();
}

class CreateTableMigration extends DatabaseMigration implements Rollbackable{
    public CreateTableMigration(String version, String description){
        super(version, description);
    }

    @Override
    public void migrate(){
        if(isApplied()) {
            System.out.println("Migration already applied.");
            return;
        }

        System.out.println("Creating customers table...");
        markApplied();
        System.out.println("Table created successfully.");
    }

    @Override
    public void rollback() {
        if(isApplied()) {
            System.out.println("Dropping customers table...");
            System.out.println("Rollback completed.");
        }else {
            System.out.println("Nothing to rollback.");
        }
    }
}

class AddColumnMigration extends DatabaseMigration {
    public AddColumnMigration(String version, String description){
        super(version, description);
    }

    @Override
    public void migrate(){
        if(isApplied()){
            System.out.println("Migration already applied");
            return;
        }

        System.out.println("Adding phone_number column...");
        markApplied();
        System.out.println("Column added successfully.");
    }
}

public class DatabaseMigrationDemo {
    public static void main(String[]args) {

        DatabaseMigration[] migrations = {
                new CreateTableMigration("V1", "Create customers table"),
                new AddColumnMigration("V2", "Add customer phone number")
        };

        for(DatabaseMigration migration : migrations){
            migration.displayInfo();

            migration.migrate();

            System.out.println("Status after migration:");
            migration.displayInfo();

            System.out.println();

        }
        Rollbackable rollback = (Rollbackable) migrations[0];

        rollback.rollback();
    }
}