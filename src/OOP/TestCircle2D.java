package OOP;

public class TestCircle2D {
    public static void main(String[] args) {
        // Create two circles
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        Circle2D c2 = new Circle2D(4, 5, 10.5);
        Circle2D c3 = new Circle2D(3, 3, 2);

        // Test area and perimeter
        System.out.println("Circle c1:");
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        // Test contains point
        System.out.println("\nDoes c1 contain point (3, 3)? " + c1.contains(3, 3));
        System.out.println("Does c1 contain point (8, 8)? " + c1.contains(8, 8));

        // Test contains circle
        System.out.println("\nDoes c1 contain c3? " + c1.contains(c3));

        // Test overlaps
        System.out.println("Does c1 overlap with c2? " + c1.overlaps(c2));
        System.out.println("Does c1 overlap with c3? " + c1.overlaps(c3));

        // Create default circle
        Circle2D defaultCircle = new Circle2D();
        System.out.println("\nDefault circle:");
        System.out.println("Center: (" + defaultCircle.getX() + ", " +
                defaultCircle.getY() + ")");
        System.out.println("Radius: " + defaultCircle.getRadius());
        System.out.println("Area: " + defaultCircle.getArea());
        System.out.println("Perimeter: " + defaultCircle.getPerimeter());
    }
}
