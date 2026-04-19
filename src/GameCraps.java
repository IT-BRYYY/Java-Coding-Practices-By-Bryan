import java.util.Random;

public class GameCraps {

    public static int[] rollDice() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        return new int[]{die1, die2};
    }

    public static void playCraps() {
        int[] dice = rollDice();
        int die1 = dice[0];
        int die2 = dice[1];
        int total = die1 + die2;

        System.out.println("You rolled " + die1 + " + " + die2 + " = " + total);

        if (total == 7 || total == 11) {
            System.out.println("You win");

        } else if (total == 2 || total == 3 || total == 12) {
            System.out.println("You lose");

        } else {
            int point = total;
            System.out.println("point is " + point);

            while (true) {
                dice = rollDice();
                die1 = dice[0];
                die2 = dice[1];
                total = die1 + die2;

                System.out.println("You rolled " + die1 + " + " + die2 + " = " + total);

                if (total == point) {
                    System.out.println("You win");
                    break;
                } else if (total == 7) {
                    System.out.println("You lose");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        playCraps();
    }
}