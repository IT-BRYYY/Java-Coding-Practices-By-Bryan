package OOP;

import java.util.Arrays;

abstract class ComputingDevice
        implements Comparable<ComputingDevice> {

    private String model;

    ComputingDevice(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract int getRamSize();

    @Override
    public int compareTo(ComputingDevice other) {
        return Integer.compare(
                other.getRamSize(),
                this.getRamSize()
        );
    }
}

class LaptopSpecification extends ComputingDevice {
    private int ramSize;

    LaptopSpecification(String model, int ramSize) {
        super(model);
        this.ramSize = ramSize;
    }

    @Override
    public int getRamSize() {
        return ramSize;
    }
}

public class LaptopComparisonDemo {
    public static void main(String[] args) {
        ComputingDevice[] laptops = {
                new LaptopSpecification("Acer Aspire", 16),
                new LaptopSpecification("Lenovo IdeaPad", 8),
                new LaptopSpecification("ASUS TUF", 32)
        };

        Arrays.sort(laptops);

        System.out.println("Laptops sorted by RAM:");

        for (ComputingDevice laptop : laptops) {
            System.out.println(
                    laptop.getModel() + " - "
                            + laptop.getRamSize() + " GB"
            );
        }
    }
}