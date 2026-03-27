import java.util.Scanner;
public class EvenPositionChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.print("Characters at even positions: ");

        for(int i = 1; i < text.length(); i+=2){
            System.out.print(text.charAt(i));

        }

        System.out.println();
        input.close();
    }
}
