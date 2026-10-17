package OOP;

abstract class Ch13ComparableShape
        implements Comparable<Ch13ComparableShape> {

    public abstract double getArea();

    @Override
    public int compareTo(Ch13ComparableShape other) {
        return Double.compare(this.getArea(), other.getArea());
    }
}

class Ch13CircleShape extends Ch13ComparableShape {
    private double radius;

    Ch13CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Ch13RectangleShape extends Ch13ComparableShape {
    private double width;
    private double height;

    Ch13RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class ShapeComparisonDemo {
    public static void main(String[] args) {
        Ch13ComparableShape circle =
                new Ch13CircleShape(4);

        Ch13ComparableShape rectangle =
                new Ch13RectangleShape(8, 7);

        System.out.printf("Circle area: %.2f%n",
                circle.getArea());

        System.out.printf("Rectangle area: %.2f%n",
                rectangle.getArea());

        int result = circle.compareTo(rectangle);

        if (result < 0) {
            System.out.println(
                    "Rectangle has the larger area."
            );
        } else if (result > 0) {
            System.out.println(
                    "Circle has the larger area."
            );
        } else {
            System.out.println(
                    "Both shapes have equal areas."
            );
        }
    }
}