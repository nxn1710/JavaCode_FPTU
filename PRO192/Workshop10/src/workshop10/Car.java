package workshop10;

/**
 * @date Mar 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Car {
    private String name;
    private double price;
    private String production;

    public Car() {
    }

    public Car(String name, double price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProduction() {
        return production;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", price=" + price + ", production=" + production + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car)obj;
            return car.name.equals(this.name) && car.price == this.price &&
                    car.production.equals(this.production);
        }
        return false;
    }

    
}
