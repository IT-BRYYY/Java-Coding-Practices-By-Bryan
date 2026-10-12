package OOP;


abstract class SmartAppliance {
    private String brand;

    SmartAppliance(String brand) {
        this.brand = brand;
    }

    public void showBrand() {
        System.out.println("Brand: " + brand);
    }

    public abstract void operate();
}

interface PowerControl {
    void turnOn();

    void turnOff();
}

class RiceCooker extends SmartAppliance implements PowerControl {

    RiceCooker(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Cooking rice...");
    }

    @Override
    public void turnOn() {
        System.out.println("Rice cooker is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Rice cooker is turned off.");
    }
}

public class ApplianceDemo2 {
    public static void main(String[] args) {
        RiceCooker cooker = new RiceCooker("Toshiba");

        cooker.showBrand();
        cooker.turnOn();
        cooker.operate();
        cooker.turnOff();
    }
}