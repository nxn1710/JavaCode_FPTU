package myqueue;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enqueue("Nghiep");
        myQueue.enqueue("Huy");
        myQueue.enqueue("Toan");
        myQueue.enqueue("Phuc");
        myQueue.enqueue("Xuan");
        myQueue.display();
        System.out.println("Dequeue");
        System.out.println(myQueue.dequeue());
        myQueue.enqueue("Xuan");
        myQueue.display();
    }
}
