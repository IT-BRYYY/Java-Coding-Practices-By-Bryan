package OOP;

public class ParkingPassDemo {
    public static void main(String[] args) {
        getParkingFee motorcycle = new MotorcycleFeeGet();
        getParkingFee car = new CarFeeGet();

        System.out.println("Motorcycle fee: PHP " + motorcycle.getFee());
        System.out.println("Car fee: PHP " + car.getFee());
    }
}

abstract class getParkingFee {
    public abstract int getFee();
}

class MotorcycleFeeGet extends getParkingFee {
    @Override
    public int getFee() {
        return 20;
    }
}

class CarFeeGet extends getParkingFee {
    @Override
    public int getFee() {
        return 50;
    }
}