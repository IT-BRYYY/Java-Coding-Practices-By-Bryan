package RealWorld_Projects.HRMS;

public class TestHRMS {
    public static void main(String[] args) {
        // Test Person
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@email.com");

        // Test Student
        Student student = new Student("Jane Smith", "456 Oak Ave", "555-5678",
                "jane@email.com", Student.JUNIOR);

        // Test Employee
        MyDate hireDate = new MyDate(2020, 5, 15);
        Employee employee = new Employee("Bob Johnson", "789 Pine Rd", "555-9012",
                "bob@email.com", "Office 101", 50000, hireDate);

        // Test Faculty
        Faculty faculty = new Faculty("Dr. Sarah Lee", "321 Elm St", "555-3456",
                "sarah@email.com", "Office 202", 75000,
                new MyDate(2018, 8, 20), "Mon-Wed 2-4 PM", "Professor");

        // Test Staff
        Staff staff = new Staff("Mike Wilson", "654 Maple Dr", "555-7890",
                "mike@email.com", "Office 303", 45000,
                new MyDate(2021, 1, 10), "Administrative Assistant");

        // Display all toString() methods
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

        // Display hire dates
        System.out.println("\n--- Hire Dates ---");
        System.out.println("Employee hired: " + employee.getDateHired());
        System.out.println("Faculty hired: " + faculty.getDateHired());
        System.out.println("Staff hired: " + staff.getDateHired());
    }
}