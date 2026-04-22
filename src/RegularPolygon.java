import java.util.Scanner;

public class RegularPolygon {

    /**
     * Returns the area of a regular polygon.
     * @param n the number of sides
     * @param side the length of each side
     * @return the area of the polygon
     */
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the polygon is " + area(n, side));
    }
}