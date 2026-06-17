package OOP;

public class TestPass {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        printCircle(myCircle);
    }

    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("The area of circle of radius "
                + c.getRadius() + " is " + c.getArea());
    }
}