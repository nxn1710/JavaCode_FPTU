package labjava;

import java.util.Scanner;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JSP0053 {

    private static Scanner scanner = new Scanner(System.in);

    private static int menu() {
        System.out.println("=====Bubble Sort Program=====");
        System.out.println("1. Random array element");
        System.out.println("2. Sort ascending array");
        System.out.println("3. Sort Descending array");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        MyArray arr = new MyArray();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    System.out.print("Enter number of element: ");
                    arr = new MyArray(scanner.nextInt());
                    arr.randomArr();
                    arr.display();
                    break;
                case 2:
                    System.out.println("After ascending sorted");
                    arr.bubbleSortAscending();
                    arr.display();
                    break;
                case 3:
                    System.out.println("After descending sorted");
                    arr.bubbleSortDescending();
                    arr.display();
                    break;

            }
        } while (choice != 4);
    }

}
