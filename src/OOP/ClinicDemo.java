package OOP;

abstract class ClinicStaff {
    protected String name;

    ClinicStaff(String name) {
        this.name = name;
    }

    public abstract void performDuty();
}

interface ShiftSchedulable {
    void scheduleShift();
}

class ClinicNurse extends ClinicStaff
        implements ShiftSchedulable {

    ClinicNurse(String name) {
        super(name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " assists patients.");
    }

    @Override
    public void scheduleShift() {
        System.out.println(
                name + "'s nursing shift is scheduled."
        );
    }
}

class ClinicDoctor extends ClinicStaff
        implements ShiftSchedulable {

    ClinicDoctor(String name) {
        super(name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " examines patients.");
    }

    @Override
    public void scheduleShift() {
        System.out.println(
                name + "'s doctor shift is scheduled."
        );
    }
}

public class ClinicDemo {
    public static void main(String[] args) {
        ClinicStaff[] staff = {
                new ClinicNurse("Maria"),
                new ClinicDoctor("Daniel")
        };

        for (ClinicStaff member : staff) {
            member.performDuty();
        }

        ShiftSchedulable nurse =
                (ShiftSchedulable) staff[0];

        nurse.scheduleShift();
    }
}