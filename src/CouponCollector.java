import java.util.Random;

public class CouponCollector {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        boolean[] suitsCollected = new boolean[4];
        String[] firstCards = new String[4];
        int picks = 0;
        int totalCollected = 0;

        Random random = new Random();

        while (totalCollected < 4) {
            int rankIndex = random.nextInt(13);
            int suitIndex = random.nextInt(4);
            picks++;

            if (!suitsCollected[suitIndex]) {
                suitsCollected[suitIndex] = true;
                firstCards[suitIndex] = ranks[rankIndex] + " of " + suits[suitIndex];
                totalCollected++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(firstCards[i]);
        }

        System.out.println("Number of picks: " + picks);
    }
}