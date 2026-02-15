package Math_Operations;

import java.util.*;
public class TrianglePrism{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the Equilateral: ");
        double length = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(length,2);

        double volume = area * length;

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The volume of the Triangular prism is %.2f", volume);



    }
}