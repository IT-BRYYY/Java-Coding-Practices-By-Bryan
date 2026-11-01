package OOP;

import java.util.Arrays;

abstract class CompanyEmployee
        implements Comparable<CompanyEmployee> {

    private String name;

    CompanyEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();

    @Override
    public int compareTo(CompanyEmployee other) {
        return Double.compare(
                this.getSalary(),
                other.getSalary()
        );
    }
}

class FullTimeEmployee extends CompanyEmployee {
    private double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

public class EmployeeRankingDemo {
    public static void main(String[] args) {
        CompanyEmployee[] employees = {
                new FullTimeEmployee("Alex", 25000),
                new FullTimeEmployee("Maria", 35000),
                new FullTimeEmployee("John", 30000)
        };

        Arrays.sort(employees);

        System.out.println("Employees by salary:");

        for (CompanyEmployee employee : employees) {
            System.out.printf(
                    "%s - PHP %.2f%n",
                    employee.getName(),
                    employee.getSalary()
            );
        }
    }
}