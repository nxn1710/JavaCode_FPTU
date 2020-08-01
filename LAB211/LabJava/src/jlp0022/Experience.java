package jlp0022;

/**
 * @date Jul 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Experience extends Candidates{
    private int ExpInYear;
    private String ProSkill;

    public Experience() {
    }

    public Experience(int ExpInYear, String ProSkill, String CandidateId, String fristName, String lastName, String birthDate, String address, String phone, String email) {
        super(CandidateId, fristName, lastName, birthDate, address, phone, email);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

    @Override
    public String toString() {
        return super.toString()  + " ExpInYear=" + ExpInYear + ", ProSkill=" + ProSkill + '}';
    }
    
    
}
