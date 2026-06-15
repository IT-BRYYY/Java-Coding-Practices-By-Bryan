package OOP;

public class TestCircleWithStaticMembers {
    public static void main(String[]args){
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + CircleWithSM.numberOfObjects);

        CircleWithSM c1 = new CircleWithSM();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithSM.numberOfObjects + ")");

        CircleWithSM c2 = new CircleWithSM();

        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithSM.numberOfObjects + ")");
        System.out.println("c1: radius (" + c2.radius + ") and number of Circle objects (" + CircleWithSM.numberOfObjects + ")");

    }
}
class CircleWithSM{
    double radius;

    static int numberOfObjects = 0;

    CircleWithSM(){
        radius = 1;
        numberOfObjects++;
    }
    CircleWithSM(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
}