package Math_Operations;

import java.util.Scanner;
public class GeometryPointOnLineSegment{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2 : ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double location = (x1 - x0) * (y2 - y0)-(x2 - x0) * (y1 - y0);

        String segment = "("+ x0 + "," + y0+ ")" + " to " + "(" + x1 + "," + y1 + ")";
        String point = "("+ x2 +", "+ y2 + ")";

        if (location == 0){
            boolean onSegment = (x2 >=Math.min(x0,x1) && x2 <= Math.max(x0, x1) &&
                    y2 >= Math.min(y0,y1) && y2 <=Math.max(y0,y1));

            if(onSegment){
                System.out.println(point + " is ont the line segment from " + segment);
            }else{
                System.out.println(point + " is not on the line segment " + segment);
            }

        }else{
            System.out.println(point + " is not on the line segment from"  + segment);
        }
    }
}