package workshop5;

/**
 * @date Feb 28, 2020
 * @author Nguyen Xuan Nghiep
 */
public class PhoneNumber {

    protected int area;
    protected String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    public void display() {
        System.out.println(area + " - " + number);
    }

}
