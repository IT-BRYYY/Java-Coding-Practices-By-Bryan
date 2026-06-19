package OOP;

public class HospitalSystem {
    public static void main(String[] args) {

        Doctor doc1 = new Doctor("Dr. Santos", "Cardiologist", 2500.0);
        Doctor doc2 = new Doctor("Dr. Reyes", "Pediatrician", 1800.0);

        Patient p1 = new Patient("Juan dela Cruz", 45, "Chest Pain");
        Patient p2 = new Patient("Maria Garcia", 7, "Fever");
        Patient p3 = new Patient("Pedro Bautista", 60, "Hypertension");

        Appointment a1 = new Appointment(p1, doc1, "2024-06-20", "9:00 AM");
        Appointment a2 = new Appointment(p2, doc2, "2024-06-20", "10:00 AM");
        Appointment a3 = new Appointment(p3, doc1, "2024-06-21", "2:00 PM");

        System.out.println("========================================");
        System.out.println("        HOSPITAL MANAGEMENT SYSTEM      ");
        System.out.println("========================================");

        System.out.println("\n--- DOCTORS ---");
        System.out.println(doc1);
        System.out.println(doc2);

        System.out.println("\n--- PATIENTS ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n--- APPOINTMENTS ---");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\n--- HOSPITAL STATS ---");
        System.out.println("Total Patients Registered : " + Patient.getCount());
        System.out.println("Total Doctors on Staff    : " + Doctor.getCount());
        System.out.println("Total Appointments Booked : " + Appointment.getCount());

        System.out.println("\n--- UPDATE PATIENT ---");
        p1.setCondition("Stable - Post Checkup");
        System.out.println("Updated: " + p1);

        System.out.println("\n--- SENIOR DOCTOR ---");
        System.out.println("Higher fee doctor: " + getSeniorDoctor(doc1, doc2).getName());
    }

    public static Doctor getSeniorDoctor(Doctor d1, Doctor d2) {
        return d1.getConsultationFee() >= d2.getConsultationFee() ? d1 : d2;
    }
}