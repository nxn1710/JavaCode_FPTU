package workshop7;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @date Mar 7, 2020
 * @author Nguyen Xuan Nghiep
 */
public class EmployeeList {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> list = new ArrayList<>();

    public ArrayList<Employee> getList() {
        return list;
    }

    public Employee getEmployee(int i) {
        return list.get(i);
    }

    public void addEmployees(Employee employee) {
        list.add(employee);
    }

    public ArrayList<Employee> managerList() {
        ArrayList<Employee> manager = new ArrayList<>();
        for (Employee i : list) {
            if (i instanceof Manager) {
                manager.add(i);
            }
        }
        return manager;
    }

    public double technicalSalaryAverage() {
        int count = 0;
        double sum = 0;
        for (Employee i : list) {
            if (i instanceof Technician) {
                sum += i.salary();
            count++;
            }
        }
        return sum / count;
    }

    public Employee searchID(String id) {
        for (Employee i : list) {
            if ((i.getEmployeeID()).equals(id)) {
                return i;
            }
        }
        return null;
    }

    public ArrayList<Employee> searchName(String name) {
        ArrayList<Employee> listName = new ArrayList<>();
        for (Employee i : list) {
            if (name.equals(i.getFullName())) {
                listName.add(i);
            }
        }
        return listName;
    }

    public ArrayList<Employee> searchGender(boolean gender) {
        ArrayList<Employee> listGender = new ArrayList<>();
        for (Employee i : list) {
            if (i.isGender() == gender) {
                listGender.add(i);
            }
        }
        return listGender;
    }

    public ArrayList<Employee> searchDate(Date date) {
        ArrayList<Employee> listDate = new ArrayList<>();
        for (Employee i : list) {
            if (date.compareTo(i.getWorkStartDate()) <= 0) {
                listDate.add(i);
            }
        }
        return listDate;
    }

    public void removeID(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getEmployeeID())) {
                list.remove(i);
            }
        }
    }

    public void removeDate(Date date) {
        for (int i = 0; i < list.size(); i++) {
            if (date.compareTo(list.get(i).getWorkStartDate()) <= 0) {
                list.remove(i);
            }
        }
    }

    public Employee lastSalaryMax() {
        return null;
    }

    public void updateEmployee(String id, Employee employee) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getEmployeeID())) {
                list.set(i, employee);
            }
        }
    }
}
