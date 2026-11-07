package OOP;

abstract class SecurityThreat {
    private String threatName;
    private int severityLevel;

    public SecurityThreat(String threatName, int severityLevel) {
        this.threatName = threatName;
        this.severityLevel = severityLevel;
    }

    public String getThreatName() {
        return threatName;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public abstract void analyzeThreat();
}

interface Removable {
    void removeThreat();
}

class MalwareThreat extends SecurityThreat implements Removable {

    public MalwareThreat(String threatName, int severityLevel) {
        super(threatName, severityLevel);
    }

    @Override
    public void analyzeThreat() {
        System.out.println("Analyzing suspicious software...");
        System.out.println("Severity Level: " + getSeverityLevel());
    }

    @Override
    public void removeThreat() {
        System.out.println(getThreatName()
                + " has been removed successfully.");
    }
}

class PhishingThreat extends SecurityThreat {

    public PhishingThreat(String threatName, int severityLevel) {
        super(threatName, severityLevel);
    }

    @Override
    public void analyzeThreat() {
        System.out.println("Analyzing suspicious email...");
        System.out.println("Severity Level: " + getSeverityLevel());
    }
}

public class CybersecurityThreatDemo {
    public static void main(String[] args) {

        SecurityThreat[] threats = {
                new MalwareThreat("Trojan Virus", 9),
                new PhishingThreat("Fake Login Email", 7)
        };

        for (SecurityThreat threat : threats) {
            System.out.println("Threat: " + threat.getThreatName());
            threat.analyzeThreat();

            if (threat instanceof Removable) {
                Removable removable = (Removable) threat;
                removable.removeThreat();
            }

            System.out.println();
        }
    }
}