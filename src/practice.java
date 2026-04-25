import java.util.Scanner;
public class practice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double [] myList = new double[10];
        System.out.print("Enter " + myList.length + " values");
        for (int i = 0; i < myList.length; i++){
            myList[i] = Math.random() * 100;
        }

    }
}