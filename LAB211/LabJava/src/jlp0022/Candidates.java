package jlp0022;

/**
 * @date Jul 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Candidates {
//    CandidateId, FirstName, LastName, BirthDate, Address, Phone, Email 

    private String CandidateId;
    private String fristName;
    private String lastName;
    private String birthDate;
    private String address;
    private String phone;
    private String email;

    public Candidates() {
    }

    public Candidates(String CandidateId, String fristName, String lastNam, String birthDate, String address, String phone, String email) {
        this.CandidateId = CandidateId;
        this.fristName = fristName;
        this.lastName = lastNam;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getCandidateId() {
        return CandidateId;
    }

    public void setCandidateId(String CandidateId) {
        this.CandidateId = CandidateId;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidates{" + "CandidateId=" + CandidateId + ", fristName=" + fristName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address=" + address + ", phone=" + phone + ", email=" + email + '}';
    }
    
    

}
