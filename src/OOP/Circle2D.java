package OOP;

public class Circle2D {
    // Data fields
    private double x;
    private double y;
    private double radius;

    // No-arg constructor
    public Circle2D() {
        this(0, 0, 1);
    }

    // Constructor with specified x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Method to get area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to get perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a point is inside the circle
    public boolean contains(double x, double y) {
        // Calculate distance from center to the point
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        // Point is inside if distance is less than radius
        return distance <= radius;
    }

    // Method to check if another circle is inside this circle
    public boolean contains(Circle2D circle) {
        // Calculate distance between centers
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) +
                Math.pow(this.y - circle.getY(), 2));
        // Circle is inside if distance + circle.radius <= this.radius
        return distance + circle.getRadius() <= this.radius;
    }

    // Method to check if another circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        // Calculate distance between centers
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) +
                Math.pow(this.y - circle.getY(), 2));
        // Check if circles overlap
        // Overlap if distance < sum of radii and not completely contained
        return distance < this.radius + circle.getRadius() &&
                !contains(circle);
    }
}