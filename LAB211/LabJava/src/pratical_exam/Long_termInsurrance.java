package pratical_exam;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Long_termInsurrance extends Insurrance {

    private double amountPayableMonth;

    public Long_termInsurrance() {
    }

    public Long_termInsurrance(double amountPayableMonth, String nameCustomer, int numberMonth, double amountPayable) {
        super(nameCustomer, numberMonth, amountPayable);
        this.amountPayableMonth = amountPayableMonth;
    }

    public double getAmountPayableMonth() {
        return amountPayableMonth;
    }

    public void setAmountPayableMonth(double amountPayableMonth) {
        this.amountPayableMonth = amountPayableMonth;
    }

    @Override
    public String toString() {
        return "\tLong_termInsurrance" + super.toString() + "\n\tAmount Payable Month: " + amountPayableMonth;
    }
    
    
}
