package jsp0073;

import java.util.Scanner;

/**
 * @date Jun 24, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("=====Handy Expense program=====");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice, id = 0;
        Manager manager = new Manager();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    manager.addExpense(++id);
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    manager.delete();
                    break;
                case 4:
                    break;

            }
        } while (choice != 4);
    }
}
