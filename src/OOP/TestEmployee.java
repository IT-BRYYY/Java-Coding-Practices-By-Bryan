package OOP;

/**
 * Test class to demonstrate the Employee class functionality
 */
public class TestEmployee {
    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE DEMO ===\n");

        // Create employees using different constructors
        Employee emp1 = new Employee();
        emp1.setEmployeeId("EMP001");
        emp1.setFirstName("John");
        emp1.setLastName("Smith");
        emp1.setDepartment("IT");
        emp1.setSalary(65000.00);
        emp1.setYearsOfExperience(8);

        Employee emp2 = new Employee("EMP002", "Sarah", "Johnson",
                "Marketing", 72000.00, 12);

        Employee emp3 = new Employee("EMP003", "Mike", "Brown",
                "Sales", 55000.00, 3);

        // Test validation
        System.out.println("Testing validation:");
        Employee emp4 = new Employee("EMP004", "Invalid", "Employee",
                "HR", -1000.00, 60);
        System.out.println();

        // Display employee information
        System.out.println("Employee 1 (Default constructor then set):");
        emp1.displayEmployeeInfo();
        System.out.println();

        System.out.println("Employee 2 (Parameterized constructor):");
        emp2.displayEmployeeInfo();
        System.out.println();

        System.out.println("Employee 3:");
        emp3.displayEmployeeInfo();
        System.out.println();

        // Test business methods
        System.out.println("=== Business Methods Test ===");
        System.out.println("Employee 2 bonus: $" + emp2.calculateBonus());

        System.out.println("\nGiving Employee 2 a 10% raise:");
        emp2.giveRaise(10);
        System.out.println("New salary: $" + emp2.getSalary());

        System.out.println("\nGiving Employee 2 a 25% raise (invalid):");
        emp2.giveRaise(25);

        // Test toString
        System.out.println("\n=== toString Output ===");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        // Test equals
        System.out.println("\n=== equals Method Test ===");
        Employee emp1Copy = new Employee("EMP001", "John", "Smith",
                "IT", 65000.00, 8);
        System.out.println("emp1 equals emp1Copy: " + emp1.equals(emp1Copy));
        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        // Static method
        System.out.println("\nTotal employees created: " + Employee.getTotalEmployees());
    }
}