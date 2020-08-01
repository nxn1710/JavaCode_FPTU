package myqueue;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyQueue<T> {

    private int front, last, capacity, count, cap2;
    private T[] queue;

    public MyQueue() {
        queue = (T[]) new Object[100];
    }

    public MyQueue(int capacity) {
        front = last = 0;
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];
        count = 0;
        cap2 = capacity;
    }

    public void enqueue(T data) {
        if (count == capacity) {
            System.out.println("Can not add because queue is full");
        } else {
            System.out.println("Add success");
            queue[last] = data;
            last++;
            count++;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void clear() {
        front = -1;
        last = -1;
        count = 0;
        capacity = 0;
    }

    public T dequeue() {
        T item = null;
        if (isEmpty()) {
            System.out.println("Quese is empty");
        } else {
            item = queue[front];
            front++;
            cap2--;
            count--;
        }
        return item;
    }

    public void display() {
        System.out.println("My Queue data is");
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i < last; i++) {
                System.out.print(queue[i] + "<--");
            }
            System.out.println("");
        }
    }

    public void first() {
        System.out.println("First element is " + queue[front]);
    }

}
