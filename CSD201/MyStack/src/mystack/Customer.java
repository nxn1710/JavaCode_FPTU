package mystack;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Customer {

    private String name;
    private String phone;

    public Customer() {
    }

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", phone=" + phone + '}';
    }

}
