package OOP;

abstract class HotelRoom {
    private String roomNumber;
    private double nightlyRate;

    public HotelRoom(String roomNumber, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public abstract double calculateTotal(int nights);
}

interface RoomService {
    void requestRoomService(String service);
}

class StandardRoom extends HotelRoom implements RoomService {

    public StandardRoom(String roomNumber, double nightlyRate) {
        super(roomNumber, nightlyRate);
    }

    @Override
    public double calculateTotal(int nights) {
        return getNightlyRate() * nights;
    }

    @Override
    public void requestRoomService(String service) {
        System.out.println("Standard room service requested: " + service);
    }
}

class DeluxeRoom extends HotelRoom implements RoomService {

    public DeluxeRoom(String roomNumber, double nightlyRate) {
        super(roomNumber, nightlyRate);
    }

    @Override
    public double calculateTotal(int nights) {
        return (getNightlyRate() * nights) + 500;
    }

    @Override
    public void requestRoomService(String service) {
        System.out.println("Deluxe room service requested: " + service);
    }
}

public class HotelBookingDemo {
    public static void main(String[] args) {
        HotelRoom room = new StandardRoom("101", 1200);

        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Three-night cost: PHP "
                + room.calculateTotal(3));

        RoomService service = (RoomService) room;
        service.requestRoomService("Extra towels");

        System.out.println();

        room = new DeluxeRoom("205", 2500);

        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Three-night cost: PHP "
                + room.calculateTotal(3));

        service = (RoomService) room;
        service.requestRoomService("Breakfast");
    }
}