package jsp0063;

import java.util.Scanner;

/**
 * @date Jun 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Person {

    private String name;
    private String address;
    private double salary;
    private Scanner scanner = new Scanner(System.in);

    public Person() {
    }

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        System.out.println("Input Information Person");
        System.out.print("Please input name: ");
        name = scanner.nextLine();
        System.out.print("Please input address: ");
        address = scanner.nextLine();
        do {
            System.out.print("Please input salary: ");
            try {
                String s = scanner.nextLine();
                salary = Double.parseDouble(s.trim());
                if (salary < 0) {
                    System.out.println("Salary greater than zero");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("You must input digit");
            }
        } while (true);
    }

    @Override
    public String toString() {
        return "Information of Person" +"\nName: " + name + "\nAddress: " + address + "\nSalary: " + salary;
    }
    
}
