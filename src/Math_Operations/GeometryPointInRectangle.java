package Math_Operations;

import java.util.Scanner;
public class GeometryPointInRectangle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(x >= -4 && x <= 6 && y >= -1.5 && y <= 3.5){
            System.out.println("Point " + "(" + x + ", " + y + ")" + " is in the rectangle ");
        }else {
            System.out.println("Point " + "(" + x + ", " + y + ")" + " is not inside the rectangle ");

        }




        //when you use greater than sign in negative number it is like this -4 -3 -2 -1 not this -4 -5




    }
}
