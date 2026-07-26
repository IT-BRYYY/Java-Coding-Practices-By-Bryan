package OOP;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());  // This will use the Student class from Student.java
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}