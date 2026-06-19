package OOP;

class Doctor {

    private String name;
    private String specialization;
    private double consultationFee;
    private static int count = 0;

    public Doctor() {
        this("Unknown", "General", 500.0);
    }

    public Doctor(String name, String specialization, double consultationFee) {
        this.name = name;
        this.specialization = specialization;
        this.consultationFee = consultationFee;
        count++;
    }

    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public double getConsultationFee() { return consultationFee; }
    public void setConsultationFee(double fee) { this.consultationFee = fee; }
    public static int getCount() { return count; }

    public String toString() {
        return "Doctor: " + name + " | " + specialization + " | Fee: PHP " + consultationFee;
    }
}