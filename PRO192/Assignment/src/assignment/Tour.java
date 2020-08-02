package assignment;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date Mar 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public abstract class Tour implements Itour, Serializable {

    protected String code;
    protected String title;
    protected double price;
    protected String transport;
    protected Date startDate;
    protected Date endDate;
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private static final long serialVersionUID = 1L;

    public Tour() {
    }

    public Tour(String code, String title, double price, String transport, Date startDate, Date endDate) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.transport = transport;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "\n\tcode: " + code + "\n\ttitle: " + title + "\n\tprice: " + price + "\n\ttransport: "
                + transport + "\n\tStart Date: " + format.format(startDate) + "\n\tEnd Date: "
                + format.format(endDate);
    }

    public abstract double surcharge();

}
