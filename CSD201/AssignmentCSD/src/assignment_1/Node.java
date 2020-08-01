package assignment_1;

import java.io.Serializable;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Node<T> implements Serializable {

    T data;
    Node next;
    public static final long serialVersionUID = 1L;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
