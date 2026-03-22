public class ConversionTables {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────
        // 5.3 Celsius to Fahrenheit
        // ─────────────────────────────────────────────
        System.out.println("===== Celsius to Fahrenheit =====");
        System.out.printf("%-10s %s%n", "Celsius", "Fahrenheit");
        for (int c = 0; c <= 100; c += 2) {
            double f = c * 9.0 / 5 + 32;
            System.out.printf("%-10d %.1f%n", c, f);
        }

        System.out.println();

        // ─────────────────────────────────────────────
        // 5.4 Inches to Centimetres
        // ─────────────────────────────────────────────
        System.out.println("===== Inches to Centimetres =====");
        System.out.printf("%-10s %s%n", "Inches", "Centimetres");
        for (int inch = 1; inch <= 10; inch++) {
            double cm = inch * 2.54;
            System.out.printf("%-10d %.2f%n", inch, cm);
        }

        System.out.println();

        // ─────────────────────────────────────────────
        // 5.5 Celsius↔Fahrenheit side by side
        // ─────────────────────────────────────────────
        System.out.println("===== Celsius to Fahrenheit | Fahrenheit to Celsius =====");
        System.out.printf("%-10s %-14s | %-12s %s%n",
                "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");

        int cel = 0;
        int fahr = 20;
        while (cel <= 100) {
            double cToF = cel * 9.0 / 5 + 32;
            double fToC = (fahr - 32) * 5.0 / 9;
            System.out.printf("%-10d %-14.3f | %-12d %.3f%n", cel, cToF, fahr, fToC);
            cel += 2;
            fahr += 5;
        }

        System.out.println();

        // ─────────────────────────────────────────────
        // 5.6 Ping↔Square Meter side by side
        // ─────────────────────────────────────────────
        System.out.println("===== Ping to Square Meter | Square Meter to Ping =====");
        System.out.printf("%-8s %-14s | %-14s %s%n",
                "Ping", "Square Meter", "Square Meter", "Ping");

        int ping = 10;
        int sqm = 30;
        while (ping <= 80) {
            double pingToSqm = ping * 3.305;
            double sqmToPing = sqm / 3.305;
            System.out.printf("%-8d %-14.3f | %-14d %.3f%n", ping, pingToSqm, sqm, sqmToPing);
            ping += 5;
            sqm += 5;
        }
    }
}