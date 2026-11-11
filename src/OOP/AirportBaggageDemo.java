package OOP;

abstract class AirportBaggage {
    private String passengerName;
    private double weight;

    public AirportBaggage(String passengerName, double weight) {
        this.passengerName = passengerName;
        this.weight = weight;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double calculateBaggageFee();
}

interface BaggageTrackable {
    void trackBaggage();
}

class DomesticBaggage extends AirportBaggage
        implements BaggageTrackable {

    public DomesticBaggage(String passengerName, double weight) {
        super(passengerName, weight);
    }

    @Override
    public double calculateBaggageFee() {
        if (getWeight() <= 20) {
            return 0;
        }

        return (getWeight() - 20) * 100;
    }

    @Override
    public void trackBaggage() {
        System.out.println("Domestic baggage is being loaded.");
    }
}

class InternationalBaggage extends AirportBaggage
        implements BaggageTrackable {

    public InternationalBaggage(String passengerName, double weight) {
        super(passengerName, weight);
    }

    @Override
    public double calculateBaggageFee() {
        if (getWeight() <= 25) {
            return 0;
        }

        return (getWeight() - 25) * 200;
    }

    @Override
    public void trackBaggage() {
        System.out.println("International baggage is in transit.");
    }
}

public class AirportBaggageDemo {
    public static void main(String[] args) {

        AirportBaggage[] baggageList = {
                new DomesticBaggage("Alex", 23),
                new InternationalBaggage("Maria", 30)
        };

        for (AirportBaggage baggage : baggageList) {
            System.out.println("Passenger: "
                    + baggage.getPassengerName());

            System.out.println("Weight: "
                    + baggage.getWeight() + " kg");

            System.out.println("Baggage Fee: PHP "
                    + baggage.calculateBaggageFee());

            BaggageTrackable tracking = (BaggageTrackable) baggage;
            tracking.trackBaggage();

            System.out.println();
        }
    }
}