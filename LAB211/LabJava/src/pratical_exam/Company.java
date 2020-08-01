package pratical_exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @date Jul 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Company {

    HashMap<Employee, Double> listEmployees;
    HashMap<Employee, Double> listEmployeesBonus;
    ArrayList<Employee> listBonus100USD;
    ArrayList<Employee> listEmployeesFined;

    public Company(HashMap<Employee, Double> listEmployees, HashMap<Employee, Double> listEmployeesBonus) {
        this.listEmployees = listEmployees;
        this.listEmployeesBonus = listEmployeesBonus;
    }

    public Company() {
        listEmployees = new HashMap<>();
        listBonus100USD = new ArrayList<>();
        listEmployeesBonus = new HashMap<>();
        listEmployeesFined = new ArrayList<>();
    }

    public void inputEmployee() {
        System.out.print("Enter Employee's Name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter Employee's Coefficients Salary: ");
        double coeffi = Validation.checkInputDouble();
        System.out.println("----Enter list of insurrance----");
        int type;
        ArrayList<Insurrance> listInsurrances = new ArrayList<>();
        boolean check = false;
        double bonus = 0;
        double sumPayable = 0;
        do {
            System.out.println("1. Short term insurrance");
            System.out.println("2. Long term insurrance");
            System.out.print("Enter type of insurrance: ");
            type = Validation.checkInputInt();
            System.out.print("Enter name customer: ");
            String cusName = Validation.checkInputString();
            int months;
            while (true) {
                System.out.print("Enter number of month: ");
                months = Validation.checkInputInt();
                //check month of long term insurrances must be greater than 12
                if (type == 2) {
                    if (months >= 12) {
                        break;
                    }
                } else {
                    break;
                }
            }
            System.out.print("Enter amount payable: ");
            double payable = Validation.checkInputDouble();
            sumPayable += payable;
            if (type == 2) {
                double payableMonth = payable / months;
                listInsurrances.add(new Long_termInsurrance(payableMonth, cusName, months, payable));
                bonus += (0.5 * payableMonth);
            } else {
                bonus += (0.05 * payable);
                listInsurrances.add(new Short_termInsurrance(cusName, months, payable));
            }
            System.out.print("Continue add insurrance:(Y/N): ");
            check = Validation.checkInputYN();
        } while (check);
        Employee employee = new Employee(name, coeffi, listInsurrances);
        double salary = 40 * coeffi + 0.01 * sumPayable;
        for (Insurrance i : listInsurrances) {
            //add list bonus 100 usd
            if (i.getAmountPayable() >= 10000 && !listBonus100USD.contains(employee)) {
                listBonus100USD.add(employee);
                salary += 100;
            }
        }
        if (sumPayable < 10000) {
            listEmployeesFined.add(employee);
            salary -= 30;
        }
        listEmployeesBonus.put(employee, bonus);

        listEmployees.put(employee, salary + bonus);
        System.out.println("Add success");
    }

    public void displayAllEmployee() {
        Iterator<Employee> it = listEmployees.keySet().iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            System.out.println(e);
            System.out.print("Salary: " + listEmployees.get(e));
            System.out.println("");
            System.out.println("List Insurrance sold: ");
            for (Insurrance i : e.getInsurranceSold()) {
                System.out.println(i);
            }
        }
    }

    public void employeeHasBonusGreater50USD() {
        Iterator<Employee> it = listEmployeesBonus.keySet().iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (listEmployeesBonus.get(e) > 50) {
                System.out.println(e);
            }
        }
    }

    public void displayEmployeeBeFined() {
        for (Employee e : listEmployeesFined) {
            System.out.println(e);
        }
    }

    public void employeeHasBonus100USD() {
        for (Employee e : listBonus100USD) {
            System.out.println(e);
        }
    }

}
