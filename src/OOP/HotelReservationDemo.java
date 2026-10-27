package OOP;

abstract class HotelAccommodation {
    protected String roomType;
    protected double pricePerNight;

    HotelAccommodation(String roomType, double pricePerNight) {
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public abstract double calculateTotal(int nights);
}

interface RoomReservable {
    void reserveRoom();
}

class DeluxeHotelRoom extends HotelAccommodation
        implements RoomReservable {

    DeluxeHotelRoom(String roomType, double pricePerNight) {
        super(roomType, pricePerNight);
    }

    @Override
    public double calculateTotal(int nights) {
        return pricePerNight * nights;
    }

    @Override
    public void reserveRoom() {
        System.out.println(roomType + " successfully reserved.");
    }
}

public class HotelReservationDemo {
    public static void main(String[] args) {
        DeluxeHotelRoom room =
                new DeluxeHotelRoom("Deluxe Room", 2500);

        room.reserveRoom();

        System.out.println("Room Type: " + room.roomType);
        System.out.println("Total Cost: PHP "
                + room.calculateTotal(3));
    }
}