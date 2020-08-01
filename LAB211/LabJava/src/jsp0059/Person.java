package jsp0059;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Person {

    String name;
    String address;
    double money;

    public Person() {
    }

    public Person(String name, String address, double money) {
        this.name = name;
        this.address = address;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15.1f", name, address, money);
    }

}
