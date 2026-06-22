package OOP;

/**
 * A simple Weather class demonstrating OOP concepts
 */
public class Weather {
    // Private data fields
    private String city;
    private double temperature; // in Celsius
    private double humidity; // percentage
    private String condition; // Sunny, Rainy, Cloudy, etc.
    private double windSpeed; // km/h

    // Static constants
    public static final double MAX_TEMP = 50.0;
    public static final double MIN_TEMP = -30.0;
    private static int totalWeatherRecords = 0;

    // No-arg constructor
    public Weather() {
        this.city = "Unknown";
        this.temperature = 20.0;
        this.humidity = 50.0;
        this.condition = "Clear";
        this.windSpeed = 0.0;
        totalWeatherRecords++;
    }

    // Parameterized constructor
    public Weather(String city, double temperature, double humidity,
                   String condition, double windSpeed) {
        this.city = city;
        setTemperature(temperature);
        setHumidity(humidity);
        this.condition = condition;
        setWindSpeed(windSpeed);
        totalWeatherRecords++;
    }

    // Getters
    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public static int getTotalWeatherRecords() {
        return totalWeatherRecords;
    }

    // Setters with validation
    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        }
    }

    public void setTemperature(double temperature) {
        if (temperature >= MIN_TEMP && temperature <= MAX_TEMP) {
            this.temperature = temperature;
        } else {
            System.out.println("Invalid temperature. Setting to 20.0");
            this.temperature = 20.0;
        }
    }

    public void setHumidity(double humidity) {
        if (humidity >= 0 && humidity <= 100) {
            this.humidity = humidity;
        } else {
            System.out.println("Invalid humidity. Setting to 50.0");
            this.humidity = 50.0;
        }
    }

    public void setCondition(String condition) {
        if (condition != null && !condition.isEmpty()) {
            this.condition = condition;
        }
    }

    public void setWindSpeed(double windSpeed) {
        if (windSpeed >= 0 && windSpeed <= 200) {
            this.windSpeed = windSpeed;
        } else {
            System.out.println("Invalid wind speed. Setting to 0.0");
            this.windSpeed = 0.0;
        }
    }

    // Business methods
    public double toFahrenheit() {
        return (temperature * 9/5) + 32;
    }

    public boolean isHot() {
        return temperature > 30;
    }

    public boolean isCold() {
        return temperature < 10;
    }

    public boolean isWindy() {
        return windSpeed > 30;
    }

    public void displayWeather() {
        System.out.println("Weather in " + city + ":");
        System.out.println("Temperature: " + temperature + "°C (" +
                String.format("%.1f", toFahrenheit()) + "°F)");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Condition: " + condition);
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Status: " + (isHot() ? "Hot" : isCold() ? "Cold" : "Mild"));
    }

    @Override
    public String toString() {
        return String.format("Weather[%s: %.1f°C, %s, %.1f km/h]",
                city, temperature, condition, windSpeed);
    }
}
