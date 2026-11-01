package OOP;

abstract class MeasurableShape {
    public abstract double calculateArea();

    public void displayArea() {
        System.out.printf("Area: %.2f%n", calculateArea());
    }
}

interface Resizable {
    void resize(double factor);
}

class RectangleShape extends MeasurableShape implements Resizable {
    private double width;
    private double height;

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }
}

class CircleShape extends MeasurableShape {
    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeMeasurementDemo {
    public static void main(String[] args) {
        MeasurableShape rectangle = new RectangleShape(5, 4);

        System.out.println("Rectangle:");
        rectangle.displayArea();

        Resizable resizableRectangle = (Resizable) rectangle;
        resizableRectangle.resize(2);

        System.out.println("Rectangle after resizing:");
        rectangle.displayArea();

        MeasurableShape circle = new CircleShape(3);

        System.out.println("Circle:");
        circle.displayArea();
    }
}