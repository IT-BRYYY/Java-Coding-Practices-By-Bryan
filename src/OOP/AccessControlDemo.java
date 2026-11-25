package OOP;

abstract class SystemUser{
    private String username;

    public SystemUser(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public abstract String getRole();

    public abstract boolean hasPermission(String permission);

    public void displayInfo(){
        System.out.println("Username: " + username);
        System.out.println("Role: " + getRole());
    }
}

interface AuditableUser {
    void recordActivity(String activity);
}

class AdministratorUser extends SystemUser implements AuditableUser {
    public AdministratorUser(String username) {
        super(username);
    }

    @Override
    public String getRole(){
        return "ADMIN";
    }

    @Override
    public boolean hasPermission(String permission){
        return permission.equals("READ")
                || permission.equals("WRITE")
                || permission.equals("DELETE");
    }

    @Override
    public void recordActivity(String activity){
        System.out.println("Audit Log: " + getUsername() + " performed " + activity);
    }
}

class StandardSystemUser extends SystemUser {
    public StandardSystemUser(String username) {
        super(username);
    }

    @Override
    public String getRole(){
        return "USER";
    }

    @Override
    public boolean hasPermission(String permission) {
        return permission.equals("READ");
    }
}
public class AccessControlDemo {
    public static void main(String[]args){

        SystemUser[] users = {
                new AdministratorUser("admin01"),
                new StandardSystemUser("user01")
        };

        for(SystemUser user : users) {
            user.displayInfo();

            System.out.println("Can Read: " + user.hasPermission("READ"));
            System.out.println("Can Write: " + user.hasPermission("WRITE"));
            System.out.println("Can Delete: " + user.hasPermission("DELETE"));
        if(user instanceof AuditableUser && user.hasPermission("DELETE")) {

            AuditableUser audit = (AuditableUser) user;
            audit.recordActivity("DELETE");
        }

            System.out.println();
        }
    }
}