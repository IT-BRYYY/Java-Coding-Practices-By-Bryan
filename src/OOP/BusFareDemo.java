package OOP;

abstract class TransportFare {
    private String destination;

    TransportFare(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public abstract double calculateFare();
}

interface DiscountApplicable {
    double applyDiscount(double percentage);
}

class BusFare extends TransportFare
        implements DiscountApplicable {

    private double distanceKm;
    private double ratePerKm;

    BusFare(String destination, double distanceKm,
            double ratePerKm) {
        super(destination);
        this.distanceKm = distanceKm;
        this.ratePerKm = ratePerKm;
    }

    @Override
    public double calculateFare() {
        return distanceKm * ratePerKm;
    }

    @Override
    public double applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException(
                    "Discount must be between 0 and 100."
            );
        }

        return calculateFare()
                - (calculateFare() * percentage / 100);
    }
}

public class BusFareDemo {
    public static void main(String[] args) {
        BusFare fare = new BusFare("Bacoor", 12, 15);

        System.out.println(
                "Destination: " + fare.getDestination()
        );

        System.out.println(
                "Regular fare: PHP " + fare.calculateFare()
        );

        System.out.println(
                "Fare with 10% discount: PHP "
                        + fare.applyDiscount(10)
        );
    }
}