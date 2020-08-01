package question2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @date Jul 27, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyQuickSort {

    public static void quickSort(ArrayList<Employee> employeesList, int l, int r) {
        int i = l, j = r, pivot = (l + r) / 2;
        while (i < j) {
            while (employeesList.get(i).getId().compareTo(employeesList.get(pivot).getId()) < 0) {
                i++;
            }
            while (employeesList.get(j).getId().compareTo(employeesList.get(pivot).getId()) > 0) {
                j--;
            }
            if (i <= j) {
                Collections.swap(employeesList, i, j);
                i++;
                j--;
            }

        }
        if (i < r) {
            quickSort(employeesList, i, r);
        }
        if (l < j) {
            quickSort(employeesList, l, j);
        }
    }

    public static void display(ArrayList<Employee> eList) {
        eList.forEach((e) -> {
            System.out.println(e);
        });
    }
}
