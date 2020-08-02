package workshop10;

import java.util.Scanner;

/**
 * @date Mar 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static CarList<Car> list = new CarList<>();
    private static String name;
    private static double price;
    private static String production;

    public static void add() {
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Price: ");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Production: ");
        production = scanner.nextLine();
        list.add(new Car(name, price, production));
    }

    public static void display() {
        list.display();
    }
    
    public static void size() {
        System.out.println("Size of car list is" + list.getSize());
    }
    
    public static void empty() {
        if (list.checkEmpty()) {
            System.out.println("Car list is empty");
        } else {
            System.out.println("Car list is not empty");
        }
    }

    public static void delete() {
        int postion;
        System.out.println("Enter a position: ");
        postion = scanner.nextInt();
        list.delete(postion);
    }

    public static void sort() {
        list.sort();
    }

    public static void search() {
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Price: ");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Production: ");
        production = scanner.nextLine();
        if (list.search(new Car(name, price,production))) {
            System.out.println("This car is exists in Car list");
        } else {
            System.out.println("This car is not exists in Car list");
        }

    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("------------MENU-----------");
            System.out.println("1. Add car in car list");
            System.out.println("2. Display car list");
            System.out.println("3. Get size of car list");
            System.out.println("4. Check empty car list");
            System.out.println("5. Delete car in car list");
            System.out.println("6. Sort car price in car list");
            System.out.println("7. Search car in car list");
            System.out.println("8. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    size();
                    break;
                case 4:
                    empty();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    search();
                    break;
            }
        } while (choice != 8);
    }

}
