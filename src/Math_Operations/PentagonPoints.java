package Math_Operations;

import java.util.Scanner;
public class PentagonPoints {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are");

        for(int i = 1; i<= 5;i++ ){
            double angle = Math.toRadians(-90 + (i -1 ) + 72);

            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);

            System.out.printf("(%.2f, %.2f)%n",x , y);
        }


    }
}