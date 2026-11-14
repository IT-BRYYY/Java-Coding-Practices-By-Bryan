package OOP;

abstract class WasteMaterial {
    private String materialName;
    private double weight;

    public WasteMaterial(String materialName, double weight) {
        this.materialName = materialName;
        this.weight = weight;
    }

    public String getMaterialName() {
        return materialName;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double calculateRecyclingValue();

    public void displayInformation() {
        System.out.println("Material: " + materialName);
        System.out.println("Weight: " + weight + " kg");
    }
}

interface Recyclable {
    boolean canRecycle();

    void processRecycling();
}

class PlasticWaste extends WasteMaterial implements Recyclable {

    public PlasticWaste(String materialName, double weight) {
        super(materialName, weight);
    }

    @Override
    public double calculateRecyclingValue() {
        return getWeight() * 8;
    }

    @Override
    public boolean canRecycle() {
        return getWeight() > 0;
    }

    @Override
    public void processRecycling() {
        if (canRecycle()) {
            System.out.println("Plastic waste sent for recycling.");
        } else {
            System.out.println("Invalid plastic waste weight.");
        }
    }
}

class MetalWaste extends WasteMaterial implements Recyclable {

    public MetalWaste(String materialName, double weight) {
        super(materialName, weight);
    }

    @Override
    public double calculateRecyclingValue() {
        return getWeight() * 25;
    }

    @Override
    public boolean canRecycle() {
        return getWeight() > 0;
    }

    @Override
    public void processRecycling() {
        if (canRecycle()) {
            System.out.println("Metal waste sent for recycling.");
        } else {
            System.out.println("Invalid metal waste weight.");
        }
    }
}

public class RecyclingManagementDemo {
    public static void main(String[] args) {

        WasteMaterial[] materials = {
                new PlasticWaste("Plastic Bottles", 5),
                new MetalWaste("Aluminum Cans", 3)
        };

        for (WasteMaterial material : materials) {
            material.displayInformation();

            System.out.printf("Recycling Value: PHP %.2f%n",
                    material.calculateRecyclingValue());

            if (material instanceof Recyclable) {
                Recyclable recyclable = (Recyclable) material;

                System.out.println("Recyclable: "
                        + recyclable.canRecycle());

                recyclable.processRecycling();
            }

            System.out.println();
        }
    }
}