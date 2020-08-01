package jsp0068;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @date Jun 23, 2020
 * @author Nguyen Xuan Nghiep
 */
public class StudentList {

    private ArrayList<Student> listStudent;
    private static Scanner scanner = new Scanner(System.in);

    public StudentList() {
        listStudent = new ArrayList<>();
    }

    public void input() {
        boolean check = false;
        do {
            Student st = new Student();
            System.out.println("Please input student information");
            System.out.print("Name: ");
            st.setName(scanner.nextLine());
            System.out.print("Classes: ");
            st.setClasses(scanner.nextLine());
            System.out.print("Mark: ");
            st.setMark(scanner.nextFloat());
            scanner.nextLine();
            listStudent.add(st);
            System.out.print("Do you want to enter more student infomation? (Y/N): ");
            char input = scanner.nextLine().charAt(0);
            check = input == 'Y';
        } while (check == true);
    }
    
    public void sort() {
        Collections.sort(listStudent, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        
        });
    }
    
    public void display() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("----------Student " + (i+1) + " ----------");
            System.out.println(listStudent.get(i).toString());
        }
    }
}
