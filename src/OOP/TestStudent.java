package OOP;

public class TestStudent {

    public static void main(String[] args) {

        // create object
        Student s1 = new Student("Juan", 18, 80);

        // show info
        s1.showStudent();

        System.out.println("\nChecking result...");
        s1.checkResult();

        System.out.println("\nUpdating score...\n");

        // change score
        s1.updateScore(65);

        // show again
        s1.showStudent();
        s1.checkResult();
    }
}
