package OOP;

abstract class TrainingTask {
    private String title;

    TrainingTask(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void completeTask();
}

interface ProgressTrackable {
    double getProgress();
}

class JavaPracticeTask extends TrainingTask
        implements ProgressTrackable {

    private int completedExercises;
    private int totalExercises;

    JavaPracticeTask(String title, int completed, int total) {
        super(title);
        this.completedExercises = completed;
        this.totalExercises = total;
    }

    @Override
    public void completeTask() {
        System.out.println(getTitle() + " completed.");
    }

    @Override
    public double getProgress() {
        if (totalExercises <= 0) {
            return 0;
        }

        return completedExercises * 100.0 / totalExercises;
    }
}

public class TrainingProgressDemo {
    public static void main(String[] args) {
        JavaPracticeTask task =
                new JavaPracticeTask("Java OOP Exercises", 6, 10);

        task.completeTask();

        System.out.printf(
                "Progress: %.0f%%%n",
                task.getProgress()
        );
    }
}