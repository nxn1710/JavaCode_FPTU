package question2;

import java.util.ArrayList;

/**
 * @date Jul 27, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> elist = new ArrayList<>();
        elist.add(new Employee("De140022", "Nguyen Xuan Nghiep", 19));
        elist.add(new Employee("De140026", "Le Tran Viet Long", 19));
        elist.add(new Employee("De140020", "Nguyen Truong Phuc", 19));
        elist.add(new Employee("De140023", "Truong Khanh Toan", 19));
        System.out.println("Berfore sorted");
        MyQuickSort.display(elist);
        System.out.println("After sorted");
        MyQuickSort.quickSort(elist, 0, elist.size() - 1);
        MyQuickSort.display(elist);
    }
}
