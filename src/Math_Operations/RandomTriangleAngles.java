package Math_Operations;

import java.util.Scanner;
public class RandomTriangleAngles{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        final double radius= 40;

        double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;

        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);

        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);

        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double a = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        double b = Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
        double c = Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));

        double angleA = Math.acos((b * b + c *c - a * a) / (2 * b * c));
        double angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));

        System.out.println("Three angles (in degrees): ");
        System.out.println("Angle 1: " + Math.toDegrees(angleA));
        System.out.println("Angle 2: " + Math.toDegrees(angleB));
        System.out.println("Angle 3: " + Math.toDegrees(angleC));

        System.out.println("\nSum of angles: " + (Math.toDegrees(angleA) + Math.toDegrees(angleB) + Math.toDegrees(angleC)));







    }
}