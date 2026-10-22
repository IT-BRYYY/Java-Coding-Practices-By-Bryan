package OOP;

abstract class EventPass {
    private String eventName;
    protected double basePrice;

    EventPass(String eventName, double basePrice) {
        this.eventName = eventName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public abstract double calculatePrice();
}

interface TicketCancellable {
    void cancelTicket();
}

class ConcertPass extends EventPass
        implements TicketCancellable {

    private double serviceFee;

    ConcertPass(String eventName, double basePrice,
                double serviceFee) {
        super(eventName, basePrice);
        this.serviceFee = serviceFee;
    }

    @Override
    public double calculatePrice() {
        return basePrice + serviceFee;
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket cancellation requested.");
    }
}

public class TicketBookingDemo {
    public static void main(String[] args) {
        ConcertPass ticket =
                new ConcertPass("Music Festival", 1200, 50);

        System.out.println(
                "Event: " + ticket.getEventName()
        );

        System.out.println(
                "Ticket price: PHP " + ticket.calculatePrice()
        );

        ticket.cancelTicket();
    }
}