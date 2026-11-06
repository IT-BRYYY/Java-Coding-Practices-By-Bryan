package OOP;

abstract class WeatherStation {
    private String location;
    private double temperature;

    public WeatherStation(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public double getTemperature() {
        return temperature;
    }

    public abstract void displayWeather();
}

interface Alertable {
    void issueWeatherAlert();
}

class StormStation extends WeatherStation implements Alertable {

    public StormStation(String location, double temperature) {
        super(location, temperature);
    }

    @Override
    public void displayWeather() {
        System.out.println("Location: " + getLocation());
        System.out.println("Temperature: " + getTemperature() + "°C");
        System.out.println("Weather: Heavy rain and strong winds.");
    }

    @Override
    public void issueWeatherAlert() {
        System.out.println("ALERT: Storm warning issued.");
    }
}

class SunnyStation extends WeatherStation {

    public SunnyStation(String location, double temperature) {
        super(location, temperature);
    }

    @Override
    public void displayWeather() {
        System.out.println("Location: " + getLocation());
        System.out.println("Temperature: " + getTemperature() + "°C");
        System.out.println("Weather: Sunny and clear.");
    }
}

public class WeatherStationDemo {
    public static void main(String[] args) {

        WeatherStation[] stations = {
                new StormStation("Manila", 28.5),
                new SunnyStation("Batangas", 32.0)
        };

        for (WeatherStation station : stations) {
            station.displayWeather();
            System.out.println();
        }

        Alertable alert = (Alertable) stations[0];
        alert.issueWeatherAlert();
    }
}