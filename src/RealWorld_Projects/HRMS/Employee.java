package RealWorld_Projects.HRMS;
import RealWorld_Projects.HRMS.MyDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, phoneNumber, email, office);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice(){
        return office;
    }
    public double getSalary(){
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }
    public void setOffice(String office){
        this.office = office;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDateHired(MyDate dataHired){
        this.dateHired = dataHired;
    }
    public String toString(){
        return "Employee: " + getName();
    }
}
