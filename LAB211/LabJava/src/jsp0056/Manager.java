package jsp0056;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Jun 23, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manager {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private ArrayList<Worker> listWorker;
    private ArrayList<SalaryHistory> listHistorys;
    private Scanner scanner = new Scanner(System.in);

    public Manager() {
        listWorker = new ArrayList<>();
        listHistorys = new ArrayList<>();
    }

    
    public void addTestWorker() {
        listWorker.add(new Worker("W1", "Nghiep", 19, 1000, "Da Nang"));
        listWorker.add(new Worker("W2", "Hung", 29, 1100, "Da Nang"));
        listWorker.add(new Worker("W3", "Long", 21, 2000, "Da Nang"));
        listWorker.add(new Worker("W4", "Phuc", 22, 3000, "Da Nang"));
        listWorker.add(new Worker("W5", "Toan", 10, 1200, "Da Nang"));
    }
    
    public void addWorker() {
        Worker worker = new Worker();
        String code;
        int age;
        System.out.println("----------Add Worker----------");
        do {
            System.out.print("Enter Code: ");
            code = scanner.nextLine();
            if (checkDuplicate(code)) {
                worker.setCode(code);
                break;
            } else {
                System.out.println("Code can not be duplicate");
            }
        } while (true);
        System.out.print("Enter name: ");
        worker.setName(scanner.nextLine());
        do {
            System.out.print("Enter age: ");
            age = scanner.nextInt();
            if (age < 18 || age > 65) {
                System.out.println("Age must be in range 18 to 65");
            } else {
                worker.setAge(age);
                break;
            }
        } while (true);
        System.out.print("Enter salary: ");
        worker.setSalary(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Enter work location: ");
        worker.setLocation(scanner.nextLine());
        listWorker.add(worker);
    }

    public void changeSalary() {
        String code, status;
        boolean isExist = false;
        double salary;
        System.out.print("Enter code: ");
        code = scanner.nextLine();
        for (Worker worker : listWorker) {
            if (code.equalsIgnoreCase(worker.getCode())) {
                System.out.print("Enter salary: ");
                salary = scanner.nextDouble();
                status = salary > worker.getSalary() ? "UP" : "DOWN";
                //update salary
                worker.setSalary(salary);
                //add history of salary
                SalaryHistory sh = new SalaryHistory(status, getCurrentDate(), worker.getCode(), worker.getName(),
                        worker.getAge(), salary, worker.getLocation());
                listHistorys.add(sh);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Dont have that code in list");
        }
        
    }

    public void displaySalaryHistory() {
        System.out.println("--------------------Display Salary History--------------------");
        System.out.printf("%-5s%-10s%-5s%-10s%-7s%-10s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        for (SalaryHistory sh : listHistorys) {
            System.out.printf("%-5s", sh.getCode());
            System.out.printf("%-10s", sh.getName());
            System.out.printf("%-5d", sh.getAge());
            System.out.printf("%-10.2f", sh.getSalary());
            System.out.printf("%-7s", sh.getStatus());
            System.out.printf("%-10s", sh.getDate());
            System.out.println("");
        }
    }

    public boolean checkDuplicate(String code) {
        for (Worker worker : listWorker) {
            if (code.equalsIgnoreCase(worker.getCode())) {
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

    public String getCurrentDate() {
        return sdf.format(new Date());
    }

}
