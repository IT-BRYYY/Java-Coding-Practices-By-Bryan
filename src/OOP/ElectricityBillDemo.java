package OOP;

abstract class UtilityBill {
    protected String customerName;
    protected double unitsConsumed;

    UtilityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public abstract double calculateBill();
}

interface BillDiscountable {
    double applyDiscount(double percentage);
}

class ElectricityBill extends UtilityBill
        implements BillDiscountable {

    private double ratePerUnit;

    ElectricityBill(String customerName,
                    double unitsConsumed,
                    double ratePerUnit) {
        super(customerName, unitsConsumed);
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    public double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    @Override
    public double applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException(
                    "Invalid discount percentage."
            );
        }

        return calculateBill() * (1 - percentage / 100);
    }
}

public class ElectricityBillDemo {
    public static void main(String[] args) {
        ElectricityBill bill =
                new ElectricityBill("Alex", 150, 12);

        System.out.println("Customer: " + bill.customerName);

        System.out.println(
                "Electricity Bill: PHP " + bill.calculateBill()
        );

        System.out.println(
                "Discounted Bill: PHP " + bill.applyDiscount(10)
        );
    }
}