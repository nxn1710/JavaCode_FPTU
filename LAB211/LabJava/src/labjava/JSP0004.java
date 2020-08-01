package labjava;

import java.awt.Toolkit;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JSP0004 {
    public static void main(String[] args) {
//        System.out.print("Enter size of array: ");
//        int size = MyArray.scanner.nextInt();
//        MyArray arr = new MyArray(size);
//        arr.randomArr();
//        System.out.println("Unsorted Array: ");
//        arr.display();
//        System.out.println("Sorted Array: ");
//        arr.quickSort(0, size - 1);
//        arr.display();
//        
        while (true) {            
            MyArray arr = new MyArray((int)Math.random() * 10);
            if (!arr.isAscending()) {
                Toolkit.getDefaultToolkit().beep();
                arr.display();
                break;
            } else {
                System.out.println(".");
            }
        }
    }
}
