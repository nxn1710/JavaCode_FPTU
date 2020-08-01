package jlp0023;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * @date Jul 4, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manager {

    private ArrayList<Fruit> listFruit;
    private ArrayList<Order> listOrder;
    private Hashtable<String, ArrayList<Order>> listShopping;

    public Manager() {
        listFruit = new ArrayList<>();
        listShopping = new Hashtable<>();
    }

//    public void addTest() {
//        listFruit.add(new Fruit(1, "Apple", 3, 2, "vietnam"));
//        listFruit.add(new Fruit(2, "Banana", 4, 1, "vietnam"));
//        listFruit.add(new Fruit(3, "Mango", 2, 5, "vietnam"));
//    }

    public void addFruit(int id) {
        Fruit fruit = new Fruit();
        fruit.setId(id);
        System.out.print("Enter fruit name: ");
        fruit.setName(Validation.checkInputString());
        System.out.print("Enter fruit quantity: ");
        fruit.setQuantity(Validation.checkInputInt());
        System.out.print("Enter fruit price: ");
        fruit.setPrice(Validation.checkInputInt());
        System.out.print("Enter fruit origin: ");
        fruit.setOrigin(Validation.checkInputString());
        listFruit.add(fruit);
    }

    public void shopping() {
        String nameCustomer;
        int select, quantity;
        boolean check;
        listOrder = new ArrayList<>();
        int id = 1;
        do {
            System.out.println("List of Fruit: ");
            displayFruit();
            System.out.print("Enter select item: ");
            select = Validation.checkInputInt();
            Fruit fruit = listFruit.get(select - 1);
            System.out.println("You select: " + fruit.getName());
            System.out.print("Please input quantity: ");
            quantity = Validation.checkInputIntLimit(0, fruit.getQuantity());
            //update quantity to store
            fruit.setQuantity(fruit.getQuantity() - quantity);
            //create new order
            Order order = new Order(id++, fruit, quantity);
            listOrder.add(order);
            check = Validation.checkInputYN();
        } while (check);
        System.out.print("Enter your name: ");
        nameCustomer = Validation.checkInputString();
        listShopping.put(nameCustomer, listOrder);
    }

    public void viewOrder() {
        Set<String> keys = listShopping.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            String nameCustomer = itr.next();
            System.out.println("Customer: " + nameCustomer);
            displayOrder(listShopping.get(nameCustomer));
        }
    }

    public void displayOrder(ArrayList<Order> order) {
        System.out.printf("%-10s|%-10s|%-7s|%-10s\n", "Product", "Quantity", "Price", "Amount");
        int total = 0;
        for (Order o : order) {
            System.out.printf("%-2d%-8s", o.getId(), o.getFruit().getName());
            System.out.printf("%-10d", o.getQuantity());
            System.out.printf("%7d$", o.getFruit().getPrice());
            int amount = o.getQuantity() * o.getFruit().getPrice();
            System.out.printf("%10d$", amount);
            total += amount;
            System.out.println("");
        }
        System.out.println("Total = " + total + "$");
    }

    public void displayFruit() {
        System.out.printf("%-5s%-12s%-10s%-10s%-10s\n", "Item", "FruitName", "Quantity", "Origin", "Price");
        listFruit.forEach((f) -> {
            System.out.printf("%-5d", f.getId());
            System.out.printf("%-12s", f.getName());
            System.out.printf("%-10d", f.getQuantity());
            System.out.printf("%-10s", f.getOrigin());
            System.out.printf("%10d$", f.getPrice());
            System.out.println("");
        });
    }

}
