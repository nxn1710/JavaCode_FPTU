package practicalexam;

import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Apr 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class InPatient extends Patient {
    Scanner scanner = new Scanner(System.in);
    private double dailyFee;
    private Date dischargedDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public InPatient() {
    }

    
    public InPatient(double dailyFee, Date dischargedDate, String code, String fullName, Date hospitalizedDate, String gender, double medicineCost) {
        super(code, fullName, hospitalizedDate, gender, medicineCost);
        this.dailyFee = dailyFee;
        this.dischargedDate = dischargedDate;
    }
    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    public Date getDischargedDate() {
        return dischargedDate;
    }

    public void setDischargedDate(Date dischargedDate) {
        this.dischargedDate = dischargedDate;
    }

    public long numberOfDate() {
        return ChronoUnit.DAYS.between(this.hospitalizedDate.toInstant(), this.dischargedDate.toInstant());
    }
    
    @Override
    public double medicineFee() {
        return this.medicineCost * numberOfDate();
    }

    @Override
    public double hospitalFee() {
        return medicineFee() + this.dailyFee * numberOfDate();
    }

    @Override
    public String toString() {
        return "InPatient{" + super.toString() + "\n\tdailyFee: " + dailyFee + "\n\tdischargedDate: " + sdf.format(dischargedDate) + '}';
    }
    
}
