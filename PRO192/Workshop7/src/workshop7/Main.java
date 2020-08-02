package workshop7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Mar 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public EmployeeList employeeList = new EmployeeList();
    Scanner scanner = new Scanner(System.in);
    public SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

    public void add() {
        int choice, check;
        String fullName, employeeID, work, position;
        double salaryCoefficient;
        Date workStartDate = null;
        double positionAllowance;
        boolean gender = true;
        System.out.println("Add Employees management");
        do {
            System.out.println("1. Add employees\n2. Add manager\n3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("ID: ");
                    employeeID = scanner.nextLine();
                    System.out.print("Full name: ");
                    fullName = scanner.nextLine();
                    System.out.print("Salary coeficient: ");
                    salaryCoefficient = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Work start Date: ");
                    try {
                        workStartDate = format.parse(scanner.nextLine());
                    } catch (ParseException ex) {
                    }
                    System.out.print("Gender (1. Male/0. Female): ");
                    check = scanner.nextInt();
                    gender = check == 1 ? true : false;
                    scanner.nextLine();
                    System.out.print("Attribute work: ");
                    work = scanner.nextLine();
                    Technician technician = new Technician(employeeID, fullName, salaryCoefficient, workStartDate, gender,
                            work);
                    employeeList.addEmployees(technician);
                    break;
                }
                case 2: {

                    System.out.print("ID: ");
                    employeeID = scanner.nextLine();
                    System.out.print("Full name: ");
                    fullName = scanner.nextLine();
                    System.out.print("Salary coeficient: ");
                    salaryCoefficient = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Work start Date: ");
                    try {
                        workStartDate = format.parse(scanner.nextLine());
                    } catch (ParseException ex) {
                    }
                    System.out.print("Gender (1. Male/0. Female): ");
                    check = scanner.nextInt();
                    gender = check == 1 ? true : false;
                    scanner.nextLine();
                    System.out.print("Position: ");
                    position = scanner.nextLine();
                    System.out.print("Position Allowance: ");
                    positionAllowance = scanner.nextDouble();
                    scanner.nextLine();
                    Manager manager = new Manager(employeeID, fullName, salaryCoefficient, workStartDate, gender,
                            position, positionAllowance);
                    employeeList.addEmployees(manager);
                    break;
                }
                case 3:
                    System.out.println("Success Add Infomation");
                    break;
            }
        } while (choice != 3);
    }

    public void infoList() {
        int choice;
        System.out.println("List Information management");
        do {
            System.out.println("1. List Employee\n2. List Manager\n3. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (Employee v : employeeList.getList()) {
                        System.out.println(v.toString());
                    }
                    break;
                case 2:
                    for (Employee v : employeeList.managerList()) {
                        System.out.println(v.toString());
                    }
                    break;
                case 3:

                    break;
            }
        } while (choice != 3);
    }

    public void salary() {
        int choice, check;
        String id;
        String fullName;
        boolean gender;
        Date workingDate = null;
        System.out.println("Salary management");
        do {
            System.out.println("1. Salary employee id\n2. Salary manager");
            System.out.println("3. Salary average\n4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    for (Employee i : employeeList.getList()) {
                        System.out.println("ID: " + i.getEmployeeID() + " Salary: " + i.salary());
                    }
                    break;
                case 2:
                    for (Employee i : employeeList.managerList()) {
                        System.out.println("ID: " + i.getEmployeeID() + " Salary: " + i.salary());
                    }
                    break;
                case 3:
                    System.out.println("Salary average: " + employeeList.technicalSalaryAverage());
                    break;
                case 4:

                    break;
            }
        } while (choice
                != 4);
    }

    public void remove() {
        int choice, check;
        String id;
        Date workingDate = null;
        System.out.println("Remove management");
        do {
            System.out.println("1. By id employee id\n2. By work start date\n3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter ID Employee: ");
                    id = scanner.nextLine();
                    employeeList.removeID(id);
                    break;
                case 2:
                    System.out.println("Enter Work start date: ");
                    try {
                        workingDate = format.parse(scanner.nextLine());
                    } catch (Exception e) {
                    }
                    id = scanner.nextLine();
                    employeeList.removeDate(workingDate);
                    break;
            }
        } while (choice != 3);
    }

    public void search() {
        int choice, check;
        String id;
        String fullName;
        boolean gender;
        Date workingDate = null;
        System.out.println("Search management");
        do {
            System.out.println("1. By employee id\n2. By full name");
            System.out.println("3. By gender\n4. By working start date\n5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter id employee: ");
                    id = scanner.nextLine();
                    System.out.println(employeeList.searchID(id).toString());
                    break;
                case 2:
                    System.out.print("Enter full name: ");
                    fullName = scanner.nextLine();
                    for (Employee v : employeeList.searchName(fullName)) {
                        System.out.println(v.toString());
                    }
                    break;
                case 3:
                    System.out.print("Enter gender (1. Male/0. Female):: ");
                    check = scanner.nextInt();
                    scanner.nextLine();
                    gender = check == 1 ? true : false;
                    for (Employee v : employeeList.searchGender(gender)) {
                        System.out.println(v.toString());
                    }
                    break;
                case 4:
                    System.out.print("Work start Date: ");
                    try {
                        workingDate = format.parse(scanner.nextLine());
                    } catch (ParseException ex) {
                    }
                    for (Employee v : employeeList.searchDate(workingDate)) {
                        System.out.println(v.toString());
                    }
                    break;
            }
        } while (choice != 5);
    }

    public void update() {
        int choice, check;
        String fullName, employeeID, work;
        double salaryCoefficient;
        Date workStartDate = null;
        boolean gender = true;
        System.out.print("ID need update: ");
        employeeID = scanner.nextLine();
        System.out.print("Full name: ");
        fullName = scanner.nextLine();
        System.out.print("Salary coeficient: ");
        salaryCoefficient = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Work start Date: ");
        try {
            workStartDate = format.parse(scanner.nextLine());
        } catch (ParseException ex) {
        }
        System.out.print("Gender (1. Male/0. Female): ");
        check = scanner.nextInt();
        gender = check == 1 ? true : false;
        scanner.nextLine();
        System.out.print("Attribute work: ");
        work = scanner.nextLine();
        Technician technician = new Technician(employeeID, fullName, salaryCoefficient, workStartDate, gender,
                work);
        employeeList.updateEmployee(employeeID ,technician);

    }

    public static void main(String[] args) {
        //All Declare here
        Scanner scanner = new Scanner(System.in);
        int choice;
        Main main = new Main();
        //All work here
        do {
            System.out.println("1. Add new employees");
            System.out.println("2. List information");
            System.out.println("3. Salary information");
            System.out.println("4. Search employee");
            System.out.println("5. Remove employee");
            System.out.println("6. Update employee information");
            System.out.println("7. Exit");
            System.out.print("Feature: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    main.add();
                    break;
                case 2:
                    main.infoList();
                    break;
                case 3:
                    main.salary();
                    break;
                case 4:
                    main.search();
                    break;
                case 5:
                    main.remove();
                    break;
                case 6:
                    main.update();
                    break;
            }
        } while (choice != 8);

    }
}
