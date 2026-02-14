import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int rem = year % 12 + 1;
        String zodiacc;

        switch(rem){
            case 1: zodiacc = "Monkey"; break;
            case 2: zodiacc = "Rooster"; break;
            case 3: zodiacc = "Dog"; break;
            case 4: zodiacc = "Pig"; break;
            case 5: zodiacc = "Rat"; break;
            case 6: zodiacc = "Ox"; break;
            case 7: zodiacc = "Tiger"; break;
            case 8: zodiacc = "Rabbit"; break;
            case 9: zodiacc = "Dragon"; break;
            case 10: zodiacc = "Snake"; break;
            case 11: zodiacc = "Horse"; break;
            case 12: zodiacc = "Sheep"; break;
            default: zodiacc = "Unknown"; break;
        }

        System.out.println(zodiacc);

        input.close();
    }
}