package jsp0056;


/**
 * @date Jun 23, 2020
 * @author Nguyen Xuan Nghiep
 */
public class SalaryHistory extends Worker{
    private String status;
    private String date;

    public SalaryHistory() {
    
    }

    public SalaryHistory(String status, String date, String code, String name, int age, double salary, String location) {
        super(code, name, age, salary, location);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
