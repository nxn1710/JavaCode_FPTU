package practicalexam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date Apr 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public abstract class Patient implements IPatient {

    protected String code;
    protected String fullName;
    protected Date hospitalizedDate;
    protected String gender;
    protected double medicineCost;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Patient() {
    }

    
    public Patient(String code, String fullName, Date hospitalizedDate, String gender, double medicineCost) {
        this.code = code;
        this.fullName = fullName;
        this.hospitalizedDate = hospitalizedDate;
        this.gender = gender;
        this.medicineCost = medicineCost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getHospitalizedDate() {
        return hospitalizedDate;
    }

    public void setHospitalizedDate(Date hospitalizedDate) {
        this.hospitalizedDate = hospitalizedDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }

    @Override
    public String toString() {
        return "\n\tcode: " + code + "\n\tfullName: " + fullName + "\n\thospitalizedDate: " + sdf.format(hospitalizedDate) + "\n\tgender: " + gender + "\n\tmedicineCost: " + medicineCost;
    }

    public abstract double medicineFee();

}
