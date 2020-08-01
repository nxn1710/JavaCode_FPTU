package assignment_1;

import java.io.Serializable;

/**
 * @date Jun 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Train implements Serializable {

    private String tcode;
    private String trainName;
    private int seat;
    private int booker;
    private double departTime;
    private String departPlace;
    private static final long serialVersionUID = 1L;

    public Train() {
    }

    public Train(String tcode, String trainName, int seat, int booker, double departTime, String departPlace) {
        this.tcode = tcode;
        this.trainName = trainName;
        this.seat = seat;
        this.booker = booker;
        this.departTime = departTime;
        this.departPlace = departPlace;
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getBooker() {
        return booker;
    }

    public void setBooker(int booker) {
        this.booker = booker;
    }

    public double getDepartTime() {
        return departTime;
    }

    public void setDepartTime(double departTime) {
        this.departTime = departTime;
    }

    public String getDepartPlace() {
        return departPlace;
    }

    public void setDepartPlace(String departPlace) {
        this.departPlace = departPlace;
    }

    @Override
    public String toString() {
        return String.format("%-5s|%-5s|%-5d|%-5d|%-5.1f|%-5s\n", tcode, trainName, seat, booker, departTime, departPlace);
    }

}
