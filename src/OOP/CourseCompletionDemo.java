
package OOP;

abstract class OnlineCourse {
    protected String courseName;

    OnlineCourse(String courseName) {
        this.courseName = courseName;
    }

    public abstract void completeCourse();
}

interface Gradable {
    double getGrade();
}

interface GraduationEligible extends Gradable {
    void awardDiploma();
}

class JavaCourse extends OnlineCourse
        implements GraduationEligible {

    private double grade;

    JavaCourse(String courseName, double grade) {
        super(courseName);
        this.grade = grade;
    }

    @Override
    public void completeCourse() {
        System.out.println(
                "Course completed: " + courseName
        );
    }

    @Override
    public double getGrade() {
        return grade;
    }

    @Override
    public void awardDiploma() {
        if (grade >= 75) {
            System.out.println(
                    "Congratulations! Diploma awarded."
            );
        } else {
            System.out.println(
                    "Grade is too low to receive a diploma."
            );
        }
    }
}

public class CourseCompletionDemo {
    public static void main(String[] args) {
        JavaCourse course =
                new JavaCourse("Java Programming", 88);

        OnlineCourse onlineCourse = course;
        onlineCourse.completeCourse();

        GraduationEligible eligible = course;

        System.out.println(
                "Final grade: " + eligible.getGrade()
        );

        eligible.awardDiploma();
    }
}
