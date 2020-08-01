package long21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @date Jun 10, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manage {

    ArrayList<Student> list;
    private Scanner scanner = new Scanner(System.in);

    public Manage() {
        list = new ArrayList();
    }

    public void addTest() {
        list.add(new Student("DE140021", "Nguyen Van Nghiep", 1, "Java"));
        list.add(new Student("DE140006", "Nguyen Truong Phuc", 1, "Java"));
        list.add(new Student("DE140022", "Nguyen Xuan Nghiep", 2, "C/C++"));
        list.add(new Student("DE140023", "Le Quang Nghiep", 3, ".Net"));
        list.add(new Student("DE140020", "Tran Xuan Nghiep", 2, "Java"));
        list.add(new Student("DE140022", "Nguyen Xuan Nghiep", 3, "C/C++"));
    }

    public void create() {
        do {
            Student s = new Student();
            System.out.print("Enter id student: ");
            s.setId(Validation.checkInputString());
            System.out.print("Enter student name: ");
            s.setName(Validation.checkInputString());
            System.out.print("Enter semester: ");
            s.setSemester(Validation.checkInputInt());
            System.out.print("Enter course name: ");
            s.setCourseName(Validation.checkInputString());
            System.out.print(s.toString());
            list.add(s);
            if (!Validation.checkInputYN()) {
                break;
            }
        } while (true);
    }

    public Student findID(String id) {
        for (Student s : list) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void findSort() {
        String name;
        ArrayList<Student> listName = new ArrayList<>();
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        for (Student s : list) {
            if (s.getName().matches("(.*)" + name + "(.*)")) {
                listName.add(s);
            }
        }

        Collections.sort(listName, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.printf("%-20s |%8s |%11s\n", "Student Name", "Semester", "Course Name");
        for (Student e : listName) {
            System.out.printf("%-20s |%-8d |%-11s\n", e.getName(), e.getSemester(), e.getCourseName());
        }
        System.out.println("");
    }

    public void display() {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    public void updateOrDelete() {
        char choice;
        Student s;
        String id, name, courseName;
        int semester;
        System.out.print("Do you want do Update(U) or Delete(D): ");
        choice = Validation.checkInputString().charAt(0);
        switch (choice) {
            case 'U':
                System.out.println("Enter id student to update: ");
                id = Validation.checkInputString();
                s = findID(id);
                System.out.print("Enter name: ");
                s.setName(Validation.checkInputString());
                System.out.print("Enter semester: ");
                s.setSemester(Validation.checkInputInt());
                System.out.print("Enter course name: ");
                s.setCourseName(Validation.checkInputString());
                break;
            case 'D':
                System.out.println("Enter id student to remove: ");
                id = Validation.checkInputString();
                do {
                    s = findID(id);
                    list.remove(s);
                } while (s != null);
                break;
        }
    }

    public void report() {
        int size = list.size();
        int count[] = new int[size];
        int i = 0;
        for (Student student : list) {
            for (Student student1 : list) {
                if (student.getId().equals(student1.getId())
                        && student.getCourseName().equals(student1.getCourseName())) {
                    count[i]++;
                }
            }
            i++;
        }
        ArrayList<String> print = new ArrayList<>();
        int j = 0;
        for (Student s : list) {
            String result = String.format("%-20s|%-10s|%-5d", s.getName(), s.getCourseName(), count[j]);
            print.add(result);
            j++;
        }
        Set<String> set = new HashSet<>(print);
        print.clear();
        print.addAll(set);
        for (String result : set) {
            System.out.println(result);
        }
    }
}
