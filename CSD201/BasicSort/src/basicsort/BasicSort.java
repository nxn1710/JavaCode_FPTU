package basicsort;

import java.util.Scanner;

/**
 * @date Jul 13, 2020
 * @author Nguyen Xuan Nghiep
 */
public class BasicSort {

    private static Scanner scanner = new Scanner(System.in);

    public static int Menu() {
        System.out.println("1. Add test employee");
        System.out.println("2. Display employee");
        System.out.println("3. Selection Sort");
        System.out.println("4. Inserction Sort");
        System.out.println("5. Bubble Sort");
        System.out.println("6. Quick Sort");
        System.out.println("7. Sort Descending");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        EmployeeList elist = new EmployeeList();

        do {
            choice = Menu();
            switch (choice) {
                case 1:
                    elist.addTest();
                    break;
                case 2:
                    elist.display();
                    break;
                case 3:
                    elist.selectionSortA();
                    break;
                case 4:
                    elist.insertionSortA();
                    break;
                case 5:
                    elist.bubbleSortA();
                    break;
                case 6:
                    elist.quickSort(elist.getEmployees(), 0, elist.getEmployees().size() - 1);
                    break;
                    case 7:
                    elist.sort(elist.getEmployees(),  0, elist.getEmployees().size() - 1);
                    break;
            }
        } while (choice != 8);
    }

}
