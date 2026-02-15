package Math_Operations;

import java.util.Scanner;
public class GeometryTwoRectangle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x- , y coordinates, width, and height: ");
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1W = input.nextDouble();
        double r1H = input.nextDouble();

        System.out.print("Enter r2's center x- , y coordinates, width, and height: ");
        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2W = input.nextDouble();
        double r2H = input.nextDouble();


        if (r2W == 0 && r2H == 0 && r1W == 0 && r1H == 0) {
            System.out.println("Invalid output");
        }


        double xDistance = Math.abs(r1X - r2X);
        double yDistance = Math.abs(r1Y - r2Y);


        if(xDistance + (r2W / 2) <=(r1W / 2) && yDistance + (r2H / 2) <=(r1H / 2 )){
            System.out.println("inside");
        }else if(xDistance < (r1W / 2 + r2W / 2) && yDistance < (r1H / 2 + r2H / 2)){
            System.out.println("overlap");
        }else if (xDistance >= (r1W / 2 + r2W / 2) || yDistance >= (r1H / 2 + r2H / 2)){
            System.out.println("No overlap");
        }






    }
}