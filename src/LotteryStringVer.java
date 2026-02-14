import java.util.Scanner;
public class LotteryStringVer{
    public static void main(String []args){
        String lottery = "" + ((int)(Math.random() *10 ) + 1) +
                ((int)(Math.random()*10) + 1);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter lottery number (2digits): ");
        String guess = input.nextLine();

        if(guess.length() != 2){
            System.out.println("Enter Only Two Digit numbers!!!");
            return;
        }if(!Character.isDigit(guess.charAt(0)) ||
            !Character.isDigit(guess.charAt(1))){
            System.out.println("Enter only number!!");
            return;
        }

        char lottery1 = lottery.charAt(0);
        char lottery2 = lottery.charAt(1);

        char guess1 = guess.charAt(0);
        char guess2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if(guess.equals(lottery)){
            System.out.println("Exact Match You win 1M");
        }else if(guess1 == lottery2 && guess2 == lottery1){
            System.out.println("All Match You win 500k");
        }else if(guess1 == lottery1 ||
                 guess2 == lottery2 ||
                 guess1 == lottery2 ||
                 guess2 == lottery1){
            System.out.println("One Match You win 10K");
        }else{
            System.out.println("Sorry, No Match :< ");
        }

        input.close();
    }
}