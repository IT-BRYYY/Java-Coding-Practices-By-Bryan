import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = input.nextLine();

        for(int i = text.length()-1; i >=0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
