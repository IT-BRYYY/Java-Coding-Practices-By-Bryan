import java.util.Scanner;
public class StudentGradeManager {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();


        System.out.print("Enter First Exam Grade (0 - 100): ");
        int firstExamGrade = getValidGrade(input);
        System.out.print("Enter Second Exam Grade (0 - 100): ");
        int secondExamGrade = getValidGrade(input);
        System.out.print("Enter Third Exam Grade (0 - 100): ");
        int thirdExamGrade = getValidGrade(input);



        int total = (firstExamGrade + secondExamGrade + thirdExamGrade);
        double averageGrade = getAverageGrade(total);
        String gradeLetter = getGradeLetter(averageGrade);
        boolean isPass = isPass(averageGrade);

        System.out.println("Name: " + studentName);
        System.out.printf("Average Grade:%.2f ", averageGrade);
        System.out.println("Grade Letter: " + gradeLetter);
        System.out.println("Passed or Fail: " + (isPass ? "Pass" : "Fail"));


    }
    public static int getValidGrade(Scanner input) {
        int grade;

        while (true) {
            grade = input.nextInt();
            if (grade >= 0 && grade <= 100) {
                return grade;
            } else {
                System.out.print("Invalid! Enter grade (0-100): ");
            }
        }
    }

    public static double getAverageGrade(double grade) {
        return grade / 3.0;
    }
    public static String getGradeLetter(double grade){
        if (grade >= 90) {
            return "A";
        } else if (grade >= 85) {
            return "B";
        } else if (grade >= 75) {
            return "C";
        } else {
            return "F";
        }
    }

    public static boolean isPass(double grade) {
        return grade >= 75;
    }
}
