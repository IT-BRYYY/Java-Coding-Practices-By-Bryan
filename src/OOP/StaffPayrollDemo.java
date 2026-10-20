package OOP;

abstract class PayrollStaff {
    protected String name;
    protected double baseSalary;

    PayrollStaff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculatePay();
}

interface BonusEligible {
    double calculateBonus(double percentage);
}

class OfficeStaff extends PayrollStaff
        implements BonusEligible {

    OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculatePay() {
        return baseSalary;
    }

    @Override
    public double calculateBonus(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException(
                    "Invalid bonus percentage."
            );
        }

        return baseSalary * percentage / 100;
    }
}

public class StaffPayrollDemo {
    public static void main(String[] args) {
        OfficeStaff staff =
                new OfficeStaff("Alex", 25000);

        System.out.println("Employee: " + staff.name);

        System.out.println(
                "Monthly salary: PHP "
                        + staff.calculatePay()
        );

        System.out.println(
                "Bonus: PHP "
                        + staff.calculateBonus(10)
        );
    }
}