import java.util.Scanner;
public class GradeCalculatorUsingMethods {

    public static double getAverage(double s1, double s2, double s3, double s4, double s5){
        return (s1 + s2 + s3 + s4 + s5) / 5;
    }
    public static String getLetterGrade(double average){
        if(average >= 90){
            return "A - Excellent";
        }else if(average >= 80){
            return "B - Good Job!";
        }else if(average >= 70){
            return "C - Passing";
        }else if (average >= 60){
            return "D - Needs Improvement";
        }else {
            return "F - Failed";
        }
    }
    public static String getStatus (double average){
        if(average >=75){
            return "Passed";
        }else {
            return " Failed";
        }
    }
    public static void printReport(String name, double average, String grade, String status){
        System.out.println("\n===== GRADE REPORT =====");
        System.out.println("Student Name: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        System.out.println("=========================");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter score for Math: ");
        double math = input.nextDouble();

        System.out.print("Enter score for Science: ");
        double science = input.nextDouble();

        System.out.print("Enter score for English: ");
        double english = input.nextDouble();

        System.out.print("Enter score for History: ");
        double history = input.nextDouble();

        System.out.print("Enter score for Filipino: ");
        double filipino = input.nextDouble();

        double average = getAverage(math, science,english,history,filipino);
        String grade = getLetterGrade(average);
        String status = getStatus(average);

        printReport(name, average, grade, status);
    }
}
