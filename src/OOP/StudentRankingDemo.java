package OOP;

import java.util.Arrays;

abstract class AcademicRecord
        implements Comparable<AcademicRecord> {

    private String studentName;

    AcademicRecord(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public abstract double getAverage();

    @Override
    public int compareTo(AcademicRecord other) {
        return Double.compare(
                other.getAverage(),
                this.getAverage()
        );
    }
}

class StudentGradeRecord extends AcademicRecord {
    private double average;

    StudentGradeRecord(String name, double average) {
        super(name);
        this.average = average;
    }

    @Override
    public double getAverage() {
        return average;
    }
}

public class StudentRankingDemo {
    public static void main(String[] args) {
        AcademicRecord[] students = {
                new StudentGradeRecord("Alex", 88.5),
                new StudentGradeRecord("Maria", 95.0),
                new StudentGradeRecord("John", 91.5)
        };

        Arrays.sort(students);

        System.out.println("Student Rankings:");

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    (i + 1) + ". "
                            + students[i].getStudentName()
                            + " - " + students[i].getAverage()
            );
        }
    }
}