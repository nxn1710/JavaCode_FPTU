package jlp0023;

/**
 * @date Jul 4, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Order {

    private int id;
    private Fruit fruit;
    private int quantity;

    public Order() {
    }

    public Order(int id, Fruit fruit, int quantity) {
        this.id = id;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
