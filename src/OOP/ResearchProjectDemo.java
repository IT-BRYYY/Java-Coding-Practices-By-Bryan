package OOP;

abstract class ResearchProject {
    private String projectTitle;
    private int researchHours;

    public ResearchProject(String projectTitle, int researchHours) {
        this.projectTitle = projectTitle;
        this.researchHours = researchHours;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public int getResearchHours() {
        return researchHours;
    }

    public abstract void presentResearch();

    public double calculateResearchPoints() {
        return researchHours * 2.0;
    }
}

interface Publishable {
    void publishResearch();
}

class ComputerResearch extends ResearchProject
        implements Publishable {

    public ComputerResearch(String title, int hours) {
        super(title, hours);
    }

    @Override
    public void presentResearch() {
        System.out.println("Presenting computer research findings.");
    }

    @Override
    public void publishResearch() {
        System.out.println("Research published in the technology journal.");
    }
}

class EnvironmentalResearch extends ResearchProject {

    public EnvironmentalResearch(String title, int hours) {
        super(title, hours);
    }

    @Override
    public void presentResearch() {
        System.out.println("Presenting environmental research findings.");
    }
}

public class ResearchProjectDemo {
    public static void main(String[] args) {
        ResearchProject project =
                new ComputerResearch("AI in Education", 15);

        System.out.println("Project: " + project.getProjectTitle());
        System.out.println("Research Hours: " + project.getResearchHours());
        System.out.println("Research Points: "
                + project.calculateResearchPoints());

        project.presentResearch();

        Publishable publishable = (Publishable) project;
        publishable.publishResearch();

        System.out.println();

        project = new EnvironmentalResearch(
                "Plastic Waste Reduction", 10);

        System.out.println("Project: " + project.getProjectTitle());
        System.out.println("Research Points: "
                + project.calculateResearchPoints());
        project.presentResearch();
    }
}