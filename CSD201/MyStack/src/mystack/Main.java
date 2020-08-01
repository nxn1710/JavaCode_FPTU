package mystack;

import java.util.Scanner;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        myStack.push(7);
//        myStack.push(5);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
        MyStack myStack = new MyStack(10);
        Student a = new Student("Nguyen Xuan Nghiep", "DE140022");
        Student b = new Student("Nguyen Xuan Nghiep2", "DE1400223");
        Student c = new Student("Nguyen Xuan Nghiep3", "DE1400224");
        Customer d = new Customer("Nguyen Xuan Nghiep4", "0363659356");
        Customer e = new Customer("Nguyen Xuan Nghiep4", "0363659356");
        myStack.push(7);
        myStack.push(5);
        myStack.push(a);
        myStack.push(e);
        myStack.push(b);
        myStack.push(c);
        myStack.push(d);
        myStack.push(3);
        myStack.display();
        System.out.println("Pop");
        System.out.println(myStack.pop());
        myStack.display();
        System.out.println("Peek");
        System.out.println(myStack.peek());
        System.out.print("Enter number need convert: ");
        MyStack.convertToBinary(scanner.nextInt()).reverse();
    }
}
