package jlp0023;

/**
 * @date Jul 4, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Fruit {

    private int id;
    private String name;
    private int quantity;
    private int price;
    private String origin;

    public Fruit() {
    }

    public Fruit(int id, String name, int quantity, int price, String origin) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
