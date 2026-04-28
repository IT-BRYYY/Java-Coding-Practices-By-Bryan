public class GradeTracker {
    public static void main(String[] args) {
        int [] grades = {85, 90, 78, 92, 88};

        printGrades(grades);
        changeGrade(grades, 2, 95);
        printGrades(grades);
    }

    public static void printGrades(int []grades){
        System.out.println("Current Grades:");
        for(int i = 0; i < grades.length; i++){
            System.out.println("Student " + (i+1) + ": " + grades[i]);
        }
    }
    public static void changeGrade(int [] grades, int index, int newGrade){
        grades[index] = newGrade;
    }
}
