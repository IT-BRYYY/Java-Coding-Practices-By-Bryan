package OOP;

public class TestPersonEmail {
    public static void main(String[] args) {
        // Create person using full constructor
        PersonEmail p1 = new PersonEmail("John Doe", 25, "john.doe@email.com");
        p1.displayInfo();

        System.out.println();

        // Test setters
        System.out.println("=== Testing Setters ===");
        p1.setAge(26);
        p1.setEmail("john.new@email.com");
        p1.setName("John Smith");

        System.out.println("\nUpdated Person:");
        System.out.println(p1.toString());
    }
}