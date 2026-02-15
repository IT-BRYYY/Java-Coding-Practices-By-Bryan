package Math_Operations;

import java.util.Scanner;
public class GeometryPointsInTriangle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if((x >= 0 && x <= 200) && (y >= 0 && y<= 100)){
            if(y <= -0.5* x + 100){
                System.out.println("inside");
            }else{
                System.out.println("outside");
            }
        }else{
            System.out.println("the point is outside the triangle ");
        }

    }
}