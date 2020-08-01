
/**
 * @date Jun 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MiniTest1 {
    //int[] arr = {3, 2, 3, 1, 4, 5, 6, 7};
    private static int findMin(int arr[], int size) {
        if (size == 1) {
            return arr[0];
        }
        return Math.min(arr[size - 1], findMin(arr, size - 1));
    }

    private static int findSum(int arr[], int size) {
        int index = size - 1;
        if (size == 1) {
            return arr[index];
        }
        return arr[index] + findSum(arr, size - 1);
    }

    private static boolean isPalindrome(String string, int start, int end) {
        if (start == end) {
            return true;
        }
        if (string.charAt(start) != string.charAt(end)) {
            return false;
        }
        if (start < end) {
            return isPalindrome(string, start + 1, end - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 4, 5, 6, 7};
        //question 3
        System.out.println(findMin(arr, arr.length));
        //question 4
        System.out.println(findSum(arr, arr.length));
        //question 5
        String test = "nghieppeihgn";
        System.out.println(isPalindrome(test, 0, test.length() - 1));
    }
}
