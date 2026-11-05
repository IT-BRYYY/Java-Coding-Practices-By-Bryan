package OOP;

abstract class PerformanceEvaluation {
    private String employeeName;
    private double productivity;
    private double teamwork;

    public PerformanceEvaluation(
            String employeeName,
            double productivity,
            double teamwork) {

        this.employeeName = employeeName;
        this.productivity = productivity;
        this.teamwork = teamwork;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getProductivity() {
        return productivity;
    }

    public double getTeamwork() {
        return teamwork;
    }

    public abstract double calculatePerformanceScore();
}

interface Promotable {
    boolean isEligibleForPromotion(double score);
}

class RegularEvaluation extends PerformanceEvaluation
        implements Promotable {

    public RegularEvaluation(
            String employeeName,
            double productivity,
            double teamwork) {

        super(employeeName, productivity, teamwork);
    }

    @Override
    public double calculatePerformanceScore() {
        return (getProductivity() * 0.60)
                + (getTeamwork() * 0.40);
    }

    @Override
    public boolean isEligibleForPromotion(double score) {
        return score >= 85;
    }
}

class ProbationaryEvaluation extends PerformanceEvaluation
        implements Promotable {

    public ProbationaryEvaluation(
            String employeeName,
            double productivity,
            double teamwork) {

        super(employeeName, productivity, teamwork);
    }

    @Override
    public double calculatePerformanceScore() {
        return (getProductivity() * 0.50)
                + (getTeamwork() * 0.50);
    }

    @Override
    public boolean isEligibleForPromotion(double score) {
        return score >= 90;
    }
}

public class EmployeePerformanceDemo {
    public static void main(String[] args) {

        PerformanceEvaluation regular =
                new RegularEvaluation("Alex", 90, 85);

        double regularScore =
                regular.calculatePerformanceScore();

        System.out.println("Employee: "
                + regular.getEmployeeName());

        System.out.printf("Performance Score: %.2f%n",
                regularScore);

        Promotable regularPromotion =
                (Promotable) regular;

        System.out.println("Promotion Eligible: "
                + regularPromotion.isEligibleForPromotion(
                regularScore));

        System.out.println();

        PerformanceEvaluation probationary =
                new ProbationaryEvaluation("Maria", 92, 88);

        double probationaryScore =
                probationary.calculatePerformanceScore();

        System.out.println("Employee: "
                + probationary.getEmployeeName());

        System.out.printf("Performance Score: %.2f%n",
                probationaryScore);

        Promotable probationaryPromotion =
                (Promotable) probationary;

        System.out.println("Promotion Eligible: "
                + probationaryPromotion.isEligibleForPromotion(
                probationaryScore));
    }
}