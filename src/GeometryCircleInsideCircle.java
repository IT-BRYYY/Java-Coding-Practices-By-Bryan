import java.util.Scanner;
public class GeometryCircleInsideCircle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y- coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double r1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y- coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double r2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));


        if(r2 > 0 && r1 >0){
            if (distance <= r1 - r2) {
                System.out.println("Circle2 is inside circle 1 ");
            }else if (distance <= r1 + r2) {
                System.out.println("Circle2 Overlaps circle1 ");
            }else { // if distance > r1 + r2 its does not overlap
                System.out.println("Circle2 does not overlap circle1");
            }
        }else{
            System.out.println("Invalid Input");
        }
    }
}