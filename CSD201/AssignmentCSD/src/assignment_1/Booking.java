package assignment_1;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Booking {

    private String tcode;
    private String ccode;
    private int seat;
    public static final long serialVersionUID = 1L;

    public Booking() {
    }

    public Booking(String tcode, String ccode, int seat) {
        this.tcode = tcode;
        this.ccode = ccode;
        this.seat = seat;
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Booking{" + "tcode=" + tcode + ", ccode=" + ccode + ", seat=" + seat + '}';
    }

}
