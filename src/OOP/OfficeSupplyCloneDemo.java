package OOP;

abstract class InventoryAsset {
    private String name;

    InventoryAsset(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void displayDetails();
}

class OfficeSupply extends InventoryAsset implements Cloneable {
    private int quantity;

    OfficeSupply(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    void displayDetails() {
        System.out.println(
                getName() + ": " + quantity + " units"
        );
    }

    @Override
    public OfficeSupply clone() {
        try {
            return (OfficeSupply) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

public class OfficeSupplyCloneDemo {
    public static void main(String[] args) {
        OfficeSupply original =
                new OfficeSupply("Notebook", 10);

        OfficeSupply copy = original.clone();
        copy.setQuantity(25);

        System.out.println("Original supply:");
        original.displayDetails();

        System.out.println("Copied supply:");
        copy.displayDetails();
    }
}