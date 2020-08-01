package lab6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @date Jul 13, 2020
 * @author Nguyen Xuan Nghiep
 */
public class EmployeeList {

    ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addTest() {
        employees.add(new Employee("DE140022", "Nguyễn Xuân Nghiệp", 3));
        employees.add(new Employee("DE140042", "Trương Khánh Toàn", 2));
        employees.add(new Employee("DE140021", "Trần Kim Việt", 1));
        employees.add(new Employee("DE140018", "Lê Trần Viết Long", 3));
        employees.add(new Employee("DE140006", "Nguyễn Trường Phúc", 2));
        employees.add(new Employee("DE140014", "Nguyễn Nhân", 3));

    }

    public void display() {
        employees.forEach((e) -> {
            System.out.println(e.toString());
        });
    }

    public void insertionSortA() {
        for (int i = 1; i < employees.size(); i++) {
            Employee e = employees.get(i);
            int j = i - 1;
            while (j >= 0 && employees.get(j).compareTo(e) > 0) {
                employees.set(j + 1, employees.get(j));
                j--;
            }
            employees.set(j + 1, e);
        }
    }

    public void insertionSortD() {
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            int j = i - 1;
            while (j >= 0 && employees.get(j).compareTo(e) < 0) {
                employees.set(j + 1, employees.get(j));
                j--;
            }
            employees.set(j + 1, e);
        }
    }

    public void bubbleSortA() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = employees.size() - 1; j > i; j--) {
                if (employees.get(j - 1).compareTo(employees.get(j)) > 0) {
                    Employee temp = employees.get(j - 1);
                    employees.set(j - 1, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
    }

    public void bubbleSortD() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = employees.size() - 1; j > i; j--) {
                if (employees.get(j - 1).compareTo(employees.get(j)) < 0) {
                    Employee temp = employees.get(j - 1);
                    employees.set(j - 1, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
    }

    public void selectionSortA() {
        for (int i = 0; i < employees.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(min).compareTo(employees.get(j)) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                Employee temp = employees.get(min);
                employees.set(min, employees.get(i));
                employees.set(i, temp);
            }
        }
    }

    public void selectionSortD() {
        for (int i = 0; i < employees.size() - 1; i++) {
            int max = i;
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(max).compareTo(employees.get(j)) < 0) {
                    max = j;
                }
            }
            if (max != i) {
                Employee temp = employees.get(max);
                employees.set(max, employees.get(i));
                employees.set(i, temp);
            }
        }
    }

    public void quickSort(ArrayList<Employee> employeesList, int l, int r) {
        int i = l, j = r, pivot = (l + r) / 2;
        while (i < j) {
            while (employeesList.get(i).compareTo(employeesList.get(pivot)) < 0) {
                i++;
            }
            while (employeesList.get(j).compareTo(employeesList.get(pivot)) > 0) {
                j--;
            }
            if (i <= j) {
                Collections.swap(employees, i, j);
                i++;
                j--;
            }

        }
        if (i < r) {
            quickSort(employeesList, i, r);
        }
        if (l < j) {
            quickSort(employeesList, l, j);
        }
    }

    void sort(ArrayList<Employee> employeesList, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(employeesList, l, m);
            sort(employeesList, m + 1, r);
            merge(employeesList, l, m, r);
        }
    }

    void merge(ArrayList<Employee> employeesList, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        Employee[] L = new Employee[n1];
        Employee[] R = new Employee[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = employeesList.get(l + i);
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = employeesList.get(m + 1 + j);
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                employeesList.set(k, L[i]);
                i++;
            } else {
                employeesList.set(k, R[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            employeesList.set(k, L[i]);
            i++;
            k++;
        }

        while (j < n2) {
            employeesList.set(k, R[j]);
            j++;
            k++;
        }
    }
    
}
