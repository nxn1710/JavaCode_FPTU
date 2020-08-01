
/**
 * @date Jun 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class BinarySearch {

    public static int search(int[] arr, int x, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (int) (left + right) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return search(arr, x, mid + 1, right);
        }
        return search(arr, x, left, mid - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,9};
        
    }
}
