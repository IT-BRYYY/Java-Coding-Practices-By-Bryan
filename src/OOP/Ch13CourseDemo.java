package OOP;

abstract class Ch13OnlineCourse {
    private String courseName;

    Ch13OnlineCourse(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void displayCourseDetails();
}

interface Ch13CertificateEligible {
    void issueCertificate();
}

class Ch13JavaCourse extends Ch13OnlineCourse
        implements Ch13CertificateEligible {

    private int durationHours;

    Ch13JavaCourse(String courseName, int durationHours) {
        super(courseName);
        this.durationHours = durationHours;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course: " + getCourseName());
        System.out.println("Duration: " + durationHours + " hours");
    }

    @Override
    public void issueCertificate() {
        System.out.println(
                "Certificate issued for " + getCourseName()
        );
    }
}

public class Ch13CourseDemo {
    public static void main(String[] args) {
        Ch13OnlineCourse course =
                new Ch13JavaCourse("Java Programming", 40);

        course.displayCourseDetails();

        Ch13CertificateEligible eligible =
                (Ch13CertificateEligible) course;

        eligible.issueCertificate();
    }
}