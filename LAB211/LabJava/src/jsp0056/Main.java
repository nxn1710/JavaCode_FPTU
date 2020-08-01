package jsp0056;

import java.util.Scanner;

/**
 * @date Jun 23, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("===== Worker Management =====");
        System.out.println("1. Add worker");
        System.out.println("2. Up/Down salary");
        System.out.println("3. Display information salary");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addTestWorker();
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    manager.addWorker();
                    break;
                case 2:
                    manager.changeSalary();
                    break;
                case 3:
                    manager.displaySalaryHistory();
                    break;
            }
        } while (choice != 4);
    }
}
