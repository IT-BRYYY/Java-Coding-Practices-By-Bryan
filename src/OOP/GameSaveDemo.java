package OOP;

abstract class GameSaveData {
    private String playerName;

    GameSaveData(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public abstract void displayProgress();
}

class PlayerSaveFile extends GameSaveData
        implements Cloneable {

    private int level;
    private int coins;

    PlayerSaveFile(String playerName, int level, int coins) {
        super(playerName);
        this.level = level;
        this.coins = coins;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    @Override
    public void displayProgress() {
        System.out.println("Player: " + getPlayerName());
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
    }

    @Override
    public PlayerSaveFile clone() {
        try {
            return (PlayerSaveFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

public class GameSaveDemo {
    public static void main(String[] args) {
        PlayerSaveFile original =
                new PlayerSaveFile("Alex", 10, 500);

        PlayerSaveFile backup = original.clone();

        backup.setLevel(15);
        backup.setCoins(1000);

        System.out.println("Original Save:");
        original.displayProgress();

        System.out.println("\nBackup Save:");
        backup.displayProgress();
    }
}