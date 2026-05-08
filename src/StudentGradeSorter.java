import java.util.Scanner;

public class StudentGradeSorter {

    // ── Selection Sort for grades (ascending) ──────────────────────────
    public static void selectionSortAsc(double[] grades, String[] names) {
        for (int i = 0; i < grades.length - 1; i++) {
            double currentMin = grades[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < grades.length; j++) {
                if (currentMin > grades[j]) {
                    currentMin = grades[j];
                    currentMinIndex = j;
                }
            }

            // Swap grades AND names together so they stay matched
            if (currentMinIndex != i) {
                grades[currentMinIndex] = grades[i];
                grades[i] = currentMin;

                String tempName = names[currentMinIndex];
                names[currentMinIndex] = names[i];
                names[i] = tempName;
            }
        }
    }

    // ── Selection Sort for grades (descending) ─────────────────────────
    public static void selectionSortDesc(double[] grades, String[] names) {
        for (int i = 0; i < grades.length - 1; i++) {
            double currentMax = grades[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < grades.length; j++) {
                if (currentMax < grades[j]) {  // changed > to <
                    currentMax = grades[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                grades[currentMaxIndex] = grades[i];
                grades[i] = currentMax;

                String tempName = names[currentMaxIndex];
                names[currentMaxIndex] = names[i];
                names[i] = tempName;
            }
        }
    }

    // ── Get letter grade ───────────────────────────────────────────────
    public static String getLetterGrade(double grade) {
        if (grade >= 90) return "A";
        else if (grade >= 80) return "B";
        else if (grade >= 70) return "C";
        else if (grade >= 60) return "D";
        else return "F";
    }

    // ── Compute average ────────────────────────────────────────────────
    public static double computeAverage(double[] grades) {
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }

    // ── Display table ──────────────────────────────────────────────────
    public static void displayTable(String[] names, double[] grades) {
        System.out.println("─────────────────────────────────────");
        System.out.printf("%-15s %-10s %-5s%n", "Name", "Grade", "Letter");
        System.out.println("─────────────────────────────────────");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s %-10.2f %-5s%n",
                    names[i], grades[i], getLetterGrade(grades[i]));
        }
        System.out.println("─────────────────────────────────────");
        System.out.printf("Average grade: %.2f (%s)%n",
                computeAverage(grades), getLetterGrade(computeAverage(grades)));
        System.out.println("─────────────────────────────────────");
    }

    // ── Main ───────────────────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names  = new String[n];
        double[] grades = new double[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter grade of " + names[i] + ": ");
            grades[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Menu
        System.out.println("\nSort order:");
        System.out.println("[1] Ascending  (lowest to highest)");
        System.out.println("[2] Descending (highest to lowest)");
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        System.out.println("\n── Unsorted ──");
        displayTable(names, grades);

        if (choice == 1) {
            selectionSortAsc(grades, names);
            System.out.println("\n── Sorted: Lowest to Highest ──");
        } else {
            selectionSortDesc(grades, names);
            System.out.println("\n── Sorted: Highest to Lowest ──");
        }

        displayTable(names, grades);

        // Highlight top and bottom student
        System.out.println("\n🏆 Top student    : " + names[0] + " (" + grades[0] + ")");
        System.out.println("⚠️  Lowest student : " + names[n - 1] + " (" + grades[n - 1] + ")");

        sc.close();
    }
}