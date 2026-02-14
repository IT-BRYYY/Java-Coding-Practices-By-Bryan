import java.util.Scanner;
public class CostOfShipping {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        double cost;
        System.out.print("Enter the weight of the package: ");
        int pounds = input.nextInt();

        if(pounds <= 2){
           cost = 2.5;
        }else if(pounds <= 4){
           cost = 4.5;
        }else if(pounds <=10){
           cost = 7.5;
        }else if(pounds <=20){
           cost = 10.5;
        }else{
            System.out.println("The package cannot be shipped");
            return;
        }

        System.out.printf("The cost of the package is %.2f",cost);
    }
}
