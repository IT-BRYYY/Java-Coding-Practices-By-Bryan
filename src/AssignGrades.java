import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int[] scores = new int[n];

        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        // Find the best score
        int best = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        // Assign and display grades
        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(scores[i], best);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }

    public static String getGrade(int score, int best) {
        if (score >= best - 5)  return "A";
        else if (score >= best - 10) return "B";
        else if (score >= best - 15) return "C";
        else if (score >= best - 20) return "D";
        else                         return "F";
    }
}