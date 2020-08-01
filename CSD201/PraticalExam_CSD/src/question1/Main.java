package question1;

import java.util.Scanner;

/**
 * @date Jul 27, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        MyStack<Integer> myStack = new MyStack<>(16);
        System.out.print("Enter decimal: ");
        num = scanner.nextInt();
        while (num > 0) {
            int rea = num % 2;
            myStack.push(rea);
            num = num / 2;
        }
        System.out.print("Binary is: ");
        myStack.reverse();
    }
}
