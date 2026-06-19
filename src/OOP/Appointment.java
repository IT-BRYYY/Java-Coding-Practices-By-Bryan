package OOP;

class Appointment {

    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private static int count = 0;

    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        count++;
    }

    public static int getCount() { return count; }

    public String toString() {
        return "Appointment: " + patient.getName() +
                " -> " + doctor.getName() +
                " | Date: " + date +
                " | Time: " + time;
    }
}