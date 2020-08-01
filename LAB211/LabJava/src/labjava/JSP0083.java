package labjava;

import java.util.Scanner;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JSP0083 {

    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        //push to stack
        stack.push(4);
        stack.push(3);
        stack.push(3);
        stack.push(5);
        //cant not push because stack is full
        stack.push(2);
        //pick and remove first element in stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
