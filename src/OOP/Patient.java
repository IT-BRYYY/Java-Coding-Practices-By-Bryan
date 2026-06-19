package OOP;

class Patient {

    private String name;
    private int age;
    private String condition;
    private static int count = 0;

    public Patient() {
        this("Unknown", 0, "Not Diagnosed");
    }

    public Patient(String name, int age, String condition) {
        this.name = name;
        this.age = age;
        this.condition = condition;
        count++;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }
    public static int getCount() { return count; }

    @Override
    public String toString() {
        return "Patient: " + name + " | Age: " + age + " | Condition: " + condition;
    }
}