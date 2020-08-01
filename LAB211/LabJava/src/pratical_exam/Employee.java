package pratical_exam;

import java.util.ArrayList;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Employee {

    private String name;
    private double coefficientsSalary;
    private ArrayList<Insurrance> insurranceSold;

    public Employee() {
    }

    public Employee(String name, double coefficientsSalary, ArrayList<Insurrance> insurranceSold) {
        this.name = name;
        this.coefficientsSalary = coefficientsSalary;
        this.insurranceSold = insurranceSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public ArrayList<Insurrance> getInsurranceSold() {
        return insurranceSold;
    }

    public void setInsurranceSold(ArrayList<Insurrance> insurranceSold) {
        this.insurranceSold = insurranceSold;
    }

    @Override
    public String toString() {
        return String.format("Employee Name: %-10sCoefficients Salary: %-10f", name, coefficientsSalary);
    }

}
