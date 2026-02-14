import java.util.Scanner;

public class Computearea {
    //Computing the area of cirlce using constant
    public static void main (String [] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}