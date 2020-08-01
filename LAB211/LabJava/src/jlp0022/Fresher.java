package jlp0022;

/**
 * @date Jul 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Fresher extends Candidates {
///-	Freshercandidatehas addition attributes: graduated time (Graduation_date),
    //Rank of Graduation (Graduation_rank) and university where student graduated (Education)

    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education, String CandidateId, String fristName, String lastName, String birthDate, String address, String phone, String email) {
        super(CandidateId, fristName, lastName, birthDate, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() +  " graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education=" + education + '}';
    }

}
