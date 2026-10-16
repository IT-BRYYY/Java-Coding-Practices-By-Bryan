package OOP;

abstract class Ch13Employee {
    private String name;

    Ch13Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}

class Ch13RegularEmployee extends Ch13Employee
        implements Comparable<Ch13RegularEmployee> {

    private double monthlySalary;

    Ch13RegularEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public int compareTo(Ch13RegularEmployee other) {
        return Double.compare(
                this.calculateSalary(),
                other.calculateSalary()
        );
    }
}

public class Ch13EmployeeComparisonDemo {
    public static void main(String[] args) {
        Ch13RegularEmployee employee1 =
                new Ch13RegularEmployee("Alex", 25000);

        Ch13RegularEmployee employee2 =
                new Ch13RegularEmployee("Jordan", 30000);

        System.out.println(
                employee1.getName() + ": PHP "
                        + employee1.calculateSalary()
        );

        System.out.println(
                employee2.getName() + ": PHP "
                        + employee2.calculateSalary()
        );

        int result = employee1.compareTo(employee2);

        if (result < 0) {
            System.out.println(
                    employee2.getName()
                            + " has the higher salary."
            );
        } else if (result > 0) {
            System.out.println(
                    employee1.getName()
                            + " has the higher salary."
            );
        } else {
            System.out.println(
                    "Both employees have equal salaries."
            );
        }
    }
}