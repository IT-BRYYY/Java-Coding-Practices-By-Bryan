import java.util.Scanner;
public class OpenaDoor {

    public static void main(String [] args){

        //if else
        // This example shows how you can use if..else to "open a door" if the user enters the correct code

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Room Code: ");
        int code = sc.nextInt();

        if (code == 2004){
            System.out.println("Correct Code. This door is open now");
        }
        else {
            System.out.println("Incorrect Code. Try Other Code ");
        }




    }

}
