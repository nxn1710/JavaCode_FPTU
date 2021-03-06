package labjava;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JSP0001 {
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int size = MyArray.scanner.nextInt();
        MyArray arr = new MyArray(size);
        arr.randomArr();
        System.out.println("Unsorted Array: ");
        arr.display();
        System.out.println("Sorted Ascending Array: ");
        arr.bubbleSortAscending();
        arr.display();
        System.out.println("Sorted Descending Array: ");
        arr.bubbleSortDescending();
        arr.display();
    }
}
