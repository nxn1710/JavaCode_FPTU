package labjava;

import java.util.Scanner;

/**
 * @date Jun 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyArray {

    private int[] arr;
    private int size;
    public static Scanner scanner = new Scanner(System.in);

    public MyArray() {
    }

    public MyArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void randomArr() {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 30);
        }
    }

    public void bubbleSortAscending() {
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    
    public void bubbleSortDescending() {
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public int binarySearch(int left, int right, int x) {
        int mid = (int) ((left + right) / 2);
        if (left > right) {
            return -1;
        }
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(left, mid - 1, x);
        }
        return binarySearch(mid + 1, right, x);
    }

    public int partition(int left, int right) {
        int pivot = arr[right];
        int i = left -1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+ 1;
    }
    
    
    public void quickSort(int left, int right) {
        if (left < right) {
            int pi = partition(left, right);
            quickSort(left, pi-1);
            quickSort(pi+1, right);
        } 
    }
    
    public boolean isAscending() {
        for (int i = 0; i < size; i++) {
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    

    public void display() {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println("");
    }
}
