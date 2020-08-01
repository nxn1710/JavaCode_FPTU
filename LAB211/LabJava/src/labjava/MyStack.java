package labjava;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyStack {

    private int[] stack;
    private int index;
    private int size;

    public MyStack() {
    }

    public MyStack(int size) {
        this.stack = new int[size];
        index = -1;
        this.size = size;
    }

    public void push(int value) {
        if (index >= size - 1) {
            System.out.println("Can not push because stack is full");
        } else {
            System.out.println("Push success");
            index++;
            stack[index] = value;
        }
    }

    public int pop() {
        if (index == -1) {
            System.out.println("Stack is empty");
        }
        int temp = stack[index];
        index--;
        return temp;
    }

    public int get() {
        return stack[index];
    }
}
