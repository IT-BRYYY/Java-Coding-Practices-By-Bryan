
package OOP;

abstract class MedicalActivity {
    protected String patientName;

    MedicalActivity(String patientName) {
        this.patientName = patientName;
    }

    public abstract void completeCheckup();
}

interface Diagnosable {
    String getDiagnosis();
}

interface TreatmentEligible extends Diagnosable {
    void recommendTreatment();
}

class PatientCheckup extends MedicalActivity
        implements TreatmentEligible {

    private String diagnosis;

    PatientCheckup(String patientName, String diagnosis) {
        super(patientName);
        this.diagnosis = diagnosis;
    }

    @Override
    public void completeCheckup() {
        System.out.println(
                "Checkup completed for: " + patientName
        );
    }

    @Override
    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void recommendTreatment() {
        if (diagnosis.equalsIgnoreCase("Flu")) {
            System.out.println(
                    "Recommendation: Consult a doctor for flu care."
            );
        } else {
            System.out.println(
                    "Recommendation: Follow the doctor's advice."
            );
        }
    }
}

public class PatientTreatmentDemo {
    public static void main(String[] args) {
        PatientCheckup patient =
                new PatientCheckup("Alex", "Flu");

        MedicalActivity activity = patient;
        activity.completeCheckup();

        TreatmentEligible eligible = patient;

        System.out.println(
                "Diagnosis: " + eligible.getDiagnosis()
        );

        eligible.recommendTreatment();
    }
}
