import java.util.Scanner;
public class ComputePerimeterOfTriangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three edge of triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int perimeter = a + b + c;

        if(a + b > c && a + c > b && b + c > a){
            System.out.println(perimeter);
        }else{
            System.out.println("invalid input");
        }

    }
}

