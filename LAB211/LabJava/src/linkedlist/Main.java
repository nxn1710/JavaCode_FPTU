package linkedlist;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println("Push element");
        list.push(3);
        list.push(4);
        list.push(8);
        System.out.println("Pop element");
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println("Peek element");
        System.out.println(list.peek());
    }
}
