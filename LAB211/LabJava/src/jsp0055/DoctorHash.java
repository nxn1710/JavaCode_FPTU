package jsp0055;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class DoctorHash {

    private HashMap<String, Doctor> listDoctor;

    public DoctorHash() {
        listDoctor = new HashMap<>();
    }

    public void addDoctor() throws Exception {
        System.out.print("Enter Dotor's Code: ");
        String code = Validation.checkInputString();
        if (listDoctor.containsKey(code)) {
            throw new Exception("Doctor code [" + code + "] is duplicate");
        }
        System.out.print("Enter Doctor's Name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter Doctor's Specialization: ");
        String spec = Validation.checkInputString();
        System.out.print("Enter Doctor's Availability: ");
        int ava = Validation.checkInputInt();
        Doctor doctor = new Doctor(code, name, spec, ava);
        listDoctor.put(code, doctor);
        System.out.println("Add success");
    }

    public void updateDoctor() throws Exception {
        System.out.print("Enter Dotor's Code: ");
        String code = Validation.checkInputString();
        if (!listDoctor.containsKey(code)) {
            throw new Exception("Doctor code [" + code + "] doesn't exist");
        }
        System.out.print("Enter Doctor's Name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter Doctor's Specialization: ");
        String spec = Validation.checkInputString();
        System.out.print("Enter Doctor's Availability: ");
        int ava = Validation.checkInputInt();
        Doctor doctor = new Doctor(code, name, spec, ava);
        listDoctor.replace(code, doctor);
        System.out.println("Update success");
    }

    public void deleteDoctor() throws Exception {
        System.out.print("Enter Dotor's Code: ");
        String code = Validation.checkInputString();
        if (!listDoctor.containsKey(code)) {
            throw new Exception("Doctor code [" + code + "] doesn't exist");
        }
        listDoctor.remove(code);
        System.out.println("Delete success");
    }

    public HashMap<String, Doctor> search(){
        HashMap<String, Doctor> searchDoctor = new HashMap<>();
        System.out.print("Enter Dotor's Name: ");
        String name = Validation.checkInputString();
        Iterator<String> it = listDoctor.keySet().iterator();
        while (it.hasNext()) {
            String code = it.next();
            Doctor doctor = listDoctor.get(code);
            if (doctor.getName().contains(name)) {
                searchDoctor.put(doctor.getCode(), doctor);
            }
        }
        return searchDoctor;
    }
}
