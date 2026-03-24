public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double tuitionFourYears = 0;
        double tuitionRate = 0.06;

        // Compound 10 times to get tuition at year 10
        for (int i = 0; i < 10; i++) {
            tuition += tuition * tuitionRate;
        }

        System.out.printf("Tuition after 10 years: $%.0f%n", tuition);

        // Sum tuition for years 11, 12, 13, 14 (4 years after year 10)
        for (int j = 0; j < 4; j++) {
            tuition += tuition * tuitionRate;
            tuitionFourYears += tuition;
        }

        System.out.printf("Total cost of four years tuition: $%.0f%n", tuitionFourYears);
    }
}