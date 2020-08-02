package workshop7;

import java.util.Date;

/**
 * @date Mar 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Technician extends Employee {

    private String work;
    public static double yearReward = 50000;

    public Technician() {
    }

    public Technician(String employeeID, String fullName, double salaryCoefficient, Date workStartDate, boolean gender, String work) {
        super(employeeID, fullName, salaryCoefficient, workStartDate, gender);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTechnician work: " + work;
    }

    @Override
    public double reward() {
        return Technician.yearReward * this.numberOfYear();
    }

    @Override
    public double salary() {
        return this.salaryCoefficient * Employee.basicSalary + this.seniorityAllowance();
    }
}
