
package OOP;

abstract class LibraryActivity {
    protected String memberName;

    LibraryActivity(String memberName) {
        this.memberName = memberName;
    }

    public abstract void borrowBook();
}

interface PointEarnable {
    int getPoints();
}

interface RewardEligible extends PointEarnable {
    void claimReward();
}

class BookBorrowing extends LibraryActivity
        implements RewardEligible {

    private int points;

    BookBorrowing(String memberName, int points) {
        super(memberName);
        this.points = points;
    }

    @Override
    public void borrowBook() {
        System.out.println(
                memberName + " borrowed a library book."
        );
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void claimReward() {
        if (points >= 100) {
            System.out.println(
                    "Reward claimed: Free bookmark!"
            );
        } else {
            System.out.println(
                    "Not enough points to claim a reward."
            );
        }
    }
}

public class LibraryRewardDemo {
    public static void main(String[] args) {
        BookBorrowing borrowing =
                new BookBorrowing("Alex", 120);

        LibraryActivity activity = borrowing;
        activity.borrowBook();

        RewardEligible eligible = borrowing;

        System.out.println(
                "Member points: " + eligible.getPoints()
        );

        eligible.claimReward();
    }
}
