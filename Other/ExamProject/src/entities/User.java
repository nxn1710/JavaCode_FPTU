package entities;

/**
 * @date Jul 20, 2020
 * @author Nguyen Xuan Nghiep
 */
public class User {
    private String name;
    private String idNumber;
    private String password;
    private String classes;

    public User() {
    }

    public User(String name, String idNumber, String password, String classes) {
        this.name = name;
        this.idNumber = idNumber;
        this.password = password;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    
    
}
