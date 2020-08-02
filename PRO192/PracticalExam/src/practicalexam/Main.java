package practicalexam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Apr 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        String code, name, gender;
        Date hospitalizedDate, dischargedDate;
        double medicineCost, dailyFee, examinationFee, testingFee;
        int choice;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PatientList patient = new PatientList();
        Scanner scanner = new Scanner(System.in);
        patient.addTest();
        System.out.println("Add Patient");
        System.out.println("1. Add In patient");
        System.out.println("2. Add Out patinet");
        choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter patient Code: ");
        code = scanner.nextLine();
        if (patient.isExistCode(code) == false) {
            System.out.println("Enter patient name: ");
            name = scanner.nextLine();
            System.out.println("Enter hospitalized date");
            hospitalizedDate = sdf.parse(scanner.nextLine());
            System.out.println("Enter gender patient (Male/Female): ");
            gender = scanner.nextLine();
            System.out.println("Enter medicine cost: ");
            medicineCost = scanner.nextDouble();
            if (choice == 1) {
                System.out.println("Enter daily fee: ");
                dailyFee = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter discharged date: ");
                dischargedDate = sdf.parse(scanner.nextLine());
                Patient inPatient = new InPatient(dailyFee, dischargedDate, code, name, hospitalizedDate, gender, medicineCost);
                patient.add(inPatient);
            } else if (choice == 2) {
                System.out.println("Enter examination fee");
                examinationFee = scanner.nextDouble();
                System.out.println("Enter testing fee");
                testingFee = scanner.nextDouble();
                scanner.nextLine();
                Patient outPatient = new OutPatient(examinationFee, testingFee, code, name, hospitalizedDate, gender, medicineCost);
                patient.add(outPatient);
            }
        } else {
            System.out.println("Patient Code already exist");
        }
        System.out.println("Compute the hospital’s fee average of all the in-patients");
        System.out.println(patient.avgHospitalFeeInPatient());
        System.out.println("List out-patient information including hospital’s fee");
        patient.listOutPatient();
        System.out.println("Search the patient by specified patient code");
        System.out.println("Enter specified patient code");
        code = scanner.nextLine();
        patient.searchCode(code);
        System.out.println("Search the last occurrence of the patient having minimum hospital’s fee");
        patient.minHospitalFee();
        System.out.println("Remove the in-patients released from hospital after specified date");
        System.out.println("Enter specified date");
        dischargedDate = sdf.parse(scanner.nextLine());
        patient.remove(dischargedDate);
        System.out.println("After remove");
        patient.listIntPatient();
    }
}
