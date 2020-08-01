package jsp0065;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @date Jul 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) {
        Manager man = new Manager();
        boolean check;
        ArrayList<Student> listStudents = new ArrayList<>();
        HashMap<String, Double> percentType = new HashMap<>();
        System.out.println("=====Management Student Program=====");
        do {            
            listStudents.add(man.addStudent());
            check = Validation.checkInputYN();
        } while (check);
        percentType = man.getPercentTypeStudent1(listStudents);
        man.displayStudent(listStudents);
        man.displayPercentType(percentType, listStudents);
    }
}
