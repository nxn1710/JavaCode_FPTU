package practicalexam;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Apr 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class PatientList {

    private ArrayList<Patient> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add(Patient patient) {
        list.add(patient);
    }
    
    //add data to test
    public void addTest() {
        Patient inPatient = new InPatient();
        Patient outPatient = new OutPatient();
        Date date1 = new Date("2000/10/17");
        Date date2 = new Date("2000/10/20");
        inPatient = new InPatient(100, date2, "IN1", "Nguyen Xuan Nghiep", date1, "Male", 100);
        list.add(inPatient);
        date1 = new Date("2000/11/17");
        date2 = new Date("2000/11/19");
        inPatient = new InPatient(200, date2, "IN2", "Nguyen Quang Hung", date1, "Male", 200);
        list.add(inPatient);
        date1 = new Date("2000/11/17");
        outPatient = new OutPatient(100, 100, "OUT1", "Nguyen Truong Hung", date1, "Male", 100);
        list.add(outPatient);
        date1 = new Date("2000/12/17");
        outPatient = new OutPatient(100, 100, "OUT2", "Truong Khanh Toan", date1, "Male", 100);
        list.add(outPatient);
    }
    
    public boolean isExistCode(String code) {
        for (Patient i : list) {
            if (code.equals(i.getCode())) {
                return true;
            }
        }
        return false;
    }

    public double avgHospitalFeeInPatient() {
        double count = 0, sum = 0;
        for (Patient i : list) {
            if (i instanceof InPatient) {
                sum += ((InPatient) i).hospitalFee();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public void listOutPatient() {
        for (Patient i : list) {
            if (i instanceof OutPatient) {
                System.out.println(i.toString());
            }
        }
    }
    
    public void listIntPatient() {
        for (Patient i : list) {
            if (i instanceof InPatient) {
                System.out.println(i.toString());
            }
        }
    }

    public void searchCode(String code) {
        int check = 0;
        for (Patient i : list) {
            if (code.equals(i.getCode())) {
                System.out.println(i.toString());
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Don't have that patient code in list");
        }
    }

    public void minHospitalFee() {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).hospitalFee()) {
                min = list.get(i).hospitalFee();
                index = i;
            }
        }
        System.out.println(list.get(index).toString());
        System.out.println("Minium hospital fee is : " + min);
    }

    public void remove(Date date) {
        for (Patient i : list) {
            if (i instanceof InPatient) {
                if (date.compareTo(((InPatient) i).getDischargedDate()) > 0) {
                    list.remove(i);
                }
            }
        }
    }
}
