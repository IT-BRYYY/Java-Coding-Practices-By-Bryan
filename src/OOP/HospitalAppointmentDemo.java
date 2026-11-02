package OOP;

abstract class HospitalAppointment {
    private String patientName;
    private String doctorName;

    public HospitalAppointment(String patientName, String doctorName) {
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public abstract double calculateConsultationFee();
}

interface Cancellable {
    void cancelAppointment();
}

class GeneralConsultation extends HospitalAppointment
        implements Cancellable {

    public GeneralConsultation(String patientName, String doctorName) {
        super(patientName, doctorName);
    }

    @Override
    public double calculateConsultationFee() {
        return 500;
    }

    @Override
    public void cancelAppointment() {
        System.out.println("General consultation cancelled.");
    }
}

class SpecialistConsultation extends HospitalAppointment
        implements Cancellable {

    public SpecialistConsultation(String patientName, String doctorName) {
        super(patientName, doctorName);
    }

    @Override
    public double calculateConsultationFee() {
        return 1000;
    }

    @Override
    public void cancelAppointment() {
        System.out.println("Specialist consultation cancelled.");
    }
}

public class HospitalAppointmentDemo {
    public static void main(String[] args) {
        HospitalAppointment appointment =
                new GeneralConsultation("Alex", "Dr. Reyes");

        System.out.println("Patient: " + appointment.getPatientName());
        System.out.println("Doctor: " + appointment.getDoctorName());
        System.out.println("Consultation Fee: PHP "
                + appointment.calculateConsultationFee());

        Cancellable cancellation = (Cancellable) appointment;
        cancellation.cancelAppointment();

        System.out.println();

        appointment =
                new SpecialistConsultation("Maria", "Dr. Santos");

        System.out.println("Patient: " + appointment.getPatientName());
        System.out.println("Doctor: " + appointment.getDoctorName());
        System.out.println("Consultation Fee: PHP "
                + appointment.calculateConsultationFee());
    }
}