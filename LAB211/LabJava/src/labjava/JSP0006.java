package labjava;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JSP0006 {
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int size = MyArray.scanner.nextInt();
        MyArray arr = new MyArray(size);
        arr.randomArr();
        System.out.println("Unsorted Array: ");
        arr.display();
        System.out.println("Sorted Array: ");
        arr.bubbleSortAscending();
        arr.display();
        System.out.print("Enter element find: ");
        int x = MyArray.scanner.nextInt();
        int index = arr.binarySearch(0, size - 1, x);
        if (index == -1) {
            System.out.println("Cant not find " + x + " in array");
        } else {
            System.out.println(x + " appear in index " + index + " of array");
        }
    }
}
