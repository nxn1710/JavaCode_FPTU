package pratical_exam;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Insurrance {

    private String nameCustomer;
    private int numberMonth;
    private double amountPayable;

    public Insurrance() {
    }

    public Insurrance(String nameCustomer, int numberMonth, double amountPayable) {
        this.nameCustomer = nameCustomer;
        this.numberMonth = numberMonth;
        this.amountPayable = amountPayable;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public void setNumberMonth(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    public double getAmountPayable() {
        return amountPayable;
    }

    public void setAmountPayable(double amountPayable) {
        this.amountPayable = amountPayable;
    }

    @Override
    public String toString() {
        return "\n\tCustomer name: " + nameCustomer + "\n\tnumber of Month: " + numberMonth + "\n\tAmount Payable: " + amountPayable;
    }
    
    
    
}
