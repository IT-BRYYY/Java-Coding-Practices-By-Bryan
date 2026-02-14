import java.util.Scanner;
public class ComputediffShapes {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Compute the area of different Shapes(Circle, Triangle, Rectangle)");
        System.out.print("Choose the shape that you want to compute: ");
        String shape = input.nextLine();

        if(shape.equalsIgnoreCase("Circle")){
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();

            final double PI = 3.14159 ;
            double area = radius * radius * PI;

            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
        else if(shape.equalsIgnoreCase("Rectangle")) {
            System.out.print("Enter Length: ");
            double length = input.nextDouble();

            System.out.print("Enter Width: ");
            double width = input.nextDouble();

            double results = length * width;

            System.out.println("The area for Rectangle is " + results);
        }
        else if (shape.equalsIgnoreCase("Triangle")){
            System.out.print("Enter Base: ");
            double base = input.nextDouble();

            System.out.print("Enter Height ");
            double height = input.nextDouble();

            double results = (base * height) / 2;

            System.out.println("The area triangle is " + results);
        } else {
            System.out.println("\nChoose only in Circle, Triangle, Rectangle!!");
        }

        input.close();

    }
}
