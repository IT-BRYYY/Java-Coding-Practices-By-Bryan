package OOP;
import java.util.Scanner;

public class ReadData {
    public static void main(String[]args)throws Exception{
        java.io.File file = new java.io.File("scores.txt");

        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String firstname = input.next();
            String mi = input.next();
            String lastname = input.next();
            int score = input.nextInt();

            System.out.println(firstname + " " + mi + " " + lastname + " " + score);
        }
        input.close();
    }
}
