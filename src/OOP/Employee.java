package OOP;

public class Employee {
    // Data fields (instance variables) - private for encapsulation
    private String employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    private int yearsOfExperience;
    private String email;

    // Static constants
    public static final double MINIMUM_WAGE = 15.00; // per hour equivalent
    public static final double MAX_SALARY = 500000.00;
    private static int totalEmployees = 0;

    // No-arg constructor
    public Employee() {
        this.employeeId = "EMP000";
        this.firstName = "Unknown";
        this.lastName = "Employee";
        this.department = "Unassigned";
        this.salary = 30000.00;
        this.yearsOfExperience = 0;
        this.email = "unknown@company.com";
        totalEmployees++;
    }

    // Parameterized constructor
    public Employee(String employeeId, String firstName, String lastName,
                    String department, double salary, int yearsOfExperience) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        setSalary(salary); // Using setter for validation
        setYearsOfExperience(yearsOfExperience);
        generateEmail();
        totalEmployees++;
    }

    // Getter methods (accessors)
    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getEmail() {
        return email;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Setter methods (mutators) with validation
    public void setEmployeeId(String employeeId) {
        if (employeeId != null && !employeeId.isEmpty()) {
            this.employeeId = employeeId;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
            generateEmail();
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
            generateEmail();
        }
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        }
    }

    public void setSalary(double salary) {
        if (salary >= MINIMUM_WAGE * 2080) { // Assuming 2080 work hours per year
            this.salary = Math.min(salary, MAX_SALARY);
        } else {
            System.out.println("Salary too low. Setting to minimum wage equivalent.");
            this.salary = MINIMUM_WAGE * 2080;
        }
    }

    public void setYearsOfExperience(int years) {
        if (years >= 0 && years <= 50) {
            this.yearsOfExperience = years;
        } else {
            System.out.println("Invalid years of experience. Setting to 0.");
            this.yearsOfExperience = 0;
        }
    }

    // Helper method to generate email
    private void generateEmail() {
        if (firstName != null && lastName != null) {
            this.email = (firstName.toLowerCase() + "." + lastName.toLowerCase() +
                    "@company.com").replace(" ", "");
        }
    }

    // Business methods
    public void giveRaise(double percentage) {
        if (percentage > 0 && percentage <= 20) {
            double raiseAmount = salary * (percentage / 100);
            double newSalary = salary + raiseAmount;
            if (newSalary <= MAX_SALARY) {
                salary = newSalary;
                System.out.println("Raise of " + percentage + "% given. New salary: $" + salary);
            } else {
                System.out.println("Cannot give raise. Would exceed maximum salary.");
            }
        } else {
            System.out.println("Invalid raise percentage. Must be between 0 and 20.");
        }
    }

    public double calculateBonus() {
        // Bonus based on years of experience
        if (yearsOfExperience >= 10) {
            return salary * 0.10; // 10% bonus
        } else if (yearsOfExperience >= 5) {
            return salary * 0.05; // 5% bonus
        } else {
            return salary * 0.02; // 2% bonus
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("===== Employee Information =====");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Email: " + email);
        System.out.println("Bonus: $" + String.format("%.2f", calculateBonus()));
        System.out.println("=================================");
    }

    @Override
    public String toString() {
        return String.format("Employee[%s: %s %s, %s, $%.2f, %d years]",
                employeeId, firstName, lastName,
                department, salary, yearsOfExperience);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeId.equals(employee.employeeId);
    }
}