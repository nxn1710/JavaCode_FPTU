package pratical_exam;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Short_termInsurrance extends Insurrance {

    public Short_termInsurrance() {
    }

    public Short_termInsurrance(String nameCustomer, int numberMonth, double amountPayable) {
        super(nameCustomer, numberMonth, amountPayable);
    }

    @Override
    public String toString() {
        return "\tShort_termInsurrance" + super.toString();
    }
}
