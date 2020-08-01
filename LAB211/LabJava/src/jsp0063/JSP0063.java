package jsp0063;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @date Jun 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JSP0063 {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Person person = new Person();
            person.input();
            list.add(person);
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        
        list.forEach((p) -> {
            System.out.println(p.toString());
        });
    }
}
