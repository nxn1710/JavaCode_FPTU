package workshop5;

/**
 * @date Feb 28, 2020
 * @author Nguyen Xuan Nghiep
 */
public class IntPhoneNumber extends PhoneNumber {

    private String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }

    @Override
    public void display() {
        System.out.println(countryCode + " - " + area + " - " + number);
    }
}
