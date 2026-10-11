package OOP.inheritance;

abstract class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void displayRole();
}

class Student extends Person implements Cloneable {

    Student(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println(getName() + " is a student.");
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

public class StudentCloneDemo {
    public static void main(String[] args) {
        Student original = new Student("Alex");

        Student copy = original.clone();
        copy.setName("Jordan");

        System.out.println("Original:");
        original.displayRole();

        System.out.println("Cloned object:");
        copy.displayRole();
    }
}