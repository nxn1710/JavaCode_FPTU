package assignment;

import java.util.Date;

/**
 * @date Mar 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class International extends Tour {

    private double aviationTax;
    private double entryFee;

    public International() {
    }

    public International(double aviationTax, double entryFee, String code, String title, double price,
             String transport, Date startDate, Date endDate) {
        super(code, title, price, transport, startDate, endDate);
        this.aviationTax = aviationTax;
        this.entryFee = entryFee;
    }

    public double getAviationTax() {
        return aviationTax;
    }

    public void setAviationTax(double aviationTax) {
        this.aviationTax = aviationTax;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }
    
    @Override
    public String toString() {
        return "International{" + super.toString() + "\n\taviationTax: " + aviationTax + "\n\tentryFee: " + entryFee + "\n}\n";
    }

    @Override
    public double surcharge() {
        return this.aviationTax + this.entryFee;
    }

    @Override
    public double tourCharge() {
        return this.surcharge() + this.price;
    }
    

}
