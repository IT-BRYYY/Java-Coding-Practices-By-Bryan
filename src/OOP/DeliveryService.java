package OOP;

interface Trackable {
    void trackPackage();
}

interface Deliverable extends Trackable {
    void deliverPackage();
}

abstract class DeliveryTask {
    private String destination;

    DeliveryTask(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    abstract double calculateFee();
}

class LocalParcel extends DeliveryTask
        implements Deliverable {

    private double weight;

    LocalParcel(String destination, double weight) {
        super(destination);
        this.weight = weight;
    }

    @Override
    double calculateFee() {
        return 50 + (weight * 10);
    }

    @Override
    public void trackPackage() {
        System.out.println("Package is being tracked.");
    }

    @Override
    public void deliverPackage() {
        System.out.println(
                "Delivering package to " + getDestination()
        );
    }
}

class DeliveryServiceDemo {
    public static void main(String[] args) {
        LocalParcel parcel =
                new LocalParcel("Bacoor, Cavite", 2);

        parcel.trackPackage();
        parcel.deliverPackage();

        System.out.println(
                "Delivery fee: PHP " + parcel.calculateFee()
        );
    }
}