package OOP;

abstract class LearningActivity {
    protected String title;

    LearningActivity(String title) {
        this.title = title;
    }

    public abstract void completeActivity();
}

interface Scoreable {
    double getScore();
}

interface CertificateEligible extends Scoreable {
    void issueCertificate();
}

class ProgrammingQuiz extends LearningActivity
        implements CertificateEligible {

    private double score;

    ProgrammingQuiz(String title, double score) {
        super(title);
        this.score = score;
    }

    @Override
    public void completeActivity() {
        System.out.println(
                "Completed activity: " + title
        );
    }

    @Override
    public double getScore() {
        return score;
    }

    @Override
    public void issueCertificate() {
        if (score >= 75) {
            System.out.println(
                    "Certificate awarded!"
            );
        } else {
            System.out.println(
                    "Score is too low for certification."
            );
        }
    }
}

public class CourseActivityDemo {
    public static void main(String[] args) {
        ProgrammingQuiz quiz =
                new ProgrammingQuiz("Java OOP Quiz", 90);

        LearningActivity activity = quiz;
        activity.completeActivity();

        CertificateEligible eligible = quiz;

        System.out.println(
                "Quiz score: " + eligible.getScore()
        );

        eligible.issueCertificate();
    }
}