package OOP;

public class TestCourse {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Introduction to Java Programming");

        // Add three students
        course.addStudent("Alice Johnson");
        course.addStudent("Bob Smith");
        course.addStudent("Carol Williams");

        System.out.println("Initial student list:");
        displayStudents(course);

        // Remove one student
        course.dropStudent("Bob Smith");

        System.out.println("\nAfter dropping Bob Smith:");
        displayStudents(course);

        // Display course information
        System.out.println("\nCourse name: " + course.getCourseName());
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }

    private static void displayStudents(Course course) {
        String[] students = course.getStudents();
        if (students.length == 0) {
            System.out.println("No students enrolled.");
        } else {
            for (int i = 0; i < students.length; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }
}