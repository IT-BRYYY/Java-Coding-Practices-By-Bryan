package OOP;

abstract class BackgroundJob {
    private String jobName;
    private boolean completed;

    public BackgroundJob(String jobName) {
        this.jobName = jobName;
        this.completed = false;
    }

    public String getJobName() {
        return jobName;
    }

    public boolean isCompleted() {
        return completed;
    }

    protected void markCompleted() {
        completed = true;
    }

    public abstract void execute();

    public void displayStatus() {
        System.out.println("Job: " + jobName);
        System.out.println("Completed: " + completed);
    }
}

interface Retryable {
    void retry();
}

class ReportGenerationJob extends BackgroundJob
        implements Retryable {

    public ReportGenerationJob(String jobName) {
        super(jobName);
    }

    @Override
    public void execute() {
        System.out.println("Generating monthly sales report...");
        markCompleted();
        System.out.println("Report generated successfully.");
    }

    @Override
    public void retry() {
        if (isCompleted()) {
            System.out.println("No retry needed. Job already completed.");
        } else {
            System.out.println("Retrying report generation...");
            execute();
        }
    }
}

class DataCleanupJob extends BackgroundJob {

    public DataCleanupJob(String jobName) {
        super(jobName);
    }

    @Override
    public void execute() {
        System.out.println("Removing expired temporary records...");
        markCompleted();
        System.out.println("Data cleanup completed.");
    }
}

public class BackgroundJobDemo {
    public static void main(String[] args) {

        BackgroundJob[] jobs = {
                new ReportGenerationJob("Monthly Sales Report"),
                new DataCleanupJob("Temporary Data Cleanup")
        };

        for (BackgroundJob job : jobs) {
            job.displayStatus();

            job.execute();

            System.out.println("Status after execution:");
            job.displayStatus();

            System.out.println();
        }

        Retryable retryableJob = (Retryable) jobs[0];
        retryableJob.retry();
    }
}