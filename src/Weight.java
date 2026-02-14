import java.util.Scanner;
public class Weight   {
    public static void main(String []args){

        System.out.println("Let's find if you are Underweight,Healthy,Overweight,Obese");

        double weight;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter you're weight: ");
        weight = scanner.nextDouble();

        if(weight<=45.4){
            System.out.println("You are UnderWeight");
        }

        else if(weight>=45.5){
            System.out.println("You are Healthy");

        }

        else if (weight >=59.1){
            System.out.println("You are OverWeight");

        }

        else if (weight >=70.5){
            System.out.println("You are Obese");
        }

        else if (weight >= 93.3){
            System.out.println("You are Extremly Obese");

        }



    }
}