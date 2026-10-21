
package OOP;

abstract class GameActivity {
    protected String gameName;

    GameActivity(String gameName) {
        this.gameName = gameName;
    }

    public abstract void finishGame();
}

interface Pointable {
    int getPoints();
}

interface AchievementEligible extends Pointable {
    void unlockAchievement();
}

class AdventureGame extends GameActivity
        implements AchievementEligible {

    private int points;

    AdventureGame(String gameName, int points) {
        super(gameName);
        this.points = points;
    }

    @Override
    public void finishGame() {
        System.out.println(
                "Game completed: " + gameName
        );
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void unlockAchievement() {
        if (points >= 1000) {
            System.out.println(
                    "Achievement unlocked: Master Explorer!"
            );
        } else {
            System.out.println(
                    "Not enough points to unlock achievement."
            );
        }
    }
}

public class GameAchievementDemo {
    public static void main(String[] args) {
        AdventureGame game =
                new AdventureGame("Mystery Island", 1500);

        GameActivity activity = game;
        activity.finishGame();

        AchievementEligible eligible = game;

        System.out.println(
                "Total points: " + eligible.getPoints()
        );

        eligible.unlockAchievement();
    }
}
