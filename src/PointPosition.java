import java.util.Scanner;

public class PointPosition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x0, y0, x1, y1, x2, y2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.println("p2 is on the line segment from p0 to p1");
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("p2 is on the same line but not on the segment");
        } else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("p2 is on the left side of the line");
        } else {
            System.out.println("p2 is on the right side of the line");
        }
    }

    /** Return true if point is on the left side */
    public static boolean leftOfTheLine(double x0, double y0,
                                        double x1, double y1,
                                        double x2, double y2) {

        double result = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        return result > 0;
    }

    /** Return true if point is on the same line */
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1,
                                        double x2, double y2) {

        double result = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        return result == 0;
    }

    /** Return true if point is on the line segment */
    public static boolean onTheLineSegment(double x0, double y0,
                                           double x1, double y1,
                                           double x2, double y2) {

        double result = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);

        if (result != 0) {
            return false; // not on the same line
        }

        // Check if within bounds
        return (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1) &&
                y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1));
    }
}