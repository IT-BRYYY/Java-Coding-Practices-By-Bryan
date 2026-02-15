package Conversion_Formatting;

import java.util.*;

public class WindChillTemperature {
    public static void main(String[] args) {
        final double MIN_TEMP = -58;
        final double MAX_TEMP = 41;
        final double MIN_WIND_SPEED = 2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Conversion_Formatting.Fahrenheit between -58F and 41F: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        if (temperature < MIN_TEMP || temperature > MAX_TEMP) {
            System.out.println("Invalid temperature. It must be between -58°F and 41°F.");
            return;
        }

        if (windSpeed < MIN_WIND_SPEED) {
            System.out.println("Invalid wind speed. It must be greater than or equal to 2 mph.");
            return;
        }

        double windChill = 35.74
                + 0.6215 * temperature
                - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.printf("\nThe wind chill index is %.5f", windChill);
    }
}
