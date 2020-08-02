package assignment;

import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @date Mar 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Domestic extends Tour {

    private double guideTrip;

    public Domestic() {
    }

    public Domestic(double guideTrip) {
        this.guideTrip = guideTrip;
    }

    public Domestic(double guideTrip, String code, String title, double price, String transport,
            Date startDate, Date endDate) {
        super(code, title, price, transport, startDate, endDate);
        this.guideTrip = guideTrip;
    }

    public double getGuideTrip() {
        return guideTrip;
    }

    public void setGuideTrip(double guideTrip) {
        this.guideTrip = guideTrip;
    }
    

    @Override
    public String toString() {
        return "Domestic{" + super.toString() + "\n\tguideTrip: " + guideTrip + "\n}\n";
    }

    @Override
    public double surcharge() {
        return this.guideTrip * ChronoUnit.DAYS.between(this.startDate.toInstant(), this.endDate.toInstant());
    }

    @Override
    public double tourCharge() {
        return this.surcharge() + this.price;
    }

}
