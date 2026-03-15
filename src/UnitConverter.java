import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int category;

        System.out.println("================================");
        System.out.println("        Unit Converter App      ");
        System.out.println("================================");

        do {
            // Category menu
            System.out.println("\nSelect a category:");
            System.out.println("  1. Length   (km / miles)");
            System.out.println("  2. Weight   (kg / pounds)");
            System.out.println("  3. Temperature (Celsius / Fahrenheit)");
            System.out.println("  0. Exit");
            System.out.print("Choice: ");
            category = scanner.nextInt();

            if (category == 0) break;

            if (category < 1 || category > 3) {
                System.out.println("  Invalid category. Try again.");
                continue;
            }

            // Direction menu
            System.out.println("\nConvert:");
            switch (category) {
                case 1: System.out.println("  1. km  → miles\n  2. miles → km");   break;
                case 2: System.out.println("  1. kg  → pounds\n  2. pounds → kg"); break;
                case 3: System.out.println("  1. °C  → °F\n  2. °F  → °C");       break;
            }
            System.out.print("Direction (1 or 2): ");
            int dir = scanner.nextInt();

            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            double result = 0;
            String fromUnit = "", toUnit = "";

            if (category == 1 && dir == 1) { result = value * 0.621371; fromUnit = "km";     toUnit = "miles";  }
            if (category == 1 && dir == 2) { result = value * 1.60934;  fromUnit = "miles";  toUnit = "km";     }
            if (category == 2 && dir == 1) { result = value * 2.20462;  fromUnit = "kg";     toUnit = "lbs";    }
            if (category == 2 && dir == 2) { result = value * 0.453592; fromUnit = "lbs";    toUnit = "kg";     }
            if (category == 3 && dir == 1) { result = (value * 9/5) + 32; fromUnit = "°C";    toUnit = "°F";    }
            if (category == 3 && dir == 2) { result = (value - 32) * 5/9; fromUnit = "°F";    toUnit = "°C";    }

            System.out.printf("%n  %.4f %s  =  %.4f %s%n", value, fromUnit, result, toUnit);

        } while (category != 0);

        System.out.println("\nExiting Unit Converter. Goodbye!");
        scanner.close();
    }
}