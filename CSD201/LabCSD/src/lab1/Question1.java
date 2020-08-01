package lab1;

import java.util.Scanner;

/**
 * @date Jun 24, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Question1 {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] arr;

    public static int checkInputInt() {
        while (true) {
            String result;
            result = scanner.nextLine();
            try {
                return Integer.parseInt(result);
            } catch (NumberFormatException e) {
                System.err.println("Please input a integer");
                System.out.println("Enter again");
            }
        }
    }

    public static void inputSize() {
        int size = checkInputInt();
        arr = new int[size];
    }

    public static void inputElement() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = checkInputInt();
        }
    }

    public static void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void bubbleSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Input size: ");
        inputSize();
        System.out.println("Input element");
        inputElement();
        System.out.println("Display array");
        display();
        System.out.println("After sort");
        bubbleSort();
        display();
    }
}
