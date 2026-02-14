import java.util.Scanner;
public class GeometryPointInCircle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        if(distance <= 10){
            System.out.println("Point " + "(" + x + ", " + y + ")" + " is inside the circle ");
        }else  {
            System.out.println("Point " + "(" + x + ", " + y + ")" + " is outside the circle ");

        }

    }
}