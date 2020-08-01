package basicsort;

/**
 * @date Jul 13, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Employee implements Comparable<Employee>{

    private String id;
    private String employeeName;
    private int level;

    public Employee() {
    }

    public Employee(String id, String employeeName, int level) {
        this.id = id;
        this.employeeName = employeeName;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", employeeName=" + employeeName + ", level=" + level + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId().compareTo(o.getId());
    }
    
    
}
