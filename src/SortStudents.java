import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String[] names = new String[n];
        double[] scores = new double[n];

        // Read student names and scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name and score: ");
            names[i] = input.next();
            scores[i] = input.nextDouble();
        }

        // Sort using selection sort (decreasing order of scores)
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the max score in the remaining unsorted section
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap scores
            double tempScore = scores[maxIndex];
            scores[maxIndex] = scores[i];
            scores[i] = tempScore;

            // Swap names
            String tempName = names[maxIndex];
            names[maxIndex] = names[i];
            names[i] = tempName;
        }

        // Print sorted results
        System.out.println("\nStudents sorted by score (highest to lowest):");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t" + scores[i]);
        }
    }
}