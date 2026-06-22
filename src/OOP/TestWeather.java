package OOP;

/**
 * Test class for Weather
 */
public class TestWeather {
    public static void main(String[] args) {
        // Create weather objects
        Weather weather1 = new Weather("New York", 25.5, 65.0, "Sunny", 10.5);
        Weather weather2 = new Weather("London", 15.0, 80.0, "Cloudy", 5.0);
        Weather weather3 = new Weather("Dubai", 42.0, 30.0, "Sunny", 15.0);

        // Test validation
        System.out.println("Testing validation:");
        Weather weather4 = new Weather("Invalid", 100.0, 150.0, "Test", 300.0);
        System.out.println();

        // Display weather
        weather1.displayWeather();
        System.out.println();
        weather2.displayWeather();
        System.out.println();
        weather3.displayWeather();
        System.out.println();

        // Test methods
        System.out.println("=== Method Tests ===");
        System.out.println(weather1.getCity() + " hot? " + weather1.isHot());
        System.out.println(weather2.getCity() + " cold? " + weather2.isCold());
        System.out.println(weather3.getCity() + " windy? " + weather3.isWindy());

        // Test toString
        System.out.println("\n" + weather1.toString());
        System.out.println(weather2.toString());

        // Static method
        System.out.println("\nTotal records: " + Weather.getTotalWeatherRecords());
    }
}