package workshop7;

import java.util.Date;

/**
 * @date Mar 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manager extends Employee {

    private String position;
    private double positionAllowance;
    public static double yearReward = 100000;

    public Manager() {
    }

    public Manager(String employeeID, String fullName, double salaryCoefficient, Date workStartDate,
            boolean gender, String position, double positionAllowance) {
        super(employeeID, fullName, salaryCoefficient, workStartDate, gender);
        this.position = position;
        this.positionAllowance = positionAllowance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    @Override
    public double reward() {
        return Manager.yearReward * this.numberOfYear();
    }

    @Override
    public String toString() {
        return super.toString() + "\nManager position: " + position + "\nPosition Allowance: " + positionAllowance;
    }

    @Override
    public double salary() {
        return this.salaryCoefficient * Employee.basicSalary + this.seniorityAllowance() + this.positionAllowance;
    }

}
