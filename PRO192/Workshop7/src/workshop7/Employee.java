package workshop7;

import com.sun.beans.util.Cache;
import java.util.Calendar;
import java.util.Date;

/**
 * @date Mar 7, 2020
 * @author Nguyen Xuan Nghiep
 *
 */
public abstract class Employee implements IEmployee {

    protected String employeeID;
    protected String fullName;
    protected double salaryCoefficient;
    protected Date workStartDate;
    protected boolean gender; //true is male, false is female;
    public static double basicSalary = 1490000;
    public static double yearSeniorityAllowance = 100000;

    public Employee() {
    }

    public Employee(String employeeID, String fullName, double salaryCoefficient, Date workStartDate, boolean gender) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salaryCoefficient = salaryCoefficient;
        this.workStartDate = workStartDate;
        this.gender = gender;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(Date workStartDate) {
        this.workStartDate = workStartDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static double getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(double basicSalary) {
        Employee.basicSalary = basicSalary;
    }

    public static double getYearSeniorityAllowance() {
        return yearSeniorityAllowance;
    }

    public static void setYearSeniorityAllowance(double yearSeniorityAllowance) {
        Employee.yearSeniorityAllowance = yearSeniorityAllowance;
    }

    public abstract double reward();
    
    public long numberOfYear() {
        return (Calendar.getInstance().getTime().getTime() - this.workStartDate.getTime()) /1000/60/60/24/365;
    }
    
    public double seniorityAllowance() {
        return this.numberOfYear() * Employee.yearSeniorityAllowance;
    }

    @Override
    public String toString() {
        return "\nEmployeeID: " + employeeID + "\nFullName: " + fullName + "\nSalary Coefficient: "
                + salaryCoefficient + "\nWorkStartDate: " + workStartDate + "\nGender: " + (gender ? "Male" : "Female");
    }
}
