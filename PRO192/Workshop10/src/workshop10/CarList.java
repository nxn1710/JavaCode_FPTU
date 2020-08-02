package workshop10;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @date Mar 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class CarList<T> {

    private List<T> a = new LinkedList<>();

    public CarList() {
    }

    public void add(T t) {
        a.add(t);
    }

    public void display() {
        for (T i : a) {
            System.out.println(i.toString());
        }
    }

    public int getSize() {
        return a.size();
    }

    public boolean checkEmpty() {
        return a.isEmpty();
    }

    public void delete(int pos) {
        a.remove(pos);
    }

    public void sort() {
        Collections.sort(a, new Comparator<T>(){
            @Override
            public int compare(T o1, T o2) {
                return (int) (((Car)o1).getPrice() - ((Car)o2).getPrice());
            }
        });
    }

    public boolean search(Car c) {
        for (T i : a) {
            if (i.equals(c)) return true;
        }
        return false;
    }
}
