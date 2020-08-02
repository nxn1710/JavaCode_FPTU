package question2;

import java.util.Date;

/**
 * @date Feb 23, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Student {

    private String name;
    private String studentID;
    private Date birthDate;
    private String address;
    private String major;

    public Student() {
    }

    public Student(String name, String studentID, Date birthDate, String address, String major) {
        this.name = name;
        this.studentID = studentID;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nStudent Id: " + this.studentID
                + "\n Birthdate: " + this.birthDate + "\nAddress: "
                + this.address + "\nMajor: " + this.major;
    }
}
