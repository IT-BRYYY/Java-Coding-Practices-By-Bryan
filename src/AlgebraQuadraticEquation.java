import java.util.Scanner;
public class AlgebraQuadraticEquation{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for a,b,c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (b*b) - (4 * a * c);

        double r1 = (- b + Math.sqrt(discriminant)) / (2 * a);
        double r2 = (- b- Math.sqrt(discriminant)) / (2 * a);

        if(discriminant > 0){
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }else if(discriminant == 0) {
            System.out.println("The equation has one root " + r1);
        }else {
            System.out.println("The equation has no real roots ");
        }

    }
}


// Important quiz: Solving quadratic equations using discriminant
// Remember to use Math.sqrt(discriminant)!
//
// Notes:
// The discriminant is the part of the quadratic formula inside the square root:
//      discriminant = b^2 - 4ac
// It tells us how many real roots the equation has:
//   > 0 → two real roots
//   = 0 → one real root (both are the same)
//   < 0 → no real roots (the roots are imaginary)
//
// Formula for roots:
//   r1 = (-b + Math.sqrt(discriminant)) / (2 * a)
//   r2 = (-b - Math.sqrt(discriminant)) / (2 * a)
