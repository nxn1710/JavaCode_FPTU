package jsp0056;

/**
 * @date Jun 23, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Worker {
    private String code;
    private String name;
    private int age;
    private double salary;
    private String location;

    public Worker() {
    }

    public Worker(String code, String name, int age, double salary, String location) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
