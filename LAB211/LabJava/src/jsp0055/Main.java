package jsp0055;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {
    
    private static int menu() {
        System.out.println("========= Doctor Management ==========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }
    
    public static void main(String[] args) {
        DoctorHash manager = new DoctorHash();
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1: {
                    try {
                        manager.addDoctor();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                break;
                case 2:
                    try {
                        manager.updateDoctor();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        manager.deleteDoctor();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    HashMap<String, Doctor> listDoctor = manager.search();
                    Iterator<String> it = listDoctor.keySet().iterator();
                    while (it.hasNext()) {
                        String code = it.next();
                        System.out.println(listDoctor.get(code));
                    }
                    
                    break;
                case 5:
                    break;
            }
        } while (choice != 5);
    }
}
