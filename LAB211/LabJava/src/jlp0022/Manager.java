package jlp0022;

import java.util.ArrayList;

/**
 * @date Jul 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manager {

    private ArrayList<Experience> experiences;
    private ArrayList<Fresher> freshers;
    private ArrayList<Intership> interships;

    public Manager() {
        experiences = new ArrayList<>();
        freshers = new ArrayList<>();
        interships = new ArrayList<>();
    }

    public void addCandidate(int type) {
        System.out.println("Enter candicate id: ");
        String id = Validation.checkInputString();
        System.out.println("Enter first name: ");
        String firstName = Validation.checkInputString();
        System.out.println("Enter last name: ");
        String lastName = Validation.checkInputString();
        System.out.println("Enter birthday (dd/MM/yyyy): ");
        String birthDate = Validation.checkInputDate();
        System.out.println("Enter address: ");
        String address = Validation.checkInputString();
        System.out.println("Enter phone: ");
        String phone = Validation.checkInputString();
        System.out.println("Enter email: ");
        String email = Validation.checkInputString();
        switch (type) {
            case 1:
                System.out.println("Enter year experience: ");
                int yearExp = Validation.checkInputInt();
                System.out.println("Enter pro skill: ");
                String proskill = Validation.checkInputString();
                Experience ex = new Experience(yearExp, proskill, id, firstName, lastName, birthDate, address, phone, email);
                experiences.add(ex);
                break;
            case 2:
                System.out.println("Enter graduation date (dd/MM/yyyy): ");
                String grD = Validation.checkInputDate();
                System.out.println("Enter graduation rank: ");
                String grR = Validation.checkInputString();
                System.out.println("Enter education: ");
                String edu = Validation.checkInputString();
                Fresher f = new Fresher(grD, grR, edu, id, firstName, lastName, birthDate, address, phone, email);
                freshers.add(f);
                break;
            case 3:
                System.out.println("Enter majors: ");
                String major = Validation.checkInputString();
                System.out.println("Enter semester: ");
                String sem = Validation.checkInputString();
                System.out.println("Enter university name: ");
                String uniName = Validation.checkInputString();
                Intership inter = new Intership(major, sem, uniName, id, firstName, lastName, birthDate, address, phone, email);
                interships.add(inter);
                break;
        }
    }

    public void display() {
        System.out.println("=====EXPERIENCE=====");
        for (Experience e : experiences) {
            System.out.println(e.getFristName() + " " + e.getLastName());
        }
        System.out.println("=====FRESHER=====");
        for (Fresher f : freshers) {
            System.out.println(f.getFristName() + " " + f.getLastName());
        }
        System.out.println("=====INTERSHIP=====");
        for (Intership i : interships) {
            System.out.println(i.getFristName() + " " + i.getLastName());
        }
    }

    public void search(String name) {
        for (Experience e : experiences) {
            String s = e.getFristName() + " " + e.getLastName();
            if (s.contains(name)) {
                System.out.println(e.toString());
            }
        }
        for (Fresher f : freshers) {
            String s = f.getFristName() + " " + f.getLastName();
            if (s.contains(name)) {
                System.out.println(f.toString());
            }
        }
        for (Intership i : interships) {
            String s = i.getFristName() + " " + i.getLastName();
            if (s.contains(name)) {
                System.out.println(i.toString());
            }
        }
    }

}
