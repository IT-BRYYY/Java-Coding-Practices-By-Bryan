import java.util.Scanner;
public class GradeCalculatorWithLetterGradeAndGPA{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Student name: ");
        String studentName = input.nextLine();

        System.out.print("Midterm Exam score (0-100): ");
        double midtermExam = input.nextDouble();

        System.out.print("Final Exam score (0 - 100): ");
        double finalExam = input.nextDouble();

        System.out.print("Project Score: ");
        double projectScore = input.nextDouble();

        System.out.print("Attendance percentage: ");
        double attendance = input.nextDouble();

        String LetterGrade;
        String GPA;
        String FeedBack;


        double midtermPercentage = midtermExam * (30.0 / 100);
        double finalExamPercentage = finalExam * (40.0 / 100);
        double projectPercentage = projectScore * (20.0 / 100);
        double attendancePercentage = attendance * (10.0 / 100);

        double finalGrade = midtermPercentage + finalExamPercentage + projectPercentage + attendancePercentage;


        if(finalGrade >= 90){
            FeedBack = " Excellent Work";
            LetterGrade = "A";
            GPA = "4.0";
        }else if(finalGrade >= 80 ){
            FeedBack = "Good job";
            LetterGrade = "B";
            GPA = "3.0";
        }else if(finalGrade >=70 ){
            FeedBack = "Satisfactory";
            LetterGrade = "C";
            GPA = "2.0";
        }else if(finalGrade >= 60 ){
            FeedBack = "Needs Improvement";
            LetterGrade = "D";
            GPA = "1.0";
        }else{
            FeedBack = "Please see your advisor";
            LetterGrade = "F";
            GPA = "0.0";
        }

        if(attendance < 75){
            FeedBack += "\nWarning: Low attendance affected your grade";
        }

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("All individual scores: " + "\nMidterm Exam " +midtermExam + "\nFinal Exam " + finalExam + "\nProject " + projectScore);
        System.out.printf("\nFinal weighted scores %.2f\n", finalGrade);
        System.out.println("Letter Grade: " + LetterGrade);
        System.out.println("GPA: " + GPA);
        System.out.println("Feedback message: " + FeedBack);

        input.close();

    }
}