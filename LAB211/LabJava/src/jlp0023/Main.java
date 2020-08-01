package jlp0023;


/**
 * @date Jul 4, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static int menu() {
        System.out.println("FRUIT SHOP SYSTEM");
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }

    public static void main(String[] args) {
        int choice, idFruit = 1;
        boolean check;
        Manager manager = new Manager();
//        manager.addTest();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    do {
                        manager.addFruit(idFruit++);
                        check = Validation.checkInputYN();
                    } while (check);
                    break;
                case 2:
                    manager.viewOrder();
                    break;
                case 3:
                    manager.shopping();
                    break;

            }
        } while (choice != 4);
    }
}
