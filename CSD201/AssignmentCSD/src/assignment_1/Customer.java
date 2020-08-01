package assignment_1;

import java.io.Serializable;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Customer implements Serializable {

    private String ccode;
    private String cus_name;
    private String phone;
    public static final long serialVersionUID = 1L;

    public Customer() {
    }

    public Customer(String ccode, String cus_name, String phone) {
        this.ccode = ccode;
        this.cus_name = cus_name;
        this.phone = phone;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-10s| %-10s| %-10s\n", ccode, cus_name, phone);
    }

}
