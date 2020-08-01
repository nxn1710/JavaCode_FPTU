package linkedlist;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyLinkedList {

    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = tail = null;
    }

    public void push(int data) {
        Node p = new Node(data);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }
    
    public int pop() {
        int temp = head.data;
        head = head.next;
        return temp;
    }
    
    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

}
