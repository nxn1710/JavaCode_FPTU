
/**
 * @date Jul 20, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Phone {

    public String zoneCode;
    public String number;

    public Phone() {
    }

    public Phone(String zoneCode, String number) {
        this.number = number;
        this.zoneCode = zoneCode;
    }

    @Override
    public String toString() {
        return "Phone{" + "zoneCode=" + zoneCode + ", number=" + number + '}';
    }

}
