package OOP;

abstract class AssessmentItem {
    private String title;

    AssessmentItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    abstract double getScore();
}

class QuizResult extends AssessmentItem
        implements Comparable<QuizResult> {

    private double score;

    QuizResult(String title, double score) {
        super(title);
        this.score = score;
    }

    @Override
    double getScore() {
        return score;
    }

    @Override
    public int compareTo(QuizResult other) {
        return Double.compare(this.score, other.score);
    }
}

class QuizComparisonDemo {
    public static void main(String[] args) {
        QuizResult quiz1 = new QuizResult("Java Quiz", 85);
        QuizResult quiz2 = new QuizResult("OOP Quiz", 92);

        System.out.println(
                quiz1.getTitle() + ": " + quiz1.getScore()
        );

        System.out.println(
                quiz2.getTitle() + ": " + quiz2.getScore()
        );

        int result = quiz1.compareTo(quiz2);

        if (result < 0) {
            System.out.println(
                    quiz2.getTitle() + " has the higher score."
            );
        } else if (result > 0) {
            System.out.println(
                    quiz1.getTitle() + " has the higher score."
            );
        } else {
            System.out.println("Both quizzes have equal scores.");
        }
    }
}