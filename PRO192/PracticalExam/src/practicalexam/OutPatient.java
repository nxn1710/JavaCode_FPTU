package practicalexam;

import java.util.Date;

/**
 * @date Apr 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class OutPatient extends Patient{
    private double examinationFee;
    private double testingFee;
    public OutPatient() {
        
    }

    public OutPatient(double examinationFee, double testingFee, String code, String fullName, Date hospitalizedDate, String gender, double medicineCost) {
        super(code, fullName, hospitalizedDate, gender, medicineCost);
        this.examinationFee = examinationFee;
        this.testingFee = testingFee;
    }

    public double getExaminationFee() {
        return examinationFee;
    }

    public void setExaminationFee(double examinationFee) {
        this.examinationFee = examinationFee;
    }

    public double getTestingFee() {
        return testingFee;
    }

    public void setTestingFee(double testingFee) {
        this.testingFee = testingFee;
    }

    @Override
    public double medicineFee() {
        return medicineCost;
    }

    @Override
    public double hospitalFee() {
        return examinationFee + medicineFee() + testingFee;
    }

    @Override
    public String toString() {
        return "OutPatient{" + super.toString() +"\n\texaminationFee: " + examinationFee + "\n\ttestingFee: " + testingFee + '}';
    }
    
    
}
