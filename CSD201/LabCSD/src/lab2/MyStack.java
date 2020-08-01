package lab2;

import java.util.EmptyStackException;

/**
 * @date Jul 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyStack {

    int[] arr;
    int capacity;
    int top;

    public MyStack() {
        top = -1;
    }

    public MyStack(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (top == capacity) {
            throw new StackOverflowError("Stack is overflow");
        }
        top++;
        arr[top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        top--;
        return arr[top + 1];
    }

    public int peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return arr[top];
    }
    
    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
