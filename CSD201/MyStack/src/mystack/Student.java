package mystack;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Student {
    private String name;
    private String rollNumber;

    public Student() {
    }

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", rollNumber=" + rollNumber + '}';
    }
   
}
