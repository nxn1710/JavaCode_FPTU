package jlp0022;

/**
 * @date Jul 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Intership extends Candidates {

    //Majors, Semester, Universityname
    private String majors;
    private String semester;
    private String universityName;

    public Intership() {
    }

    public Intership(String majors, String semester, String universityName, String CandidateId, String fristName, String lastName, String birthDate, String address, String phone, String email) {
        super(CandidateId, fristName, lastName, birthDate, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString()  + " majors=" + majors + ", semester=" + semester + ", universityName=" + universityName + '}';
    }
    

}
