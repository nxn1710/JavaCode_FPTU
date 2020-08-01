package jsp0065;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @date Jul 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manager {

    public Manager() {
    }

    public Student addStudent() {
        Student s = new Student();
        System.out.print("Name: ");
        s.setName(Validation.checkInputString());
        System.out.print("Classed: ");
        s.setClasses(Validation.checkInputString());
        System.out.print("Maths: ");
        s.setMaths(Validation.checkInputMark());
        System.out.print("Chemistry: ");
        s.setChemistry(Validation.checkInputMark());
        System.out.print("Physics: ");
        s.setPhysics(Validation.checkInputMark());
        double avg = (s.getChemistry() + s.getMaths() + s.getPhysics()) / 3;
        s.setAvg(avg);
        if (avg > 7.5) {
            s.setType("A");
        } else if (avg >= 6) {
            s.setType("B");
        } else if (avg >= 4) {
            s.setType("C");
        } else {
            s.setType("D");
        }
        return s;
    }

    public void displayStudent(ArrayList<Student> listStudents) {
        for (int i = 0; i < listStudents.size(); i++) {
            System.out.println("-----Student " + (i + 1) + " Info-----");
            System.out.println("Name: " + listStudents.get(i).getName());
            System.out.println("Classes: " + listStudents.get(i).getClasses());
            System.out.println("AVG: " + String.format("%.2f", listStudents.get(i).getAvg()));
            System.out.println("Type: " + listStudents.get(i).getType());

        }
    }

    public HashMap<String, Double> getPercentTypeStudent3(ArrayList<Student> listStudent) {
        HashMap<String, Double> percentType = new HashMap<>();
        double[] types = {0, 0, 0, 0};
        for (Student s : listStudent) {
            types[s.getType().charAt(0) - 'A']++;
        }

        for (int i = 0; i < types.length; i++) {
            percentType.put(String.format("%s", (char) (65 + i)), types[i]);
        }
        return percentType;
    }

    public HashMap<String, Double> getPercentTypeStudent2(ArrayList<Student> listStudent) {
        HashMap<String, Double> percentType = new HashMap<>();
        String[] types = {"A", "B", "C", "D"};
        double[] count = {0, 0, 0, 0};
        for (int i = 0; i < types.length; i++) {
            for (Student s : listStudent) {
                if (s.getType().equalsIgnoreCase(types[i])) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < types.length; i++) {
            percentType.put(types[i], count[i]);
        }
        return percentType;
    }

    public HashMap<String, Double> getPercentTypeStudent1(ArrayList<Student> listStudent) {
        HashMap<String, Double> percentType = new HashMap<>();
        String[] types = {"A", "B", "C", "D"};
        for (String type : types) {
            percentType.put(type, 0.0);
        }
        double n = 0;
        for (Student s : listStudent) {
            n = percentType.get(s.getType());
            percentType.put(s.getType(), ++n);
        }
        return percentType;
    }

    public void displayPercentType(HashMap<String, Double> percentType, ArrayList<Student> listStudents) {
        int num = listStudents.size();
        System.out.println("--------Classification Info--------");
        Set<String> key = percentType.keySet();
        Iterator<String> iter = key.iterator();
        while (iter.hasNext()) {
            String type = iter.next();
            System.out.println(type + " : " + String.format("%.2f", percentType.get(type) / num * 100) + "%");
        }
    }
}
