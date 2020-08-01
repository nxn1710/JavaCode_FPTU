package question1;

import java.util.EmptyStackException;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyStack<T> {

    private int top;
    private T[] stack;

    public MyStack() {
    }

    public MyStack(int capacity) {
        if (capacity <= 0) {
            System.out.println("Capacity must be > 0");
        } else {
            stack = (T[]) new Object[capacity];
            top = -1;
        }
    }

    public void push(T value) {
        if (top >= stack.length) {
            System.out.println("Stack is overflow");
        }
        top++;
        stack[top] = value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]);
            }
            System.out.println("");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        top--;
        return stack[top + 1];
    }

    public void clear() {
        top = -1;
    }
    
    public void reverse() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i]);
        }
        System.out.println("");
    }

}
